/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucion;

import sopadeletrass2.Nodo;
import java.io.*;

/**
 * Falta Conectar los nodos a sus respectivos nodos
 * 
 * @author Daniel Morales
 */


public class DFS {
    
    public DFS (){
          
    } 
    
    public void iniciarProcedimiento(Nodo aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion){
        
        String Palabra = aux.getLetra();
        Nodo aux10 = new Nodo(aux.getLetra(),aux.getPosicion());
        actualizar(aux10,aux);
        ListaVisitados.insertarInicio(aux10);
        adyacencia(aux10,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra);
    }
    private void adyacencia(Nodo aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra){
        visitarDAI(aux,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra);
        visitarA(aux,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra);
        visitarDAD(aux,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra);
        visitarD(aux,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra);
        visitarDBD(aux,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra);
        visitarB(aux,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra);
        visitarDBI(aux,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra);
        visitarI(aux,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra); 
    }
    
    public void visitarDAI(Nodo aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra){
        if (aux.getDiagonalArribaIzquierda() != null){
            Nodo aux1 = aux.getDiagonalArribaIzquierda();
            Nodo aux11 = new Nodo(aux1.getLetra(),aux1.getPosicion());
            actualizar(aux11,aux1);
            Palabra = Palabra + aux11.getLetra();
            ListaNumeros ListaVisitados1 = new ListaNumeros();
            Nodo aux21 = ListaVisitados.getFirst();
            while (aux21 != null){
                Nodo aux31 = new Nodo(aux21.getLetra(),aux21.getPosicion());
                actualizar(aux31,aux21);
                ListaVisitados1.insertarInicio(aux31);
                aux21 = aux21.getSiguiente();
            }
            if (ListaVisitados1.visitado(aux11) == false){
                ListaVisitados1.insertarInicio(aux11);
                leerDocumento(direccion, Palabra, PalabrasEncontradas, aux11, ListaVisitados1, TiempoInicial);
            }
        }
    }
    
    public void visitarA(Nodo aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra){
       if (aux.getArriba()!= null){
            Nodo aux2 = aux.getArriba();
            Nodo aux12 = new Nodo(aux2.getLetra(),aux2.getPosicion());
            actualizar(aux12,aux2);
            Palabra = Palabra + aux12.getLetra();
            ListaNumeros ListaVisitados2 = new ListaNumeros();
            Nodo aux22 = ListaVisitados.getFirst();
            while (aux22 != null){
                Nodo aux32 = new Nodo(aux22.getLetra(),aux22.getPosicion());
                actualizar(aux32,aux22);
                ListaVisitados2.insertarInicio(aux32);
                aux22 = aux22.getSiguiente();
            }
            if (ListaVisitados2.visitado(aux12) == false){
                ListaVisitados2.insertarInicio(aux12);
                leerDocumento(direccion, Palabra, PalabrasEncontradas, aux12, ListaVisitados2, TiempoInicial);
            }
            
        }
    }
    
    public void visitarDAD(Nodo aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra){
       if (aux.getDiagonalArribaDerecha()!= null){
            Nodo aux3 = aux.getDiagonalArribaDerecha();
            Nodo aux13 = new Nodo(aux3.getLetra(),aux3.getPosicion());
            actualizar(aux13,aux3);
            Palabra = Palabra + aux13.getLetra();
            ListaNumeros ListaVisitados3 = new ListaNumeros();
            Nodo aux23 = ListaVisitados.getFirst();
            while (aux23 != null){
                Nodo aux33 = new Nodo(aux23.getLetra(),aux23.getPosicion());
                actualizar(aux33,aux23);
                ListaVisitados3.insertarInicio(aux33);
                aux23 = aux23.getSiguiente();
            }
            if (ListaVisitados3.visitado(aux13) == false){
                ListaVisitados3.insertarInicio(aux13);
                leerDocumento(direccion, Palabra, PalabrasEncontradas, aux13, ListaVisitados3, TiempoInicial);
            }
        }
    }
    
    public void visitarD(Nodo aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra){
       if (aux.getDer() != null){
            Nodo aux4 = aux.getDer();
            Nodo aux14 = new Nodo(aux4.getLetra(),aux4.getPosicion());
            actualizar(aux14,aux4);
            Palabra = Palabra + aux14.getLetra();
            ListaNumeros ListaVisitados4 = new ListaNumeros();
            Nodo aux24 = ListaVisitados.getFirst();
            while (aux24 != null){
                Nodo aux34 = new Nodo(aux24.getLetra(),aux24.getPosicion());
                actualizar(aux34,aux24);
                ListaVisitados4.insertarInicio(aux34);
                aux24 = aux24.getSiguiente();
            }
            if (ListaVisitados4.visitado(aux14) == false){
                ListaVisitados4.insertarInicio(aux14);
                leerDocumento(direccion, Palabra, PalabrasEncontradas, aux14, ListaVisitados4, TiempoInicial);
            } 
        }
    }
    
