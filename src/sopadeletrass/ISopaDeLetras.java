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

/**
 *
 * @author KelvinCi
 */
public class ISopaDeLetras extends javax.swing.JFrame {

<<<<<<< HEAD
    public Grafos grafo;
//    public String letras;
    public String[] diccionario;
    public String path;
=======
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    private static String[] diccionario = {};
    private static String[] palabrasEncontradas = new String[100];
    char[][] letras = new char[4][4];
    String linea;
    Tablero tablero = new Tablero(letras);
    private static int contadorPalabrasEncontradas = 0;
    

    public static void agregarAlDiccionario(String nuevaPalabra) {
        // Asegurarse de que la nueva palabra no esté ya en el diccionario
        if (!palabraYaEnDiccionario(nuevaPalabra)) {
            // Crear un nuevo array con tamaño aumentado para contener la nueva palabra
            String[] nuevoDiccionario = new String[diccionario.length + 1];
            // Copiar el contenido del diccionario actual al nuevo array
            System.arraycopy(diccionario, 0, nuevoDiccionario, 0, diccionario.length);
            // Agregar la nueva palabra al final del nuevo array
            nuevoDiccionario[diccionario.length] = nuevaPalabra;
            // Asignar el nuevo array como el diccionario actual
            diccionario = nuevoDiccionario;
        }
    }

    public static boolean palabraYaEnDiccionario(String palabra) {
        for (String palabraDiccionario : diccionario) {
            if (palabraDiccionario.equals(palabra)) {
                return true;
            }
        }
        return false;
    }
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7

    /**
     * Creates new form ISopaDeLetras
     */
    public ISopaDeLetras(Grafos grafo, String[] diccionario, String path) {
        initComponents();
        this.grafo = grafo;
        this.diccionario = diccionario;
        this.path = path;
        this.setVisible(true);
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
    
    public void imprimir_dic(){
        for (int i = 0; i < this.diccionario.length; i++) {
            this.dic.setText(this.dic.getText() + this.diccionario[i] +"\n");
        }
    }
    public void drawTree(AuxiliarBFS auxiliarBFS) {
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
        v00 = new javax.swing.JTextField();
        tres = new javax.swing.JTextField();
        cuatro = new javax.swing.JTextField();
        v01 = new javax.swing.JTextField();
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
<<<<<<< HEAD
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
=======
        jButton1 = new javax.swing.JButton();
        palabra = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7

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

        v00.setText("1");
        getContentPane().add(v00, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 39, 37, -1));

        tres.setText("3");
        getContentPane().add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 95, 37, -1));

        cuatro.setText("4");
        getContentPane().add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 123, 37, -1));

        v01.setText("5");
        getContentPane().add(v01, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 39, 37, -1));

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

<<<<<<< HEAD
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

        jButton1.setText("GuardarTXT");
