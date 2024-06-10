
package resolucion;

import java.io.BufferedReader;
import java.io.FileReader;
import sopadeletrass2.Nodo;

/**
 *
 * @author DMorales
 */

/**
 * Clase que se encarga de la busqueda por BFS en el grafo
 * 
 * ADVERTENCIA
 * La busqueda por BFS no esta funcionando correctamente y se tarda demasiado en encontrar las palabras
 * por lo que no recomiendo que lo pruebes a menos que pongas maximo 10 palabras en el diccionario,
 * aparte de este error, en algunas palabras lee mal la lista de los nodos visitados causando que pase
 * dos veces por el mismo nodo encontrando palabras que no deberia encontrar
 */ 
public class BFS {
    
    // Creador de la clase
    public BFS(){
        
    }
    
    // Se encarga de iniciar la busqueda con los valores pasados desde el main
    public void iniciarProcedimientoB (Nodo aux,long TiempoInicial,ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion){
        String Palabra = aux.getLetra();
        Nodo aux10 = new Nodo(aux.getLetra(),aux.getPosicion());
        actualizar(aux10,aux);
        ListaVisitados.insertarInicio(aux10);
        NodoBFS NodoA = new NodoBFS(aux10, Palabra, ListaVisitados);
        ListaNodoBFS Lista1 = new ListaNodoBFS();
        Lista1.insertarInicio(NodoA);
        adyacencia(TiempoInicial, ListaVisitados, PalabrasEncontradas,direccion,Palabra, Lista1);
    }
    
    
    private void adyacencia(long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra, ListaNodoBFS ListaaVisitar){
        
        NodoBFS aux20 = ListaaVisitar.getFirst();
        ListaNodoBFS ListaVisitados20 = new ListaNodoBFS();
        while (aux20 != null){
            visitarDAI(aux20,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra,ListaVisitados20);
            visitarA(aux20,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra,ListaVisitados20);
            visitarDAD(aux20,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra,ListaVisitados20);
            visitarD(aux20,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra,ListaVisitados20);
            visitarDBD(aux20,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra,ListaVisitados20);
            visitarB(aux20,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra,ListaVisitados20);
            visitarDBI(aux20,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra,ListaVisitados20);
            visitarI(aux20,TiempoInicial,ListaVisitados,PalabrasEncontradas,direccion,Palabra,ListaVisitados20);
            aux20 = aux20.getSiguiente();
        }
        NodoBFS aux30 = ListaVisitados20.getFirst();
        ListaaVisitar.vaciar();
        int Scontador = 0;
        while (aux30 != null){
            int contador = 0;
            contador = leerDocumentoBFS(direccion, PalabrasEncontradas, TiempoInicial, aux30, contador);
            Scontador = Scontador + contador;
            if (contador > 0){
                Nodo aux50 = new Nodo("vacio",0);
                ListaNumeros ListaVacia = new ListaNumeros();
                NodoBFS aux40 = new NodoBFS(aux50,"vacio",ListaVacia);
                actualizarBFS(aux40,aux30);
                ListaaVisitar.insertarInicio(aux40);
            }
            aux30 = aux30.getSiguiente();
        }
        Nodo aux60 = new Nodo("vacio",0);
        ListaNumeros ListaVacia = new ListaNumeros();
        NodoBFS aux70 = new NodoBFS(aux60,"vacio",ListaVacia);
        NodoBFS aux80 = ListaaVisitar.getFirst();
        
        while (aux80 != null){
            actualizarBFS(aux70,aux80);
            adyacencia(TiempoInicial, aux70.getLista(), PalabrasEncontradas,direccion,aux70.getPalabra(), ListaaVisitar);
            aux80 = aux80.getSiguiente();
        }
    }
    
    private void visitarDAI(NodoBFS aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra, ListaNodoBFS ListaVisitados20){
        if (aux.getNodo().getDiagonalArribaIzquierda() != null){
            Nodo aux1 = aux.getNodo().getDiagonalArribaIzquierda();
            Nodo aux11 = new Nodo(aux1.getLetra(),aux1.getPosicion());
            actualizar(aux11,aux1);
            Palabra = aux.getPalabra() + aux11.getLetra();
            ListaNumeros ListaVisitados1 = new ListaNumeros();
            Nodo aux21 = aux.getLista().getFirst();
            while (aux21 != null){
                Nodo aux31 = new Nodo(aux21.getLetra(),aux21.getPosicion());
                actualizar(aux31,aux21);
                ListaVisitados1.insertarInicio(aux31);
                aux21 = aux21.getSiguiente();
            }
            if (aux.getLista().visitado(aux11) == false){
                ListaVisitados1.insertarInicio(aux11);
            }
            NodoBFS BFS1 = new NodoBFS(aux11,Palabra,ListaVisitados1);
            ListaVisitados20.insertarInicio(BFS1);
        }
    }
    
