package maxpizza.controlador;

import hibernate.CrudDetallePedido;
import hibernate.CrudDireccion;
import hibernate.CrudPedido;
import personalizarTabla.TablaModelo;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import maxpizza.modelo.Carrito;
import maxpizza.modelo.Detallepedido;
import maxpizza.modelo.DetallepedidoId;
import maxpizza.modelo.Direccion;
import maxpizza.modelo.Pedido;
import maxpizza.vista.VistaCarrito;
import validacion.Utilidades;
import maxpizza.reportes.clases.ReporteFactura;

public class ControladorCarrito extends ControladorGenerico implements KeyListener {

    VistaCarrito vistaCarrito;
    TablaModelo tablaModelo;
    ReporteFactura reporteFactura;
    
    CrudPedido crudPedido;
    CrudDireccion crudDireccion;
    CrudDetallePedido crudDetallepedido;

    private double totalCompra;

    public ControladorCarrito() {
        iniciarComponentes();
        cargarDatos();
        iniciarEventos();

        vistaCarrito.setVisible(true);
    }

    @Override
    void iniciarComponentes() {
        vistaCarrito = new VistaCarrito();
        crudPedido = new CrudPedido();
        crudDetallepedido = new CrudDetallePedido();
        crudDireccion = new CrudDireccion();
        reporteFactura = new ReporteFactura();
    }

    @Override
    public void cargarDatos() {
        cargarTabla();
        cargarDireccion();
        rellenarResumenCesta();
    }

    @Override
    void iniciarEventos() {
        vistaCarrito.getBtnVaciarCesta().addActionListener(this);
        vistaCarrito.getBtnQuitarArticulo().addActionListener(this);
        vistaCarrito.getBtnSeguirComprando().addActionListener(this);
        vistaCarrito.getBtnPagar().addActionListener(this);
        vistaCarrito.getBtnModificarDireccion().addActionListener(this);

        vistaCarrito.getTablaCesta().addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "vaciarCesta":
                vaciarCesta();
                break;

            case "quitarArticulo":
                quitarProductoCesta();
                break;

            case "seguirComprando":
                ControladorPrincipal ctrlPrincipal = new ControladorPrincipal();
                vistaCarrito.dispose();
                break;

            case "pagar":
                if (ControladorLogin.getCliente().getDireccion() != null) {
                    realizarPedido();

                } else {
                    Utilidades.mensaje("Para realizar el pedido debe añadir una dirección");
                    vistaCarrito.getBtnModificarDireccion().doClick();
                }
                break;

            case "modificarDireccion":
                ControladorCuentaCliente ctrlCuentaCliente = new ControladorCuentaCliente("direccionEnvio");
                vistaCarrito.dispose();

                break;
        }
        rellenarResumenCesta();
    }

    private void cargarDireccion() {
        Direccion direccion = ControladorLogin.getCliente().getDireccion();

        if (direccion != null) {
            direccion = crudDireccion.buscar(direccion.getIdDireccion());

            vistaCarrito.getAreaTextDireccion().append("Calle: " + direccion.getCalle() + "\n");
            vistaCarrito.getAreaTextDireccion().append("Número: " + direccion.getNumero() + "\n");
            vistaCarrito.getAreaTextDireccion().append("Codigo Postal: " + direccion.getCodigoPostal() + "\n");
            vistaCarrito.getAreaTextDireccion().append("Localidad: " + direccion.getLocalidad() + "\n");
            vistaCarrito.getAreaTextDireccion().append("Teléfono: " + direccion.getTelefono());
        }
    }

    private void cargarTabla() {
        String[] titulos = {"ARTÍCULOS", "PRECIO", "UNIDADES", "TOTAL"};

        ArrayList<Carrito> lineas = Carrito.getLineas();

        tablaModelo = new TablaModelo(titulos, 0);
        tablaModelo.rellenarTablaCesta(lineas);

        vistaCarrito.getTablaCesta().setModel(tablaModelo);
        tablaModelo.formatoColumnasTablaCesta(vistaCarrito.getTablaCesta());
    }

    private void quitarProductoCesta() {
        int fila = vistaCarrito.getTablaCesta().getSelectedRow();
        if (fila >= 0) {
            Carrito.setUnidadesTotales(Carrito.getUnidadesTotales() - Carrito.getLineas().get(fila).getUnidades());//Restamos a las uds totales las uds del articulo
            Carrito.getLineas().remove(fila);
            cargarTabla();

        } else if (fila < 0 || vistaCarrito.getTablaCesta().getRowCount() < 0) {
            Utilidades.mensaje("Debe seleccionar un artículo de la cesta");
        }
    }

    private void vaciarCesta() {
        Carrito.getLineas().clear();
        Carrito.setUnidadesTotales(0);
        cargarTabla();
    }

    private double calculartotalArticulos() {
        double totalArticulos = 0;
        for (Carrito carrito : Carrito.getLineas()) {
            totalArticulos += carrito.getPrecioTotal();
        }
        return totalArticulos;
    }

    //Rellena ResumenCesta y obtiene el precio total de la compra
    private void rellenarResumenCesta() {
        vistaCarrito.getArticulos().setText(String.format("%.2f", calculartotalArticulos()) + "€");

        if (calculartotalArticulos() == 0) {
            vistaCarrito.getEnvio().setText("0,00€");
            vistaCarrito.getTotal().setText("0,00€");

            totalCompra = 0;

        } else if (calculartotalArticulos() > 20) {
            vistaCarrito.getEnvio().setText("0,00€");
            vistaCarrito.getTotal().setText(String.format("%.2f", calculartotalArticulos()) + "€");

            totalCompra = calculartotalArticulos();

        } else {
            vistaCarrito.getEnvio().setText("3,00€");
            vistaCarrito.getTotal().setText(String.format("%.2f", calculartotalArticulos() + 3) + "€");

            totalCompra = calculartotalArticulos() + 3;
        }
    }

    private void realizarPedido() {
        if (totalCompra > 0) {
            String formaPago = vistaCarrito.getBtnGrupo().getSelection().getActionCommand();

            Pedido pedido = new Pedido(ControladorLogin.getCliente(), new Date(),
                    new BigDecimal(totalCompra), formaPago);

            crudPedido.alta(pedido);
            realizarDetallePedido();
            reporteFactura.crearFactura(pedido.getIdPedido());
            
            vaciarCesta();

            vistaCarrito.dispose();
            ControladorLogin ctrlogin = new ControladorLogin();
        } else {
            Utilidades.mensaje("La cesta esta vacía");
        }
    }

    private void realizarDetallePedido() {
        DetallepedidoId detallePedidoId;
        Detallepedido detallePedido;
        Pedido pedido = crudPedido.ultimoValor();

        for (Carrito carrito : Carrito.getLineas()) {
            int idPedido = pedido.getIdPedido();
            int idProducto = carrito.getProducto().getIdProducto();
            int unidadesProducto = carrito.getUnidades();

            BigDecimal precioUnitario = new BigDecimal(carrito.getPrecio());
            BigDecimal precioTotalProducto = new BigDecimal(carrito.getPrecioTotal());

            detallePedidoId = new DetallepedidoId(idPedido, idProducto);

            detallePedido = new Detallepedido(detallePedidoId, pedido, carrito.getProducto(),
                    unidadesProducto, precioUnitario, precioTotalProducto);

            crudDetallepedido.alta(detallePedido);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
            rellenarResumenCesta();
        }

    }

}
