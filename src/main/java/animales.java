import java.sql.Date;

public abstract class animales {
    String especie, sexo;
    float peso;
    Date fechaNacimiento;

    public abstract String getEspecie();

    public abstract void setEspecie(String especie);

    public abstract String getSexo();

    public abstract void setSexo(String sexo);

    public abstract float getPeso();

    public abstract void setPeso(float peso);

    public abstract Date getFechaNacimiento();

    public abstract void setFechaNacimiento(Date fechaNacimiento);

}
