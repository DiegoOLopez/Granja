
import java.sql.Date;

public abstract class personaMoral implements domicilio{



 //Definicion de variables
    String nombreEmpresa,RFC,giro;
    Date fechaRegistro;
//Metodos Abstractos
    public abstract String getNombreEmpresa();

    public abstract void setNombreEmpresa(String nombreEmpresa);

    public abstract String getRFC();
    
    public abstract void setRFC(String RFC);
    
    public abstract String getGiro();

    public abstract void setGiro(String giro);
    
    public abstract Date getFechaRegistro();

    public abstract void setFechaRegistro(Date fechaRegistro);
    
    
}
