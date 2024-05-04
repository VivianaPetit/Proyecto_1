/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa2.pkg18.pkg01.pkg23;

/**
 *
 * @author valeriazampetti
 */
public class Nodo {
    private Object dato;
    private Nodo pnext;

    public Nodo(Object dato) {
        this.dato = dato;
        this.pnext = null;
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    /**
     * @return the pnext
     */
    public Nodo getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(Nodo pnext) {
        this.pnext = pnext;
    }
    
    
    
    
    
}
