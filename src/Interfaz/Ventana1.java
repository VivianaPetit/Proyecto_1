/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author VivianaPetit
 */
public class Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    Fuentes tipoFuente; 
    
    public Ventana1() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        tipoFuente = new Fuentes();
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 20));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 40));
        
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
        jLabel3 = new javax.swing.JLabel();
        panelRound2 = new Interfaz.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelRound3 = new Interfaz.PanelRound();
        backgorund = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(120, 61, 25));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(185, 148, 112));
        jLabel3.setText("Sopa De Letras");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        panelRound2.setBackground(new java.awt.Color(185, 148, 112));
        panelRound2.setRoundBottomLeft(10);
        panelRound2.setRoundBottomRight(10);
        panelRound2.setRoundTopLeft(10);
        panelRound2.setRoundTopRight(10);
        panelRound2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRound2MousePressed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(120, 61, 25));
        jLabel1.setText("Iniciar");
        panelRound2.add(jLabel1);

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 110, 30));

        panelRound3.setBackground(new java.awt.Color(185, 148, 112));
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgorund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background__4_-removebg-preview.png"))); // NOI18N
        panelRound3.add(backgorund, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 420));

        panelRound1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 380));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelRound2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MousePressed
        
        Ventana2 v2 = new Ventana2();
        this.setVisible(false);
        v2.setVisible(true);
    }//GEN-LAST:event_panelRound2MousePressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgorund;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private Interfaz.PanelRound panelRound1;
    private Interfaz.PanelRound panelRound2;
    private Interfaz.PanelRound panelRound3;
    // End of variables declaration//GEN-END:variables
}
