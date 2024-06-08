/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sopadeletrass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import sopadeletrass.AuxiliarBFS_1;
import sopadeletrass.Grafos;
import sopadeletrass.NodoGrafo;

/**
 *
 * @author KelvinCi
 */
public class ISopaDeLetras extends javax.swing.JFrame {

    public Grafos grafo;
//    public String letras;
    public String[] diccionario;
    public String path;

    /**
     * Creates new form ISopaDeLetras
     */
    public ISopaDeLetras(Grafos grafo, String[] diccionario, String path) {
        initComponents();
        this.grafo = grafo;
        this.diccionario = diccionario;
        this.path = path;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.escribirSopadeLetras();
        this.imprimir_dic();
    }

    public void sobrescribirTXT(Grafos grafo, String[] diccionario, String direccion_txt) {
        String datos = "";
        String linea;
        String datos_txt = "";
        String path = direccion_txt;
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.write("dic" + "\n");
            for (int i = 0; i < grafo.max_nodos; i++) {
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

    public void imprimir_dic() {
        for (int i = 0; i < this.diccionario.length; i++) {
            this.dic.setText(this.dic.getText() + this.diccionario[i] + "\n");
        }
    }

   /* public void drawTree(AuxiliarBFS_1 auxiliarBFS) {
        Graph graph = new SingleGraph("BFS Tree");

        for (int i = 0; i < auxiliarBFS.recorrido.length; i++) {
            try {
                String nodeId = "node_" + i;
                String nodeLabel = String.valueOf(auxiliarBFS.recorrido[i].letra);
                graph.addNode(nodeId);
                Node node = graph.getNode(nodeId);
                node.setAttribute("ui.label", nodeLabel);
                node.setAttribute("ui.shape", "circle");
                node.setAttribute("ui.size", 10);
                node.setAttribute("ui.color", "rgb(173, 216, 230)");
            } catch (Exception e) {

            }
        }

        for (int i = 0; i < auxiliarBFS.recorrido.length - 1; i++) {
            try {
                String fromNodeId = "node_" + i;
                String toNodeId = "node_" + (i + 1);
                graph.addEdge(fromNodeId + "->" + toNodeId, fromNodeId, toNodeId); // add edge between nodes
            } catch (Exception e) {

            }
        }

        System.setProperty("org.graphstream.ui", "swing");
        graph.display();
    }**/

    public void GraficarArbol(NodoGrafo[] recorrido) {

        Graph graph = new SingleGraph("Arbol");

        graph.setAttribute("ui.stylesheet", "node { fill-color: white; stroke-mode: plain; stroke-color: black; stroke-width: 2px; size: 30px; text-alignment: at-right; text-padding: 10px; }");

        NodoGrafo padre = null;
        for (NodoGrafo nodo : recorrido) {
            try {
                Node node = graph.addNode(nodo.pos + "");
                node.setAttribute("ui.label", nodo.letra + "");
                node.setAttribute("ui.class", "nodo");

                if (padre != null) {
                    graph.addEdge(padre.pos + "-" + nodo.pos, padre.pos + "", nodo.pos + "");
                }
                padre = nodo;
            } catch (Exception e) {

            }
        }
        System.setProperty("org.graphstream.ui", "swing");
        graph.display();
    }

    public void escribirSopadeLetras() {
        String letras = "";
        for (int i = 0; i < this.grafo.letras.length; i++) {
            letras += this.grafo.letras[i].letra;
        }
        this.uno.setText(String.valueOf(letras.charAt(0)));
        this.dos.setText(String.valueOf(letras.charAt(1)));
        this.tres.setText(String.valueOf(letras.charAt(2)));
        this.cuatro.setText(String.valueOf(letras.charAt(3)));
        this.cinco.setText(String.valueOf(letras.charAt(4)));
        this.seis.setText(String.valueOf(letras.charAt(5)));
        this.siete.setText(String.valueOf(letras.charAt(6)));
        this.ocho.setText(String.valueOf(letras.charAt(7)));
        this.nueve.setText(String.valueOf(letras.charAt(8)));
        this.diez.setText(String.valueOf(letras.charAt(9)));
        this.once.setText(String.valueOf(letras.charAt(10)));
        this.doce.setText(String.valueOf(letras.charAt(11)));
        this.trece.setText(String.valueOf(letras.charAt(12)));
        this.catorce.setText(String.valueOf(letras.charAt(13)));
        this.quince.setText(String.valueOf(letras.charAt(14)));
        this.dieciseis.setText(String.valueOf(letras.charAt(15)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        empezar = new javax.swing.JButton();
        dos = new javax.swing.JTextField();
        uno = new javax.swing.JTextField();
        tres = new javax.swing.JTextField();
        cuatro = new javax.swing.JTextField();
        cinco = new javax.swing.JTextField();
        nueve = new javax.swing.JTextField();
        doce = new javax.swing.JTextField();
        ocho = new javax.swing.JTextField();
        seis = new javax.swing.JTextField();
        siete = new javax.swing.JTextField();
        diez = new javax.swing.JTextField();
        once = new javax.swing.JTextField();
        trece = new javax.swing.JTextField();
        catorce = new javax.swing.JTextField();
        quince = new javax.swing.JTextField();
        dieciseis = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        bfs = new javax.swing.JButton();
        palabra = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dfs = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dic = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empezar.setText("Empezar");
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });
        getContentPane().add(empezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        dos.setText("2");
        getContentPane().add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 67, 37, -1));

        uno.setText("1");
        getContentPane().add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 39, 37, -1));

