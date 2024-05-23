/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopadeletrass;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class NodoGrafo {

    private char letra;
    private int x, y;//posicion en el tablero
    private List<NodoGrafo> adyacentes;

    public NodoGrafo(char letra, int x, int y) {
        this.letra = letra;
        this.x = x;
        this.y = y;
        this.adyacentes=new ArrayList<>();
        
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public List<NodoGrafo> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(List<NodoGrafo> adyacentes) {
        this.adyacentes = adyacentes;
    }

}
