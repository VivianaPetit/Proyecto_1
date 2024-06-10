
package resolucion;

/**
 *
 * @author DMorales
 */

/**
 * Clase que crea listas de NodosBFS 
 * Sus parametros son:
 * First: Apuntador al primero de la lista
 * Last: Apuntador al ultimo de la lista
 * length: Longitud de la lista
 */
public class ListaNodoBFS {
    private NodoBFS first;
    private NodoBFS last;
    private int length;
    
    // Creador de la clase 
    public ListaNodoBFS(){
        this.first=null;
        this.last=null;
        this.length=0;
    }

    /*
    * Metodo que inserta un Nodo al inicio de la lista
    */
    public void insertarInicio(NodoBFS nodo){
        if(first==null){
            first=nodo;
            last=nodo;
            length = length + 1;
        }
        else{
            nodo.setSiguiente(first);
            first.setAnterior(nodo);
            first=nodo;
            length = length + 1;
        }
    }
    
    // Destructor de la clase
    public void vaciar(){
        this.first = null;
        this.last = null;
        this.length = 0;
    }
    
    /*
    * Metodo que elimina al artributo de la lista
    */
    public void eliminar(NodoBFS nodo){
        NodoBFS aux = first;
        while (aux != null){
            if (aux == nodo){
                if (aux == first){
                    first = aux.getSiguiente();
                    aux.getSiguiente().setAnterior(null);
                }
                if (aux == last){
                    last = aux.getAnterior();
                    aux.getAnterior().setSiguiente(null);
                }
                else {
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                }
            }
            else {
                aux = aux.getSiguiente();
        }
        
        }
    }
    
    /*
    * Metodo que retorna la cabeza de la lista
    */
    public NodoBFS getFirst() {
        return first;
    }

    /*
    * Metodo que cambia la cabeza de la lista por el nodo pasado por parametro
    */
    public void setFirst(NodoBFS first) {
        this.first = first;
    }

    /*
    * Metodo que retorna el ultimo de la lista 
    */
    public NodoBFS getLast() {
        return last;
    }

    /*
    * Metodo que cambia el ultimo nodo de la lista por el nodo pasado por parametro
    */
    public void setLast(NodoBFS last) {
        this.last = last;
    }

    /*
    * Metodo que retorna la longitud de la lista
    */
    public int getLenght() {
        return length;
    }

    /*
    * Metodo que cambia la longitud de la lista por el numero parametro
    */
    public void setLenght(int lenght) {
        this.length = lenght;
    }
}