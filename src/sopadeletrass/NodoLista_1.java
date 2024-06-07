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
    private NodoLista anterior;
    public NodoLista(char valor){
        this.siguiente=null;
        this.anterior=null;
        this.valor=valor;
    }

    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

    public NodoLista getDere() {
        return siguiente;
    }

    public void setDere(NodoLista dere) {
        this.siguiente = dere;
    }

    public NodoLista getIzq() {
        return anterior;
    }

    public void setIzq(NodoLista izq) {
        this.anterior = izq;
    }
    
}
