
package resolucion;

/**
 * 
 * @author DMorales
 */

/**
 * Clase que tiene los objetos NodoPalabra y son los que se almacenan en la lista de palabras encontradas durante la busqueda BFS y DFS
 * Sus parametros son:
 * Palabra: Palabra encontrada durante la busqueda
 * tiempo: Tiempo que el programa se tardo en encontrar la palabra
 * siguiente: Apuntador al siguiente nodo, usado para crear la lista
 * anterior: Apuntador al nodo posterior, usado para crear la lista
 */ 
public class NodoPalabras {
    private String palabra;
    private long tiempo;
    private NodoPalabras siguiente;
    private NodoPalabras anterior;
    
    /*
    * Creador de la clase
    * Recive los parametros palabra y tiempo
    */
    public NodoPalabras(String palabra, long tiempo){
        this.siguiente=null;
        this.anterior=null;
        this.palabra = palabra;
        this.tiempo = tiempo;
    }
    
    /*
    * Metodo que regresa la palabra del nodo
    */
    public String getPalabra(){
        return palabra;
        }
    
    /*
    * Cambia el artributo palabra del Nodo por el string palabra pasado como paramtero
    */
    public void setPalabra(String Palabra){
        this.palabra = palabra;
    }
    
    /*
    * Metodo que regresa el nodo siguiente al seleccionado
    */
    public NodoPalabras getSiguiente() {
        return siguiente;
    }
    
    /*
    * Metodo que regresa el tiempo que se tardo el programa en encontrarlo
    */
    public long getTiempo(){
        return tiempo;
    }
    
    /*
    * Metodo que cambia el artributo tiempo por el pasado como parametro
    */
    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }
    
    /*
    * Metodo que cambia el artributo siguiente por el pasado por parametro
    */
    public void setSiguiente(NodoPalabras siguiente) {
        this.siguiente = siguiente;
    }
    
    /*
    * Metodo que regresa el nodo anterior al seleccionado
    */
    public NodoPalabras getAnterior() {
        return anterior;
    }

    /*
    * Metodo que cambia el artributo anterior por el pasado por parametro
    */
    public void setAnterior(NodoPalabras anterior) {
        this.anterior = anterior;
    }  
}