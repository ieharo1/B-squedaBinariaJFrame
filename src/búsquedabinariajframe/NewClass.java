/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package búsquedabinariajframe;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Scrappy Doo Coco
 */
public class NewClass {

    
     public void hola(){
                    
         try {
             System.out.println("entro a la BD");
             Connection conexion;
             Statement prep;
             String respuesta = "insert into prueba values('A','2')";
             DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
             conexion = DriverManager.getConnection("jdbc:derby://localhost:1527/BusquedaBinaria", "", "");
             prep = conexion.createStatement();
             prep.executeUpdate(respuesta);
         } catch (SQLException ex) {
             Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
         }
    
     }          
    
}
