/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class ConsultarPaciente {

    public static String getId_Paciente(Connection c,int i) {
        try {
            String valorid;
            CallableStatement cs = null;
            cs = c.prepareCall("{CALL Consulta(?,?)}");
            cs.registerOutParameter(1, java.sql.Types.VARCHAR);
            cs.setInt(2, i);
            cs.executeQuery();
            valorid = cs.getString(1);

            cs.close();
            c.close();
            return valorid;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    

}