    private void visitarA(NodoBFS aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra,ListaNodoBFS ListaVisitados20){
       if (aux.getNodo().getArriba()!= null){
            Nodo aux2 = aux.getNodo().getArriba();
            Nodo aux12 = new Nodo(aux2.getLetra(),aux2.getPosicion());
            actualizar(aux12,aux2);
            Palabra = aux.getPalabra() + aux12.getLetra();
            ListaNumeros ListaVisitados2 = new ListaNumeros();
            Nodo aux22 = aux.getLista().getFirst();
            while (aux22 != null){
                Nodo aux32 = new Nodo(aux22.getLetra(),aux22.getPosicion());
                actualizar(aux32,aux22);
                ListaVisitados2.insertarInicio(aux32);
                aux22 = aux22.getSiguiente();
            }
            if (aux.getLista().visitado(aux12) == false){
                ListaVisitados2.insertarInicio(aux12);
            }
           NodoBFS BFS2 = new NodoBFS(aux12,Palabra,ListaVisitados2);
            ListaVisitados20.insertarInicio(BFS2);
        }
    }
    
    private void visitarDAD(NodoBFS aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra,ListaNodoBFS ListaVisitados20){
       if (aux.getNodo().getDiagonalArribaDerecha()!= null){
            Nodo aux3 = aux.getNodo().getDiagonalArribaDerecha();
            Nodo aux13 = new Nodo(aux3.getLetra(),aux3.getPosicion());
            actualizar(aux13,aux3);
            Palabra = aux.getPalabra() + aux13.getLetra();
            ListaNumeros ListaVisitados3 = new ListaNumeros();
            Nodo aux23 = aux.getLista().getFirst();
            while (aux23 != null){
                Nodo aux33 = new Nodo(aux23.getLetra(),aux23.getPosicion());
                actualizar(aux33,aux23);
                ListaVisitados3.insertarInicio(aux33);
                aux23 = aux23.getSiguiente();
            }
            if (aux.getLista().visitado(aux13) == false){
                ListaVisitados3.insertarInicio(aux13);
            }
        NodoBFS BFS3 = new NodoBFS(aux13,Palabra,ListaVisitados3);
            ListaVisitados20.insertarInicio(BFS3);
        }
    }
    
    private void visitarD(NodoBFS aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra,ListaNodoBFS ListaVisitados20){
       if (aux.getNodo().getDer() != null){
            Nodo aux4 = aux.getNodo().getDer();
            Nodo aux14 = new Nodo(aux4.getLetra(),aux4.getPosicion());
            actualizar(aux14,aux4);
            Palabra = aux.getPalabra() + aux14.getLetra();
            ListaNumeros ListaVisitados4 = new ListaNumeros();
            Nodo aux24 = aux.getLista().getFirst();
            while (aux24 != null){
                Nodo aux34 = new Nodo(aux24.getLetra(),aux24.getPosicion());
                actualizar(aux34,aux24);
                ListaVisitados4.insertarInicio(aux34);
                aux24 = aux24.getSiguiente();
            }
            if (aux.getLista().visitado(aux14) == false){
                ListaVisitados4.insertarInicio(aux14);
            } 
        NodoBFS BFS4 = new NodoBFS(aux14,Palabra,ListaVisitados4);
            ListaVisitados20.insertarInicio(BFS4);
        }
    }
    
    private void visitarDBD(NodoBFS aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra,ListaNodoBFS ListaVisitados20){
       if (aux.getNodo().getDiagonalAbajoDerecha()!= null){
            Nodo aux5 = aux.getNodo().getDiagonalAbajoDerecha();
            Nodo aux15 = new Nodo(aux5.getLetra(),aux5.getPosicion());
            actualizar(aux15,aux5);
            Palabra = aux.getPalabra() + aux15.getLetra();
            ListaNumeros ListaVisitados5 = new ListaNumeros();
            Nodo aux25 = aux.getLista().getFirst();
            while (aux25 != null){
                Nodo aux35 = new Nodo(aux25.getLetra(),aux25.getPosicion());
                actualizar(aux35,aux25);
                ListaVisitados5.insertarInicio(aux35);
                aux25 = aux25.getSiguiente();
            }
            if (aux.getLista().visitado(aux15) == false){
                ListaVisitados5.insertarInicio(aux15);
            }  
        NodoBFS BFS5 = new NodoBFS(aux15,Palabra,ListaVisitados5);
            ListaVisitados20.insertarInicio(BFS5);
        }
    }
    
    private void visitarB(NodoBFS aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra,ListaNodoBFS ListaVisitados20){
       if (aux.getNodo().getAbajo() != null){
            Nodo aux6 = aux.getNodo().getAbajo();
            Nodo aux16 = new Nodo(aux6.getLetra(),aux6.getPosicion());
            actualizar(aux16,aux6);
            Palabra = aux.getPalabra() + aux16.getLetra();
            ListaNumeros ListaVisitados6 = new ListaNumeros();
            Nodo aux26 = aux.getLista().getFirst();
            while (aux26 != null){
                Nodo aux36 = new Nodo(aux26.getLetra(),aux26.getPosicion());
                actualizar(aux36,aux26);
                ListaVisitados6.insertarInicio(aux36);
                aux26 = aux26.getSiguiente();
            }
            if (aux.getLista().visitado(aux16) == false){
                ListaVisitados6.insertarInicio(aux16);
            }
        NodoBFS BFS6 = new NodoBFS(aux16,Palabra,ListaVisitados6);
            ListaVisitados20.insertarInicio(BFS6);
        }
    }
    
