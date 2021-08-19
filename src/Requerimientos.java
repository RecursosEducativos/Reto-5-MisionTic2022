import java.sql.SQLException;
import java.util.ArrayList;



public class Requerimientos {

   
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
    
    

