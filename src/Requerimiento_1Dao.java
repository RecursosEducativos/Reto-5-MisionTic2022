import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_1Dao {   

    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_1> requerimiento1()  throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();

        try{

            String consulta = "SELECT ID_Proyecto,Ciudad,Banco_Vinculado,Constructora,clasificacion  "
                              +"from Proyecto where (Fecha_Inicio > '2020%' AND Clasificacion = 'Condominio');";
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resulset = statement.executeQuery();
            while(resulset.next()){

                Requerimiento_1 requerimiento_1 = new Requerimiento_1();
                requerimiento_1.setID_Proyecto(resulset.getInt("ID_Proyecto"));
                requerimiento_1.setCiudad(resulset.getString("Ciudad"));
                requerimiento_1.setBanco_Vinculado(resulset.getString("Banco_Vinculado"));
                requerimiento_1.setConstructora(resulset.getString("Constructora"));
                requerimiento_1.setClasificacion(resulset.getString("Clasificacion"));
                respuesta.add(requerimiento_1);

            }
            resulset.close();
            statement.close();
        }
        catch(SQLException e){
            System.err.println("Error consultado: "+ e);
        }
        finally{
            if(conexion != null){
                conexion.close();
            }
        }
        return respuesta;
    }

}
