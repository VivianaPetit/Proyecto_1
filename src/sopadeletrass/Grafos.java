/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

<<<<<<< HEAD
import java.util.LinkedList;
import java.util.Queue;

=======
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7
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
<<<<<<< HEAD
        letras = new NodoGrafo[max];
=======
        letras = new NodoGrafo[max] ;
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7
    }

    public void insertar_vertices(char letra) {
        NodoGrafo nuevo = new NodoGrafo(num_vertices, letra);
        letras[num_vertices] = nuevo;
<<<<<<< HEAD

=======
        
        
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7
        if (num_vertices + 1 <= max_nodos) {
            for (int i = 0; i < num_vertices + 1; i++) {
                for (int j = num_vertices; j < num_vertices + 1; j++) {
                    matriz_ady[i][j].es_adyacente = matriz_ady[j][i].es_adyacente = false;
<<<<<<< HEAD
                    matriz_ady[i][j].destino = matriz_ady[j][i].origen = nuevo;
                    matriz_ady[i][j].origen = matriz_ady[j][i].origen = letras[i];
=======
                    matriz_ady[i][j].destino = matriz_ady[j][i].origen= nuevo;
                    matriz_ady[i][j].origen = matriz_ady[j][i].origen= letras[i];
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7
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
<<<<<<< HEAD
            System.out.print(this.letras[i].letra + "   ");
            for (int j = 0; j < num_vertices; j++) {
                if (matriz_ady[i][j].es_adyacente) {
                    System.out.print(this.letras[j].letra);
=======
            for (int j = 0; j < num_vertices; j++) {
                if (matriz_ady[i][j].es_adyacente) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7
                }
            }
            System.out.println("");
        }
    }
<<<<<<< HEAD


    public NodoGrafo[] dfs(String palabra) {
        boolean[] visited = new boolean[num_vertices];
        for (int i = 0; i < 16; i++) {
            visited[i] = false;
        }
        NodoGrafo[] found = new NodoGrafo[palabra.length()];
        for (int i = 0; i < 16; i++) {
            if (letras[i].letra == palabra.charAt(0)) {
//                System.out.println("Inicio " + letras[i].letra);
                found[0] = letras[i];
                found = dfsRecursive(i, visited, palabra, found, 1);
            }
        }

        return found;
    }

    private NodoGrafo[] dfsRecursive(int vertex, boolean[] visited, String palabra, NodoGrafo[] np, int pos) {
        visited[vertex] = true;
        if (pos == palabra.length()) {
            return np;
        }
//        traversal.append(letras[vertex].letra);

        for (int i = 0; i < num_vertices; i++) {
            boolean l = this.letras[i].letra == palabra.charAt(pos);
//            System.out.println(matriz_ady[vertex][i].es_adyacente + "  " + palabra.charAt(pos) + " y " + this.letras[i].letra + " = " + l);
            if (matriz_ady[vertex][i].es_adyacente && !visited[i] && this.letras[i].letra == palabra.charAt(pos)) {
                np[pos] = this.letras[i];
//                System.out.println("Letra: " + this.letras[i].letra);
                np = dfsRecursive(i, visited, palabra, np, pos + 1);
            }
        }
        return np;
    }

    public AuxiliarBFS bfsSearch(String word) {
    AuxiliarBFS aux = new AuxiliarBFS();
    for (int i = 0; i < num_vertices; i++) {
        if (bfsSearchFromVertex(i, word, aux)) {
            return aux;
        }
    }
    return aux;
}

private boolean bfsSearchFromVertex(int start, String word, AuxiliarBFS aux) {
    boolean[] visited = new boolean[num_vertices];
    Queue<Integer> queue = new LinkedList<>();

    queue.add(start);
    visited[start] = true;

    while (!queue.isEmpty()) {
        int vertex = queue.poll();
        if (bfsSearchFromVertexHelper(vertex, word, 0, visited, aux)) {
            aux.encontrado = true;
            return true;
        }

        for (int i = 0; i < num_vertices; i++) {
            if (matriz_ady[vertex][i].es_adyacente && !visited[i]) {
                queue.add(i);
                visited[i] = true;
            }
        }
    }

    return false;
}

private boolean bfsSearchFromVertexHelper(int vertex, String word, int index, boolean[] visited, AuxiliarBFS aux) {
    if (index == word.length()) {
        return true;
    }

    if (letras[vertex].letra != word.charAt(index)) {
        return false;
    }

    aux.recorrido[index] = letras[vertex];

    for (int i = 0; i < num_vertices; i++) {
        if (matriz_ady[vertex][i].es_adyacente && !visited[i]) {
            visited[i] = true;
            if (bfsSearchFromVertexHelper(i, word, index + 1, visited, aux)) {
                return true;
            }
            visited[i] = false;
        }
    }

    return false;
}

    public void reboot(boolean[] visitados) {
        for (int i = 0; i < this.num_vertices; i++) {
            visitados[i] = false;

        }
    }
=======
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7
}
