/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josevargass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author josevargas
 */
public class Principal extends javax.swing.JFrame {
static int cont = 0;
    /**
     * Creates new form Principal
     */
    public Principal() throws IOException {
        initComponents();
        universos.add(new Universo("MarvelUniverse"));
        universos.add(new Universo("Unitec"));
        universos.get(0).getSeresvivos().add(new SerVivo("Spiderman", 9, 18, "Marte", "Humano"));
        universos.get(0).getSeresvivos().add(new SerVivo("Hulk", 5, 25, "Tierra", "Amanto"));
        universos.get(0).getSeresvivos().add(new SerVivo("Capitan A", 8, 19, "Jupiter", "Humano"));
        universos.get(0).getSeresvivos().add(new SerVivo("Black Widow", 10, 18, "Mercurio", "Amanto"));
        universos.get(0).getSeresvivos().add(new SerVivo("Jose Vargas", 2, 14, "Marte", "Humano"));
        universos.get(0).getSeresvivos().add(new SerVivo("SuperMan", 6, 36, "Tierra", "Amanto"));
        universos.get(0).getSeresvivos().add(new SerVivo("Thor", 1, 10, "Saturno", "Humano"));
        universos.get(0).getSeresvivos().add(new SerVivo("Iron Man", 5, 150, "Marte", "Amanto"));
        universos.get(0).getSeresvivos().add(new SerVivo("Claudia", 6, 23, "Saturno", "Humano"));
        universos.get(0).getSeresvivos().add(new SerVivo("Batman", 9, 29, "Tierra", "Amanto"));
        universos.get(1).getSeresvivos().add(new SerVivo("Hernan", 7, 38, "Mercurio", "Humano"));
        universos.get(1).getSeresvivos().add(new SerVivo("Monica", 10, 18, "Marte", "Amanto"));
        universos.get(1).getSeresvivos().add(new SerVivo("Leonardo", 2, 35, "Saturno", "Humano"));
        universos.get(1).getSeresvivos().add(new SerVivo("Clauida", 1, 70, "Jupiter", "Amanto"));
        universos.get(1).getSeresvivos().add(new SerVivo("Carlos", 8, 40, "Mercurio", "Humano"));
        universos.get(1).getSeresvivos().add(new SerVivo("Diego", 4, 65, "Tierra", "Amanto"));
        universos.get(1).getSeresvivos().add(new SerVivo("Miguel", 9, 32, "Saturno", "Humano"));
        universos.get(1).getSeresvivos().add(new SerVivo("Javier", 10, 17, "Jupiter", "Amanto"));
        universos.get(1).getSeresvivos().add(new SerVivo("Jose", 2, 25, "Marte", "Humano"));
        universos.get(1).getSeresvivos().add(new SerVivo("Marco", 5, 45, "Tierra", "Amanto"));
        universos.get(0).escribirArchivo();
        universos.get(1).escribirArchivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_ag_sv = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        js_poder = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        tf_edad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_planeta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_raza = new javax.swing.JComboBox<>();
        guardar_sv = new javax.swing.JButton();
        jd_mod_sv = new javax.swing.JDialog();
        jd_mod_sv1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        js_poder1 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        tf_edad1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_planeta1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cb_raza1 = new javax.swing.JComboBox<>();
        guardar_sv1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Ser Vivo");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Poder:");

        js_poder.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel4.setText("Edad:");

