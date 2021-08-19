import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    
    //private static final String DATABASE_LOCATION = "D:\\ProyectosConstruccion.db";
    //"ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:D:\\ProyectosConstruccion.db";

        return DriverManager.getConnection(url);
    }
}

