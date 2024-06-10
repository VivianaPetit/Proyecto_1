
package resolucion;

/**
 *
 * @author DMorales
 */

/**
 * Clase que crea listas de NodosPalabras 
 * Sus parametros son:
 * First: Apuntador al primero de la lista
 * Last: Apuntador al ultimo de la lista
 * length: Longitud de la lista
 */
public class ListaPalabras {
    private NodoPalabras first;
    private NodoPalabras last;
    private int length;
    
    // Creador de la clase 
    public ListaPalabras(){
        this.first=null;
        this.last=null;
        this.length=0;
    }
    
    /**
     * Metodo que inserta al un nodo incio de la lista 
     * Parametros:
     * Palabra: Palabra encontrada
     * tiempo: tiempo que se tardo el program en encontrarla
     */
    public void insertarInicio(String palabra, long tiempo){
        NodoPalabras nodo = new NodoPalabras(palabra,tiempo);
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
    
    /**
     * Metodo que elimina el nodo pasado por parametro de la lista
     */
    public void eliminar(NodoPalabras nodo){
        NodoPalabras aux = first;
        while (aux != null){
            if (aux == nodo){
                if (aux == first){
                    first = aux.getSiguiente();
                    aux.getSiguiente().setAnterior(null);
                    length = length - 1;
                }
                if (aux == last){
                    last = aux.getAnterior();
                    aux.getAnterior().setSiguiente(null);
                    length = length - 1;
                }
                else {
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                    length = length - 1;
                }
            }
            else {
                aux = aux.getSiguiente();
            }
        }
    }
    
    /**
     * Metodo que revisa si la palabra pasada por parametro coincide con el artributo palabra
     * de un nodo ya presente en la lista
     */
    public boolean encontrar(String palabra){
        NodoPalabras aux = first;
        while (aux != null){
            if (aux.getPalabra().contentEquals(palabra)){
                return true;
            }
            else {
                aux = aux.getSiguiente();
            }
        }
        return false;
    }
    
    /**
     * Metodo que imprime los nodos de la lista en la consola
     */
    public void imprimirLista(){
        NodoPalabras aux = first;
        while (aux != null){
            System.out.println("Palabra encontrada   " + aux.getPalabra() + "   Tiempo   " + aux.getTiempo());
            aux = aux.getSiguiente();
        }
                
    }
}