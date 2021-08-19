
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.awt.event.*;



public class Formulario extends JFrame {

    JFrame frame;
    JTable tabla1,tabla2,tabla3 = new JTable();
    JButton send1,send2,send3;
    ImagenFondo ambiente = new ImagenFondo();
    Requerimientos consultas =  new Requerimientos();

    
    

public Formulario () throws SQLException{


initFormulario();
actionPerformed();
setContentPane(ambiente);


}

private void actionPerformed() {
}

private void initFormulario () throws SQLException{

frame = new JFrame("RETO 5");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(600, 700);
frame.setResizable(false);



// Creando MenuBar y agregando componentes
JMenuBar mb = new JMenuBar();
mb.setAlignmentY(Component.LEFT_ALIGNMENT);
JMenu m1 = new JMenu("ARCHIVO");
JMenu m2 = new JMenu("CONSULTAS");
JMenu m3 = new JMenu("ACERCA");

//ADICION DE JMenu A JMenuBar
mb.add(m1);
mb.add(m2);
mb.add(m3);

//creando los JMenuItem
JMenuItem MeI1 = new JMenuItem("Salir");
JMenuItem MeI2 = new JMenuItem("Consulta 1");
JMenuItem MeI3 = new JMenuItem("Consulta 2");
JMenuItem MeI4 = new JMenuItem("Consulta 3");
JMenuItem MeI5 = new JMenuItem("Reto Realizado por: Raúl Soto Villamizar Grupo 64");

//ADICION DE JMenuItem A JMenu
m1.add(MeI1);
m2.add(MeI2);
m2.add(MeI3);
m2.add(MeI4);
m3.add(MeI5);


//CONSTRUIMOS EL OBJETO JPANEL PARA ALBERGAR LA BOTONERA
JPanel Botonera = new JPanel();
//LE DECIMOS QUE ESE PANEL VA A TENER UN lAYOUT FLOWLAYOUT Y SUS COMPONENTES ESTARAN CENTRARDOS

Botonera.setLayout(new FlowLayout(FlowLayout.CENTER));

// CREO UNOS LABEL PARA DAR ESPACIOS ENTRE LOS BOTONES
JLabel espacio1 = new JLabel("          ");

JLabel espacio2 = new JLabel("          ");

//CONSTRUIMOS BOTONES
JButton send1 = new JButton("Consulta 1");
JButton send2 = new JButton("Consulta 2");
JButton send3 = new JButton("Consulta 3");


//ADICIONAMOS BOTONES AL PANEL
Botonera.add(send1);
Botonera.add(espacio1);
Botonera.add(send2);
Botonera.add(espacio2);
Botonera.add(send3);

// CREAMOS LAS TABLAS Y LAS CABECERAS PARA SER USADAS DESPÚES

//PRIMERA CONSULTA
String[] nombres1 = {"ID_Proyecto", "Ciudad", "Banco_Vinculado", "Constructora", "Clasificación"};
tabla1 = new JTable(consultas.mostrar(), nombres1);

 // SEGUNDA CONSULTA
String[] nombres2 = {"Nombre", "Primer Apellido", "ciudad Residenia", "Cargo", "Salario"};
tabla2 = new JTable(consultas.mostrar2(), nombres2);

//TERCERA CONSULTA
String[] nombres3 = {"Proveedor", "Pagado", "Constructora"};
tabla3 = new JTable(consultas.mostrar3(), nombres3);


// CREAMOS EL JSCROLLPANE QUE ES EL QUE ME ALBERGA LAS TABLAS
JScrollPane Panel = new JScrollPane();
Panel.setAlignmentY(Component.CENTER_ALIGNMENT);

JPanel fondo = new ImagenFondo();
fondo.add(Panel);
       
        
//AGREGAMOS LOS PANELES AL PANEL BORDELAYOUT QUE SERÁ MI PRINCIPAL

frame. getContentPane().add(BorderLayout.SOUTH,Botonera);
frame. getContentPane().add(fondo, BorderLayout.CENTER);
frame. getContentPane().add(BorderLayout.NORTH, mb);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame. setVisible(true);
frame.setLocationRelativeTo(null);

// CREAMOS LOS EVENTOS ACTIONLISTENER Y LOS ADICIONAMOS AL BOTÓN Y A LOS MENUITEM

 ActionListener consulta1 = new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae){

        Panel.add(tabla1);
        Panel.setViewportView(tabla1);
      
        
        
     }
 };

send1.addActionListener(consulta1);
MeI2.addActionListener(consulta1);


ActionListener consulta2 = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){

       Panel.add(tabla2);
       Panel.setViewportView(tabla2);
       
              
    }
};

send2.addActionListener(consulta2);
MeI3.addActionListener(consulta2);


ActionListener consulta3 = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){

       Panel.add(tabla3);
       Panel.setViewportView(tabla3);
      
       
    }
};

send3.addActionListener(consulta3);
MeI4.addActionListener(consulta3);

// EVENTO ACTIONLISTENER PARA SALIR 
ActionListener salir = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae){

        //CON ESTA LINEA DE CÓDIGO CERRAMOS LA APLICACIÓN
      salir();
       
    }
};


MeI1.addActionListener(salir);
}
 
class ImagenFondo extends JPanel{

    private Image imagen;

   
        @Override
        
        public void paint(Graphics g){

        imagen = new ImageIcon(getClass().getResource("/RecursoEducativo.jpeg")).getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    
    
    }

}
	private void salir(){
        int valor = JOptionPane.showConfirmDialog(this,"Estás seguro de salir de Reto 5?","ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        		if (valor == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Preparado para el próximo Reto", "SALIR", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        
	}
    }
		








