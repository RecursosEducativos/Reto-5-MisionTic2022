
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;



public class Requerimiento1 extends JFrame {

    public Requerimiento1() throws SQLException{
        initUI();
            }
            public void initUI() throws SQLException{
                setLayout(new BorderLayout());
                String[] nombres = {"ID_Proyecto", "Ciudad", "Banco_Vinculado", "Constructora", "Clasificación"};
                JTable tabla1 = new JTable(mostrar(), nombres);
                JScrollPane Panel = new JScrollPane(tabla1);
                add(Panel, BorderLayout.CENTER);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(400, 500);
                setLocationRelativeTo(null);
                setVisible(true);
        
    }
    

    
    public String[][] mostrar() throws SQLException{
        ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento1();
        String matriz[][]= new String [lista.size()][5];
        for (int i = 0; i< lista.size(); i++){
            matriz[i][0] = String.valueOf(lista.get(i).getID_Proyecto());
            matriz[i][1] = lista.get(i).getCiudad();
            matriz[i][2] = lista.get(i).getBanco_Vinculado();
            matriz[i][3] = lista.get(i).getConstructora();
            matriz[i][4] = lista.get(i).getClasificacion();
        }
        return matriz;
    }
}



    

