


package ConectaBD;

import java.sql.*;

import java.sql.Connection;

public class Conexion {
    
    public Connection dameConexion(){
        
//Crear Objeto de Tipo Connection
           Connection miconexion=null;

        try{
 //Se carga el driver de conexion mediante el driver manager
 //especificando nuestro servidor, nuestro usuario y contrseña del gestor
 
 
     Class.forName("com.mysql.cj.jdbc.Driver");
    
     //miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDateTimeCode=false&serverTimezone","root","aziel");
            
      miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado","root","aziel");
                
       
        }catch(Exception e){
            
        }
        
        return miconexion;
            
    }
    
}
    

