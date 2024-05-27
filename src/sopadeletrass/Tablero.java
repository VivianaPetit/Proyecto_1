/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopadeletrass;


/**
 *
 * @author
 */
public class Tablero {

    private char[][] letra;
    private int tamano;

    public Tablero(char[][] letra) {
        this.letra = letra;
        this.tamano = 4;
    }

    public char obtenerLetra(int fila, int columna) {
        return letra[fila][columna];
    }

    public boolean esAdyacente(int fila1, int col1, int fila2, int col2) {
        return Math.abs(fila1 - fila2) <= 1 && Math.abs(col1 - col2) <= 1 && !(fila1 == fila2 && col1 == col2);
    }

    public char[][] getLetra() {
        return letra;
    }

    public void setLetra(char[][] letra) {
        this.letra = letra;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

}
