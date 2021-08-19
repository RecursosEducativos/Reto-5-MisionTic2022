import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_3Dao {
    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_3> requerimiento3()  throws SQLException {
        // Su código

        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion3 = JDBCUtilities.getConnection();

        try{

            String consulta = "SELECT Proveedor, Pagado,Constructora  " +
            "from Compra C  INNER JOIN  Proyecto P ON C.ID_Proyecto = P.ID_Proyecto WHERE Pagado ='No' AND Proveedor = 'JUMBO';";
                            
            
            PreparedStatement statement = conexion3.prepareStatement(consulta);
            ResultSet resulset = statement.executeQuery();
            while(resulset.next()){

                Requerimiento_3 requerimiento_3 = new Requerimiento_3();
                requerimiento_3.setProveedor(resulset.getString("Proveedor"));
                requerimiento_3.setPagado(resulset.getString("Pagado"));
                requerimiento_3.setConstructora(resulset.getString("Constructora"));
                
                respuesta.add(requerimiento_3);

               
               
            

            }
            resulset.close();
            statement.close();
        }
        catch(SQLException e){
            System.err.println("Error consultado: "+ e);
        }
        finally{
            if(conexion3 != null){
                conexion3.close();
            }
        }
        return respuesta;
    
    }
}