/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionPaciente;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebas
 */
public class DesbloquearPaciente_Conexion {
    public static ArrayList<Object>getPaciente(Connection c, int id)
     {
     ArrayList<Object> paciente = new ArrayList<>();
     CallableStatement cs = null;
     try{
     cs= c.prepareCall("{CALL getPaciente_from_id(?)}");
             cs.setInt(1, id);
             ResultSet rs = cs.executeQuery();
             while(rs.next())
             {
                 String tipo_sangre_ = "";
                 String id_sexo_ = "";
                 String cedula = rs.getString("cedula");
                 String direccion = rs.getString("direccion");
                 Date fecha_nacimiento = rs.getDate("fecha_nacimiento");
                 int tipo_sangre = rs.getInt("id_tipo_sangre");
                 int id_sexo = rs.getInt("id_sexo");
                 String nombre = rs.getString("nombre");
                 String telefono= rs.getString("telefono");
                 paciente.add(cedula);
                 paciente.add(direccion);
                 paciente.add(fecha_nacimiento);
                 if(tipo_sangre == 1)
                     tipo_sangre_ ="A+";
                 if(tipo_sangre == 2)
                     tipo_sangre_ ="A-";
                 if(tipo_sangre == 3)
                     tipo_sangre_ ="O+";
                 if(tipo_sangre == 4)
                     tipo_sangre_ ="O-";
                 if(tipo_sangre == 5)
                     tipo_sangre_ ="B+";
                 if(tipo_sangre == 6)
                     tipo_sangre_ ="B-";
                 if(tipo_sangre == 7)
                     tipo_sangre_ ="AB+";
                 if(tipo_sangre == 8)
                     tipo_sangre_ ="AB-";
                 paciente.add(tipo_sangre_);
                 if(id_sexo == 1)
                     id_sexo_= "femenino";
                 if(id_sexo == 2)
                     id_sexo_= "masculino";
                 paciente.add(id_sexo_);
                 paciente.add(nombre);
                 paciente.add(telefono);
             }
             return paciente;
         } catch (SQLException ex) {
             Logger.getLogger(buscarPaciente_Conexion.class.getName()).log(Level.SEVERE, null, ex);
         }
     return null;
     }
    public static void ModificarCitasCanceladas(Connection c,int id_) {
        try {
            CallableStatement cs = null;
            cs = c.prepareCall("{CALL eliminarCitasCanceladas(?)}");
            cs.setInt(1, id_);
            cs.executeQuery();
            cs.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
