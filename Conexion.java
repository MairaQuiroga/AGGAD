package AGGAD;

import java.awt.Toolkit;

public class Conexion extends javax.swing.JFrame {

    public Conexion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Icon();
        this.setTitle("AGGAD");
    }

    public final void Icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/AGGAD.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LabelImgAGGAD = new javax.swing.JLabel();
        BotonRegistroPartos = new javax.swing.JButton();
        BotonRegistroLeche = new javax.swing.JButton();
        LabelBienvenido = new javax.swing.JLabel();
        BotonRegistroHojaDeVida1 = new javax.swing.JButton();
        LabelTextoNombre = new javax.swing.JLabel();
        BotonConsultarDatosHojaDeVida = new javax.swing.JButton();
        BotonConsultarRegistroDePartos = new javax.swing.JButton();
        BotonConsultarRegistroDeLeche = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 222, 222));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 535));
        jPanel1.setLayout(null);

        LabelImgAGGAD.setForeground(new java.awt.Color(0, 0, 0));
        LabelImgAGGAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGGADCONEXION.png"))); // NOI18N
        jPanel1.add(LabelImgAGGAD);
        LabelImgAGGAD.setBounds(70, 80, 440, 370);

        BotonRegistroPartos.setBackground(new java.awt.Color(46, 213, 115));
        BotonRegistroPartos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonRegistroPartos.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegistroPartos.setText("Registrar Parto");
        BotonRegistroPartos.setBorder(null);
        BotonRegistroPartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroPartosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistroPartos);
        BotonRegistroPartos.setBounds(660, 190, 240, 50);

        BotonRegistroLeche.setBackground(new java.awt.Color(46, 213, 115));
        BotonRegistroLeche.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonRegistroLeche.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegistroLeche.setText("Registro De Leche");
        BotonRegistroLeche.setBorder(null);
        BotonRegistroLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroLecheActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistroLeche);
        BotonRegistroLeche.setBounds(660, 110, 240, 50);

        LabelBienvenido.setBackground(new java.awt.Color(222, 222, 222));
        LabelBienvenido.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        LabelBienvenido.setForeground(new java.awt.Color(0, 0, 0));
        LabelBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBienvenido.setText("BIENVENIDO");
        jPanel1.add(LabelBienvenido);
        LabelBienvenido.setBounds(110, 30, 370, 50);

        BotonRegistroHojaDeVida1.setBackground(new java.awt.Color(46, 213, 115));
        BotonRegistroHojaDeVida1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonRegistroHojaDeVida1.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegistroHojaDeVida1.setText("Registrar Hoja De Vida");
        BotonRegistroHojaDeVida1.setBorder(null);
        BotonRegistroHojaDeVida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroHojaDeVida1ActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistroHojaDeVida1);
        BotonRegistroHojaDeVida1.setBounds(660, 30, 240, 50);

        LabelTextoNombre.setBackground(new java.awt.Color(222, 222, 222));
        LabelTextoNombre.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        LabelTextoNombre.setForeground(new java.awt.Color(0, 0, 0));
        LabelTextoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTextoNombre.setText("<html><div style='text-align: center;'>" + "<html><body>APLICACIÓN PARA LA GESTIÓN GANADERA  <br> Y EL ANÁLISIS DE DATOS</body></html>" + "</div></html>");
        LabelTextoNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelTextoNombre);
        LabelTextoNombre.setBounds(0, 410, 640, 110);

        BotonConsultarDatosHojaDeVida.setBackground(new java.awt.Color(46, 213, 115));
        BotonConsultarDatosHojaDeVida.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonConsultarDatosHojaDeVida.setForeground(new java.awt.Color(0, 0, 0));
        BotonConsultarDatosHojaDeVida.setText("Consultar Hojas de vida");
        BotonConsultarDatosHojaDeVida.setBorder(null);
        BotonConsultarDatosHojaDeVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarDatosHojaDeVidaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonConsultarDatosHojaDeVida);
        BotonConsultarDatosHojaDeVida.setBounds(660, 270, 240, 50);

        BotonConsultarRegistroDePartos.setBackground(new java.awt.Color(46, 213, 115));
        BotonConsultarRegistroDePartos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonConsultarRegistroDePartos.setForeground(new java.awt.Color(0, 0, 0));
        BotonConsultarRegistroDePartos.setText("Consultar Registros De Partos");
        BotonConsultarRegistroDePartos.setBorder(null);
        BotonConsultarRegistroDePartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarRegistroDePartosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonConsultarRegistroDePartos);
        BotonConsultarRegistroDePartos.setBounds(660, 340, 240, 50);

        BotonConsultarRegistroDeLeche.setBackground(new java.awt.Color(46, 213, 115));
        BotonConsultarRegistroDeLeche.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonConsultarRegistroDeLeche.setForeground(new java.awt.Color(0, 0, 0));
        BotonConsultarRegistroDeLeche.setText("Consultar Registros De Leche");
        BotonConsultarRegistroDeLeche.setBorder(null);
        BotonConsultarRegistroDeLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarRegistroDeLecheActionPerformed(evt);
            }
        });
        jPanel1.add(BotonConsultarRegistroDeLeche);
        BotonConsultarRegistroDeLeche.setBounds(660, 420, 240, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistroPartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroPartosActionPerformed
        RegistroPartos Parto = new RegistroPartos();
        Parto.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonRegistroPartosActionPerformed

    private void BotonRegistroLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroLecheActionPerformed
        RegistroLeche RegistroLeche = new RegistroLeche();
        RegistroLeche.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonRegistroLecheActionPerformed

    private void BotonRegistroHojaDeVida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroHojaDeVida1ActionPerformed
        HojaDeVida Hoja = new HojaDeVida();
        Hoja.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonRegistroHojaDeVida1ActionPerformed

    private void BotonConsultarDatosHojaDeVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarDatosHojaDeVidaActionPerformed
        ConsultasHojasDeVida ConsultaHojasDeVida = new ConsultasHojasDeVida();
        ConsultaHojasDeVida.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonConsultarDatosHojaDeVidaActionPerformed

    private void BotonConsultarRegistroDePartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarRegistroDePartosActionPerformed
        ConsultasPartos Inicio = new ConsultasPartos();
        Inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonConsultarRegistroDePartosActionPerformed

    private void BotonConsultarRegistroDeLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarRegistroDeLecheActionPerformed
        ConsultasRegistroDeLeche Inicioo = new ConsultasRegistroDeLeche();
        Inicioo.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonConsultarRegistroDeLecheActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultarDatosHojaDeVida;
    private javax.swing.JButton BotonConsultarRegistroDeLeche;
    private javax.swing.JButton BotonConsultarRegistroDePartos;
    private javax.swing.JButton BotonRegistroHojaDeVida1;
    private javax.swing.JButton BotonRegistroLeche;
    private javax.swing.JButton BotonRegistroPartos;
    private javax.swing.JLabel LabelBienvenido;
    private javax.swing.JLabel LabelImgAGGAD;
    private javax.swing.JLabel LabelTextoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
