package AGGAD;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroLeche extends javax.swing.JFrame {

    public static String IdBovino;
    public static int NumeroLitros;
    public static String Jornada;
    public static String ConvertirFechaSQL;
    public static Date FechaRegistroLeche;
    public static java.sql.Date FechaSQL;

    public RegistroLeche() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("AGGAD");
        Icon();
        BottonGroup();
        PlaceHolder();

    }

    public final void Icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/AGGAD.png")));
    }

    private void BottonGroup() {
        GrupoDeBotonesJornada.add(RadioBotonMañana);
        GrupoDeBotonesJornada.add(RadioBotonTarde);
        GrupoDeBotonesJornada.add(RadioBotonNoche);
    }

    private void PlaceHolder() {
        TextPromp FieldIdBovino = new TextPromp("Id Bovino", CajaIDBovino);
        TextPromp FieldNumeroDeLitros = new TextPromp("Numero de Litros", CajaNumeroDeLitros);
    }

    private void RadioBotones() {
        if (RadioBotonMañana.isSelected()) {
            Jornada = "Mañana";
        } else if (RadioBotonTarde.isSelected()) {
            Jornada = "Tarde";
        } else if (RadioBotonNoche.isSelected()) {
            Jornada = "Noche";
        } else {
            Jornada = "No espesificado";
        }
    }

    private void FechaRegistroLeche() {
        SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
        ConvertirFechaSQL = Formato.format(FechaRegistroLeche);
        FechaSQL = java.sql.Date.valueOf(ConvertirFechaSQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoDeBotonesJornada = new javax.swing.ButtonGroup();
        PanelRegistroLeche = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelImgAGGAD = new javax.swing.JLabel();
        CajaNumeroDeLitros = new javax.swing.JTextField();
        CajaIDBovino = new javax.swing.JTextField();
        LabelJornada = new javax.swing.JLabel();
        RadioBotonMañana = new javax.swing.JRadioButton();
        RadioBotonNoche = new javax.swing.JRadioButton();
        RadioBotonTarde = new javax.swing.JRadioButton();
        BotonEnviarDatoProduccion = new javax.swing.JButton();
        CalendarFechaRegistroLeche = new com.toedter.calendar.JDateChooser();
        BotonVolver = new javax.swing.JButton();
        LabelTextoHoraCorrecto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRegistroLeche.setBackground(new java.awt.Color(222, 222, 222));
        PanelRegistroLeche.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelRegistroLeche.setMinimumSize(new java.awt.Dimension(950, 535));
        PanelRegistroLeche.setLayout(null);

        LabelTitulo.setBackground(new java.awt.Color(222, 222, 222));
        LabelTitulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LabelTitulo.setText("REGISTRO DE PRODUCCIÓN LECHERA");
        LabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        PanelRegistroLeche.add(LabelTitulo);
        LabelTitulo.setBounds(10, 20, 900, 60);

        LabelImgAGGAD.setBackground(new java.awt.Color(46, 213, 115));
        LabelImgAGGAD.setForeground(new java.awt.Color(0, 0, 0));
        LabelImgAGGAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGGADMEDIANA.png"))); // NOI18N
        PanelRegistroLeche.add(LabelImgAGGAD);
        LabelImgAGGAD.setBounds(610, 78, 330, 310);

        CajaNumeroDeLitros.setBackground(new java.awt.Color(222, 222, 222));
        CajaNumeroDeLitros.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaNumeroDeLitros.setForeground(new java.awt.Color(0, 0, 0));
        CajaNumeroDeLitros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaNumeroDeLitrosKeyTyped(evt);
            }
        });
        PanelRegistroLeche.add(CajaNumeroDeLitros);
        CajaNumeroDeLitros.setBounds(40, 340, 390, 30);

        CajaIDBovino.setBackground(new java.awt.Color(222, 222, 222));
        CajaIDBovino.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaIDBovino.setForeground(new java.awt.Color(0, 0, 0));
        CajaIDBovino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaIDBovinoActionPerformed(evt);
            }
        });
        PanelRegistroLeche.add(CajaIDBovino);
        CajaIDBovino.setBounds(40, 200, 390, 30);

        LabelJornada.setBackground(new java.awt.Color(222, 222, 222));
        LabelJornada.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LabelJornada.setForeground(new java.awt.Color(0, 0, 0));
        LabelJornada.setText("Jornada:");
        LabelJornada.setToolTipText("");
        PanelRegistroLeche.add(LabelJornada);
        LabelJornada.setBounds(30, 390, 90, 24);

        RadioBotonMañana.setBackground(new java.awt.Color(46, 213, 115));
        RadioBotonMañana.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RadioBotonMañana.setForeground(new java.awt.Color(0, 0, 0));
        RadioBotonMañana.setText("Mañana");
        RadioBotonMañana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RadioBotonMañana.setOpaque(false);
        RadioBotonMañana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBotonMañanaActionPerformed(evt);
            }
        });
        PanelRegistroLeche.add(RadioBotonMañana);
        RadioBotonMañana.setBounds(20, 430, 110, 31);

        RadioBotonNoche.setBackground(new java.awt.Color(46, 213, 115));
        RadioBotonNoche.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RadioBotonNoche.setForeground(new java.awt.Color(0, 0, 0));
        RadioBotonNoche.setText("Noche");
        RadioBotonNoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RadioBotonNoche.setOpaque(false);
        RadioBotonNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBotonNocheActionPerformed(evt);
            }
        });
        PanelRegistroLeche.add(RadioBotonNoche);
        RadioBotonNoche.setBounds(250, 430, 110, 31);

        RadioBotonTarde.setBackground(new java.awt.Color(46, 213, 115));
        RadioBotonTarde.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RadioBotonTarde.setForeground(new java.awt.Color(0, 0, 0));
        RadioBotonTarde.setText("Tarde");
        RadioBotonTarde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RadioBotonTarde.setOpaque(false);
        RadioBotonTarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBotonTardeActionPerformed(evt);
            }
        });
        PanelRegistroLeche.add(RadioBotonTarde);
        RadioBotonTarde.setBounds(140, 430, 100, 30);

        BotonEnviarDatoProduccion.setBackground(new java.awt.Color(46, 213, 115));
        BotonEnviarDatoProduccion.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonEnviarDatoProduccion.setForeground(new java.awt.Color(0, 0, 0));
        BotonEnviarDatoProduccion.setText("Registrar Datos");
        BotonEnviarDatoProduccion.setBorder(null);
        BotonEnviarDatoProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarDatoProduccionActionPerformed(evt);
            }
        });
        PanelRegistroLeche.add(BotonEnviarDatoProduccion);
        BotonEnviarDatoProduccion.setBounds(690, 380, 170, 40);

        CalendarFechaRegistroLeche.setBackground(new java.awt.Color(222, 222, 222));
        CalendarFechaRegistroLeche.setForeground(new java.awt.Color(0, 0, 0));
        CalendarFechaRegistroLeche.setDateFormatString("dd-MM-yyyy");
        PanelRegistroLeche.add(CalendarFechaRegistroLeche);
        CalendarFechaRegistroLeche.setBounds(40, 280, 390, 29);

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
        PanelRegistroLeche.add(BotonVolver);
        BotonVolver.setBounds(690, 430, 170, 40);

        LabelTextoHoraCorrecto.setBackground(new java.awt.Color(222, 222, 222));
        LabelTextoHoraCorrecto.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LabelTextoHoraCorrecto.setForeground(new java.awt.Color(0, 0, 0));
        PanelRegistroLeche.add(LabelTextoHoraCorrecto);
        LabelTextoHoraCorrecto.setBounds(150, 450, 210, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistroLeche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistroLeche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioBotonMañanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBotonMañanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBotonMañanaActionPerformed

    private void RadioBotonNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBotonNocheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBotonNocheActionPerformed

    private void RadioBotonTardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBotonTardeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBotonTardeActionPerformed

    private void BotonEnviarDatoProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarDatoProduccionActionPerformed
        RadioBotones();
        IdBovino = CajaIDBovino.getText();
        FechaRegistroLeche = CalendarFechaRegistroLeche.getDate();
        NumeroLitros = Integer.parseInt(CajaNumeroDeLitros.getText());
        FechaRegistroLeche();
        System.out.println(IdBovino + " " + NumeroLitros + " " + Jornada + " " + FechaSQL);
        ConexionBaseDeDatos EnvioDatosProduccionLeche = new ConexionBaseDeDatos();
        EnvioDatosProduccionLeche.Conexion();
        try {
            EnvioDatosProduccionLeche.EnviarDatosRegistroLeche();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLeche.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_BotonEnviarDatoProduccionActionPerformed

    private void CajaNumeroDeLitrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaNumeroDeLitrosKeyTyped
        char Numero = evt.getKeyChar();
        if (Numero < '0' || Numero > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_CajaNumeroDeLitrosKeyTyped

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Conexion Volver = new Conexion();
        Volver.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotonVolverActionPerformed

    private void CajaIDBovinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaIDBovinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaIDBovinoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviarDatoProduccion;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField CajaIDBovino;
    private javax.swing.JTextField CajaNumeroDeLitros;
    private com.toedter.calendar.JDateChooser CalendarFechaRegistroLeche;
    private javax.swing.ButtonGroup GrupoDeBotonesJornada;
    private javax.swing.JLabel LabelImgAGGAD;
    private javax.swing.JLabel LabelJornada;
    private javax.swing.JLabel LabelTextoHoraCorrecto;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelRegistroLeche;
    private javax.swing.JRadioButton RadioBotonMañana;
    private javax.swing.JRadioButton RadioBotonNoche;
    private javax.swing.JRadioButton RadioBotonTarde;
    // End of variables declaration//GEN-END:variables
}
