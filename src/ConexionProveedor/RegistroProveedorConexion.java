/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionProveedor;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;

/**
 *
 * @author usuario
 */
public class RegistroProveedorConexion {
    public static int getMaxId_Proveedor(Connection c) {
        try {
            int valor_a_devolver;
            CallableStatement cs = null;
            cs = c.prepareCall("{CALL GetMaxIdProveedor(?)}");
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

    public static boolean registrarProveedor(Connection c,String nombre,String apellido,String tel) {
        try {
            CallableStatement cs = null;
            
            cs = c.prepareCall("{CALL InsertarProveedorNuevo(?,?,?)}");
            cs.setString(1, nombre);
            cs.setString(2, apellido);
            cs.setString(3, tel);
            
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
