import java.sql.Date;

public abstract class personaFisica {
    
    //Atributos
    String Nombre, ApellidoP, ApellidoM, Sexo;
    Date fechaNacimiento;

    //Definicion de metodos
    public abstract String getNombre();

    public abstract void setNombre(String Nombre);

    public abstract String getApellidoP();

    public abstract void setApellidoP(String Apellidop);

    public abstract String getApellidoM();
    
    public abstract void setApellidoM(String ApellidoM);

    public abstract String getSexo();

    public abstract void setSexo(String Sexo);

    public abstract Date getFechaNacimiento();

    public abstract void setFechaNacimiento(Date fechaNacimiento);
    
    
}
