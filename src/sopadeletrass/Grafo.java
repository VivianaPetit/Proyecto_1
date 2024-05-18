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
	private NodoGrafo grafo[];
	private int nroVertices;
	
	public Grafo(int nroVertices){
		this.nroVertices = nroVertices;
		grafo = new NodoGrafo[this.nroVertices];
		
		for(int i = 0; i < grafo.length; i++){
			grafo[i] = null;
		}
	}
	
	public boolean existeArista(int v1, int v2){
		NodoGrafo actual = grafo[v1];
		while(actual != null){
			if(actual.vertice == v2) return true;
			actual = actual.sgte;
		}
		return false;
	}
	
	public void insertarArista(int v1, int v2, int peso){
		if(!existeArista(v1, v2)){
			NodoGrafo nuevo = new NodoGrafo(v2, peso);
			
			if(grafo[v1] == null){
				grafo[v1] = nuevo;
				insertarArista(v2, v1,peso);				
			}
			else{
				NodoGrafo actual = grafo[v1];
				
				while(actual.sgte != null)
				{ 
					actual = actual.sgte;
				}
				actual.sgte = nuevo;
				insertarArista(v2,v1,peso);				
			}
		}		
	}
	
	public void eliminarArista(int v1, int v2){
		if(existeArista(v1, v2)){
			if(grafo[v1].vertice == v2){
				grafo[v1] = grafo[v1].sgte;
				eliminarArista(v2,v1);
				return;
			}
			NodoGrafo actual = grafo[v1].sgte;
			NodoGrafo anterior = grafo[v1];
			
			while(actual != null){
				if(actual.vertice == v2){
					anterior.sgte = actual.sgte;
					eliminarArista(v2,v1);
					return;
				}
				anterior = actual;
				actual = actual.sgte;
			}
		}		
	}
	
	public void mostrarGrafo(){
		for( int i = 0; i < grafo.length; i++){
			NodoGrafo actual = grafo[i];
			
			while(actual != null){
				System.out.printf("%d -> " , i);
				System.out.printf("%d(%d) \n" , actual.vertice, actual.pesoArista);
				
				actual = actual.sgte;
			}
			System.out.println();
		}
	}
	
	public void eliminarGrafo(){
		for( int i = 0; i < grafo.length; i++){
			grafo[i] = null;
		}
	}

    public NodoGrafo[] getGrafo() {
        return grafo;
    }

    public void setGrafo(NodoGrafo[] grafo) {
        this.grafo = grafo;
    }

    public int getNroVertices() {
        return nroVertices;
    }

    public void setNroVertices(int nroVertices) {
        this.nroVertices = nroVertices;
    }
  
}
