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
    private int numVertices; // Número de vértices del grafo
    private Lista<Vertice> vertices; // Arreglo de vértices de tipo char
    private int[][] ady; // Matriz de adyacencia

    // Constructor del grafo
    public Grafo(Lista<Vertice> vertices) {
        this.numVertices = vertices.getLenght();
        this.vertices = vertices;
        this.ady = new int[numVertices][numVertices];

        // Inicializar la matriz de adyacencia con 0 (sin conexiones)
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                ady[i][j] = 0;
            }
        }
    }
    
    public int getIndiceVertice(Vertice vertice){
        Nodo<Vertice> verticeNodo= vertices.getFirst();
        for (int i = 0; i < vertices.getLenght(); i++) {
            if (verticeNodo.getValor().getLetra() == vertice.getLetra()) {
                return i;
            }
            verticeNodo = verticeNodo.getSiguiente();
        }
        return -1; // Vertice no encontrado
    }
    

    // Obtener el índice de un vértice en la lista.
    public boolean existeVertice(Vertice vertice) {
        Nodo<Vertice> verticeList= vertices.getFirst();
        for (int i = 0; i < numVertices; i++) {
            if (verticeList.getValor().getLetra() == vertice.getLetra()) {
                return true;
            }
            verticeList = verticeList.getSiguiente();
        }
        return false; // Vertice no encontrado
    }

    // Agregar una arista entre dos vértices
    public void agregarArista(Vertice u, Vertice v) {
        int indiceU = getIndiceVertice(u);
        int indiceV = getIndiceVertice(v);

        if (indiceU != -1 && indiceV != -1) {
            ady[indiceU][indiceV] = 1;
            ady[indiceV][indiceU] = 1; // Conexiones no dirigidas
        } else {
            System.out.println("Error: Vertices no encontrados");
        }
    }

    // Eliminar una arista entre dos vértices
    public void eliminarArista(Vertice u, Vertice v) {
        int indiceU = getIndiceVertice(u);
        int indiceV = getIndiceVertice(v);

        if (indiceU != -1 && indiceV != -1) {
            ady[indiceU][indiceV] = 0;
            ady[indiceV][indiceU] = 0;
        } else {
            System.out.println("Error: Vertices no encontrados");
        }
    }

    // Verificar si dos vértices están conectados
    public boolean estanConectados(Vertice u, Vertice v) {
        int indiceU = getIndiceVertice(u);
        int indiceV = getIndiceVertice(v);

        if (indiceU != -1 && indiceV != -1) {
            return ady[indiceU][indiceV] == 1;
        } else {
            return false;
        }
    }

    // Mostrar la matriz de adyacencia
    public void mostrarMatrizAdyacencia() { 
        Nodo<Vertice> vertice = vertices.getFirst();
        System.out.print(" ");
        for (int i = 0; i< numVertices; i++) {           
            System.out.print(" " + vertice.getValor().getLetra());
            vertice = vertice.getSiguiente();
        }
        System.out.println();
        vertice = vertices.getFirst();
        for (int i = 0; i < numVertices; i++) {
            System.out.print(vertice.getValor().getLetra() + " ");
            for (int j = 0; j < numVertices; j++) {                           
                System.out.print(ady[i][j] + " ");
            }
            vertice = vertice.getSiguiente();
            System.out.println();
        }
    }
}
