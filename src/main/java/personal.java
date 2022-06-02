import java.sql.Date;

public class personal extends personaFisica{
    //Atributos
    String Cargo, profesion;
    int sueldoPorHora, horasTrabajo, sueldoMensual;
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

    public int getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(int sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }


    public int getDiasDeTrabajo() {
        return diasDeTrabajo;
    }

    public void setDiasDeTrabajo(int diasDeTrabajo) {
        this.diasDeTrabajo = diasDeTrabajo;
    }

    public int getSueldoMensual() {
        sueldoMensual = (horasTrabajo* sueldoPorHora*diasDeTrabajo)*4;
        return sueldoMensual;
    }

    public void setSueldoMensual(int sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    //creacion de metodos

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


    /**
     *
     *
     */

    @Override
    public String getPais() {
        return pais;
    }

    @Override
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String getEstado() {
        return estado;
    }

    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String getMunicipio() {
        return municipio;
    }

    @Override
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String getLocalidad() {
        return localidad;
    }

    @Override
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String getCalle() {
        return calle;
    }

    @Override
    public void setCalle(String calle) {
        this.calle = calle;
    }
}