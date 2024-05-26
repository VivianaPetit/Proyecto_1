/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sopadeletrass.Lista;



/**
 *
 * @author KelvinCi
 */
public class Ventana2 extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    static Lista listaWord;
    static Lista listaLetras;
    Fuentes tipoFuente;

    /**
     * Creates new form ISopaDeLetras
     */
    public Ventana2() {
        initComponents();
        listaWord = new Lista();
        listaLetras = new Lista();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        tipoFuente = new Fuentes();
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 15));
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 28));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 28));
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 18));
        
    }

    public String AbrirArchivo(File archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caract = (char) ascci;
                documento += caract;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error de: " + e);

        }
        return documento;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Interfaz.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelRound2 = new Interfaz.PanelRound();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(120, 61, 25));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Carga tu archivo con el diccionario");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("y las letras para el tablero");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Solo archivos tipo .txt");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(120, 61, 25));
        panelRound2.setRoundBottomLeft(10);
        panelRound2.setRoundBottomRight(10);
        panelRound2.setRoundTopLeft(10);
        panelRound2.setRoundTopRight(10);
        panelRound2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRound2MousePressed(evt);
            }
        });
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar Archivo");
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 180, 60));

        panelRound1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 380, 120));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelRound2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MousePressed
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = AbrirArchivo(archivo);
                    int inicioWord=documento.indexOf("dic")+"/dic".length();
                    int finWord=documento.indexOf("/dic");
                    String ParaRecorrer=documento.substring(inicioWord,finWord);
                    ParaRecorrer=ParaRecorrer.replaceAll("/n", "");
                    for (int i = 0; i < ParaRecorrer.length(); i++) {
                        char letraWords=ParaRecorrer.charAt(i);
                        listaWord.insertFinal(letraWords);
                    }
                    int inicio = documento.indexOf("tab") + "tab".length();
                    int fin = documento.indexOf("/tab");
                    String textolista = documento.substring(inicio, fin);
                    textolista = textolista.trim().replaceAll(",","");

                    for (int i = 0; i < textolista.length(); i++) {
                        char letra = textolista.charAt(i);

                        listaLetras.insertFinal(letra);
                    }

                } else {
                    JOptionPane.showConfirmDialog(null, "Archivo no compatible");
                }
            }
        }
        
        Ventana4 v4 = new Ventana4();
        this.setVisible(false);
        v4.setVisible(true);
    }//GEN-LAST:event_panelRound2MousePressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private Interfaz.PanelRound panelRound1;
    private Interfaz.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}