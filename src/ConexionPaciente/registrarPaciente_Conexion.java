/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionPaciente;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class registrarPaciente_Conexion {

    public static int getMaxId_Paciente(Connection c) {
        try {
            int valor_a_devolver;
            CallableStatement cs = null;
            cs = c.prepareCall("{CALL GetMaxId(?)}");
            cs.registerOutParameter(1, java.sql.Types.INTEGER);
            cs.executeQuery();
            valor_a_devolver = cs.getInt(1);

            cs.close();
            c.close();
            return valor_a_devolver;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static boolean registrarPaciente(Connection c,String cedula,String nombre,String apellido,Date fecha_nacimiento,String direccion, String telefono,int id_sexo, int id_tipo_sangre) {
        try {
            CallableStatement cs = null;
            cs = c.prepareCall("{CALL InsertarPacienteNuevo(?,?,?,?,?,?,?,?)}");
            cs.setString(1, cedula);
            cs.setString(2, nombre);
            cs.setString(3, apellido);
            cs.setDate(4, fecha_nacimiento);
            cs.setString(5, direccion);
            cs.setString(6, telefono);
            cs.setInt(7, id_sexo);
            cs.setInt(8, id_tipo_sangre);
            
            cs.executeQuery();
            cs.close();
            c.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

 

}