        tres.setText("3");
        getContentPane().add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 95, 37, -1));

        cuatro.setText("4");
        getContentPane().add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 123, 37, -1));

        cinco.setText("5");
        getContentPane().add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 39, 37, -1));

        nueve.setText("9");
        getContentPane().add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 39, 34, -1));

        doce.setText("12");
        getContentPane().add(doce, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 123, 34, -1));

        ocho.setText("8");
        getContentPane().add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 123, 37, -1));

        seis.setText("6");
        getContentPane().add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 67, 37, -1));

        siete.setText("7");
        getContentPane().add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 95, 37, -1));

        diez.setText("10");
        getContentPane().add(diez, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 67, 34, -1));

        once.setText("11");
        getContentPane().add(once, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 95, 34, -1));

        trece.setText("13");
        getContentPane().add(trece, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 39, 35, -1));

        catorce.setText("14");
        getContentPane().add(catorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 67, 35, -1));

        quince.setText("15");
        getContentPane().add(quince, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 95, 35, -1));

        dieciseis.setText("16");
        getContentPane().add(dieciseis, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 123, 35, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 67, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 157, -1, -1));

        contenido.setColumns(20);
        contenido.setRows(5);
        jScrollPane2.setViewportView(contenido);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 250, 160));

        bfs.setText("BFS");
        bfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfsActionPerformed(evt);
            }
        });
        getContentPane().add(bfs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));
        getContentPane().add(palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 90, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 26, -1, -1));

        jLabel1.setText("BUSCAR DICCIONARIO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 205, -1));

        dfs.setText("DFS");
        dfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfsActionPerformed(evt);
            }
        });
        getContentPane().add(dfs, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        jButton1.setText("Cargar/GuardarTXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel2.setText("Diccionario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel3.setText("INGRESAR PALABRA A BUSCAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 205, -1));

        dic.setColumns(20);
        dic.setRows(5);
        jScrollPane3.setViewportView(dic);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 240, 170));

        jLabel4.setText("Palabras Encontradas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //public void lectura
    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        // TODO add your handling code here:
        if (this.palabra.getText().length() >= 3) {
            boolean found = false;
            for (int i = 0; i < this.diccionario.length; i++) {
                if (this.diccionario[i].equals(this.palabra.getText().toUpperCase())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                String[] a = new String[this.diccionario.length + 1];
                for (int i = 0; i < this.diccionario.length; i++) {
                    a[i] = this.diccionario[i];
                }
                a[this.diccionario.length] = this.palabra.getText().toUpperCase();
                this.diccionario = a;
                this.imprimir_dic();
            }
            AuxiliarBFS_1 aux = this.grafo.bfsSearch(this.palabra.getText().toUpperCase());
            this.GraficarArbol(aux.recorrido);
            if (aux.encontrado) {

                JOptionPane.showMessageDialog(rootPane, "La palabra fue encontrada en la sopa de letras!");

            } else {
                JOptionPane.showMessageDialog(rootPane, "La palabra no fue encontrada en la sopa de letras");

            }
//            this.drawTree(aux);
        } else {
            JOptionPane.showMessageDialog(rootPane, "La palabra no contiene el minimo de letras requerido");

        }
    }//GEN-LAST:event_empezarActionPerformed


    private void bfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfsActionPerformed
        // TODO add your handling code here:
        this.contenido.setText("");
        long startTime = System.nanoTime();
        for (int i = 0; i < diccionario.length; i++) {
            AuxiliarBFS_1 aux = this.grafo.bfsSearch(this.diccionario[i].toUpperCase());
            if (aux.encontrado) {

                this.contenido.setText(this.contenido.getText() + this.diccionario[i] + "\n");

            }
        }
        long endTime = System.nanoTime();

        long timeTaken = endTime - startTime;
        this.contenido.setText(this.contenido.getText() + "\n\nTime taken: " + (timeTaken / 1_000_000) + " milliseconds");
    }//GEN-LAST:event_bfsActionPerformed

    private void dfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfsActionPerformed
        // TODO add your handling code here:
        long startTime = System.nanoTime();
        this.contenido.setText("");
        for (int i = 0; i < diccionario.length; i++) {
            NodoGrafo[] l = this.grafo.dfs(diccionario[i]);
            String palabra = "";
            for (int j = 0; j < l.length; j++) {
                try {
                    palabra += l[j].letra;
                } catch (Exception e) {

                }
            }
            System.out.println(palabra + "---" + diccionario[i]);
            if (palabra.equals(diccionario[i])) {
                this.contenido.setText(this.contenido.getText() + this.diccionario[i] + "\n");
            }
        }
        long endTime = System.nanoTime();

        long timeTaken = endTime - startTime;
        this.contenido.setText(this.contenido.getText() + "\n\nTime taken: " + (timeTaken / 1_000_000) + " milliseconds");
    }//GEN-LAST:event_dfsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.sobrescribirTXT(grafo, diccionario, path);
        this.dic.setText("");
        this.imprimir_dic();
        JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con exito");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bfs;
    private javax.swing.JTextField catorce;
    private javax.swing.JTextField cinco;
    private javax.swing.JTextArea contenido;
    private javax.swing.JTextField cuatro;
    private javax.swing.JButton dfs;
    private javax.swing.JTextArea dic;
    private javax.swing.JTextField dieciseis;
    private javax.swing.JTextField diez;
    private javax.swing.JTextField doce;
    private javax.swing.JTextField dos;
    private javax.swing.JButton empezar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nueve;
    private javax.swing.JTextField ocho;
    private javax.swing.JTextField once;
    private javax.swing.JTextField palabra;
    private javax.swing.JTextField quince;
    private javax.swing.JTextField seis;
    private javax.swing.JTextField siete;
    private javax.swing.JTextField trece;
    private javax.swing.JTextField tres;
    private javax.swing.JTextField uno;
    // End of variables declaration//GEN-END:variables
}
