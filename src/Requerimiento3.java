import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;




public class Requerimiento3 extends JFrame {

    public Requerimiento3() throws SQLException{
        initUI();
            }
            public void initUI() throws SQLException{
                setLayout(new BorderLayout());
                String[] nombres = {"Proveedor", "Pagado", "Constructora"};
                JTable tabla1 = new JTable(mostrar3(), nombres);
                JScrollPane Panel = new JScrollPane(tabla1);
                add(Panel, BorderLayout.CENTER);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(400, 500);
                setLocationRelativeTo(null);
                setVisible(true);
        
    }
       

    
    public String[][] mostrar3() throws SQLException{
        ArrayList<Requerimiento_3> lista = new ArrayList<Requerimiento_3>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento3();
        String matriz[][]= new String [lista.size()][3];
        for (int i = 0; i< lista.size(); i++){
            matriz[i][0] = lista.get(i).getProveedor();
            matriz[i][1] = lista.get(i).getPagado();
            matriz[i][2] = lista.get(i).getConstructora();
            
            
        }
        return matriz;
    }
}