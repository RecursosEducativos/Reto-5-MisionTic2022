import java.util.ArrayList;

public class VistaRequerimientos {

    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();

    public static void requerimiento1(){
        
        try {
            // Su código
            ArrayList<Requerimiento_1>lista1 = controlador.consultarRequerimiento1();
            for(Requerimiento_1 reque : lista1) {
                System.out.printf("%d %s %s %s %s %n",
                reque.getID_Proyecto(),
                reque.getCiudad(),
                reque.getBanco_Vinculado(),
                reque.getConstructora(),
                reque.getClasificacion());

            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2(){
        
        try {
            ArrayList<Requerimiento_2>lista2 = controlador.consultarRequerimiento2();
            for(Requerimiento_2 reque : lista2) {
                System.out.printf("%s %s %s %s %d %n",
                reque.getNombre(),
                reque.getPrimer_Apellido(),
                reque.getCiudad_Residencia(),
                reque.getCargo(),
                reque.getSalario());

            
        } 
    }
        catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento3(){
        try {
           
            ArrayList<Requerimiento_3>lista3 = controlador.consultarRequerimiento3();
            for(Requerimiento_3 reque : lista3) {
                System.out.printf("%s %s %s %n",
                
                reque.getProveedor(),
                reque.getPagado(),
                reque.getConstructora());
                
        } 
    }
        catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }
}