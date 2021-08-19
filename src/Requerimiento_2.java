public class Requerimiento_2 {

    //aquí se coloca los campos con su respectiva asignacion 
    
    private String Nombre;
    private String Primer_Apellido;
    private String Ciudad_Residencia;
    private String Cargo;
    private Integer Salario;

  //constructo
  public Requerimiento_2(){

      }  

    public Requerimiento_2(String Nombre, String Primer_Apellido){

        this.Nombre = Nombre;
        this.Primer_Apellido = Primer_Apellido;
        //setNombre(Nombre);
       // setPrimer_Apellido(Primer_Apellido);
    }
    public void setNombre(String nombre){
        Nombre = nombre;
    
    }

    public String getNombre(){

        return Nombre;
    }

    public void setPrimer_Apellido(String primer_Apellido){
        Primer_Apellido = primer_Apellido;
    
    }
    public String getPrimer_Apellido(){

        return Primer_Apellido;
    }

    public void setCiudad_Residencia(String ciudad_residencia){
        Ciudad_Residencia = ciudad_residencia;
    
    }

    public String getCiudad_Residencia(){

        return Ciudad_Residencia;
    }

    public void setCargo(String cargo){
        Cargo = cargo;
    
    }

    public String getCargo(){

        return Cargo;
    }
    public void setSalario(Integer salario){
        Salario = salario;
    
    }

    public Integer getSalario(){

        return Salario;
    }
}

    

