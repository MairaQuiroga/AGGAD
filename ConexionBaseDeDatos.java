package AGGAD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBaseDeDatos {

    Connection Conexion;
    private String Host = "localhost";
    private String Puerto = "3307";
    private String NombreBaseDeDatos = "aggad";
    private String UserName = "root";
    private String Password = "Maira020803";
   

    public void Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + this.Host + ":" + this.Puerto + "/" + this.NombreBaseDeDatos;
            Conexion = DriverManager.getConnection(url, this.UserName, this.Password);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException a) {
            System.out.println("Error,conexion no establecida");
        }
    }

    public void EnviarDatosAnimalesBovinos() throws SQLException {
        HojaDeVida EnvioDeDatos = new HojaDeVida();
        String Identificacion = EnvioDeDatos.Identificacion;
        String Sexo = EnvioDeDatos.Sexo;
        String Raza = EnvioDeDatos.Raza;
        int numerodepartos = EnvioDeDatos.NumeroPartos;
        String Nombre = EnvioDeDatos.NombreBovino;
        String RutaImagen = EnvioDeDatos.RutaImagen;
        String Insertar = "INSERT INTO animalesbovinos(Identificacion,Sexo,Nombre,Raza,FechaDeNacimiento,IdMadre,IdPadre,NumeroDePartos,Imagen,RutaImagen)VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement A = Conexion.prepareStatement(Insertar);
            A.setString(1, Identificacion);
            A.setString(2, Sexo);
            A.setString(3, Nombre);
            A.setString(4, Raza);
            A.setDate(5, EnvioDeDatos.FechaSQL);
            A.setString(6, EnvioDeDatos.IdMadre);
            A.setString(7, EnvioDeDatos.IdPadre);
            A.setInt(8, numerodepartos);
            A.setBinaryStream(9, EnvioDeDatos.ArchivoFoto);
            A.setString(10, RutaImagen);
            A.executeUpdate();
            System.out.println("RegistroExitoso");
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
    }

    public void EnviarDatosRegistroLeche() throws SQLException {
        RegistroLeche EnvioDeDatos = new RegistroLeche();
        String Insertar = "INSERT INTO registrodeleche(NumeroDeLitros,Jornada,Fecha,idVaca)VALUES(?,?,?,?)";
        try {
            PreparedStatement B = Conexion.prepareStatement(Insertar);
            B.setInt(1, EnvioDeDatos.NumeroLitros);
            B.setString(2, EnvioDeDatos.Jornada);
            B.setDate(3, EnvioDeDatos.FechaSQL);
            B.setString(4, EnvioDeDatos.IdBovino);
            B.executeUpdate();
            System.out.println("RegistroExitoso");
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    public void EnviarDatosRegistroPartos() throws SQLException {
        int NumeroPartosActualizar = 0;
        RegistroPartos EnvioDeDatos = new RegistroPartos();
        String Insertar = "INSERT INTO registrodepartos(NombreCria,idCria,Raza,FechadePartos,idMadre)VALUES(?,?,?,?,?)";//Envio de datos a la tabla registro de partos
        String TraerDatoNumeroDeParto = "SELECT * FROM animalesbovinos WHERE Identificacion=?";//Leer de la base de datos es numero de partos que tien en el momento una animalbovino
        String ActualizarNumeroPartos = "UPDATE animalesbovinos SET NumeroDePartos=? WHERE Identificacion=?";//Se realiza una actualizacion del apartado Numero de partos con una condicion Indentificacion
        try {
            PreparedStatement C = Conexion.prepareStatement(Insertar);
            C.setString(1, EnvioDeDatos.NombreCria);
            C.setString(2, EnvioDeDatos.IdCria);
            C.setString(3, EnvioDeDatos.Raza);
            C.setDate(4, EnvioDeDatos.FechaSQL);
            C.setString(5, EnvioDeDatos.IdMadre);
            C.executeUpdate();
            System.out.println("RegistroExitoso");
        } catch (Exception e) {
            System.out.println("Error en el envio de datos a la tabla registro de partos" + e);
        }
        try {
            PreparedStatement E = Conexion.prepareStatement(TraerDatoNumeroDeParto);
            E.setString(1, EnvioDeDatos.IdMadre);
            ResultSet A = E.executeQuery();
            if (A.next()) {
                NumeroPartosActualizar = A.getInt("NumeroDePartos");
            } else {
                System.out.println("No fueron traidos datos");
            }
        } catch (Exception e) {
            System.out.println("Error en consulta de el numero de partos de animales bovinos error" + e);
        }
        int NumeroDePartosActualizado = NumeroPartosActualizar + 1;
        try {
            PreparedStatement D = Conexion.prepareStatement(ActualizarNumeroPartos);
            D.setInt(1, NumeroDePartosActualizado);
            D.setString(2, EnvioDeDatos.IdMadre);
            System.out.println("el numero de partos traido de la base de datos es " + NumeroPartosActualizar + " y el numero que se supone que se envio es: " + NumeroDePartosActualizado);
            int O = D.executeUpdate();
            System.out.println("No se que es esto pero quiero ver que retorna" + O);
        } catch (Exception e) {
            System.out.println("Error con la actualizacion de datos en la tabla animales bovinos error " + e);
        }
    }

    public void ConsultarHojasDeVida() throws SQLException {
        ConsultasHojasDeVida Consultar = new ConsultasHojasDeVida();
        Statement Leer = Conexion.createStatement();
        ResultSet Consulta = Leer.executeQuery("SELECT * FROM animalesbovinos");
        try {
            String[] Datos = new String[9];
            while (Consulta.next()) {
                Datos[0] = Consulta.getString(1);
                Datos[1] = Consulta.getString(2);
                Datos[2] = Consulta.getString(3);
                Datos[3] = Consulta.getString(4);
                Datos[4] = Consulta.getString(5);
                Datos[5] = Consulta.getString(6);
                Datos[6] = Consulta.getString(7);
                Datos[7] = Consulta.getString(8);
                Datos[8] = Consulta.getString(9);
                Consultar.TablaAnimalesBovinos.addRow(Datos);
            }
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
    }

    public void ConsultarRegistrosPartos() throws SQLException {
        ConsultasPartos Consultar = new ConsultasPartos();
        Statement Leer=Conexion.createStatement();
        ResultSet Consulta=Leer.executeQuery("SELECT * FROM registrodepartos");
        try {
            String[] Datos = new String[5];
            while (Consulta.next()) {                
                Datos[0]=Consulta.getString(2);
                Datos[1]=Consulta.getString(3);
                Datos[2]=Consulta.getString(4);
                Datos[3]=Consulta.getString(5);
                Datos[4]=Consulta.getString(6);
                Consultar.TablaConsultaP.addRow(Datos);
            }      
        } catch (SQLException e) {
            System.out.println("  Error "+ e);
        }
    }
    public void ConsultarLeche() throws SQLException{
        ConsultasRegistroDeLeche Consultar = new ConsultasRegistroDeLeche();
        Statement Leer =Conexion.createStatement();
        ResultSet Consulta=Leer.executeQuery("SELECT * FROM registrodeleche");
        try {
            String Datos[]=new String [4];
            while (Consulta.next()) {                
                Datos[0]=Consulta.getString(2);
                Datos[1]=Consulta.getString(3);
                Datos[2]=Consulta.getString(4);
                Datos[3]=Consulta.getString(5);
                Consultar.TablaConsultaP.addRow(Datos);
            }
        } catch (SQLException e) {
            System.out.println("Error "+e);
        }
        
    }
}
