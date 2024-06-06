/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import resolucion.DFS;
import resolucion.ListaNumeros;
import resolucion.ListaPalabras;
import sopadeletrass2.Nodo;


/**
 *
 * @author sl001
 */
public class Main {

    public static void main (String args[]){
        
        ListaNumeros ListaNodos = new ListaNumeros();
        Nodo uno = new Nodo("a",1);
        Nodo dos = new Nodo("l",2);
        Nodo tres= new Nodo("a",3);
        Nodo cuatro = new Nodo("s",4);
        Nodo cinco = new Nodo("k",5);
        Nodo seis = new Nodo("c",6);
        Nodo siete = new Nodo("n",7);
        Nodo ocho = new Nodo("a",8);
        Nodo nueve = new Nodo("l",9);
        Nodo diez = new Nodo("a",10);
        Nodo once = new Nodo("d",11);
        Nodo doce = new Nodo("o",12);
        Nodo trece = new Nodo("d",13);
        Nodo catorce = new Nodo("o",14);
        Nodo quince = new Nodo("r",15);
        Nodo dieciseis = new Nodo("a",16);
        
        uno.setDer(dos);
        uno.setDiagonalAbajoDerecha(seis);
        uno.setAbajo(cinco);
        
        dos.setDer(tres);
        dos.setDiagonalAbajoDerecha(siete);
        dos.setAbajo(seis);
        dos.setDiagonalAbajoIzquierda(cinco);
        dos.setIzq(uno);
        
        tres.setDer(cuatro);
        tres.setDiagonalAbajoDerecha(ocho);
        tres.setAbajo(siete);
        tres.setDiagonalAbajoIzquierda(seis);
        tres.setIzq(dos);
        
        cuatro.setAbajo(ocho);
        cuatro.setDiagonalAbajoIzquierda(siete);
        cuatro.setIzq(tres);
        
        cinco.setArriba(uno);
        cinco.setDiagonalArribaDerecha(dos);
        cinco.setDer(seis);
        cinco.setDiagonalAbajoDerecha(diez);
        cinco.setAbajo(nueve);
        
        seis.setDiagonalArribaIzquierda(uno);
        seis.setArriba(dos);
        seis.setDiagonalArribaDerecha(tres);
        seis.setDer(siete);
        seis.setDiagonalAbajoDerecha(once);
        seis.setAbajo(diez);
        seis.setDiagonalAbajoIzquierda(nueve);
        seis.setIzq(cinco);
        
        siete.setDiagonalArribaIzquierda(dos);
        siete.setArriba(tres);
        siete.setDiagonalArribaDerecha(cuatro);
        siete.setDer(ocho);
        siete.setDiagonalAbajoDerecha(doce);
        siete.setAbajo(once);
        siete.setDiagonalAbajoIzquierda(diez);
        siete.setIzq(seis);
        
        ocho.setDiagonalArribaIzquierda(tres);
        ocho.setArriba(cuatro);
        ocho.setAbajo(doce);
        ocho.setDiagonalAbajoIzquierda(once);
        ocho.setIzq(siete);
        
        nueve.setArriba(cinco);
        nueve.setDiagonalArribaDerecha(seis);
        nueve.setDer(diez);
        nueve.setDiagonalAbajoDerecha(catorce);
        nueve.setAbajo(trece);
        
        diez.setDiagonalArribaIzquierda(cinco);
        diez.setArriba(seis);
        diez.setDiagonalArribaDerecha(siete);
        diez.setDer(once);
        diez.setDiagonalAbajoDerecha(quince);
        diez.setAbajo(catorce);
        diez.setDiagonalAbajoIzquierda(trece);
        diez.setIzq(nueve);
        
        once.setDiagonalArribaIzquierda(seis);
        once.setArriba(siete);
        once.setDiagonalArribaDerecha(ocho);
        once.setDer(doce);
        once.setDiagonalAbajoDerecha(dieciseis);
        once.setAbajo(quince);
        once.setDiagonalAbajoIzquierda(catorce);
        once.setIzq(diez);
       
        doce.setDiagonalArribaIzquierda(siete);
        doce.setArriba(ocho);
        doce.setAbajo(dieciseis);
        doce.setDiagonalAbajoIzquierda(quince);
        doce.setIzq(once);
        
        trece.setArriba(nueve);
        trece.setDiagonalArribaDerecha(diez);
        trece.setDer(catorce);
        
        catorce.setDiagonalArribaIzquierda(nueve);
        catorce.setArriba(diez);
        catorce.setDiagonalArribaDerecha(once);
        catorce.setDer(quince);
        catorce.setIzq(trece);
        
        quince.setDiagonalArribaIzquierda(diez);
        quince.setArriba(once);
        quince.setDiagonalArribaDerecha(doce);
        quince.setDer(dieciseis);
        quince.setIzq(catorce);
        
        dieciseis.setDiagonalArribaIzquierda(once);
        dieciseis.setArriba(doce);
        dieciseis.setIzq(quince);
        
        ListaNodos.insertarInicio(uno);
        ListaNodos.insertarInicio(dos);
        ListaNodos.insertarInicio(tres);
        ListaNodos.insertarInicio(cuatro);
        ListaNodos.insertarInicio(cinco);
        ListaNodos.insertarInicio(seis);
        ListaNodos.insertarInicio(siete);
        ListaNodos.insertarInicio(ocho);
        ListaNodos.insertarInicio(nueve);
        ListaNodos.insertarInicio(diez);
        ListaNodos.insertarInicio(once);
        ListaNodos.insertarInicio(doce);
        ListaNodos.insertarInicio(trece);
        ListaNodos.insertarInicio(catorce);
        ListaNodos.insertarInicio(quince);
        ListaNodos.insertarInicio(dieciseis);
        
        
        DFS Simulacion1 = new DFS();
        Nodo aux = ListaNodos.getFirst();
        ListaPalabras PalabrasEncontradas = new ListaPalabras();
        long TiempoInicial = System.currentTimeMillis();
        while (aux != null){
            ListaNumeros ListaVisitados = new ListaNumeros();
            Simulacion1.iniciarProcedimiento(aux,TiempoInicial,ListaVisitados,PalabrasEncontradas,"/Users/DMorales/Documents/SENET UNIMET/ELOS/Jota.txt");
            aux = aux.getSiguiente();
        }
        PalabrasEncontradas.imprimirLista();
    }
}