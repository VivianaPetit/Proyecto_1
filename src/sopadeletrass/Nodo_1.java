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
    
    private Nodo izq;
    private Nodo der;
    private Nodo arriba;
    private Nodo abajo;
    private Nodo DiagonalArribaDerecha;
    private Nodo DiagonalArribaIzquierda;
    private Nodo DiagonalAbajoDerecha;
    private Nodo DiagonalAbajoIzquierda;
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

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public Nodo getArriba() {
        return arriba;
    }

    public void setArriba(Nodo arriba) {
        this.arriba = arriba;
    }

    public Nodo getAbajo() {
        return abajo;
    }

    public void setAbajo(Nodo abajo) {
        this.abajo = abajo;
    }

    public Nodo getDiagonalArribaDerecha() {
        return DiagonalArribaDerecha;
    }

    public void setDiagonalArribaDerecha(Nodo DiagonalArribaDerecha) {
        this.DiagonalArribaDerecha = DiagonalArribaDerecha;
    }

    public Nodo getDiagonalArribaIzquierda() {
        return DiagonalArribaIzquierda;
    }

    public void setDiagonalArribaIzquierda(Nodo DiagonalArribaIzquierda) {
        this.DiagonalArribaIzquierda = DiagonalArribaIzquierda;
    }

    public Nodo getDiagonalAbajoDerecha() {
        return DiagonalAbajoDerecha;
    }

    public void setDiagonalAbajoDerecha(Nodo DiagonalAbajoDerecha) {
        this.DiagonalAbajoDerecha = DiagonalAbajoDerecha;
    }

    public Nodo getDiagonalAbajoIzquierda() {
        return DiagonalAbajoIzquierda;
    }

    public void setDiagonalAbajoIzquierda(Nodo DiagonalAbajoIzquierda) {
        this.DiagonalAbajoIzquierda = DiagonalAbajoIzquierda;
    }
    
}
