package AGGAD;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultasPartos extends javax.swing.JFrame {

    public static DefaultTableModel TablaConsultaP = new DefaultTableModel();

    public ConsultasPartos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("AGGAD");
        Icon();
    }
   public final void Icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/AGGAD.png")));
    }

    private void ConsultaPartosColumnas() {
        TablaConsultaP.addColumn("Nombre cria");
        TablaConsultaP.addColumn("Id cria");
        TablaConsultaP.addColumn("Fecha de Parto");
        TablaConsultaP.addColumn("Id Madre");
        TablaConsultaP.addColumn("Raza");
        TablaConsultaPartos.setModel(TablaConsultaP);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConsultasPartos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsultaPartos = new javax.swing.JTable();
        BotonConsultarPartos = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        LabelImagenConsultaPartos = new javax.swing.JLabel();
        LabelTituloConsultaPartos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(949, 535));
        setName("FrameConsultaPartos"); // NOI18N
        getContentPane().setLayout(null);

        PanelConsultasPartos.setBackground(new java.awt.Color(222, 222, 222));
        PanelConsultasPartos.setForeground(new java.awt.Color(0, 0, 0));
        PanelConsultasPartos.setMinimumSize(new java.awt.Dimension(950, 535));
        PanelConsultasPartos.setName(""); // NOI18N
        PanelConsultasPartos.setPreferredSize(new java.awt.Dimension(950, 535));
        PanelConsultasPartos.setLayout(null);

        TablaConsultaPartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaConsultaPartos);

        PanelConsultasPartos.add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 860, 70);

        BotonConsultarPartos.setBackground(new java.awt.Color(46, 213, 115));
        BotonConsultarPartos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonConsultarPartos.setForeground(new java.awt.Color(0, 0, 0));
        BotonConsultarPartos.setText("Consultar ");
        BotonConsultarPartos.setBorder(null);
        BotonConsultarPartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarPartosActionPerformed(evt);
            }
        });
        PanelConsultasPartos.add(BotonConsultarPartos);
        BotonConsultarPartos.setBounds(310, 400, 140, 40);

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
        PanelConsultasPartos.add(BotonVolver);
        BotonVolver.setBounds(530, 400, 130, 40);

        LabelImagenConsultaPartos.setBackground(new java.awt.Color(222, 222, 222));
        LabelImagenConsultaPartos.setForeground(new java.awt.Color(0, 0, 0));
        LabelImagenConsultaPartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGGADPEQUEÑA.png"))); // NOI18N
        PanelConsultasPartos.add(LabelImagenConsultaPartos);
        LabelImagenConsultaPartos.setBounds(740, 10, 200, 170);

        LabelTituloConsultaPartos.setBackground(new java.awt.Color(222, 222, 222));
        LabelTituloConsultaPartos.setFont(new java.awt.Font("Verdana", 1, 33)); // NOI18N
        LabelTituloConsultaPartos.setForeground(new java.awt.Color(0, 0, 0));
        LabelTituloConsultaPartos.setText("PARTOS DE LOS ANIMALES BOVINOS");
        PanelConsultasPartos.add(LabelTituloConsultaPartos);
        LabelTituloConsultaPartos.setBounds(20, 80, 730, 70);

        getContentPane().add(PanelConsultasPartos);
        PanelConsultasPartos.setBounds(0, 0, 950, 535);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonConsultarPartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarPartosActionPerformed
        ConsultaPartosColumnas();
        ConexionBaseDeDatos ConsultaPartos= new ConexionBaseDeDatos();
        ConsultaPartos.Conexion();
        try {
            ConsultaPartos.ConsultarRegistrosPartos();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasPartos.class.getName()).log(Level.SEVERE, null, ex);
        }
        BotonConsultarPartos.setEnabled(false);
    }//GEN-LAST:event_BotonConsultarPartosActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Conexion Volver = new Conexion();
        Volver.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultarPartos;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel LabelImagenConsultaPartos;
    private javax.swing.JLabel LabelTituloConsultaPartos;
    private javax.swing.JPanel PanelConsultasPartos;
    private javax.swing.JTable TablaConsultaPartos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
