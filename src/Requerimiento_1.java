public class Requerimiento_1 {
    
    //aquí se coloca los campos con su respectiva asignacion 
    private Integer ID_Proyecto;
    private String Ciudad;
    private String Banco_Vinculado;
    private String Constructora;
    private String Clasificacion;

  //constructo
  public Requerimiento_1(){

      }  

    public Requerimiento_1(Integer ID_proyecto, String ciudad){

        this.ID_Proyecto = ID_proyecto;
        this.Ciudad = ciudad;
        //setID_Proyecto(ID_proyecto);
        //setCiudad(ciudad);
    }
    public void setID_Proyecto(Integer ID_proyecto){
        ID_Proyecto = ID_proyecto;
    
    }

    public Integer getID_Proyecto(){

        return ID_Proyecto;
    }

    public void setCiudad(String ciudad){
        Ciudad = ciudad;
    
    }
    public String getCiudad(){

        return Ciudad;
    }

    public void setBanco_Vinculado(String banco_vinculado){
        Banco_Vinculado = banco_vinculado;
    
    }
    public String getBanco_Vinculado(){

        return Banco_Vinculado;
    }
    public void setConstructora(String constructora){
        Constructora = constructora;
    
    }
    public String getConstructora(){

        return Constructora;
    }

    public void setClasificacion(String clasificacion){
        Clasificacion = clasificacion;
    
    }
    public String getClasificacion(){

        return Clasificacion;
    }

    
    

}
