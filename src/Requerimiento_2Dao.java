import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_2Dao {
    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_2> requerimiento2()  throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion2 = JDBCUtilities.getConnection();

        try{

            String consulta = "SELECT NOMBRE,PRIMER_APELLIDO,Ciudad_Residencia ,Cargo,SALARIO  "+
            " FROM Lider WHERE  salario < 510000 and (CARGO =  'Asesor' OR CARGO = 'Coordinador');";
                            
            
            PreparedStatement statement = conexion2.prepareStatement(consulta);
            ResultSet resulset = statement.executeQuery();
            while(resulset.next()){

                Requerimiento_2 requerimiento_2 = new Requerimiento_2();
                requerimiento_2.setNombre(resulset.getString("Nombre"));
                requerimiento_2.setPrimer_Apellido(resulset.getString("Primer_Apellido"));
                requerimiento_2.setCiudad_Residencia(resulset.getString("Ciudad_Residencia"));
                requerimiento_2.setCargo(resulset.getString("Cargo"));
                requerimiento_2.setSalario(resulset.getInt("Salario"));
                respuesta.add(requerimiento_2);

               
            

            }
            resulset.close();
            statement.close();
        }
        catch(SQLException e){
            System.err.println("Error consultado: "+ e);
        }
        finally{
            if(conexion2 != null){
                conexion2.close();
            }
        }
        return respuesta;
    }

    }