    private void visitarDBI(NodoBFS aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra,ListaNodoBFS ListaVisitados20){
       if (aux.getNodo().getDiagonalAbajoIzquierda() != null){
            Nodo aux7 = aux.getNodo().getDiagonalAbajoIzquierda();
            Nodo aux17 = new Nodo(aux7.getLetra(),aux7.getPosicion());
            actualizar(aux17,aux7);
            Palabra = aux.getPalabra() + aux17.getLetra();
            ListaNumeros ListaVisitados7 = new ListaNumeros();
            Nodo aux27 = aux.getLista().getFirst();
            while (aux27 != null){
                Nodo aux37 = new Nodo(aux27.getLetra(),aux27.getPosicion());
                actualizar(aux37,aux27);
                ListaVisitados7.insertarInicio(aux37);
                aux27 = aux27.getSiguiente();
            }
            if (aux.getLista().visitado(aux17) == false){
                ListaVisitados7.insertarInicio(aux17);
            }
        NodoBFS BFS7 = new NodoBFS(aux17,Palabra,ListaVisitados7);
            ListaVisitados20.insertarInicio(BFS7);
        }
    }
    
    private void visitarI(NodoBFS aux, long TiempoInicial, ListaNumeros ListaVisitados,ListaPalabras PalabrasEncontradas,String direccion,String Palabra,ListaNodoBFS ListaVisitados20){
       if (aux.getNodo().getIzq() != null){
            Nodo aux8 = aux.getNodo().getIzq();
            Nodo aux18 = new Nodo(aux8.getLetra(),aux8.getPosicion());
            actualizar(aux18,aux8);
            Palabra = aux.getPalabra() + aux18.getLetra();
            ListaNumeros ListaVisitados8 = new ListaNumeros();
            Nodo aux28 = aux.getLista().getFirst();
            while (aux28 != null){
                Nodo aux38 = new Nodo(aux28.getLetra(),aux28.getPosicion());
                actualizar(aux38,aux28);
                ListaVisitados8.insertarInicio(aux38);
                aux28 = aux28.getSiguiente();
            }
            if (aux.getLista().visitado(aux18) == false){
                ListaVisitados8.insertarInicio(aux18);
            }
        NodoBFS BFS8 = new NodoBFS(aux18,Palabra,ListaVisitados8);
            ListaVisitados20.insertarInicio(BFS8);
        }
    }
    
    public void actualizarAdyacencia(Nodo uno, Nodo dos, Nodo tres, Nodo cuatro, Nodo cinco, Nodo seis, Nodo siete, Nodo ocho, Nodo nueve, Nodo diez, Nodo once, Nodo doce, Nodo trece, Nodo catorce, Nodo quince, Nodo dieciseis){
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
    }
    
    private int leerDocumentoBFS(String direccion, ListaPalabras PalabrasEncontradas, long TiempoInicial, NodoBFS nodo, int contador){
        try {
            BufferedReader alto = new BufferedReader(new FileReader(direccion));
            String altoRead;
            while ((altoRead = alto.readLine())!= null){
                if (altoRead.startsWith(nodo.getPalabra()) == true){ 
                    contador = contador + 1;
                    if (altoRead.contentEquals(nodo.getPalabra())){
                        if (PalabrasEncontradas.encontrar(nodo.getPalabra()) == false){
                            long Tiempofinal = System.currentTimeMillis();
                            long Tiempo = Tiempofinal - TiempoInicial;
                            PalabrasEncontradas.insertarInicio(altoRead,Tiempo);
                        } 
                    }
                }
            }
        }
        catch (Exception e){   
        }
        return contador;
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
    
    private void actualizarBFS (NodoBFS nodo1, NodoBFS nodo2){
        nodo1.getNodo().setDiagonalArribaIzquierda(nodo2.getNodo().getDiagonalArribaIzquierda());
        nodo1.getNodo().setArriba(nodo2.getNodo().getArriba());
        nodo1.getNodo().setDiagonalArribaDerecha(nodo2.getNodo().getDiagonalArribaDerecha());
        nodo1.getNodo().setDer(nodo2.getNodo().getDer());
        nodo1.getNodo().setDiagonalAbajoDerecha(nodo2.getNodo().getDiagonalAbajoDerecha());
        nodo1.getNodo().setAbajo(nodo2.getNodo().getAbajo());
        nodo1.getNodo().setDiagonalAbajoIzquierda(nodo2.getNodo().getDiagonalAbajoIzquierda());
        nodo1.getNodo().setIzq(nodo2.getNodo().getIzq());
        nodo1.setPalabra(nodo2.getPalabra());
        nodo1.setLista(nodo2.getLista());
    }
}
