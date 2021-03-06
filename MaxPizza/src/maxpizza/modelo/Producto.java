package maxpizza.modelo;
// Generated 01-may-2020 17:02:44 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer idProducto;
     private String tipo;
     private String nombre;
     private String descripcion;
     private String tam;
     private BigDecimal precio;
     private Set detallepedidos = new HashSet(0);

    public Producto() {
    }

	
    public Producto(String tipo, String nombre, String descripcion, BigDecimal precio) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public Producto(String tipo, String nombre, String descripcion, String tam, BigDecimal precio, Set detallepedidos) {
       this.tipo = tipo;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.tam = tam;
       this.precio = precio;
       this.detallepedidos = detallepedidos;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getTam() {
        return this.tam;
    }
    
    public void setTam(String tam) {
        this.tam = tam;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public Set getDetallepedidos() {
        return this.detallepedidos;
    }
    
    public void setDetallepedidos(Set detallepedidos) {
        this.detallepedidos = detallepedidos;
    }




}


