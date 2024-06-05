/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sopadeletrass;

/**
 *
 * @author KelvinCi
 */
public class SopaDeLetrass {

    public static void main(String[] args) {
//        ISopaDeLetras ventana=new ISopaDeLetras();
//        ventana.setVisible(true);
        Grafos grafo = new Grafos(16);
        String letras = "ABCDEFGHIJKLMNOP";
        for (int i = 0; i < letras.length(); i++) {
            grafo.insertar_vertices(letras.charAt(i));
        }
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                grafo.insertarArista(i, j);
            }
        }
        System.out.println(grafo.matriz_ady[1][2].origen.letra +""+grafo.matriz_ady[1][2].destino.letra );

    }

}
