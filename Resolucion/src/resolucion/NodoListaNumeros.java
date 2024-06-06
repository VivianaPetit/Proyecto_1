/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion;

import sopadeletrass2.Nodo;

/**
 *
 * @author Daniel Morales
 */
public class NodoListaNumeros {
    private Nodo nodo;
    private NodoListaNumeros siguiente;
    private NodoListaNumeros anterior;
    
    public NodoListaNumeros(Nodo nodo){
        this.siguiente=null;
        this.anterior=null;
        this.nodo = nodo;
    }

    public int getPosicion() {
        return nodo.getPosicion();
    }

    public void setPosicion(int posicion) {
        this.nodo.setPosicion(posicion);
    }
    
    public Nodo getNodo(){
        return nodo;
    }
    
    public String getLetra() {
        return nodo.getLetra();
    }
    
    public void setValor(String valor) {
        this.nodo.setLetra(valor);
    }

    public NodoListaNumeros getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaNumeros siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaNumeros getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaNumeros anterior) {
        this.anterior = anterior;
    }  
}

