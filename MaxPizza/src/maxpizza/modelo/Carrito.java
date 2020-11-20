package maxpizza.modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Carrito {

    private Producto producto;
    private double precio;
    private int unidades;
    private double precioTotal;

    private static ArrayList<Carrito> lineasCarrito = new ArrayList();

    private static int unidadesTotales;

    public Carrito() {
    }

    public Carrito(Producto producto, int unidades) {
        this.producto = producto;
        this.precio = producto.getPrecio().doubleValue();
        this.unidades = unidades;
        this.precioTotal = precio * unidades;
    }

    public static ArrayList<Carrito> getLineas() {
        return lineasCarrito;
    }

    public static void setLineas(ArrayList<Carrito> lineas) {
        Carrito.lineasCarrito = lineas;
    }

    public static void addLineas(Carrito c) {
        if (lineasCarrito.contains(c)) {//Si existe solo incrementamos las unidades
            int posicion = lineasCarrito.indexOf(c);//Obtenemos la posición en el ArrayList

            //Incrementamos +1 las unidades del objeto
            lineasCarrito.get(posicion).setUnidades(lineasCarrito.get(posicion).getUnidades() + 1);

            //Calculamos el nuevo precioTotal
            lineasCarrito.get(posicion).calcularPrecioTotal(lineasCarrito.get(posicion).getPrecio(),
                    lineasCarrito.get(posicion).getUnidades());
        } else {
            lineasCarrito.add(c);
        }
        unidadesTotales++;
    }

    public static int getUnidadesTotales() {
        return unidadesTotales;
    }

    public static void setUnidadesTotales(int unidadesTotales) {
        Carrito.unidadesTotales = unidadesTotales;
    }

    public static void calcularUnidadesTotales() {
        int cantidadTotal = 0;
        for (Carrito carrito : getLineas()) {
            cantidadTotal += carrito.getUnidades();
        }

        setUnidadesTotales(cantidadTotal);
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void calcularPrecioTotal(double precioUnitario, int unidades) {
        this.precioTotal = precioUnitario * unidades;
    }

    //Sobreecribimos dichos metodos para que no inserte productos con id repetidos
    @Override
    public boolean equals(Object obj) {
        Carrito c = (Carrito) obj;

        int idProducto = c.getProducto().getIdProducto();
        String tam = c.getProducto().getTam();

        if (idProducto == this.producto.getIdProducto()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.producto);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 19 * hash + this.unidades;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.precioTotal) ^ (Double.doubleToLongBits(this.precioTotal) >>> 32));
        return hash;
    }

}
