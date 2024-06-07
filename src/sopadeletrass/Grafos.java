/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author KelvinCi
 */
public class Grafos {

    public boolean dirigido;
    public int max_nodos;
    public int num_vertices;
    public Adyacencia matriz_ady[][];
    public NodoGrafo[] letras;

    public Grafos(int max) {
        dirigido = false;
        max_nodos = max;
        num_vertices = 0;
        this.matriz_ady = new Adyacencia[max][max];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                matriz_ady[i][j] = matriz_ady[j][i] = new Adyacencia(false);
            }
        }
        letras = new NodoGrafo[max] ;
    }

    public void insertar_vertices(char letra) {
        NodoGrafo nuevo = new NodoGrafo(num_vertices, letra);
        letras[num_vertices] = nuevo;
        
        
        if (num_vertices + 1 <= max_nodos) {
            for (int i = 0; i < num_vertices + 1; i++) {
                for (int j = num_vertices; j < num_vertices + 1; j++) {
                    matriz_ady[i][j].es_adyacente = matriz_ady[j][i].es_adyacente = false;
                    matriz_ady[i][j].destino = matriz_ady[j][i].origen= nuevo;
                    matriz_ady[i][j].origen = matriz_ady[j][i].origen= letras[i];
                }
            }
            num_vertices += 1;
        }
    }

    public void insertarArista(int i, int j) {
        matriz_ady[i][j].es_adyacente = true;
        if (!dirigido) {
            matriz_ady[j][i].es_adyacente = true;
        }
    }

    public void eliminarArista(int i, int j) {
        matriz_ady[i][j].es_adyacente = false;
        if (!dirigido) {
            matriz_ady[j][i].es_adyacente = false;
        }
    }

    public int gradoIn(int j) {
        int gIn = 0;
        for (int i = 0; i < num_vertices; i++) {
            if (matriz_ady[i][j].es_adyacente) {
                gIn++;
            }
        }
        return gIn;
    }

    public int gradoOut(int i) {
        int gOut = 0;
        for (int j = 0; j < num_vertices; j++) {
            if (matriz_ady[i][j].es_adyacente) {
                gOut++; // manteniendo la posición de la fila en [i]
            }
        }
        return gOut;
    }

    public int incidencia(int i) {
        if (!dirigido) {
            return gradoIn(i);
        } else {
            return gradoIn(i) + gradoOut(i);
        }
    }

    public int tamano() {
        int tm = 0;
        for (int i = 0; i < num_vertices; i++) {
            for (int j = 0; j < num_vertices; j++) {
                if (matriz_ady[i][j].es_adyacente) {
                    tm++;
                }
            }
        }
        if (dirigido) {
            return tm;
        } else {
            return tm / 2;
        }
    }

    public void imprimirTabla() {
        System.out.println("La matriz contiene " + num_vertices + " vértices: \n");
        for (int i = 0; i < num_vertices; i++) {
            for (int j = 0; j < num_vertices; j++) {
                if (matriz_ady[i][j].es_adyacente) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}
