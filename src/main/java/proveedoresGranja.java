
import java.sql.Date;


public class proveedoresGranja extends personaMoral{
    //Definicion de variables 
    String productoComprado,pesoProducto;
    float precioProducto;

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
    
    
    
    
    
    
}
