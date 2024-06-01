/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author KelvinCi
 * @param <E>
 */
public class Lista<E> {
    private Nodo<E> first;
    private Nodo<E> last;
    private int length;
    
    /**
     * Contructor de la clase Lista 
    */
    public Lista(){
        this.first=null;
        this.last=null;
        this.length=0;
    }
    /**
    * @return true si la lista esta vacia.
    */
    public boolean esVacio(){
        return first == null;
    }
    
    /** 
    * Inserta un nuevo nodo al final de la lista. 
    *
    * @param info almacena la info para crear el nodo.
    */
    public void insertFinal(E info){
        Nodo nuevo=new Nodo(info);
        if(esVacio()){
            first=nuevo;
            last=nuevo;
        }else{
            Nodo aux = last;
            aux.setSiguiente(nuevo);
            last = nuevo;
        }
        length++;
        
    /**
     * Devuelve los elementos de una lista como una cadena.
     * 
     * @return String cadena con los elementos de la lista.
    */    
    }
     public String toString() {
        String cadena = "";
        if (esVacio()) {
            cadena = cadena + "No hay palabras en el diccionario"; 
        } else {
            Nodo aux = first;
            while (aux != null) {
                cadena = cadena + aux.getValor() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return cadena; 
    }
     
    public Nodo<E> getFirst() {
        return first;
    }

    public void setFirst(Nodo<E> first) {
        this.first = first;
    }

    public Nodo<E> getLast() {
        return last;
    }

    public void setLast(Nodo<E> last) {
        this.last = last;
    }

    public int getLenght() {
        return length;
    }

    public void setLenght(int lenght) {
        this.length = lenght;
    }
    
}
