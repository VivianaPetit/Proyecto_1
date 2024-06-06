/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion;

import sopadeletrass2.Nodo;

/**
 *
 * @author Daniel Morales
 * 
 */
public class ListaNumeros {
    private Nodo first;
    private Nodo last;
    private int length;
    
    public ListaNumeros(){
        this.first=null;
        this.last=null;
        this.length=0;
    }

    public void insertarInicio(Nodo nodo){
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
    
    public void eliminar(Nodo nodo){
        Nodo aux = first;
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
    
     public void print() {
        if (first==null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo temp = first;
            while (temp != null) {
                System.out.print(  temp.getPosicion());
                temp = temp.getSiguiente();
            }
        }
    }
    public Nodo getFirst() {
        return first;
    }

    public void setFirst(Nodo first) {
        this.first = first;
    }

    public Nodo getLast() {
        return last;
    }

    public void setLast(Nodo last) {
        this.last = last;
    }

    public int getLenght() {
        return length;
    }

    public void setLenght(int lenght) {
        this.length = lenght;
    }
    
    public boolean visitado(Nodo buscado){
        int Encontrar = buscado.getPosicion();
        Nodo aux = first;
        while (aux != null){
            if (aux.getPosicion() == Encontrar){
                return true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        return false;
    }
    
    public void imprimir(){
        Nodo aux = first;
        while(aux != null){
            System.out.println(aux.getPosicion());
        }
    }
    
    public void limpiar(Nodo uno,Nodo dos, Nodo tres, Nodo cuatro, Nodo cinco, Nodo seis, Nodo siete, Nodo ocho, Nodo nueve, Nodo diez, Nodo once, Nodo doce, Nodo trece, Nodo catorce, Nodo quince, Nodo dieciseis){
        uno.setSiguiente(null);
        uno.setAnterior(null);
        
        dos.setSiguiente(null);
        dos.setAnterior(null);
        
        tres.setSiguiente(null);
        tres.setAnterior(null);
        
        cuatro.setSiguiente(null);
        cuatro.setAnterior(null);
        
        cinco.setSiguiente(null);
        cinco.setAnterior(null);
        
        seis.setSiguiente(null);
        seis.setAnterior(null);
        
        siete.setSiguiente(null);
        siete.setAnterior(null);
        
        ocho.setSiguiente(null);
        ocho.setAnterior(null);
        
        nueve.setSiguiente(null);
        nueve.setAnterior(null);
        
        diez.setSiguiente(null);
        diez.setAnterior(null);
        
        once.setSiguiente(null);
        once.setAnterior(null);
        
        doce.setSiguiente(null);
        doce.setAnterior(null);
        
        trece.setSiguiente(null);
        trece.setAnterior(null);
        
        catorce.setSiguiente(null);
        catorce.setAnterior(null);
        
        quince.setSiguiente(null);
        quince.setAnterior(null);
        
        dieciseis.setSiguiente(null);
        dieciseis.setAnterior(null);
    }
}

