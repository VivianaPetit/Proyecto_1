/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucion;

/**
 *
 * @author DMorales
 */
public class ListaPalabras {
    private NodoPalabras first;
    private NodoPalabras last;
    private int length;
    
    public ListaPalabras(){
        this.first=null;
        this.last=null;
        this.length=0;
    }
    
    public void insertarInicio(String palabra, long tiempo){
        NodoPalabras nodo = new NodoPalabras(palabra,tiempo);
        if(first==null){
            first=nodo;
            last=nodo;
            length = length + 1;
        }
        else{
            nodo.setSiguiente(first);
            first.setAnterior(nodo);
            first=nodo;
            length = length + 1;
        }
    }
    public void eliminar(NodoPalabras nodo){
        NodoPalabras aux = first;
        while (aux != null){
            if (aux == nodo){
                if (aux == first){
                    first = aux.getSiguiente();
                    aux.getSiguiente().setAnterior(null);
                }
                if (aux == last){
                    last = aux.getAnterior();
                    aux.getAnterior().setSiguiente(null);
                }
                else {
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                }
            }
            else {
                aux = aux.getSiguiente();
        }
        
        }
    }
    
    public boolean encontrar(String palabra){
        NodoPalabras aux = first;
        while (aux != null){
            if (aux.getPalabra().contentEquals(palabra)){
                return true;
            }
            else {
                aux = aux.getSiguiente();
            }
        }
        return false;
    }
    
    public void imprimirLista(){
        NodoPalabras aux = first;
        while (aux != null){
            System.out.println("Palabra encontrada   " + aux.getPalabra() + "   Tiempo   " + aux.getTiempo());
            aux = aux.getSiguiente();
        }
                
    }
}
