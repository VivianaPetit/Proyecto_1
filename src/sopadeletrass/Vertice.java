/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author VivianaPetit
 */
public class Vertice {   
    private char letra;   
    private int fila;
    private int columna; 

    public Vertice(char letra, int fila, int columna) {
        this.letra = letra;
        this.fila = fila;
        this.columna = columna;
    }

    public char getLetra() {
        return letra;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
    
}
