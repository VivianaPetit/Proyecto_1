/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author KelvinCi
 */
public class Listaexamples {
    private NodoLista first;
    private NodoLista last;
    private int length;
    public Listaexamples(){
        this.first=null;
        this.last=null;
        this.length=0;
    }

    public void insertarbegin(char letra){
        NodoLista letras=new NodoLista(letra);
        if(first==null){
            first=letras;
            last=letras;
            length++;
        }else{
            letras.setDere(first);
            first.setIzq(letras);
            first=letras;
            length++;
        }
    }
    public void insertFinal(char letra){
        NodoLista nuevo=new NodoLista(letra);
        if(first==null){
            first=nuevo;
            last=nuevo;
        }else{
            last.setDere(nuevo);
            nuevo.setIzq(last);
            last=nuevo;
        }
    }
     public void print() {
        if (first==null) {
            System.out.println("Lista Vacia");
        } else {
            NodoLista temp = first;
            while (temp != null) {
                System.out.print(  temp.getValor() );
                temp = temp.getDere();
            }
        }
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