    public void visitarDBD(Nodo aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra){
       if (aux.getDiagonalAbajoDerecha()!= null){
            Nodo aux5 = aux.getDiagonalAbajoDerecha();
            Nodo aux15 = new Nodo(aux5.getLetra(),aux5.getPosicion());
            actualizar(aux15,aux5);
            Palabra = Palabra + aux15.getLetra();
            ListaNumeros ListaVisitados5 = new ListaNumeros();
            Nodo aux25 = ListaVisitados.getFirst();
            while (aux25 != null){
                Nodo aux35 = new Nodo(aux25.getLetra(),aux25.getPosicion());
                actualizar(aux35,aux25);
                ListaVisitados5.insertarInicio(aux35);
                aux25 = aux25.getSiguiente();
            }
            if (ListaVisitados5.visitado(aux15) == false){
                ListaVisitados5.insertarInicio(aux15);
                leerDocumento(direccion, Palabra, PalabrasEncontradas, aux15, ListaVisitados5, TiempoInicial);
            }  
        }
    }
    
    public void visitarB(Nodo aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra){
       if (aux.getAbajo() != null){
            Nodo aux6 = aux.getAbajo();
            Nodo aux16 = new Nodo(aux6.getLetra(),aux6.getPosicion());
            actualizar(aux16,aux6);
            Palabra = Palabra + aux16.getLetra();
            ListaNumeros ListaVisitados6 = new ListaNumeros();
            Nodo aux26 = ListaVisitados.getFirst();
            while (aux26 != null){
                Nodo aux36 = new Nodo(aux26.getLetra(),aux26.getPosicion());
                actualizar(aux36,aux26);
                ListaVisitados6.insertarInicio(aux36);
                aux26 = aux26.getSiguiente();
            }
            if (ListaVisitados6.visitado(aux16) == false){
                ListaVisitados6.insertarInicio(aux16);
                leerDocumento(direccion, Palabra, PalabrasEncontradas, aux16, ListaVisitados6, TiempoInicial);
            }
        }
    }
    
    public void visitarDBI(Nodo aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra){
       if (aux.getDiagonalAbajoIzquierda() != null){
            Nodo aux7 = aux.getDiagonalAbajoIzquierda();
            Nodo aux17 = new Nodo(aux7.getLetra(),aux7.getPosicion());
            actualizar(aux17,aux7);
            Palabra = Palabra + aux17.getLetra();
            ListaNumeros ListaVisitados7 = new ListaNumeros();
            Nodo aux27 = ListaVisitados.getFirst();
            while (aux27 != null){
                Nodo aux37 = new Nodo(aux27.getLetra(),aux27.getPosicion());
                actualizar(aux37,aux27);
                ListaVisitados7.insertarInicio(aux37);
                aux27 = aux27.getSiguiente();
            }
            if (ListaVisitados7.visitado(aux17) == false){
                ListaVisitados7.insertarInicio(aux17);
                leerDocumento(direccion, Palabra, PalabrasEncontradas, aux17, ListaVisitados7, TiempoInicial);
            }
        }
    }
    
    public void visitarI(Nodo aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra){
       if (aux.getIzq() != null){
            Nodo aux8 = aux.getIzq();
            Nodo aux18 = new Nodo(aux8.getLetra(),aux8.getPosicion());
            actualizar(aux18,aux8);
            Palabra = Palabra + aux18.getLetra();
            ListaNumeros ListaVisitados8 = new ListaNumeros();
            Nodo aux28 = ListaVisitados.getFirst();
            while (aux28 != null){
                Nodo aux38 = new Nodo(aux28.getLetra(),aux28.getPosicion());
                actualizar(aux38,aux28);
                ListaVisitados8.insertarInicio(aux38);
                aux28 = aux28.getSiguiente();
            }
            if (ListaVisitados8.visitado(aux18) == false){
                ListaVisitados8.insertarInicio(aux18);
                leerDocumento(direccion, Palabra, PalabrasEncontradas, aux18, ListaVisitados8, TiempoInicial);
            }
        }
    }
    
    private void leerDocumento(String direccion ,String palabra,ListaPalabras palabrasEncontradas, Nodo nodo,ListaNumeros ListaVisitados, long TiempoInicial){
        try {
            BufferedReader alto = new BufferedReader(new FileReader(direccion));
            String altoRead;
            int contador = 0;
            while ((altoRead = alto.readLine())!= null){
                if (altoRead.startsWith(palabra) == true){ 
                    contador = contador +1;
                    if (altoRead.contentEquals(palabra)){
                        if (palabrasEncontradas.encontrar(palabra) == false){
                            long Tiempofinal = System.currentTimeMillis();
                            long Tiempo = Tiempofinal - TiempoInicial;
                            palabrasEncontradas.insertarInicio(altoRead,Tiempo);
                        } 
                    }
                } 
            }
            if (contador > 0){
                adyacencia(nodo,TiempoInicial,ListaVisitados,palabrasEncontradas,direccion,palabra);
            }
        }
        catch (Exception e){   
        }
    }
    
    private void actualizar (Nodo nodo1, Nodo nodo2){
        nodo1.setDiagonalArribaIzquierda(nodo2.getDiagonalArribaIzquierda());
        nodo1.setArriba(nodo2.getArriba());
        nodo1.setDiagonalArribaDerecha(nodo2.getDiagonalArribaDerecha());
        nodo1.setDer(nodo2.getDer());
        nodo1.setDiagonalAbajoDerecha(nodo2.getDiagonalAbajoDerecha());
        nodo1.setAbajo(nodo2.getAbajo());
        nodo1.setDiagonalAbajoIzquierda(nodo2.getDiagonalAbajoIzquierda());
        nodo1.setIzq(nodo2.getIzq());
    }
}
    