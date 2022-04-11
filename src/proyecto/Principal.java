package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AGOSTINA
 */
public class Principal {

     public static void main(String[] args) {
        
        VistaLogin.mostrar();        
        conexion conexion = new conexion();
        conexion.getConexion();
     }
}
        
        
        
        
     
//Conexion base de datos
        
        //Conexion base de datos
       /* try{

           //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/sventas?serverTimezone=UTC","root","1234");
            System.out.println("Conectado");
        }   catch(Exception e){
                System.out.println(e);
                System.out.println("no se conecto");
        }
            
        //--------------------------
     }*/
//}

        
        
    
    

