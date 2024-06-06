/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucion;

/**
 * Insertar cronometro
 * @author DMorales
 */
public class NodoPalabras {
    private String palabra;
    private long tiempo;
    // Tiempo que se tardo el cronometro en encontrarlo
    private NodoPalabras siguiente;
    private NodoPalabras anterior;
    
    public NodoPalabras(String palabra, long tiempo){
        this.siguiente=null;
        this.anterior=null;
        this.palabra = palabra;
        this.tiempo = tiempo;
    }
    
    public String getPalabra(){
        return palabra;
    }
    
    public NodoPalabras getSiguiente() {
        return siguiente;
    }
    
    public long getTiempo(){
        return tiempo;
    }
    
    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public void setSiguiente(NodoPalabras siguiente) {
        this.siguiente = siguiente;
    }

    public NodoPalabras getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPalabras anterior) {
        this.anterior = anterior;
    }  
}