/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author KelvinCi
 */
public class NodoGrafo {
   
	int vertice;
	int pesoArista;
	NodoGrafo sgte;
	
	public NodoGrafo(int v, int p){
		this.vertice = v;
		this.pesoArista = p;
		
		sgte = null;
	}

    
}
