/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionFichaMedica;

import conexiondb.conexiondb;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebas
 */
public class registrarFicha_Conexion {
    
        public static int getMaxIdFicha_Medico(Connection c) {
        try {
            int id_ = 0;
            CallableStatement cs = null;
            cs = c.prepareCall("{CALL getMaxId_Ficha(?)}");
            id_ = cs.getInt("id_ficha_medica");
            cs.executeQuery();
            cs.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
        }
        
        public static Date callProcedureGetFechaServidor() throws SQLException{
        Connection dbConnection = null;
        CallableStatement callableStatement = null;
        String fechaActual = "{call fechaActual(?)}";
        Date fa = new Date(Integer.BYTES);
        try {
                dbConnection = conexiondb.getDBConnection();
                callableStatement = dbConnection.prepareCall(fechaActual);
                callableStatement.registerOutParameter(1, java.sql.Types.DATE);
                //MariaDB
                callableStatement.executeUpdate();// execute obtenerCitaMaxima store procedure
                //MySQL
                //callableStatement.executeQuery();// execute obtenerCitaMaxima store procedure
                fa = callableStatement.getDate(1);
                //System.out.println("Fecha actual del servidor: " + fa);
        } catch (SQLException e) {
                System.out.println(e.getMessage());
        } finally {
                if (callableStatement != null)
                        callableStatement.close();
                if (dbConnection != null)
                        dbConnection.close();
        }
        return fa;
    }
        
public static void main(String []args)
{
System.out.println(registrarFicha_Conexion.getMaxIdFicha_Medico(conexiondb.getDBConnection()));
            try {
                Date d = registrarFicha_Conexion.callProcedureGetFechaServidor();
            System.out.println(d);
            } catch (SQLException ex) {
                Logger.getLogger(registrarFicha_Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
}
}

