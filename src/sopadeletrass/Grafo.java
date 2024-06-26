/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;


/**
 *
 * @author KelvinCi
 */
public class Grafo {

    public static boolean dirigido;
    public static int max_nodos;
    public static int num_vertices;
    public static Adyacencia matriz_ady[][];
    public static NodoGrafo[] letras;

    public Grafo(int max) {
        dirigido = false;
        max_nodos = max;
        num_vertices = 0;
        this.matriz_ady = new Adyacencia[max][max];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                matriz_ady[i][j] = matriz_ady[j][i] = new Adyacencia(false);
            }
        }
        letras = new NodoGrafo[max];
    }
    
    /**
     * Crea un v&eacute;rtice del grafo.
     * @param letra con el valor del v&eacute;rtice.
     */
    public void insertar_vertices(char letra) {
        NodoGrafo nuevo = new NodoGrafo(num_vertices, letra);
        letras[num_vertices] = nuevo;

        if (num_vertices + 1 <= max_nodos) {
            for (int i = 0; i < num_vertices + 1; i++) {
                for (int j = num_vertices; j < num_vertices + 1; j++) {
                    matriz_ady[i][j].es_adyacente = matriz_ady[j][i].es_adyacente = false;
                    matriz_ady[i][j].destino = matriz_ady[j][i].origen = nuevo;
                    matriz_ady[i][j].origen = matriz_ady[j][i].origen = letras[i];
                }
            }
            num_vertices += 1;
        }
    }

    /**
     * Crea una arista entre dos v&eacute;rtices.
     * 
     * @param i <code>int</code> con la posici&oacute;n del v&eacute;rtice.
     * @param j <code>int</code> con la posici&oacute;n del v&eacute;rtice.
     */
    public void insertarArista(int i, int j) {
        matriz_ady[i][j].es_adyacente = true;
        if (!dirigido) {
            matriz_ady[j][i].es_adyacente = true;
        }
    }

    /**
     * Elimina una arista entre dos v&eacute;rtices.
     * @param i <code>int</code> con la posici&oacute;n del v&eacute;rtice.
     * @param j <code>int</code> con la posici&oacute;n del v&eacute;rtice.
     */
    public void eliminarArista(int i, int j) {
        matriz_ady[i][j].es_adyacente = false;
        if (!dirigido) {
            matriz_ady[j][i].es_adyacente = false;
        }
    }

    /**
     * M&eacute;todo para imprimir el grafo.
     */
    public void imprimirTabla() {
        for (int i = 0; i < num_vertices; i++) {
            System.out.print(this.letras[i].letra + "   ");
            for (int j = 0; j < num_vertices; j++) {
                if (matriz_ady[i][j].es_adyacente) {
                    System.out.print(this.letras[j].letra);
                }
            }
            System.out.println("");
        }
    }


    /**
     * Algoritmo de recorrido DFS.
     * 
     * @param palabra a buscar.
     * @return un <code>array</code> con el recorrido. 
     */
    public NodoGrafo[] dfs(String palabra) {
        boolean[] visited = new boolean[num_vertices];
        for (int i = 0; i < 16; i++) {
            visited[i] = false;
        }
        NodoGrafo[] found = new NodoGrafo[palabra.length()];
        for (int i = 0; i < 16; i++) {
            if (letras[i].letra == palabra.charAt(0)) {
                found[0] = letras[i];
                found = dfsRecursive(i, visited, palabra, found, 1);
            }
        }
        return found;
    }

    /**
     * M&eacute;todo recursivo de recorrido DFS.
     * 
     * @param vertex <code>int</code> con la posici&oacute;n del v&eacute;rtice.
     * @param visited <code>array</code> de booleanos con los v&eacute;rtices visitados.
     * @param palabra palabra a buscar.
     * @param np <code>array</code> de NodoGrafo con la ruta encontrada.
     * @param pos <code>int</code> con el &iacute;ndice actual de la palabra a buscar.
     * @return un <code>array</code> con el recorrido. 
     */
    public NodoGrafo[] dfsRecursive(int vertex, boolean[] visited, String palabra, NodoGrafo[] np, int pos) {
        visited[vertex] = true;
        if (pos == palabra.length()) {
            return np;
        }
        for (int i = 0; i < num_vertices; i++) {
            boolean l = this.letras[i].letra == palabra.charAt(pos);
            if (matriz_ady[vertex][i].es_adyacente && !visited[i] && this.letras[i].letra == palabra.charAt(pos)) {
                np[pos] = this.letras[i];
                np = dfsRecursive(i, visited, palabra, np, pos + 1);
            }
        }
        return np;
    }
    
     /**
     * M&eacute;todo que itera sobre todos los v&eacute;rtices del grafo 
     * y llama a la funci&oacute;n bfsSearchFromVertex por cada uno de ellos.
     * 
     * @param word palabra a buscar.
     * @return un <code>AuxiliarBFS</code> con el recorrido. 
     */
    public AuxiliarBFS bfsSearch(String word) {
    AuxiliarBFS aux = new AuxiliarBFS();
    for (int i = 0; i < num_vertices; i++) {
        if (bfsSearchFromVertex(i, word, aux)) {
            return aux;
        }
    }
    return aux;
}

    /**
     * M&eacute;todo que hace el recorrido BFS desde el v&eacute;rtice 
     * para encontrar una ruta que forme la palabra buscada.
     * 
     * 
     * @param start <code>int</code> con la posici&oacute;n del v&eacute;rtice.
     * @param word palabra a buscar.
     * @param aux  <code>array</code> de v&eacute;rtices visitados.
     * @return un <code>array</code> con el recorrido. 
     */
    private boolean bfsSearchFromVertex(int start, String word, AuxiliarBFS aux) {
        boolean[] visited = new boolean[num_vertices];
        Cola<Integer> cola = new Cola<>();

        cola.encolar(start);
        visited[start] = true;

        while (!cola.estaVacia()) {
            int vertex = cola.desencolar();
            if (bfsSearchFromVertexHelper(vertex, word, 0, visited, aux)) {
                aux.encontrado = true;
                return true;
            }

            for (int i = 0; i < num_vertices; i++) {
                if (matriz_ady[vertex][i].es_adyacente && !visited[i]) {
                    cola.encolar(i);
                    visited[i] = true;
                }
            }
        }

        return false;
    }

     /**
     * M&eacute;todo recursivo que hace el recorrido BFS desde un v&eacute;rtice.
     * 
     * @param vertex <code>int</code> con la posici&oacute;n del v&eacute;rtice.
     * @param word palabra a buscar.
     * @param index 
     * @param visited <code>array</code> de booleanos con los v&eacute;rtices visitados.
     * @param aux <code>array</code> de v&eacute;rtices visitados.
     * @return <code>false</code> si el ciclo se completa sin encontrar coincidencias.
     */
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
}
