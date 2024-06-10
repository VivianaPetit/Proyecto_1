/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author VivianaPetit
 * @param <E>
 */
public class Cola<E> {
private Nodo<E> primero;
private Nodo<E> ultimo;

    /**
     * Constructor de la clase Cola.
     */
    public Cola() {
        primero = null;
        ultimo = null;
    }

    /**
     * Verifica si la cola est&aacute; vac&iacute;a;.
     * @return <code>true</code> si la cola est&aacute; vac&iacute;.
     */
    public boolean estaVacia() {
        return primero == null;
    }

    /**
     * Inserta un nuevo elemento a la cola.
     * @param dato valor del nodo a insertar.
     */
    public void encolar(E dato) {
        Nodo<E> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

     /**
     * Elimina y devuelve el primer elemento de la cola.
     * @return el valor del nodo eliminado de la cola.
     */
    public E desencolar() {
        if (estaVacia()) {
            return null;
        } else {
            E dato = primero.getValor();
            primero = primero.getSiguiente();
            if (primero == null) {
                ultimo = null;
            }
            return dato;
        }
    }
    
    /**
     * Obtiene el primer nodo de la cola.
     * @return el primer nodo de la cola.
     */
    public Nodo<E> getPrimero() {
        return primero;
    }

    /**
     * Obtiene el &uacute;ltimo nodo de la cola.
     * @return el &uacute;ltimo nodo de la cola.
     */
    public Nodo<E> getUltimo() {
        return ultimo;
    }

    /**
     * Setea el primer nodo de la cola.
     * @param primero nuevo primer nodo.
     */
    public void setPrimero(Nodo<E> primero) {
        this.primero = primero;
    }

    /**
     * Setea el &uacute;ltimo nodo de la cola.
     * @param ultimo nuevo &uacute;ltimo nodo. 
     */
    public void setUltimo(Nodo<E> ultimo) {
        this.ultimo = ultimo;
    }
   
}
