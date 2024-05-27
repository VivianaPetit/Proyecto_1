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

     private static String[] diccionario = {"THIS", "THAT", "HAT", "HOG", "DOG", "FOG"};
    private static String[] palabrasEncontradas = new String[100];
    private static int contadorPalabrasEncontradas = 0;

    public static void main(String[] args) {
        char[][] letras = {
            {'T', 'H', 'I', 'S'},
            {'W', 'A', 'T', 'S'},
            {'O', 'A', 'H', 'G'},
            {'F', 'G', 'D', 'T'}
        };

        Tablero tablero = new Tablero(letras);
        buscarPalabras(tablero);

        System.out.print("Palabras encontradas: ");
        for (int i = 0; i < contadorPalabrasEncontradas; i++) {
            System.out.print(palabrasEncontradas[i] + " ");
        }
    }

    public static void buscarPalabras(Tablero tablero) {
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                boolean[][] visitado = new boolean[4][4];
                dfs(tablero, fila, columna, "", visitado);
            }
        }
    }

    public static void dfs(Tablero tablero, int fila, int columna, String palabraActual, boolean[][] visitado) {
        if (palabraActual.length() >= 3 && esPalabraValida(palabraActual)) {
            if (!palabraYaEncontrada(palabraActual)) {
                palabrasEncontradas[contadorPalabrasEncontradas++] = palabraActual;
            }
        }

        if (palabraActual.length() > 16) { // No puede ser mayor a 16 en un tablero de 4x4
            return;
        }

        visitado[fila][columna] = true;

        for (int df = -1; df <= 1; df++) {
            for (int dc = -1; dc <= 1; dc++) {
                int nf = fila + df;
                int nc = columna + dc;

                if (nf >= 0 && nf < 4 && nc >= 0 && nc < 4 && !visitado[nf][nc]) {
                    if (tablero.esAdyacente(fila, columna, nf, nc)) {
                        dfs(tablero, nf, nc, palabraActual + tablero.obtenerLetra(nf, nc), visitado);
                    }
                }
            }
        }

        visitado[fila][columna] = false;
    }

    public static boolean esPalabraValida(String palabra) {
        for (int i = 0; i < diccionario.length; i++) {
            if (diccionario[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }

    public static boolean palabraYaEncontrada(String palabra) {
        for (int i = 0; i < contadorPalabrasEncontradas; i++) {
            if (palabrasEncontradas[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }

}