=======
        jButton1.setText("buscar");
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel2.setText("Diccionario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel3.setText("INGRESAR PALABRA A BUSCAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 205, -1));

        dic.setColumns(20);
        dic.setRows(5);
        jScrollPane3.setViewportView(dic);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 240, 170));

        jLabel4.setText("Palabras Encontradas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
=======

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INGRESAR PALABRA A BUSCAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(v00, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(v01, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diez, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(once, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(doce, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(catorce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(quince, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(dieciseis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trece, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(empezar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(v01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(catorce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(once, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dieciseis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(empezar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //public void lectura
    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        if (this.palabra.getText().length() >= 3) {
            boolean found = false;
            for (int i = 0; i < this.diccionario.length; i++) {
                if (this.diccionario[i].equals(this.palabra.getText().toUpperCase())) {
                    found = true;
                    break;
=======
        //String letras = "C,H,A,O,X,A,T,M,P,R,R,A,A,O,R,O";
        StringBuilder palabraBuilder = new StringBuilder();
        Listaexamples lista = new Listaexamples();
        Listaexamples listaWord = new Listaexamples();
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = AbrirArchivo(archivo);
                    contenido.setText(documento);
                    int InicioPalabrasDicc = documento.indexOf("dic") + "/dic".length();
                    int FinalPalabrasDicc = documento.indexOf("/dic");
                    String ParaRecorrer = documento.substring(InicioPalabrasDicc, FinalPalabrasDicc);
                    ParaRecorrer = ParaRecorrer.replaceAll("/n", "");
                    for (int i = 0; i < ParaRecorrer.length(); i++) {
                        char letraWords = ParaRecorrer.charAt(i);
                        listaWord.insertFinal(letraWords);//Aqui termino de recorrer las palabras letra por letra
                        char letraDiferenteDuda = ' ';

                        if (letraDiferenteDuda != letraWords) {
                            palabraBuilder.append(letraWords);
                            String palabraBuscar = palabraBuilder.toString();

                            if (palabraBuilder.length() >= 4 || palabraBuscar.contains("ORO")) {
                                palabraBuilder.append(',');
                                String palabraDiccionario = palabraBuilder.toString();
                                agregarAlDiccionario(palabraDiccionario);
                            }
                        }

                    }

                    //aqui se leen las letras
                    int fila = 0;
                    String[] letrasEnLinea = linea.split(",");
                    int inicio = documento.indexOf("tab") + "tab".length();
                    int fin = documento.indexOf("/tab");
                    String textolista = documento.substring(inicio, fin);
                    textolista = textolista.replaceAll(",", "");
                    for (int i = 0; i < textolista.length(); i++) {
                        char letra = textolista.charAt(i);
                        letras[fila][i] = letrasEnLinea[i].charAt(0);
                        lista.insertFinal(letra);

                    }

                } else {
                    JOptionPane.showConfirmDialog(null, "Archivo no compatible");
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7
                }
            }
            if (!found) {
                String[] a = new String[this.diccionario.length + 1];
                for (int i = 0; i < this.diccionario.length; i++) {
                    a[i] = this.diccionario[i];
                }
                a[this.diccionario.length] = this.palabra.getText().toUpperCase();
                this.diccionario = a;
            }
            AuxiliarBFS aux = this.grafo.bfsSearch(this.palabra.getText().toUpperCase());
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
    public static boolean palabraYaEncontrada(String palabra) {
        for (int i = 0; i < contadorPalabrasEncontradas; i++) {
            if (palabrasEncontradas[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }
 public static boolean esPalabraValida(String palabra) {
        for (int i = 0; i < diccionario.length; i++) {
            if (diccionario[i].equals(palabra)) {
                return true;
            }
        }
        return false;
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

    public static void buscarPalabras(Tablero tablero) {
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                boolean[][] visitado = new boolean[4][4];
                dfs(tablero, fila, columna, "", visitado);
            }
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        buscarPalabras(tablero);

    }//GEN-LAST:event_jButton1ActionPerformed


    private void bfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfsActionPerformed
        // TODO add your handling code here:
        this.contenido.setText("");
        long startTime = System.nanoTime();
        for (int i = 0; i < diccionario.length; i++) {
            AuxiliarBFS aux = this.grafo.bfsSearch(this.diccionario[i].toUpperCase());
            if (aux.encontrado) {

                this.contenido.setText(this.contenido.getText() + this.diccionario[i] + "\n");

            }
        }
        long endTime = System.nanoTime();

        long timeTaken = endTime - startTime;
        System.out.println("Time taken: " + (timeTaken / 1_000_000) + " milliseconds");

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
        System.out.println("Time taken: " + (timeTaken / 1_000_000) + " milliseconds");

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
<<<<<<< HEAD
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
=======
>>>>>>> 0cc2fd744bf8de17b816d09818fe9b5ad8d2f9b7
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
    private javax.swing.JTextField v00;
    private javax.swing.JTextField v01;
    // End of variables declaration//GEN-END:variables
}
