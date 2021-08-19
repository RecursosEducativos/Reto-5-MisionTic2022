import java.sql.SQLException;
import java.util.ArrayList;

public class ElControladorDeRequerimientos {
    
    private final Requerimiento_1Dao REQUERIMIENTO_1DAO;
    private final Requerimiento_2Dao REQUERIMIENTO_2DAO;
    private final Requerimiento_3Dao REQUERIMIENTO_3DAO;

    public ElControladorDeRequerimientos(){
        this.REQUERIMIENTO_1DAO= new Requerimiento_1Dao();
        this.REQUERIMIENTO_2DAO= new Requerimiento_2Dao();
        this.REQUERIMIENTO_3DAO= new Requerimiento_3Dao();
    }
    
        public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
            // Su código
            
            return this.REQUERIMIENTO_1DAO.requerimiento1();
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            // Su código
           
            return this.REQUERIMIENTO_2DAO.requerimiento2();
        }
      
        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            // Su código}
           
            return this.REQUERIMIENTO_3DAO.requerimiento3();
        } 

}
