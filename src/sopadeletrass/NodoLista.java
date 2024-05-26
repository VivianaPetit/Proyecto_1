/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author KelvinCi
 */
public class NodoLista {
    private char valor;
    private NodoLista siguiente;
    
    public NodoLista(char valor){
        this.siguiente=null;
        this.valor=valor;
    }

    public char getValor() {
        return valor;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
}
