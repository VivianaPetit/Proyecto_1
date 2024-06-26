/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;


import static Interfaz.Ventana2.diccionario;
import static Interfaz.Ventana2.grafo;
import static Interfaz.Ventana2.path;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.util.regex.*;

/**
 *
 * @author VivianaPetit
 */
public class Ventana6 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana5
     */
    Fuentes tipoFuente;
    
    public Ventana6() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        tipoFuente = new Fuentes();
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 16));
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 24));
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 20));
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 20));
        jLabel5.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 16));
        
    }
    
    /**
     * Sobre escribe un archivo txt para actualizar el diccionario.
     */
    public void sobrescribirTXT() {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.write("dic" + "\n");
            for (int i = 0; i < diccionario.length; i++) {
                try {
                    pw.write(diccionario[i] + "\n");
                } catch (Exception e) {
                }
            }
            pw.write("/dic" + "\n");
            pw.write("tab" + "\n");
            String letras = "";
            for (int i = 0; i < grafo.max_nodos; i++) {
                if (i != grafo.max_nodos - 1) {
                    letras += grafo.letras[i].letra + ",";
                } else {
                    letras += grafo.letras[i].letra + "\n";

                }
            }
            pw.write(letras);
            pw.write("/tab" + "\n");
            pw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
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
        panelRound2 = new Interfaz.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        palabra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panelRound5 = new Interfaz.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        panelRound3 = new Interfaz.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(185, 148, 112));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(120, 61, 25));
        panelRound2.setToolTipText("");
        panelRound2.setRoundBottomLeft(10);
        panelRound2.setRoundBottomRight(10);
        panelRound2.setRoundTopLeft(10);
        panelRound2.setRoundTopRight(10);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Diccionario");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 80));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 340, 80));

        palabra.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabraActionPerformed(evt);
            }
        });
        panelRound1.add(palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 150, 40));

        jLabel2.setForeground(new java.awt.Color(120, 61, 25));
        jLabel2.setText("Ingrese la palabra ");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

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

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menú");
        panelRound5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 30));

        panelRound1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 30));

        panelRound3.setBackground(new java.awt.Color(120, 61, 25));
        panelRound3.setRoundBottomLeft(10);
        panelRound3.setRoundBottomRight(10);
        panelRound3.setRoundTopLeft(10);
        panelRound3.setRoundTopRight(10);
        panelRound3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRound3MousePressed(evt);
            }
        });
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Añadir");
        panelRound3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 30));

        panelRound1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 100, 30));

        jLabel4.setForeground(new java.awt.Color(120, 61, 25));
        jLabel4.setText("a agregrar");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabraActionPerformed

    private void panelRound5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound5MousePressed
        Ventana3 v3 = new Ventana3();
        this.setVisible(false);
        v3.setVisible(true);
    }//GEN-LAST:event_panelRound5MousePressed

    private void panelRound3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound3MousePressed
        try {
            String palabraNueva = palabra.getText().toUpperCase();
            String regex = "[A-Za-z]+";
            Pattern pattern = Pattern.compile(regex);
            
            // Evalua que la palabra solo contenga letras y al menos 3.
            if (pattern.matcher(palabraNueva).matches() && palabraNueva.length() >= 3){
                boolean found = false;
                for (int i = 0; i < Ventana2.diccionario.length; i++) {
                    if (Ventana2.diccionario[i].equals(palabra.getText().toUpperCase())) {
                    found = true;
                    break;
                    }
                }
                if (!found) {
                    String[] a = new String[Ventana2.diccionario.length + 1];
                    
                    for (int i = 0; i < Ventana2.diccionario.length; i++) {
                        a[i] = Ventana2.diccionario[i];
                    }
                    a[Ventana2.diccionario.length] = palabra.getText().toUpperCase();
                    Ventana2.diccionario = a;
                    sobrescribirTXT();
                    JOptionPane.showMessageDialog(null, "Agregado con éxito.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "La palabra ya existe en el diccionario.");
                }      
            } else {
                JOptionPane.showMessageDialog(null, "Error: input no válido.");
            } 
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: input no válido.");
        } 
  
    }//GEN-LAST:event_panelRound3MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField palabra;
    private Interfaz.PanelRound panelRound1;
    private Interfaz.PanelRound panelRound2;
    private Interfaz.PanelRound panelRound3;
    private Interfaz.PanelRound panelRound5;
    // End of variables declaration//GEN-END:variables
}
