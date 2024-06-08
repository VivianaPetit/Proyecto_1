/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import sopadeletrass.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author VivianaPetit
 */
public class Ventana4 extends javax.swing.JFrame {
    Fuentes tipoFuente;
    
     /**
     * Creates new form Ventana4
     */
    public Ventana4() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        tipoFuente = new Fuentes();
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 20));
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 16));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 16));
    }
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Interfaz.PanelRound();
        panelRound2 = new Interfaz.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        casilla1 = new javax.swing.JTextField();
        casilla2 = new javax.swing.JTextField();
        casilla3 = new javax.swing.JTextField();
        casilla4 = new javax.swing.JTextField();
        casilla5 = new javax.swing.JTextField();
        casilla6 = new javax.swing.JTextField();
        casilla7 = new javax.swing.JTextField();
        casilla8 = new javax.swing.JTextField();
        casilla9 = new javax.swing.JTextField();
        casilla10 = new javax.swing.JTextField();
        casilla11 = new javax.swing.JTextField();
        casilla12 = new javax.swing.JTextField();
        casilla13 = new javax.swing.JTextField();
        casilla14 = new javax.swing.JTextField();
        casilla15 = new javax.swing.JTextField();
        casilla16 = new javax.swing.JTextField();
        panelRound3 = new Interfaz.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Diccionario = new javax.swing.JTextArea();
        panelRound4 = new Interfaz.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        panelRound5 = new Interfaz.PanelRound();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(185, 148, 112));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(120, 61, 25));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(120, 61, 25));
        jPanel1.setForeground(new java.awt.Color(237, 180, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 55, 40));

        casilla2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 55, 42));

        casilla3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 55, 42));

        casilla4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 55, 42));

        casilla5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        casilla5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 55, 42));

        casilla6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 55, 42));

        casilla7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 55, 42));

        casilla8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 55, 42));

        casilla9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 55, 42));

        casilla10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 55, 42));

        casilla11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 55, 42));

        casilla12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 55, 42));

        casilla13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 55, 42));

        casilla14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 55, 42));

        casilla15.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 55, 42));

        casilla16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(casilla16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 55, 42));

        panelRound2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 210));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 320, 250));

        panelRound3.setBackground(new java.awt.Color(120, 61, 25));
        panelRound3.setRoundBottomLeft(10);
        panelRound3.setRoundBottomRight(10);
        panelRound3.setRoundTopLeft(10);
        panelRound3.setRoundTopRight(10);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Diccionario");
        panelRound3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        panelRound1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 40));

        Diccionario.setEditable(false);
        Diccionario.setColumns(20);
        Diccionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Diccionario.setRows(5);
        jScrollPane1.setViewportView(Diccionario);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 190));

        panelRound4.setBackground(new java.awt.Color(120, 61, 25));
        panelRound4.setRoundBottomLeft(10);
        panelRound4.setRoundBottomRight(10);
        panelRound4.setRoundTopLeft(10);
        panelRound4.setRoundTopRight(10);
        panelRound4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRound4MousePressed(evt);
            }
        });
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cargar tablero");
        panelRound4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        panelRound1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 110, 30));

        panelRound5.setBackground(new java.awt.Color(120, 61, 25));
        panelRound5.setRoundBottomLeft(10);
        panelRound5.setRoundBottomRight(10);
        panelRound5.setRoundTopLeft(10);
        panelRound5.setRoundTopRight(10);
        panelRound5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRound5MousePressed(evt);
            }
        });
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menú");
        panelRound5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 30));

        panelRound1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 30));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casilla5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5ActionPerformed
        // TODO add our handling code here:
    }//GEN-LAST:event_casilla5ActionPerformed

    private void panelRound4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound4MousePressed

        for(int i =0; i < Grafos.letras.length; i++) {
            
            String letra = String.valueOf(Grafos.letras[i].letra);
            
            /**Se obtienen los componentes del panel (TextFields) 
             * para setearles las letras del tablero.
            **/
            Component componente = jPanel1.getComponent(i);
            if (componente instanceof JTextField) {
                JTextField textfield = (JTextField) componente;            
                textfield.setText(letra);
                textfield.setEditable(false);
                textfield.setHorizontalAlignment(JTextField.CENTER);
            }
        }
        
        for (int i = 0; i < Ventana2.diccionario.length; i++) {
            this.Diccionario.setText(this.Diccionario.getText() + Ventana2.diccionario[i] +"\n");
        }
    }//GEN-LAST:event_panelRound4MousePressed

    private void panelRound5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound5MousePressed
        Ventana3 v3 = new Ventana3();
        this.setVisible(false);
        v3.setVisible(true);
    }//GEN-LAST:event_panelRound5MousePressed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Diccionario;
    private javax.swing.JTextField casilla1;
    private javax.swing.JTextField casilla10;
    private javax.swing.JTextField casilla11;
    private javax.swing.JTextField casilla12;
    private javax.swing.JTextField casilla13;
    private javax.swing.JTextField casilla14;
    private javax.swing.JTextField casilla15;
    private javax.swing.JTextField casilla16;
    private javax.swing.JTextField casilla2;
    private javax.swing.JTextField casilla3;
    private javax.swing.JTextField casilla4;
    private javax.swing.JTextField casilla5;
    private javax.swing.JTextField casilla6;
    private javax.swing.JTextField casilla7;
    private javax.swing.JTextField casilla8;
    private javax.swing.JTextField casilla9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Interfaz.PanelRound panelRound1;
    private Interfaz.PanelRound panelRound2;
    private Interfaz.PanelRound panelRound3;
    private Interfaz.PanelRound panelRound4;
    private Interfaz.PanelRound panelRound5;
    // End of variables declaration//GEN-END:variables
}
