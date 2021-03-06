package maxpizza.modelo;
// Generated 01-may-2020 17:02:44 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private String usuario;
     private Direccion direccion;
     private String pass;
     private String tipo;
     private Set pedidos = new HashSet(0);

    public Persona() {
    }

	
    public Persona(String usuario, String pass, String tipo) {
        this.usuario = usuario;
        this.pass = pass;
        this.tipo = tipo;
    }
    public Persona(String usuario, Direccion direccion, String pass, String tipo, Set pedidos) {
       this.usuario = usuario;
       this.direccion = direccion;
       this.pass = pass;
       this.tipo = tipo;
       this.pedidos = pedidos;
    }
   
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }




}


