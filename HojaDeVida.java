package AGGAD;

import java.awt.Image;
import static java.awt.Image.SCALE_DEFAULT;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class HojaDeVida extends javax.swing.JFrame {

    public static String Identificacion;
    public static String NombreBovino;
    public static String Raza;
    public static Date FechaDeNacimiento;
    public static String IdPadre;
    public static String FechaConvertirSQL;
    public static String IdMadre;
    public static int NumeroPartos;
    public static String Sexo;
    public static String RutaImagen;
    public static FileInputStream ArchivoFoto;
    public static java.sql.Date FechaSQL;
    Conexion Volver = new Conexion();
    public String NombreBovinoDesdeRegistroPartos;
    public Date FechaParto_NacimientoRegistroPartos;
    public String IdMadreDesdeRegistroPartos;
    public String IdCriaDesdeRegistroPartos;

    public HojaDeVida() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        BottonGroup();
        PlaceHolder();
        Icon();
        this.setTitle("AGGAD");
    }

    public final void Icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/AGGAD.png")));
    }

    private void BottonGroup() {
        GrupoDeBotonesSexo.add(RadioBotonHembra);
        GrupoDeBotonesSexo.add(RadioBotonMacho);
    }

    private void PlaceHolder() {
        TextPromp FieldNombre = new TextPromp("Nombre del bovino", CajaNombre);
        TextPromp FieldIdentificacion = new TextPromp("Identificación", CajaIdentificacion);
        TextPromp FieldIdpadre = new TextPromp("Id de padre", CajaIDpadre);
        TextPromp FieldIdMadre = new TextPromp("Id de la madre", CajaIDMadre);
        TextPromp FieldNumeroDePartos = new TextPromp("Numero de partos", CajaNumeroDePartos);
    }

    private void RadioBotones() {
        if (RadioBotonHembra.isSelected()) {
            Sexo = "Hembra";
            NumeroPartos = Integer.parseInt(CajaNumeroDePartos.getText());
        } else if (RadioBotonMacho.isSelected()) {
            Sexo = "Macho";
            NumeroPartos = 0;
        } else {
            Sexo = "No definido";
        }
    }

    private void FechaDeNacimiento() {
        SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
        FechaConvertirSQL = Formato.format(FechaDeNacimiento);
        FechaSQL = java.sql.Date.valueOf(FechaConvertirSQL);
    }

    public void EstablecerDatosDeRegistroPartosEnHojaDeVida(String Sexo, int IndexRaza) {
        CajaIdentificacion.setText(IdCriaDesdeRegistroPartos);
        CajaNombre.setText(NombreBovinoDesdeRegistroPartos);
        CajaIDMadre.setText(IdMadreDesdeRegistroPartos);
        CalendarFechaNacimiento.setDate(FechaParto_NacimientoRegistroPartos);
        if (Sexo == "Hembra") {
            RadioBotonHembra.setSelected(true);
        } else if (Sexo == "Macho") {
            RadioBotonMacho.setSelected(true);
        }
        ListaRazasHojaDeVida.setSelectedIndex(IndexRaza);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoDeBotonesSexo = new javax.swing.ButtonGroup();
        PanelHojadeVida = new javax.swing.JPanel();
        labelImagen = new javax.swing.JLabel();
        LabelTittle = new java.awt.Label();
        RadioBotonHembra = new javax.swing.JRadioButton();
        RadioBotonMacho = new javax.swing.JRadioButton();
        CajaNombre = new javax.swing.JTextField();
        LabelImagenTexto = new javax.swing.JLabel();
        CajaNumeroDePartos = new javax.swing.JTextField();
        CajaIdentificacion = new javax.swing.JTextField();
        CajaIDpadre = new javax.swing.JTextField();
        CajaIDMadre = new javax.swing.JTextField();
        BotonVolver = new javax.swing.JButton();
        CalendarFechaNacimiento = new com.toedter.calendar.JDateChooser();
        LabelFechaNacimiento1 = new javax.swing.JLabel();
        BotonRegistrarHojaDeVida = new javax.swing.JButton();
        ListaRazasHojaDeVida = new javax.swing.JComboBox<>();
        CajaImagen = new javax.swing.JTextField();
        AgregarImagen = new javax.swing.JButton();
        LabelFotoAnimalBovino = new javax.swing.JLabel();
        LabelSexo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelHojadeVida.setBackground(new java.awt.Color(222, 222, 222));
        PanelHojadeVida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelHojadeVida.setMinimumSize(new java.awt.Dimension(950, 535));
        PanelHojadeVida.setLayout(null);

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGGADPEQUEÑA.png"))); // NOI18N
        PanelHojadeVida.add(labelImagen);
        labelImagen.setBounds(740, 10, 190, 160);

        LabelTittle.setFont(new java.awt.Font("Verdana", 1, 42)); // NOI18N
        LabelTittle.setText("HOJA DE VIDA");
        PanelHojadeVida.add(LabelTittle);
        LabelTittle.setBounds(40, 40, 350, 60);

        RadioBotonHembra.setBackground(new java.awt.Color(46, 213, 115));
        RadioBotonHembra.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RadioBotonHembra.setForeground(new java.awt.Color(0, 0, 0));
        RadioBotonHembra.setText("Hembra");
        RadioBotonHembra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RadioBotonHembra.setOpaque(false);
        RadioBotonHembra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBotonHembraActionPerformed(evt);
            }
        });
        PanelHojadeVida.add(RadioBotonHembra);
        RadioBotonHembra.setBounds(110, 120, 110, 31);

        RadioBotonMacho.setBackground(new java.awt.Color(46, 213, 115));
        RadioBotonMacho.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RadioBotonMacho.setForeground(new java.awt.Color(0, 0, 0));
        RadioBotonMacho.setText("Macho");
        RadioBotonMacho.setOpaque(false);
        RadioBotonMacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBotonMachoActionPerformed(evt);
            }
        });
        PanelHojadeVida.add(RadioBotonMacho);
        RadioBotonMacho.setBounds(220, 120, 90, 28);

        CajaNombre.setBackground(new java.awt.Color(222, 222, 222));
        CajaNombre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaNombre.setForeground(new java.awt.Color(0, 0, 0));
        CajaNombre.setBorder(CajaNombre.getBorder());
        CajaNombre.setOpaque(false);
        CajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNombreActionPerformed(evt);
            }
        });
        CajaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaNombreKeyTyped(evt);
            }
        });
        PanelHojadeVida.add(CajaNombre);
        CajaNombre.setBounds(40, 160, 390, 30);

        LabelImagenTexto.setBackground(new java.awt.Color(222, 222, 222));
        LabelImagenTexto.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LabelImagenTexto.setForeground(new java.awt.Color(0, 0, 0));
        LabelImagenTexto.setText("Imagen:");
        PanelHojadeVida.add(LabelImagenTexto);
        LabelImagenTexto.setBounds(500, 340, 80, 24);

        CajaNumeroDePartos.setBackground(new java.awt.Color(222, 222, 222));
        CajaNumeroDePartos.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaNumeroDePartos.setForeground(new java.awt.Color(0, 0, 0));
        CajaNumeroDePartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNumeroDePartosActionPerformed(evt);
            }
        });
        CajaNumeroDePartos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaNumeroDePartosKeyTyped(evt);
            }
        });
        PanelHojadeVida.add(CajaNumeroDePartos);
        CajaNumeroDePartos.setBounds(40, 480, 390, 30);

        CajaIdentificacion.setBackground(new java.awt.Color(222, 222, 222));
        CajaIdentificacion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaIdentificacion.setForeground(new java.awt.Color(0, 0, 0));
        PanelHojadeVida.add(CajaIdentificacion);
        CajaIdentificacion.setBounds(40, 200, 390, 30);

        CajaIDpadre.setBackground(new java.awt.Color(222, 222, 222));
        CajaIDpadre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaIDpadre.setForeground(new java.awt.Color(0, 0, 0));
        CajaIDpadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaIDpadreActionPerformed(evt);
            }
        });
        PanelHojadeVida.add(CajaIDpadre);
        CajaIDpadre.setBounds(40, 380, 390, 30);

        CajaIDMadre.setBackground(new java.awt.Color(222, 222, 222));
        CajaIDMadre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaIDMadre.setForeground(new java.awt.Color(0, 0, 0));
        CajaIDMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaIDMadreActionPerformed(evt);
            }
        });
        PanelHojadeVida.add(CajaIDMadre);
        CajaIDMadre.setBounds(40, 430, 390, 30);

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
        PanelHojadeVida.add(BotonVolver);
        BotonVolver.setBounds(600, 470, 140, 39);

        CalendarFechaNacimiento.setBackground(new java.awt.Color(222, 222, 222));
        CalendarFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        CalendarFechaNacimiento.setDateFormatString("dd-MM-yyyy");
        PanelHojadeVida.add(CalendarFechaNacimiento);
        CalendarFechaNacimiento.setBounds(250, 250, 180, 29);

        LabelFechaNacimiento1.setBackground(new java.awt.Color(222, 222, 222));
        LabelFechaNacimiento1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LabelFechaNacimiento1.setForeground(new java.awt.Color(0, 0, 0));
        LabelFechaNacimiento1.setText("Fecha de nacimiento:");
        PanelHojadeVida.add(LabelFechaNacimiento1);
        LabelFechaNacimiento1.setBounds(40, 250, 200, 24);

        BotonRegistrarHojaDeVida.setBackground(new java.awt.Color(46, 213, 115));
        BotonRegistrarHojaDeVida.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonRegistrarHojaDeVida.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegistrarHojaDeVida.setText("Registrar ");
        BotonRegistrarHojaDeVida.setBorder(null);
        BotonRegistrarHojaDeVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarHojaDeVidaActionPerformed(evt);
            }
        });
        PanelHojadeVida.add(BotonRegistrarHojaDeVida);
        BotonRegistrarHojaDeVida.setBounds(760, 470, 140, 39);

        ListaRazasHojaDeVida.setBackground(new java.awt.Color(222, 222, 222));
        ListaRazasHojaDeVida.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ListaRazasHojaDeVida.setForeground(new java.awt.Color(0, 0, 0));
        ListaRazasHojaDeVida.setMaximumRowCount(3);
        ListaRazasHojaDeVida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar raza", "Angus", "Ayrshire", "Beefmaster", "Blanco orejinegro", "Bosmara", "Brahmán", "Brangus", "Cebú", "Charbray", "Charoláis", "Guernesey", "Guzerát ", "Gyr", "Hereford", "Holstein", "Limousine", "Maine Anjou", "Marchigiana", "Nelore", "Normando", "Pardo suizo", "Pasiega", "Jersey", "Romagnola", "Santa Gertrudis", "Shorthorn", "Simmental alemán", "Simmental americano" }));
        ListaRazasHojaDeVida.setBorder(null);
        ListaRazasHojaDeVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaRazasHojaDeVidaActionPerformed(evt);
            }
        });
        PanelHojadeVida.add(ListaRazasHojaDeVida);
        ListaRazasHojaDeVida.setBounds(40, 320, 390, 30);

        CajaImagen.setBackground(new java.awt.Color(222, 222, 222));
        CajaImagen.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CajaImagen.setForeground(new java.awt.Color(0, 0, 0));
        PanelHojadeVida.add(CajaImagen);
        CajaImagen.setBounds(600, 340, 180, 31);

        AgregarImagen.setBackground(new java.awt.Color(46, 213, 115));
        AgregarImagen.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        AgregarImagen.setForeground(new java.awt.Color(0, 0, 0));
        AgregarImagen.setText("Seleccionar");
        AgregarImagen.setBorder(null);
        AgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarImagenActionPerformed(evt);
            }
        });
        PanelHojadeVida.add(AgregarImagen);
        AgregarImagen.setBounds(790, 340, 130, 39);

        LabelFotoAnimalBovino.setBackground(new java.awt.Color(222, 222, 222));
        LabelFotoAnimalBovino.setForeground(new java.awt.Color(0, 0, 0));
        PanelHojadeVida.add(LabelFotoAnimalBovino);
        LabelFotoAnimalBovino.setBounds(450, 30, 280, 280);

        LabelSexo1.setBackground(new java.awt.Color(222, 222, 222));
        LabelSexo1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LabelSexo1.setForeground(new java.awt.Color(0, 0, 0));
        LabelSexo1.setText("Sexo:");
        PanelHojadeVida.add(LabelSexo1);
        LabelSexo1.setBounds(50, 120, 70, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHojadeVida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHojadeVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioBotonHembraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBotonHembraActionPerformed
        CajaNumeroDePartos.setVisible(true);
    }//GEN-LAST:event_RadioBotonHembraActionPerformed

    private void RadioBotonMachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBotonMachoActionPerformed
        CajaNumeroDePartos.setVisible(false);
    }//GEN-LAST:event_RadioBotonMachoActionPerformed

    private void CajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaNombreActionPerformed

    private void CajaNumeroDePartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNumeroDePartosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaNumeroDePartosActionPerformed

    private void CajaIDpadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaIDpadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaIDpadreActionPerformed

    private void CajaIDMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaIDMadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaIDMadreActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed

        Volver.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotonVolverActionPerformed

    private void CajaNumeroDePartosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaNumeroDePartosKeyTyped
        char NumeroPartos = evt.getKeyChar();
        if (NumeroPartos < '0' || NumeroPartos > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_CajaNumeroDePartosKeyTyped

    private void BotonRegistrarHojaDeVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarHojaDeVidaActionPerformed

        Identificacion = CajaIdentificacion.getText();
        NombreBovino = CajaNombre.getText();
        Raza = (String) ListaRazasHojaDeVida.getSelectedItem();
        IdPadre = CajaIDpadre.getText();
        IdMadre = CajaIDMadre.getText();
        RutaImagen = CajaImagen.getText();
        FechaDeNacimiento = CalendarFechaNacimiento.getDate();
        RadioBotones();
        FechaDeNacimiento();
        System.out.println(NombreBovino + " " + Raza + "  " + Identificacion + " " + FechaSQL + " " + IdPadre + " " + IdMadre + " " + Sexo + " " + NumeroPartos);
        ConexionBaseDeDatos ConexionDB = new ConexionBaseDeDatos();
        ConexionDB.Conexion();
        try {
            ConexionDB.EnviarDatosAnimalesBovinos();
        } catch (SQLException ex) {
            Logger.getLogger(HojaDeVida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonRegistrarHojaDeVidaActionPerformed

    private void CajaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaNombreKeyTyped

        char Nombre = evt.getKeyChar();
        if ((Nombre < 'a' || Nombre > 'z') && (Nombre < 'A' || Nombre > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_CajaNombreKeyTyped

    private void ListaRazasHojaDeVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaRazasHojaDeVidaActionPerformed

    }//GEN-LAST:event_ListaRazasHojaDeVidaActionPerformed

    private void AgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarImagenActionPerformed
        FileNameExtensionFilter Filtro = new FileNameExtensionFilter("Formatos de Archivod JPEG(*.JPG;*.JPEG;*.PNG)", "JPG", "JPEG", "PNG");
        JFileChooser Archivo = new JFileChooser();
        Archivo.addChoosableFileFilter(Filtro);
        Archivo.setDialogTitle("Abrir Archivos");
        File Ruta = new File("C:/Documentos");
        Archivo.setCurrentDirectory(Ruta);
        int Ventana = Archivo.showOpenDialog(null);
        if (Ventana == JFileChooser.APPROVE_OPTION) {
            File Doc = Archivo.getSelectedFile();
            CajaImagen.setText(String.valueOf(Doc));
            Image Imagen = getToolkit().getImage(CajaImagen.getText());
            Imagen = Imagen.getScaledInstance(280, 280, SCALE_DEFAULT);
            LabelFotoAnimalBovino.setIcon(new ImageIcon(Imagen));
            try {
                ArchivoFoto = new FileInputStream(CajaImagen.getText());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HojaDeVida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_AgregarImagenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarImagen;
    private javax.swing.JButton BotonRegistrarHojaDeVida;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField CajaIDMadre;
    private javax.swing.JTextField CajaIDpadre;
    private javax.swing.JTextField CajaIdentificacion;
    private javax.swing.JTextField CajaImagen;
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JTextField CajaNumeroDePartos;
    private com.toedter.calendar.JDateChooser CalendarFechaNacimiento;
    private javax.swing.ButtonGroup GrupoDeBotonesSexo;
    private javax.swing.JLabel LabelFechaNacimiento1;
    private javax.swing.JLabel LabelFotoAnimalBovino;
    private javax.swing.JLabel LabelImagenTexto;
    private javax.swing.JLabel LabelSexo1;
    private java.awt.Label LabelTittle;
    private javax.swing.JComboBox<String> ListaRazasHojaDeVida;
    private javax.swing.JPanel PanelHojadeVida;
    private javax.swing.JRadioButton RadioBotonHembra;
    private javax.swing.JRadioButton RadioBotonMacho;
    private javax.swing.JLabel labelImagen;
    // End of variables declaration//GEN-END:variables

    private static class ImagenIcon extends JLabel {

        public ImagenIcon(String aggadpng) {
        }
    }
}
