/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author KelvinCi
 */
public class Lista {
    private NodoLista first;
    private NodoLista last;
    private int length;
    
    /* Contructor de la clase Lista 
    */
    public Lista(){
        this.first=null;
        this.last=null;
        this.length=0;
    }
    /* 
    * @return <code>true</code> si la lista est&aacute vac&iacute.
    */
    public boolean esVacio(){
        return first == null;
    }
    
    public void insertFinal(char letra){
        NodoLista nuevo=new NodoLista(letra);
        if(esVacio()){
            first=nuevo;
            last=nuevo;
        }else{
            NodoLista aux = last;
            aux.setSiguiente(nuevo);
            last = nuevo;
        }
        length++;
    }
     public String printString() {
        String cadena = "";
        if (esVacio()) {
            cadena = cadena + "No hay palabras en el diccionario"; 
        } else {
            
            NodoLista aux = first;
            while (aux != null) {
                cadena = cadena + aux.getValor();
                aux = aux.getSiguiente();
            }
        }
        return cadena; 
    }
    public NodoLista getFirst() {
        return first;
    }

    public void setFirst(NodoLista first) {
        this.first = first;
    }

    public NodoLista getLast() {
        return last;
    }

    public void setLast(NodoLista last) {
        this.last = last;
    }

    public int getLenght() {
        return length;
    }

    public void setLenght(int lenght) {
        this.length = lenght;
    }
    
}