        tf_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_edadActionPerformed(evt);
            }
        });

        jLabel5.setText("Planeta:");

        jLabel6.setText("Raza:");

        cb_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));

        guardar_sv.setText("Guardar");
        guardar_sv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardar_svMouseClicked(evt);
            }
        });
        guardar_sv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_svActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_poder, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(guardar_sv, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(js_poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(guardar_sv, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_ag_svLayout = new javax.swing.GroupLayout(jd_ag_sv.getContentPane());
        jd_ag_sv.getContentPane().setLayout(jd_ag_svLayout);
        jd_ag_svLayout.setHorizontalGroup(
            jd_ag_svLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_ag_svLayout.setVerticalGroup(
            jd_ag_svLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jd_mod_svLayout = new javax.swing.GroupLayout(jd_mod_sv.getContentPane());
        jd_mod_sv.getContentPane().setLayout(jd_mod_svLayout);
        jd_mod_svLayout.setHorizontalGroup(
            jd_mod_svLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        jd_mod_svLayout.setVerticalGroup(
            jd_mod_svLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel7.setText("Modificar Ser Vivo");

        jLabel8.setText("Nombre:");

        jLabel9.setText("Poder:");

        js_poder1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel10.setText("Edad:");

        tf_edad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_edad1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Planeta:");

        jLabel12.setText("Raza:");

        cb_raza1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));

        guardar_sv1.setText("Guardar");
        guardar_sv1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardar_sv1MouseClicked(evt);
            }
        });
        guardar_sv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_sv1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_edad1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_poder1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_planeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_raza1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(guardar_sv1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(js_poder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_edad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(guardar_sv1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_planeta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cb_raza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_mod_sv1Layout = new javax.swing.GroupLayout(jd_mod_sv1.getContentPane());
        jd_mod_sv1.getContentPane().setLayout(jd_mod_sv1Layout);
        jd_mod_sv1Layout.setHorizontalGroup(
            jd_mod_sv1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_mod_sv1Layout.setVerticalGroup(
            jd_mod_sv1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta_1.setColumns(20);
        ta_1.setRows(5);
        jScrollPane1.setViewportView(ta_1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Guardar en Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Abrir Universo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Seres Vivos");

        jMenuItem3.setText("Agregar un Ser Vivo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem2.setText("Modificar un Ser Vivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem6.setText("Eliminar un Ser Vivo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Universo");

        jMenuItem5.setText("Nuevo Universo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        ta_1.setText("");
        try {
            JFileChooser fc = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            fc.setFileFilter(filtro);
            int seleccion = fc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = fc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                ta_1.setText("");
                while ((linea = br.readLine()) != null) {
                    ta_1.append(linea);
                    ta_1.append("\n");
                }
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(universos.get(cont).getSeresvivos().size()>0){
            try {
                universos.get(cont).escribirArchivo();
                JOptionPane.showMessageDialog(this, "Se creó el archivo con éxito");
            } catch (IOException ex) {
            
            }
        }else{
            JOptionPane.showMessageDialog(this, "El universo todavia no contiene ningun ser vivo");
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del universo: ");
        Universo u = new Universo(nombre);
        universos.add(u);
        if(universos.size()>3){
            cont++;
        }
        JOptionPane.showMessageDialog(this, "Se creó el universo con éxito");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void tf_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_edadActionPerformed

    private void guardar_svMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardar_svMouseClicked
        if(tf_nombre.getText().equals("") || tf_edad.getText().equals("") || tf_planeta.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No se pueden dejar casillas en blanco");
        }else{
            SerVivo sv = new SerVivo(tf_nombre.getText(), Integer.parseInt(js_poder.getValue().toString()), Integer.parseInt(tf_edad.getText()), tf_planeta.getText(), cb_raza.getSelectedItem().toString());
            universos.get(cont).getSeresvivos().add(sv);
            JOptionPane.showMessageDialog(this, "Se agregó el ser vivo con éxito");
            tf_nombre.setText("");
            tf_edad.setText("");
            tf_planeta.setText("");
            jd_ag_sv.dispose();
        }
    }//GEN-LAST:event_guardar_svMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jd_ag_sv.setVisible(true);
        jd_ag_sv.setLocationRelativeTo(this);
        jd_ag_sv.pack();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void guardar_svActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_svActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardar_svActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String unis = "";
        for (Universo universo : universos) {
            unis = unis + universos.indexOf(universo) + " - " + universo + "\n";
        }
        pos_u = Integer.parseInt(JOptionPane.showInputDialog(unis + "\n Ingrese la posicion del universo:"));
        String ser = "";
        for (Object sv : universos.get(pos_u).getSeresvivos()){
            ser += universos.get(pos_u).getSeresvivos().indexOf(sv) + " - " + sv + "\n";
        }
        pos_sv = Integer.parseInt(JOptionPane.showInputDialog(ser + "\n Ingrese la posicion del ser vivo:"));
        jd_mod_sv1.setVisible(true);
        jd_mod_sv1.setLocationRelativeTo(this);
        jd_mod_sv1.pack();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tf_edad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_edad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_edad1ActionPerformed

    private void guardar_sv1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardar_sv1MouseClicked
        if(tf_nombre1.getText().equals("") || tf_edad1.getText().equals("") || tf_planeta1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No se pueden dejar casillas en blanco");
        }else{
            SerVivo sv = new SerVivo(tf_nombre1.getText(), Integer.parseInt(js_poder1.getValue().toString()), Integer.parseInt(tf_edad1.getText()), tf_planeta1.getText(), cb_raza1.getSelectedItem().toString());
            universos.get(pos_u).getSeresvivos().set(pos_sv, sv);
            try {
                universos.get(cont).escribirArchivo();
            } catch (IOException ex) {
                
            }
            JOptionPane.showMessageDialog(this, "Se modificó el ser vivo con éxito");
            tf_nombre1.setText("");
            tf_edad1.setText("");
            tf_planeta1.setText("");
            jd_ag_sv.dispose();
        }
    }//GEN-LAST:event_guardar_sv1MouseClicked

    private void guardar_sv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_sv1ActionPerformed
        
    }//GEN-LAST:event_guardar_sv1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        String unis = "";
        for (Universo universo : universos) {
            unis = unis + universos.indexOf(universo) + " - " + universo + "\n";
        }
        pos_u = Integer.parseInt(JOptionPane.showInputDialog(unis + "\n Ingrese la posicion del universo:"));
        String ser = "";
        for (Object sv : universos.get(pos_u).getSeresvivos()){
            ser += universos.get(pos_u).getSeresvivos().indexOf(sv) + " - " + sv + "\n";
        }
        pos_sv = Integer.parseInt(JOptionPane.showInputDialog(ser + "\n Ingrese la posicion del ser vivo:"));
        universos.get(pos_u).getSeresvivos().remove(pos_sv);
    try {
        universos.get(pos_u).escribirArchivo();
    } catch (IOException ex) {
        
    }
        
        JOptionPane.showMessageDialog(this, "Se eliminó el ser vivo con éxito");
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_raza;
    private javax.swing.JComboBox<String> cb_raza1;
    private javax.swing.JButton guardar_sv;
    private javax.swing.JButton guardar_sv1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_ag_sv;
    private javax.swing.JDialog jd_mod_sv;
    private javax.swing.JDialog jd_mod_sv1;
    private javax.swing.JSpinner js_poder;
    private javax.swing.JSpinner js_poder1;
    private javax.swing.JTextArea ta_1;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_edad1;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_planeta;
    private javax.swing.JTextField tf_planeta1;
    // End of variables declaration//GEN-END:variables
    ArrayList<Universo> universos = new ArrayList();
    int pos_sv;
    int pos_u;
}
