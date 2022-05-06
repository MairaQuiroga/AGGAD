package AGGAD;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroPartos extends javax.swing.JFrame {

    public static String NombreCria;
    public static String SexoCria;
    public static String IdCria;
    public static String IdMadre;
    public static Date FechaDeParto;
    public static String Raza;
    String FechaConvertSQL;
    public static java.sql.Date FechaSQL;

    public RegistroPartos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("AGGAD");
        Icon();
        BottonGroup();
        PlaceHolder();
        InicioRegistroHojaDeVidaAuto();
    }

    public final void Icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/AGGAD.png")));
    }

    private void BottonGroup() {
        GrupoRadioBotonesSexo.add(RadioBotonHembraCria);
        GrupoRadioBotonesSexo.add(RadioBotonMachoCria);

    }

    private void PlaceHolder() {
        TextPromp FieldNombreCria = new TextPromp("Nombre de la cria", CajaNombreCria);
        TextPromp FieldIdentificacionCria = new TextPromp("ID de la cria", CajaIDCria);
        TextPromp FieldIdMadre = new TextPromp("ID de la madre", CajaIDMadre);

    }

    private void RadioBotones() {
        if (RadioBotonHembraCria.isSelected()) {
            SexoCria = "Hembra";
        } else if (RadioBotonMachoCria.isSelected()) {
            SexoCria = "Macho";
        } else {
            SexoCria = "No definido";
        }
    }

    private void ControlRegistroHojaDeVidaAuto() {
        LabelCrearHojadevida.setVisible(true);
        BotonCrearHojaDeVidaSi.setVisible(true);
        BotonNoCrearHojaDeVida.setVisible(true);
        BotonVolver.setVisible(false);

    }

    private void InicioRegistroHojaDeVidaAuto() {
        LabelCrearHojadevida.setVisible(false);
        BotonCrearHojaDeVidaSi.setVisible(false);
        BotonNoCrearHojaDeVida.setVisible(false);
    }

    private void FechaDeParto() {
        SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
        FechaConvertSQL = Formato.format(FechaDeParto);
        FechaSQL = java.sql.Date.valueOf(FechaConvertSQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoRadioBotonesSexo = new javax.swing.ButtonGroup();
        PanelRegistroPartos = new javax.swing.JPanel();
        LabelNombreDeLaCria = new javax.swing.JLabel();
        LabelRegistroPartos = new javax.swing.JLabel();
        CajaNombreCria = new javax.swing.JTextField();
        CalendarFechaNacimientoCria = new com.toedter.calendar.JDateChooser();
        CajaIDCria = new javax.swing.JTextField();
        CajaIDMadre = new javax.swing.JTextField();
        LabelSexoCria = new javax.swing.JLabel();
        RadioBotonHembraCria = new javax.swing.JRadioButton();
        RadioBotonMachoCria = new javax.swing.JRadioButton();
        BotonRegistrar = new javax.swing.JButton();
        LabelImagenRegistroPartos = new javax.swing.JLabel();
        LabelTextoNombre = new javax.swing.JLabel();
        BotonNoCrearHojaDeVida = new javax.swing.JButton();
        ListaDeRazasCria = new javax.swing.JComboBox<>();
        LabelCrearHojadevida = new javax.swing.JLabel();
        BotonCrearHojaDeVidaSi = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRegistroPartos.setBackground(new java.awt.Color(222, 222, 222));
        PanelRegistroPartos.setForeground(new java.awt.Color(0, 0, 0));
        PanelRegistroPartos.setMinimumSize(new java.awt.Dimension(950, 535));
        PanelRegistroPartos.setLayout(null);

        LabelNombreDeLaCria.setBackground(new java.awt.Color(222, 222, 222));
        LabelNombreDeLaCria.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LabelNombreDeLaCria.setForeground(new java.awt.Color(0, 0, 0));
        LabelNombreDeLaCria.setText("Fecha del parto:");
        PanelRegistroPartos.add(LabelNombreDeLaCria);
        LabelNombreDeLaCria.setBounds(60, 150, 230, 23);

        LabelRegistroPartos.setBackground(new java.awt.Color(222, 222, 222));
        LabelRegistroPartos.setFont(new java.awt.Font("Verdana", 1, 42)); // NOI18N
        LabelRegistroPartos.setForeground(new java.awt.Color(0, 0, 0));
        LabelRegistroPartos.setText("REGISTRO DE PARTOS");
        PanelRegistroPartos.add(LabelRegistroPartos);
        LabelRegistroPartos.setBounds(60, 40, 540, 52);

        CajaNombreCria.setBackground(new java.awt.Color(222, 222, 222));
        CajaNombreCria.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaNombreCria.setForeground(new java.awt.Color(0, 0, 0));
        CajaNombreCria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNombreCriaActionPerformed(evt);
            }
        });
        PanelRegistroPartos.add(CajaNombreCria);
        CajaNombreCria.setBounds(60, 110, 320, 30);

        CalendarFechaNacimientoCria.setBackground(new java.awt.Color(222, 222, 222));
        CalendarFechaNacimientoCria.setForeground(new java.awt.Color(0, 0, 0));
        CalendarFechaNacimientoCria.setOpaque(false);
        PanelRegistroPartos.add(CalendarFechaNacimientoCria);
        CalendarFechaNacimientoCria.setBounds(60, 180, 320, 19);

        CajaIDCria.setBackground(new java.awt.Color(222, 222, 222));
        CajaIDCria.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaIDCria.setForeground(new java.awt.Color(0, 0, 0));
        CajaIDCria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaIDCriaActionPerformed(evt);
            }
        });
        PanelRegistroPartos.add(CajaIDCria);
        CajaIDCria.setBounds(60, 360, 320, 30);

        CajaIDMadre.setBackground(new java.awt.Color(222, 222, 222));
        CajaIDMadre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaIDMadre.setForeground(new java.awt.Color(0, 0, 0));
        CajaIDMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaIDMadreActionPerformed(evt);
            }
        });
        PanelRegistroPartos.add(CajaIDMadre);
        CajaIDMadre.setBounds(60, 310, 320, 30);

        LabelSexoCria.setBackground(new java.awt.Color(222, 222, 222));
        LabelSexoCria.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LabelSexoCria.setForeground(new java.awt.Color(0, 0, 0));
        LabelSexoCria.setText("Sexo:");
        PanelRegistroPartos.add(LabelSexoCria);
        LabelSexoCria.setBounds(60, 230, 60, 24);

        RadioBotonHembraCria.setBackground(new java.awt.Color(46, 213, 115));
        RadioBotonHembraCria.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RadioBotonHembraCria.setForeground(new java.awt.Color(0, 0, 0));
        RadioBotonHembraCria.setText("Hembra");
        RadioBotonHembraCria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RadioBotonHembraCria.setOpaque(false);
        RadioBotonHembraCria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBotonHembraCriaActionPerformed(evt);
            }
        });
        PanelRegistroPartos.add(RadioBotonHembraCria);
        RadioBotonHembraCria.setBounds(120, 230, 110, 31);

        RadioBotonMachoCria.setBackground(new java.awt.Color(46, 213, 115));
        RadioBotonMachoCria.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RadioBotonMachoCria.setForeground(new java.awt.Color(0, 0, 0));
        RadioBotonMachoCria.setText("Macho");
        RadioBotonMachoCria.setOpaque(false);
        RadioBotonMachoCria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBotonMachoCriaActionPerformed(evt);
            }
        });
        PanelRegistroPartos.add(RadioBotonMachoCria);
        RadioBotonMachoCria.setBounds(240, 230, 90, 28);

        BotonRegistrar.setBackground(new java.awt.Color(46, 213, 115));
        BotonRegistrar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegistrar.setText("Registrar ");
        BotonRegistrar.setBorder(null);
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        PanelRegistroPartos.add(BotonRegistrar);
        BotonRegistrar.setBounds(60, 470, 120, 40);

        LabelImagenRegistroPartos.setBackground(new java.awt.Color(222, 222, 222));
        LabelImagenRegistroPartos.setForeground(new java.awt.Color(0, 0, 0));
        LabelImagenRegistroPartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGGADRegistroPartos.png"))); // NOI18N
        PanelRegistroPartos.add(LabelImagenRegistroPartos);
        LabelImagenRegistroPartos.setBounds(550, 90, 300, 280);

        LabelTextoNombre.setBackground(new java.awt.Color(222, 222, 222));
        LabelTextoNombre.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        LabelTextoNombre.setForeground(new java.awt.Color(0, 0, 0));
        LabelTextoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTextoNombre.setText("<html><div style='text-align: center;'>" + "<html><body>APLICACIÓN GANADERA PARA LA GESTIÓN  <br> Y EL ANÁLISIS DE DATOS</body></html>" + "</div></html>");
        LabelTextoNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelRegistroPartos.add(LabelTextoNombre);
        LabelTextoNombre.setBounds(400, 340, 530, 110);

        BotonNoCrearHojaDeVida.setBackground(new java.awt.Color(46, 213, 115));
        BotonNoCrearHojaDeVida.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonNoCrearHojaDeVida.setForeground(new java.awt.Color(0, 0, 0));
        BotonNoCrearHojaDeVida.setText("No");
        BotonNoCrearHojaDeVida.setBorder(null);
        BotonNoCrearHojaDeVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNoCrearHojaDeVidaActionPerformed(evt);
            }
        });
        PanelRegistroPartos.add(BotonNoCrearHojaDeVida);
        BotonNoCrearHojaDeVida.setBounds(850, 470, 70, 40);

        ListaDeRazasCria.setBackground(new java.awt.Color(222, 222, 222));
        ListaDeRazasCria.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ListaDeRazasCria.setForeground(new java.awt.Color(0, 0, 0));
        ListaDeRazasCria.setMaximumRowCount(3);
        ListaDeRazasCria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar raza", "Angus", "Ayrshire", "Beefmaster", "Blanco orejinegro", "Bosmara", "Brahmán", "Brangus", "Cebú", "Charbray", "Charoláis", "Guernesey", "Guzerát ", "Gyr", "Hereford", "Holstein", "Limousine", "Maine Anjou", "Marchigiana", "Nelore", "Normando", "Pardo suizo", "Pasiega", "Jersey", "Romagnola", "Santa Gertrudis", "Shorthorn", "Simmental alemán", "Simmental americano" }));
        ListaDeRazasCria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDeRazasCriaActionPerformed(evt);
            }
        });
        PanelRegistroPartos.add(ListaDeRazasCria);
        ListaDeRazasCria.setBounds(60, 410, 320, 30);

        LabelCrearHojadevida.setBackground(new java.awt.Color(222, 222, 222));
        LabelCrearHojadevida.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LabelCrearHojadevida.setForeground(new java.awt.Color(0, 0, 0));
        LabelCrearHojadevida.setText("¿Desea crear la hoja de vida del nacido?");
        PanelRegistroPartos.add(LabelCrearHojadevida);
        LabelCrearHojadevida.setBounds(370, 480, 370, 20);

        BotonCrearHojaDeVidaSi.setBackground(new java.awt.Color(46, 213, 115));
        BotonCrearHojaDeVidaSi.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonCrearHojaDeVidaSi.setForeground(new java.awt.Color(0, 0, 0));
        BotonCrearHojaDeVidaSi.setText("Si");
        BotonCrearHojaDeVidaSi.setBorder(null);
        BotonCrearHojaDeVidaSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearHojaDeVidaSiActionPerformed(evt);
            }
        });
        PanelRegistroPartos.add(BotonCrearHojaDeVidaSi);
        BotonCrearHojaDeVidaSi.setBounds(760, 470, 70, 40);

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
        PanelRegistroPartos.add(BotonVolver);
        BotonVolver.setBounds(210, 470, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistroPartos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistroPartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajaIDCriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaIDCriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaIDCriaActionPerformed

    private void CajaIDMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaIDMadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaIDMadreActionPerformed

    private void RadioBotonHembraCriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBotonHembraCriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBotonHembraCriaActionPerformed

    private void RadioBotonMachoCriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBotonMachoCriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBotonMachoCriaActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        RadioBotones();
        ControlRegistroHojaDeVidaAuto();
        NombreCria = CajaNombreCria.getText();
        IdCria = CajaIDCria.getText();
        IdMadre = CajaIDMadre.getText();
        FechaDeParto = CalendarFechaNacimientoCria.getDate();
        Raza = (String) ListaDeRazasCria.getSelectedItem();
        FechaDeParto();
        System.out.println(NombreCria + " " + IdCria + " " + IdMadre + " " + SexoCria + " " + FechaSQL);
        ConexionBaseDeDatos ConexionBD = new ConexionBaseDeDatos();
        ConexionBD.Conexion();
        try {
            ConexionBD.EnviarDatosRegistroPartos();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroPartos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void CajaNombreCriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNombreCriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaNombreCriaActionPerformed

    private void BotonNoCrearHojaDeVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNoCrearHojaDeVidaActionPerformed
        Conexion Volver = new Conexion();
        Volver.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotonNoCrearHojaDeVidaActionPerformed

    private void ListaDeRazasCriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDeRazasCriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaDeRazasCriaActionPerformed

    private void BotonCrearHojaDeVidaSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearHojaDeVidaSiActionPerformed
        HojaDeVida CrearDesdeRegistroPartos = new HojaDeVida();
        CrearDesdeRegistroPartos.NombreBovinoDesdeRegistroPartos = NombreCria;
        CrearDesdeRegistroPartos.FechaParto_NacimientoRegistroPartos = FechaDeParto;
        CrearDesdeRegistroPartos.IdMadreDesdeRegistroPartos = IdMadre;
        CrearDesdeRegistroPartos.IdCriaDesdeRegistroPartos = IdCria;
        CrearDesdeRegistroPartos.EstablecerDatosDeRegistroPartosEnHojaDeVida(SexoCria, ListaDeRazasCria.getSelectedIndex());
        CrearDesdeRegistroPartos.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonCrearHojaDeVidaSiActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Conexion Volver = new Conexion();
        Volver.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearHojaDeVidaSi;
    private javax.swing.JButton BotonNoCrearHojaDeVida;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField CajaIDCria;
    private javax.swing.JTextField CajaIDMadre;
    private javax.swing.JTextField CajaNombreCria;
    private com.toedter.calendar.JDateChooser CalendarFechaNacimientoCria;
    private javax.swing.ButtonGroup GrupoRadioBotonesSexo;
    private javax.swing.JLabel LabelCrearHojadevida;
    private javax.swing.JLabel LabelImagenRegistroPartos;
    private javax.swing.JLabel LabelNombreDeLaCria;
    private javax.swing.JLabel LabelRegistroPartos;
    private javax.swing.JLabel LabelSexoCria;
    private javax.swing.JLabel LabelTextoNombre;
    private javax.swing.JComboBox<String> ListaDeRazasCria;
    private javax.swing.JPanel PanelRegistroPartos;
    private javax.swing.JRadioButton RadioBotonHembraCria;
    private javax.swing.JRadioButton RadioBotonMachoCria;
    // End of variables declaration//GEN-END:variables
}
