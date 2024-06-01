/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author KelvinCi
 * @param <E>
 */
public class Nodo<E> {
    private E valor;
    private Nodo siguiente;
    
    public Nodo (E valor){
        this.siguiente=null;
        this.valor=valor;
    }

    public E getValor() {
        return valor;
    }

    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }
    
}
