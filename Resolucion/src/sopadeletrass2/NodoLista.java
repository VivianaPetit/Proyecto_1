/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass2;

/**
 *
 * @author KelvinCi
 */
public class NodoLista {
    private char letra;
    private int posicion;
    private NodoLista siguiente;
    private NodoLista anterior;
    public NodoLista(char letra){
        this.siguiente=null;
        this.anterior=null;
        this.letra=letra;
    }

    public char getValor() {
        return letra;
    }

    public void setValor(char valor) {
        this.letra = valor;
    }
    
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
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
