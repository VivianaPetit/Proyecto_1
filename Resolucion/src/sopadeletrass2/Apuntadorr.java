/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletrass2;

/**
 *
 * 
 */
public class Apuntadorr {
    int destino;
    double peso;
    
    public Apuntadorr(int d) {
        destino = d;
    }
    
    public Apuntadorr(int d, double p) {
        this(d);
        peso = p;
    }
    
    public int getDestino(){
        return destino;
    }
    
    public boolean equals(Object n) {
        Apuntadorr a = (Apuntadorr)n;
        return destino == a.destino;
    }
}
