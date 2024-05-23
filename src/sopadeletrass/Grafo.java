/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopadeletrass;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * 
 */
public class Grafo {
    private NodoGrafo[][] tablero;
    private int size=4;
    public Grafo(char[][]letras){
        tablero=new NodoGrafo[size][size];
        for(int i=0;i<size;i++){
            for (int j = 0; j < size; j++) {
                tablero[i][j]=new NodoGrafo(letras[i][j],i,j);
            }
        }
        
        conectarnodos();
    }
    public final void conectarnodos(){
        int[] dx={-1,-1,-1,0,0,1,1,1};
        int[] dy={-1,0,1,-1,1,-1,0,1};
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                NodoGrafo nodo=tablero[i][j];
                for (int k = 0; k < 8; k++) {
                    int newx=i+dx[k];
                    int newy=j+dy[k];
                    if (newx>=0&&newx<size&&newy>=0&&newy<size) {
                        nodo.getAdyacentes().add(tablero[newx][newy]);
                    }
                }
            }
            
        }
    }
     
     public static void imprimirGrafo(Grafo grafo) {
        NodoGrafo[][] tablero = grafo.getTablero();
        int size = grafo.getSize();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                NodoGrafo nodo = tablero[i][j];
                System.out.print("Nodo (" + nodo.getLetra() + " en [" + i + "," + j + "]) -> Adyacentes: ");
                for (NodoGrafo adyacente : nodo.getAdyacentes()) {
                    System.out.print(adyacente.getLetra() + " ");
                }
                System.out.println();
            }
        }
     }
    public NodoGrafo[][] getTablero() {
        return tablero;
    }

    public void setTablero(NodoGrafo[][] tablero) {
        this.tablero = tablero;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
