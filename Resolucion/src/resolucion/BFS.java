/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucion;

/**
 *
 * @author DMorales
 */
public class BFS {
    /*
    public ListaPalabras iniciarProcedimiento(ListaNumeros ListaNodos){
        long TiempoInicial = System.currentTimeMillis();
        ListaNumeros ListaVisitados = new ListaNumeros();
        ListaNumeros ListaNoVisitados = new ListaNumeros();
        
        
        
        
        
        
        
        
        
        ListaNumeros ListaVisitados = new ListaNumeros();
        String Palabra = x.getLetra();
        Nodo nodo = new Nodo(x.getLetra(),x.getPosicion());
        ListaVisitados.insertarInicio(nodo);
        adyacencia(x,Palabra,PalabrasEncontradas,ListaVisitados,TiempoInicial);
        return PalabrasEncontradas;
    }
    
    public void adyacencia(Nodo x, String palabra, ListaPalabras PalabrasEncontradas,ListaNumeros ListaVisitados, long TiempoInicial){
        
        if (x.getDiagonalArribaIzquierda()!= null){
            Nodo DAI = x.getDiagonalArribaIzquierda();
            ListaNumeros ListaVisitados1 = ListaVisitados;
            if (ListaVisitados.visitado(DAI) == false){
                String palabra1 = palabra + DAI.getLetra();
                ListaVisitados1.insertarInicio(DAI);
                leerDocumento("/Users/DMorales/Documents/SENET UNIMET/ELOS/Jota.txt",palabra1,PalabrasEncontradas,DAI,ListaVisitados1,TiempoInicial);
            }
        }
        
        if (x.getArriba()!= null){
            Nodo A = x.getArriba();
            ListaNumeros ListaVisitados2 = ListaVisitados; 
            if (ListaVisitados.visitado(A) == false){
                String palabra2 = palabra + A.getLetra();
                ListaVisitados2.insertarInicio(A);
                leerDocumento("/Users/DMorales/Documents/SENET UNIMET/ELOS/Jota.txt",palabra2,PalabrasEncontradas,A,ListaVisitados2,TiempoInicial);
            }
        }
        
        if (x.getDiagonalArribaDerecha()!= null){
            Nodo DAD = x.getDiagonalArribaDerecha();
            ListaNumeros ListaVisitados3 = ListaVisitados; 
            if (ListaVisitados.visitado(DAD) == false){
                String palabra3 = palabra + DAD.getLetra();
                ListaVisitados3.insertarInicio(DAD);
                leerDocumento("/Users/DMorales/Documents/SENET UNIMET/ELOS/Jota.txt",palabra3,PalabrasEncontradas,DAD,ListaVisitados3,TiempoInicial);
            }
        }
        
        if (x.getDer()!= null){
            Nodo D = x.getDer();
            ListaNumeros ListaVisitados4 = ListaVisitados; 
            if (ListaVisitados.visitado(D) == false){
                String palabra4 = palabra + D.getLetra();
                ListaVisitados4.insertarInicio(D);
                leerDocumento("/Users/DMorales/Documents/SENET UNIMET/ELOS/Jota.txt",palabra4,PalabrasEncontradas,D,ListaVisitados4,TiempoInicial);
            }
        }
        
        if (x.getDiagonalAbajoDerecha()!= null){
            Nodo DBD = x.getDiagonalAbajoDerecha();
            ListaNumeros ListaVisitados5 = ListaVisitados; 
            if (ListaVisitados.visitado(DBD) == false){
                String palabra5 = palabra + DBD.getLetra();
                ListaVisitados5.insertarInicio(DBD);
                leerDocumento("/Users/DMorales/Documents/SENET UNIMET/ELOS/Jota.txt",palabra5,PalabrasEncontradas,DBD,ListaVisitados5,TiempoInicial);
            }
        }
        
        if (x.getAbajo()!= null){
            Nodo B = x.getAbajo();
            ListaNumeros ListaVisitados6 = ListaVisitados; 
            if (ListaVisitados.visitado(B) == false){
                String palabra6 = palabra + B.getLetra();
                ListaVisitados6.insertarInicio(B);
                leerDocumento("/Users/DMorales/Documents/SENET UNIMET/ELOS/Jota.txt",palabra6,PalabrasEncontradas,B,ListaVisitados6,TiempoInicial);
            }
        }
        
        if (x.getDiagonalAbajoIzquierda()!= null){
            Nodo DBI = x.getDiagonalAbajoIzquierda();
            ListaNumeros ListaVisitados7 = ListaVisitados; 
            if (ListaVisitados.visitado(DBI) == false){
                String palabra7 = palabra + DBI.getLetra();
                ListaVisitados7.insertarInicio(DBI);
                leerDocumento("/Users/DMorales/Documents/SENET UNIMET/ELOS/Jota.txt",palabra7,PalabrasEncontradas,DBI,ListaVisitados7,TiempoInicial);
            }
        }
        
        if (x.getIzq()!= null){
            Nodo I = x.getIzq();
            ListaNumeros ListaVisitados8 = ListaVisitados; 
            if (ListaVisitados.visitado(I) == false){
                String palabra8 = palabra + I.getLetra();
                ListaVisitados8.insertarInicio(I);
                leerDocumento("/Users/DMorales/Documents/SENET UNIMET/ELOS/Jota.txt",palabra8,PalabrasEncontradas,I,ListaVisitados8,TiempoInicial);
            }
        }
    }
    
    public void leerDocumento(String direccion ,String palabra,ListaPalabras palabrasEncontradas, Nodo nodo,ListaNumeros ListaVisitados, long TiempoInicial){
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
                adyacencia(nodo,palabra,palabrasEncontradas,ListaVisitados,TiempoInicial);
            }
        }
        catch (Exception e){   
        }
    }
    
}*/
}
