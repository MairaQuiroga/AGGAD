package AGGAD;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultasHojasDeVida extends javax.swing.JFrame {

    public static DefaultTableModel TablaAnimalesBovinos = new DefaultTableModel();
   

    public ConsultasHojasDeVida() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("AGGAD");
        Icon();
    }
   public final void Icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/AGGAD.png")));
    }

    public void ConsultarHojasVida() {
        TablaAnimalesBovinos.addColumn("Identificacion");
        TablaAnimalesBovinos.addColumn("Sexo");
        TablaAnimalesBovinos.addColumn("Nombre");
        TablaAnimalesBovinos.addColumn("Raza");
        TablaAnimalesBovinos.addColumn("Fecha de nacimiento");
        TablaAnimalesBovinos.addColumn("Id Madre");
        TablaAnimalesBovinos.addColumn("Id Padre");
        TablaAnimalesBovinos.addColumn("Numero de partos");
        TablaAnimalesBovinos.addColumn("Imagen");
        TablaHojasDeVida.setModel(TablaAnimalesBovinos);
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConsultaHojasDeVida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHojasDeVida = new javax.swing.JTable();
        BotonConsultarHojasDeVida = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        LabelTituloConsultaHojaDeVida = new javax.swing.JLabel();
        LabelImagenConsultaHojaDeVida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelConsultaHojasDeVida.setBackground(new java.awt.Color(222, 222, 222));
        PanelConsultaHojasDeVida.setForeground(new java.awt.Color(0, 0, 0));
        PanelConsultaHojasDeVida.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        PanelConsultaHojasDeVida.setMinimumSize(new java.awt.Dimension(950, 535));
        PanelConsultaHojasDeVida.setPreferredSize(new java.awt.Dimension(950, 535));
        PanelConsultaHojasDeVida.setLayout(null);

        TablaHojasDeVida.setBackground(new java.awt.Color(222, 222, 222));
        TablaHojasDeVida.setForeground(new java.awt.Color(0, 0, 0));
        TablaHojasDeVida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaHojasDeVida);

        PanelConsultaHojasDeVida.add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 890, 120);

        BotonConsultarHojasDeVida.setBackground(new java.awt.Color(46, 213, 115));
        BotonConsultarHojasDeVida.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonConsultarHojasDeVida.setForeground(new java.awt.Color(0, 0, 0));
        BotonConsultarHojasDeVida.setText("Consultar");
        BotonConsultarHojasDeVida.setBorder(null);
        BotonConsultarHojasDeVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarHojasDeVidaActionPerformed(evt);
            }
        });
        PanelConsultaHojasDeVida.add(BotonConsultarHojasDeVida);
        BotonConsultarHojasDeVida.setBounds(310, 460, 140, 40);

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
        PanelConsultaHojasDeVida.add(BotonVolver);
        BotonVolver.setBounds(580, 460, 130, 40);

        LabelTituloConsultaHojaDeVida.setBackground(new java.awt.Color(222, 222, 222));
        LabelTituloConsultaHojaDeVida.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        LabelTituloConsultaHojaDeVida.setForeground(new java.awt.Color(0, 0, 0));
        LabelTituloConsultaHojaDeVida.setText("HOJAS DE VIDA DE LOS BOVINOS");
        PanelConsultaHojasDeVida.add(LabelTituloConsultaHojaDeVida);
        LabelTituloConsultaHojaDeVida.setBounds(40, 70, 690, 70);

        LabelImagenConsultaHojaDeVida.setBackground(new java.awt.Color(222, 222, 222));
        LabelImagenConsultaHojaDeVida.setForeground(new java.awt.Color(0, 0, 0));
        LabelImagenConsultaHojaDeVida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGGADPEQUEÑA.png"))); // NOI18N
        PanelConsultaHojasDeVida.add(LabelImagenConsultaHojaDeVida);
        LabelImagenConsultaHojaDeVida.setBounds(730, 20, 200, 170);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConsultaHojasDeVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConsultaHojasDeVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonConsultarHojasDeVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarHojasDeVidaActionPerformed
        ConsultarHojasVida(); 
        ConexionBaseDeDatos ConsultaDeHojasDeVida = new ConexionBaseDeDatos();
         ConsultaDeHojasDeVida.Conexion();
        try {
            ConsultaDeHojasDeVida.ConsultarHojasDeVida();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasHojasDeVida.class.getName()).log(Level.SEVERE, null, ex);
        }
        BotonConsultarHojasDeVida.setEnabled(false);
    }//GEN-LAST:event_BotonConsultarHojasDeVidaActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Conexion Volver = new Conexion();
        Volver.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultarHojasDeVida;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel LabelImagenConsultaHojaDeVida;
    private javax.swing.JLabel LabelTituloConsultaHojaDeVida;
    private javax.swing.JPanel PanelConsultaHojasDeVida;
    public static javax.swing.JTable TablaHojasDeVida;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
