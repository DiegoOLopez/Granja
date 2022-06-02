import java.sql.Date;

public class personal extends personaFisica{
    //Atributos
    String Cargo, profesion;
    float sueldoPorHora, horasTrabajo, sueldoMensual;
    int diasDeTrabajo;
    
    public String getCargo() {
        return Cargo;}

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public float getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(float sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public float getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(float horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public float getSueldoMensual() {
        sueldoMensual = (horasTrabajo* sueldoPorHora*diasDeTrabajo)*4;
        return sueldoMensual;
    }

    public void setSueldoMensual(float sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public int getDiasDeTrabajo() {
        return diasDeTrabajo;
    }

    //creacion de metodos
    public void setDiasDeTrabajo(int diasDeTrabajo) {
        this.diasDeTrabajo = diasDeTrabajo;
    }

    //Metodos heredados de la clase personaFisica
    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre=Nombre;}

    @Override
    public String getApellidoP() {
        return  ApellidoP;}

    @Override
    public void setApellidoP(String ApellidoP) {
        this.ApellidoP=ApellidoP;}

    @Override
    public String getApellidoM() {
        return ApellidoM;}

    @Override
    public void setApellidoM(String ApellidoM) {
        this.ApellidoM=ApellidoM;}

    @Override
    public String getSexo() {
        return Sexo;}

    @Override
    public void setSexo(String Sexo) {
        this.Sexo=Sexo;}

    @Override
    public Date getFechaNacimiento() {
        return fechaNacimiento;}

    @Override
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento=fechaNacimiento;}

}