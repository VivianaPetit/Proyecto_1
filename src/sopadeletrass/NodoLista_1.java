/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author KelvinCi
 */
public class NodoLista_1 {
    private char valor;
    private NodoLista_1 siguiente;
    private NodoLista_1 anterior;
    public NodoLista_1(char valor){
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

    public NodoLista_1 getDere() {
        return siguiente;
    }

    public void setDere(NodoLista_1 dere) {
        this.siguiente = dere;
    }

    public NodoLista_1 getIzq() {
        return anterior;
    }

    public void setIzq(NodoLista_1 izq) {
        this.anterior = izq;
    }
    
}
