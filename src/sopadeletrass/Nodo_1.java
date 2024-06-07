/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SopaDeLetrass;

/**
 *
 * @author KelvinCi
 */
public class Nodo_1 {

    private String letra;
    
    private Nodo_1 izq;
    private Nodo_1 der;
    private Nodo_1 arriba;
    private Nodo_1 abajo;
    private Nodo_1 DiagonalArribaDerecha;
    private Nodo_1 DiagonalArribaIzquierda;
    private Nodo_1 DiagonalAbajoDerecha;
    private Nodo_1 DiagonalAbajoIzquierda;
    public Nodo_1(String letra){
        this.letra=letra;
        this.DiagonalAbajoDerecha=null;
        this.DiagonalAbajoIzquierda=null;
        this.DiagonalArribaDerecha=null;
        this.DiagonalArribaIzquierda=null;
        this.abajo=null;
        this.arriba=null;
        this.der=null;
        this.izq=null;
        
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Nodo_1 getIzq() {
        return izq;
    }

    public void setIzq(Nodo_1 izq) {
        this.izq = izq;
    }

    public Nodo_1 getDer() {
        return der;
    }

    public void setDer(Nodo_1 der) {
        this.der = der;
    }

    public Nodo_1 getArriba() {
        return arriba;
    }

    public void setArriba(Nodo_1 arriba) {
        this.arriba = arriba;
    }

    public Nodo_1 getAbajo() {
        return abajo;
    }

    public void setAbajo(Nodo_1 abajo) {
        this.abajo = abajo;
    }

    public Nodo_1 getDiagonalArribaDerecha() {
        return DiagonalArribaDerecha;
    }

    public void setDiagonalArribaDerecha(Nodo_1 DiagonalArribaDerecha) {
        this.DiagonalArribaDerecha = DiagonalArribaDerecha;
    }

    public Nodo_1 getDiagonalArribaIzquierda() {
        return DiagonalArribaIzquierda;
    }

    public void setDiagonalArribaIzquierda(Nodo_1 DiagonalArribaIzquierda) {
        this.DiagonalArribaIzquierda = DiagonalArribaIzquierda;
    }

    public Nodo_1 getDiagonalAbajoDerecha() {
        return DiagonalAbajoDerecha;
    }

    public void setDiagonalAbajoDerecha(Nodo_1 DiagonalAbajoDerecha) {
        this.DiagonalAbajoDerecha = DiagonalAbajoDerecha;
    }

    public Nodo_1 getDiagonalAbajoIzquierda() {
        return DiagonalAbajoIzquierda;
    }

    public void setDiagonalAbajoIzquierda(Nodo_1 DiagonalAbajoIzquierda) {
        this.DiagonalAbajoIzquierda = DiagonalAbajoIzquierda;
    }
    
}
