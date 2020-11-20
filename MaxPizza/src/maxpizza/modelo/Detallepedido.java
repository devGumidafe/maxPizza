package maxpizza.modelo;
// Generated 01-may-2020 17:02:44 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

public class Detallepedido implements java.io.Serializable {

    private DetallepedidoId id;
    private Pedido pedido;
    private Producto producto;
    private int cantidad;
    private BigDecimal precioUnidad;
    private BigDecimal precioTotal;

    public Detallepedido() {
    }

    public Detallepedido(DetallepedidoId id, Pedido pedido, Producto producto, int cantidad, BigDecimal precioUnidad, BigDecimal precioTotal) {
        this.id = id;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.precioTotal = precioTotal;
    }

    public DetallepedidoId getId() {
        return this.id;
    }

    public void setId(DetallepedidoId id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnidad() {
        return this.precioUnidad;
    }

    public void setPrecioUnidad(BigDecimal precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public BigDecimal getPrecioTotal() {
        return this.precioTotal;
    }

    public void setPrecioTotal(BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }

}
