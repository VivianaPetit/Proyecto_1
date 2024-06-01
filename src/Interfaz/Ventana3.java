/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author USUARIO
 */
public class Ventana3 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana3
     */
    Fuentes tipoFuente; 
    
    public Ventana3() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        tipoFuente = new Fuentes();
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 23));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 23));
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 35));
        jLabel5.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 20));
        jLabel6.setFont(tipoFuente.fuente(tipoFuente.nombre, 1, 23));
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelRound3 = new Interfaz.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelRound4 = new Interfaz.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        panelRound5 = new Interfaz.PanelRound();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(120, 61, 25));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image-removebg-preview (3).png"))); // NOI18N
        jLabel2.setText("          Actualizar Diccionario");
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 50));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 310, 50));

        jPanel1.setBackground(new java.awt.Color(185, 148, 112));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background__4_-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 150, 480));

        panelRound1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 350));

        panelRound3.setBackground(new java.awt.Color(185, 148, 112));
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

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image-removebg-preview (2).png"))); // NOI18N
        jLabel3.setText("                         Ver Tablero");
        panelRound3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 50));

        panelRound1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 310, 50));

        jPanel2.setBackground(new java.awt.Color(185, 148, 112));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelRound1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 290, 10));

        jPanel3.setBackground(new java.awt.Color(185, 148, 112));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelRound1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 320, 10));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Menú");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 100, 50));

        panelRound4.setBackground(new java.awt.Color(185, 148, 112));
        panelRound4.setRoundBottomLeft(10);
        panelRound4.setRoundBottomRight(10);
        panelRound4.setRoundTopLeft(10);
        panelRound4.setRoundTopRight(10);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image-removebg-preview (1).png"))); // NOI18N
        jLabel5.setText("               Buscar Palabra Específica");
        panelRound4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 50));

        panelRound1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 310, 50));

        panelRound5.setBackground(new java.awt.Color(185, 148, 112));
        panelRound5.setRoundBottomLeft(10);
        panelRound5.setRoundBottomRight(10);
        panelRound5.setRoundTopLeft(10);
        panelRound5.setRoundTopRight(10);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image-removebg-preview.png"))); // NOI18N
        jLabel6.setText("                   Buscar Palabras");
        panelRound5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 50));

        panelRound1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 310, 50));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelRound3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound3MousePressed
        Ventana4 v4 = new Ventana4();
        this.setVisible(false);
        v4.setVisible(true);
    }//GEN-LAST:event_panelRound3MousePressed

    private void panelRound2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MousePressed
        Ventana5 v5 = new Ventana5();
        this.setVisible(false);
        v5.setVisible(true);
    }//GEN-LAST:event_panelRound2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private Interfaz.PanelRound panelRound1;
    private Interfaz.PanelRound panelRound2;
    private Interfaz.PanelRound panelRound3;
    private Interfaz.PanelRound panelRound4;
    private Interfaz.PanelRound panelRound5;
    // End of variables declaration//GEN-END:variables
}
