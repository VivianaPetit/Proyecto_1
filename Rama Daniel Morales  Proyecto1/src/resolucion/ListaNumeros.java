
package resolucion;

import sopadeletrass2.Nodo;

/**
 *
 * @author Daniel Morales
 * 
 */

/**
 * Clase que crea listas de Nodos 
 * Sus parametros son:
 * First: Apuntador al primero de la lista
 * Last: Apuntador al ultimo de la lista
 * length: Longitud de la lista
 */
public class ListaNumeros {
    private Nodo first;
    private Nodo last;
    private int length;
    
    // Creador de a clase 
    public ListaNumeros(){
        this.first=null;
        this.last=null;
        this.length=0;
    }

    /**
     * Metodo que inserta el nodo pasado al inicio de la lista
     */
    public void insertarInicio(Nodo nodo){
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
    public void eliminar(Nodo nodo){
        Nodo aux = first;
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
    
    /**
     * Metodo que imprime la lista en la consola
     */
     public void print() {
        if (first==null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo temp = first;
            while (temp != null) {
                System.out.print(  temp.getPosicion());
                temp = temp.getSiguiente();
            }
        }
    }
     
    /**
    * Metodo que regresa el primer elemento de la lista
    */
    public Nodo getFirst() {
        return first;
    }
    
    /**
     * Metodo que cambia la cabeza de la lista por el nodo pasado por parametro
     */
    public void setFirst(Nodo first) {
        this.first = first;
    }
    
    /**
     * Metodo que retorna el ultimo elemento de la lista
     */
    public Nodo getLast() {
        return last;
    }
    
    /**
     * Metodo que cambia el ultimo elemento de la lista por el pasado por parametro
     */
    public void setLast(Nodo last) {
        this.last = last;
    }
    
    /**
     * Metodo que retorna la longitud de la lista
     */
    public int getLenght() {
        return length;
    }

    /**
     * Metodo que cambia la longitud de la lista
     */
    public void setLenght(int lenght) {
        this.length = lenght;
    }
    
    /**
     * Metodo que indica si hay un nodo en la lista que tiene la misma posicion que el nodo parametro
     */
    public boolean visitado(Nodo buscado){
        int Encontrar = buscado.getPosicion();
        Nodo aux = first;
        while (aux != null){
            if (aux.getPosicion() == Encontrar){
                return true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        return false;
    }
    
    /**
     * Metodo que imprime la lista en la consola
     */
    public void imprimir(){
        Nodo aux = first;
        while(aux != null){
            System.out.println(aux.getPosicion());
        }
    }
}
    
