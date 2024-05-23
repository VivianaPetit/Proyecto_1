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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ISopaDeLetras nueva=new ISopaDeLetras();
        nueva.setLocationRelativeTo(null);
        nueva.setVisible(true);*/
        char[][] letras = {
            {'C', 'H', 'A', 'O'},
            {'X', 'A', 'T', 'M'},
            {'P', 'R', 'R', 'A'},
            {'A', 'O', 'R', 'O'}
        };
        Grafo nuevo=new Grafo(letras);
        Grafo.imprimirGrafo(nuevo);
                
       
    }

}
