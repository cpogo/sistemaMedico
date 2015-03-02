/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionProducto;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;

/**
 *
 * @author usuario
 */
public class RegistroProductoConexion {
    public static int getMaxId_producto(Connection c) {
        try {
            int valor_a_devolver;
            CallableStatement cs = null;
            cs = c.prepareCall("{CALL GetMaxIdProducto(?)}");
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

    public static boolean registrarProducto(Connection c,String nombre,String marca,String descripcion,int codPres,String posologia,int codAdmin,Date fechaCad,float costo,int cantidad) {
        try {
            CallableStatement cs = null;
            
            cs = c.prepareCall("{CALL sp_producto_medico_insert(?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, nombre);
            cs.setString(2, marca);
            cs.setString(3, descripcion);
            cs.setInt(4, codPres);
            cs.setString(5, posologia);
            cs.setInt(6, codAdmin);
            cs.setDate(7, fechaCad);
            cs.setFloat(8, costo);
            cs.setInt(9,cantidad);
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
