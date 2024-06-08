/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass;

/**
 *
 * 
 */
public class Apuntador {
    int destino;
    double peso;
    
    public Apuntador(int d) {
        destino = d;
    }
    
    public Apuntador(int d, double p) {
        this(d);
        peso = p;
    }
    
    public int getDestino(){
        return destino;
    }
    
    public boolean equals(Object n) {
        Apuntador a = (Apuntador)n;
        return destino == a.destino;
    }
}
