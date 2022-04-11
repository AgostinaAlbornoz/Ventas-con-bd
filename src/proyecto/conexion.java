package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {
    public Connection getConexion() {
            try{
            
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sventas?serverTimezone=UTC","root","1234");
            
            Statement s = c.createStatement();//Creando statement
            
            ResultSet res = s.executeQuery("select * from tabla"); //Nos permite traer cada una de las filas
            System.out.println("Conectado");

            while(res.next()){ 
                Object[] fila = new Object[4];
                
                fila[0] = res.getString("Descripcion");  
                fila[1] = res.getString("Cantidad");  
                fila[2] = res.getString("PrecioU");  
                fila[3] = res.getString("SubTotal");  
                //datos.add
            }
        }   catch(Exception e){
                System.out.println(e);
                System.out.println("no se conecto");
        }
            return null;
    }
}
