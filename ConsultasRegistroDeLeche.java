/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AGGAD;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class ConsultasRegistroDeLeche extends javax.swing.JFrame {

     public static DefaultTableModel TablaConsultaP = new DefaultTableModel();
    public ConsultasRegistroDeLeche() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("AGGAD");
        Icon();
    }
    
    private void ConsultaLeche() {
        TablaConsultaP.addColumn("Numero de litros");
        TablaConsultaP.addColumn("Jornada");
        TablaConsultaP.addColumn("Fecha");
        TablaConsultaP.addColumn("Id vaca");
        TablaRegistroLeche.setModel(TablaConsultaP);
    }
        
public final void Icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/AGGAD.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BotonConsultarRegistroLeche = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRegistroLeche = new javax.swing.JTable();
        LabelImagenConsultaRegistroLeche = new javax.swing.JLabel();
        LabelTituloConsultarRegistroLeche = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 535));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(222, 222, 222));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setMinimumSize(new java.awt.Dimension(950, 535));
        jPanel2.setPreferredSize(new java.awt.Dimension(950, 535));
        jPanel2.setLayout(null);

        BotonConsultarRegistroLeche.setBackground(new java.awt.Color(46, 213, 115));
        BotonConsultarRegistroLeche.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonConsultarRegistroLeche.setForeground(new java.awt.Color(0, 0, 0));
        BotonConsultarRegistroLeche.setText("Consultar ");
        BotonConsultarRegistroLeche.setBorder(null);
        BotonConsultarRegistroLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarRegistroLecheActionPerformed(evt);
            }
        });
        jPanel2.add(BotonConsultarRegistroLeche);
        BotonConsultarRegistroLeche.setBounds(290, 430, 150, 40);

        BotonVolver.setBackground(new java.awt.Color(46, 213, 115));
        BotonVolver.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonVolver.setForeground(new java.awt.Color(0, 0, 0));
        BotonVolver.setText("Regresar");
        BotonVolver.setBorder(null);
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel2.add(BotonVolver);
        BotonVolver.setBounds(540, 430, 140, 40);

        TablaRegistroLeche.setBackground(new java.awt.Color(222, 222, 222));
        TablaRegistroLeche.setForeground(new java.awt.Color(0, 0, 0));
        TablaRegistroLeche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaRegistroLeche);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 890, 70);

        LabelImagenConsultaRegistroLeche.setBackground(new java.awt.Color(222, 222, 222));
        LabelImagenConsultaRegistroLeche.setForeground(new java.awt.Color(0, 0, 0));
        LabelImagenConsultaRegistroLeche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGGADPEQUEÑA.png"))); // NOI18N
        jPanel2.add(LabelImagenConsultaRegistroLeche);
        LabelImagenConsultaRegistroLeche.setBounds(740, 10, 200, 170);

        LabelTituloConsultarRegistroLeche.setBackground(new java.awt.Color(222, 222, 222));
        LabelTituloConsultarRegistroLeche.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        LabelTituloConsultarRegistroLeche.setForeground(new java.awt.Color(0, 0, 0));
        LabelTituloConsultarRegistroLeche.setText("REGISTROS DE LECHE");
        jPanel2.add(LabelTituloConsultarRegistroLeche);
        LabelTituloConsultarRegistroLeche.setBounds(70, 70, 470, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 950, 535);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonConsultarRegistroLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarRegistroLecheActionPerformed
        ConsultaLeche();
        ConexionBaseDeDatos ConsultarLeche = new ConexionBaseDeDatos();
        ConsultarLeche.Conexion();
         try {
             ConsultarLeche.ConsultarLeche();
         } catch (SQLException ex) {
             Logger.getLogger(ConsultasRegistroDeLeche.class.getName()).log(Level.SEVERE, null, ex);
         }
        BotonConsultarRegistroLeche.setEnabled(false);
    }//GEN-LAST:event_BotonConsultarRegistroLecheActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Conexion Volver = new Conexion();
        Volver.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultarRegistroLeche;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel LabelImagenConsultaRegistroLeche;
    private javax.swing.JLabel LabelTituloConsultarRegistroLeche;
    public static javax.swing.JTable TablaRegistroLeche;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
