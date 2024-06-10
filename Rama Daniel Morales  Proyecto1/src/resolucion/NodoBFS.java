
package resolucion;

import sopadeletrass2.Nodo;

/**
 *
 * @author DMorales
 */

/**
 * Clase que tiene los objetos NodoBFS usados para almacenar informacion para la busqueda BFS
 * Sus parametros son:
 * Palabra: Contiene un String en donde se guarda la palabra formada por las letras de los nodos visitados
 * Nodo: contiene el nodo actual en que se encuentra el grafo durante la busqueda
 * ListaVisitados: Lista con los nodos que han sido visitados por el programa en esta rama del arbol
 * siguiente: Apuntador al siguiente nodo, usado para crear la lista
 * anterior: Apuntador al nodo posterior, usado para crear la lista
 */ 
public class NodoBFS {
    private ListaNumeros ListaVisitados;
    private Nodo nodo;
    private String palabra;
    private NodoBFS siguiente;
    private NodoBFS anterior;
    
    // Creador de la clase 
    public NodoBFS(Nodo nodo, String palabra, ListaNumeros ListaVisitados){
        this.ListaVisitados = ListaVisitados;
        this.nodo = nodo;
        this.palabra = palabra;
        this.siguiente = null;
        this.anterior = null;
    }
    
    /**
     *
     * Metodo que retorna la lista de los nodos ya visitados en esta rama
     */
    public ListaNumeros getLista(){
        return this.ListaVisitados;
    }    
    
    /**
     *
     * Metodo que cambia la lista por una nueva pasada por parametro
     */
    public void setLista(ListaNumeros ListaVisitados){
        this.ListaVisitados = ListaVisitados;
    }
    
    /**
     *
     * Metodo que regresa el nodo 
     */
    public Nodo getNodo(){
        return this.nodo;
    }
    
    /**
     *
     * Metodo que cambia el nodo por el pasado por parametro
     */
    public void setNodo(Nodo nodo){
        this.nodo = nodo;
    }
    
    /**
     *
     * Metodo que retorna la palabra del nodo
     */
    public String getPalabra(){
        return this.palabra;    
    }
    
    /**
     *
     * Metodo que cambia la palabra del nodo por la pasada por el parametro
     */
    public void setPalabra(String Palabra){
        this.palabra = Palabra;
    }
    
    /**
     *
     * Metodo que retorna el nodo siguiente en la lista
     */
    public NodoBFS getSiguiente(){
        return this.siguiente;
    }
    
    /**
     *
     * Metodo que cambia el siguiente de la lista
     */
    public void setSiguiente(NodoBFS nodo){
        this.siguiente = nodo;
    }
    
    /**
     *
     * Metodo que retorna el nodo anterior en la lista
     */
    public NodoBFS getAnterior(){
        return this.anterior;
    }
    
    /**
     *
     * Metodo que cambia el nodo anterior a este
     */
    public void setAnterior(NodoBFS nodo){
        this.anterior = nodo;
    }
}