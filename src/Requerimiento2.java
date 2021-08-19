import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;




public class Requerimiento2 extends JFrame {

    public Requerimiento2() throws SQLException{
        initUI();
            }
            public void initUI() throws SQLException{
                setLayout(new BorderLayout());
                String[] nombres = {"Nombre", "Primer Apellido", "ciudad Residenia", "Cargo", "Salario"};
                JTable tabla1 = new JTable(mostrar2(), nombres);
                JScrollPane Panel = new JScrollPane(tabla1);
                JPanel centro = new JPanel();
                centro.add(Panel);
                add(centro, BorderLayout.CENTER);
                Panel.setSize(300, 300);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(700, 600);
                setLocationRelativeTo(null);
                setVisible(true);
                JButton r =new JButton("fdfdfdf");
                JButton r2 =new JButton("dsdsdsad");
                getContentPane().add(BorderLayout.SOUTH,r);
                
                getContentPane().add(BorderLayout.NORTH,r2);
        
    }
       

    
    public String[][] mostrar2() throws SQLException{
        ArrayList<Requerimiento_2> lista = new ArrayList<Requerimiento_2>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento2();
        String matriz[][]= new String [lista.size()][5];
        for (int i = 0; i< lista.size(); i++){
            matriz[i][0] = lista.get(i).getNombre();
            matriz[i][1] = lista.get(i).getPrimer_Apellido();
            matriz[i][2] = lista.get(i).getCiudad_Residencia();
            matriz[i][3] = lista.get(i).getCargo();
            matriz[i][4] = String.valueOf(lista.get(i).getSalario());
        }
        return matriz;
    }
}