/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoMedico;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import productoMedico.buscarProductoForm;

/**
 *
 * @author usuario
 */
public class ConsultarProducto {
    public static ArrayList<Object> getProducto(Connection c,String nameproduct){
        try {
            String valorid;
            LinkedList<String> Resultado=new LinkedList<String>();
            CallableStatement cs = null;
            cs = c.prepareCall("{CALL ConsultaProducto(?,?,?,?,?,?,?,?,?,?)}");
            cs.registerOutParameter(1,java.sql.Types.INTEGER);
            cs.registerOutParameter(2, java.sql.Types.VARCHAR);
            cs.registerOutParameter(3,java.sql.Types.VARCHAR);
            cs.registerOutParameter(4, java.sql.Types.INTEGER);
            cs.registerOutParameter(5,java.sql.Types.VARCHAR);
            cs.registerOutParameter(6, java.sql.Types.INTEGER);
            cs.registerOutParameter(7,java.sql.Types.DATE);
            cs.registerOutParameter(8, java.sql.Types.FLOAT);
            cs.registerOutParameter(9,java.sql.Types.INTEGER);
            
            cs.setString(10, nameproduct);
            
            cs.executeQuery();
            
           
                
            
            int id=cs.getInt(1);
            String marca=cs.getString(2);
            String descrip=cs.getString(3);
            int idp=cs.getInt(4);
            String poso=cs.getString(5);
            int ida=cs.getInt(6);
            Date fecha=cs.getDate(7);
            float costo=cs.getFloat(8);
         
            int cant=cs.getInt(9);
            
           
            
            
            ArrayList<Object> lista=new ArrayList<>();
            lista.add(id);
            lista.add(marca);
            lista.add(descrip);
            lista.add(idp);
            lista.add(poso);
            lista.add(ida);
            lista.add(fecha);
            lista.add(costo);
            lista.add(cant);
            
            

            cs.close();
            c.close();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
           
        }
        return null;
    }

    
}
