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

    // Constructor para crear una cola vacía
    public Cola() {
        primero = null;
        ultimo = null;
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return primero == null;
    }

    // Método para encolar un elemento
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

    // Método para desencolar un elemento.
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

    // Método para obtener el primer elemento de la cola (sin eliminarlo)
    public E primerElemento() {
        if (estaVacia()) {
            return null;
        } else {
            return primero.getValor();
        }
    }
}
