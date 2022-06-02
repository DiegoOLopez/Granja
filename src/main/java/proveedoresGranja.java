
import java.sql.Date;


public class proveedoresGranja extends personaMoral{
    //Definicion de variables 
    String productoComprado,pesoProducto;
    float precioProducto;

    //Variables de domicilio interface
    String pais, estado, municipio, localidad, calle;

    //Metodos getter and setter// 
    public String getProductoComprado() {
        return productoComprado;
    }

    public void setProductoComprado(String productoComprado) {
        this.productoComprado = productoComprado;
    }

    public String getPesoProducto() {
        return pesoProducto;
    }

    public void setPesoProducto(String pesoProducto) {
        this.pesoProducto = pesoProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    //Implementacion de los metodos abstractos setters y getters de la clase animales//
    
    @Override
    public String getNombreEmpresa() {
         return nombreEmpresa;
    }

    @Override
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa= nombreEmpresa;
    }

    @Override
    public String getRFC() {
        return RFC;
    }

    @Override
    public void setRFC(String RFC) {
        this.RFC=RFC;
    }

    @Override
    public String getGiro() {
        return giro;
    }

    @Override
    public void setGiro(String giro) {
        this.giro=giro;
    }

    @Override
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    @Override
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro=fechaRegistro;
    }

    /**
     * Metodos de interface domicilio
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
