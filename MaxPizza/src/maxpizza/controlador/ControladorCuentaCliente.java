package maxpizza.controlador;

import hibernate.CrudDetallePedido;
import hibernate.CrudDireccion;
import hibernate.CrudPedido;
import hibernate.CrudPersona;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import maxpizza.modelo.Detallepedido;
import maxpizza.modelo.Direccion;
import maxpizza.modelo.Pedido;
import maxpizza.modelo.Persona;
import maxpizza.reportes.clases.ReporteFactura;
import maxpizza.reportes.clases.ReporteListadoPedidos;
import maxpizza.vista.VistaCuentaCliente;
import maxpizza.vista.VistaDetallePedido;
import personalizarTabla.TablaModelo;
import validacion.Utilidades;
import validacion.Validaciones;

public class ControladorCuentaCliente extends ControladorGenerico {

    VistaCuentaCliente vistaCuentaCliente;
    VistaDetallePedido vistaDetallePedido;
    ReporteFactura reporteFactura;
    ReporteListadoPedidos reporteListadoPedidos;

    Validaciones validaciones;
    CrudPersona crudPersona;
    CrudPedido crudPedido;
    CrudDetallePedido crudDetallePedido;
    CrudDireccion crudDireccion;

    TablaModelo tablaModelo;

    public ControladorCuentaCliente(String panel) {
        iniciarComponentes();
        iniciarEventos();
        panelVisible(panel);
        cargarDatos();

        vistaCuentaCliente.setVisible(true);
    }

    @Override
    void iniciarComponentes() {
        vistaCuentaCliente = new VistaCuentaCliente();
        vistaDetallePedido = new VistaDetallePedido();
        reporteFactura = new ReporteFactura();
        reporteListadoPedidos = new ReporteListadoPedidos();

        validaciones = new Validaciones();
        crudPersona = new CrudPersona();
        crudPedido = new CrudPedido();
        crudDetallePedido = new CrudDetallePedido();
        crudDireccion = new CrudDireccion();
    }

    @Override
    void cargarDatos() {
        cargarTablaPedidos();
        cargarDireccion();
    }

    @Override
    void iniciarEventos() {
        vistaCuentaCliente.getBtnVolver().addActionListener(this);
        vistaCuentaCliente.getBtnMisDatos().addActionListener(this);
        vistaCuentaCliente.getBtnDireccionEnvio().addActionListener(this);
        vistaCuentaCliente.getBtnPedidos().addActionListener(this);
        vistaCuentaCliente.getBtnGuardarCambiosMisDatos().addActionListener(this);
        vistaCuentaCliente.getBtnDetallePedido().addActionListener(this);
        vistaCuentaCliente.getBtnGuardarPdf().addActionListener(this);
        vistaCuentaCliente.getBtnGuardarCambiosDireccion().addActionListener(this);

        vistaDetallePedido.getBtnListaPDF().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int fila;
        int idPedido;

        panelVisible(e.getActionCommand());

        switch (e.getActionCommand()) {

            case "misDatos":

                break;

            case "cambiarPass":
                String passAntiguo = vistaCuentaCliente.getTxtPassAntiguo().getText();
                String passNuevo = vistaCuentaCliente.getTxtPassNuevo().getText();
                String repitePass = vistaCuentaCliente.getTxtRepitePass().getText();

                cambiarPass(passAntiguo, passNuevo, repitePass);
                break;

            case "direccionEnvio":
                cargarDireccion();
                break;

            case "guardarDireccion":
                crearDireccion();
                break;

            case "pedidos":
                cargarTablaPedidos();
                break;

            case "detallePedido":
                fila = vistaCuentaCliente.getTablaPedidos().getSelectedRow();
                if (rellenarLabelVistaDetalle(fila)) {
                    idPedido = (int) vistaCuentaCliente.getTablaPedidos().getValueAt(fila, 0);

                    cargarTablaDetallePedidos(idPedido);

                    vistaDetallePedido.setVisible(true);
                    vistaCuentaCliente.dispose();
                }
                break;

            case "guardarPdf":
                reporteListadoPedidos.crearListadoPedidos(ControladorLogin.cliente.getUsuario());
                break;

            case "pedidoPdf":
                fila = vistaCuentaCliente.getTablaPedidos().getSelectedRow();
                idPedido = (int) vistaCuentaCliente.getTablaPedidos().getValueAt(fila, 0);

                reporteFactura.crearFactura(idPedido);
                break;

            case "volver":
                ControladorPrincipal ctrlControladorPrincipal = new ControladorPrincipal();
                vistaCuentaCliente.dispose();
                break;
        }
    }

    private boolean rellenarLabelVistaDetalle(int fila) {
        Pedido pedido;
        if (fila >= 0) {
            int idPedido = (int) vistaCuentaCliente.getTablaPedidos().getValueAt(fila, 0);

            pedido = crudPedido.buscar(String.valueOf(idPedido));

            String fecha = new SimpleDateFormat("dd-MM-yyyy").format(pedido.getFecha());
            BigDecimal total = pedido.getPrecioTotal();
            double subTotal = total.doubleValue();
            double envio = 0;

            if (subTotal <= 20) {
                subTotal -= 3;
                envio = 3;
            }
            vistaDetallePedido.getLabelFecha().setText(fecha);
            vistaDetallePedido.getLabelNumeroPedido().setText(String.valueOf(idPedido));
            vistaDetallePedido.getLabelSubTotal().setText(String.format("%.2f", subTotal) + "€");
            vistaDetallePedido.getLabelEnvio().setText(String.format("%.2f", envio) + "€");
            vistaDetallePedido.getLabelTotal().setText(String.format("%.2f", total) + "€");

            return true;

        } else {
            Utilidades.mensaje("Debe seleccionar un pedido");
            return false;
        }

    }

    private void cargarTablaPedidos() {
        String[] titulos = {"ID_PEDIDO", "ID_CLIENTE", "FECHA", "PAGO", "TOTAL"};

        ArrayList<Pedido> pedidos = crudPedido.getAll(ControladorLogin.getCliente().getUsuario());

        tablaModelo = new TablaModelo(titulos, 0);
        tablaModelo.rellenarTablaPedidos(pedidos);

        vistaCuentaCliente.getTablaPedidos().setModel(tablaModelo);
        tablaModelo.formatoColumnasTablaPedido(vistaCuentaCliente.getTablaPedidos());
    }

    private void cargarTablaDetallePedidos(int idPedido) {
        String[] titulos = {"ARTÍCULOS", "PRECIO", "CANTIDAD", "TOTAL"};

        ArrayList<Detallepedido> detallePedidos = crudDetallePedido.getAll(idPedido);

        tablaModelo = new TablaModelo(titulos, 0);
        tablaModelo.rellenarTablaDetallePedidos(detallePedidos);

        vistaDetallePedido.getTablaDetallePedido().setModel(tablaModelo);
        tablaModelo.formatoColumnasTablaCesta(vistaDetallePedido.getTablaDetallePedido());
    }

    private void panelVisible(String vista) {
        vistaCuentaCliente.getTxtNombreUsuario().setText(ControladorLogin.getCliente().getUsuario());

        vistaCuentaCliente.getPanelMisDatos().setVisible(false);
        vistaCuentaCliente.getPanelDireccionEnvio().setVisible(false);
        vistaCuentaCliente.getPanelPedidos().setVisible(false);

        switch (vista) {
            case "misDatos":
                vistaCuentaCliente.getPanelMisDatos().setVisible(true);
                break;
            case "cambiarPass":
                vistaCuentaCliente.getPanelMisDatos().setVisible(true);
                break;
            case "direccionEnvio":
                vistaCuentaCliente.getPanelDireccionEnvio().setVisible(true);
                break;
            case "guardarDireccion":
                vistaCuentaCliente.getPanelDireccionEnvio().setVisible(true);
                break;
            case "pedidos":
                vistaCuentaCliente.getPanelPedidos().setVisible(true);
                break;
            case "detallePedido":
                vistaCuentaCliente.getPanelPedidos().setVisible(true);
                break;
            case "guardarPdf":
                vistaCuentaCliente.getPanelPedidos().setVisible(true);
                break;
        }

    }

    private void cambiarPass(String passActual, String passNuevo, String repitePass) {
        Persona cliente = ControladorLogin.getCliente();
        String antiguoPass = cliente.getPass();
        String errorCamposVacios = validaciones.validarCamposVaciosModificarPass(passActual, passNuevo);

        if (errorCamposVacios.isEmpty()) {//Se valida que los campos no esten vacios

            if (passActual.equals(antiguoPass)) {//Se valida la contraseña actual

                if (validaciones.validarPassRepetido(passNuevo, repitePass)) {//Se valida si coincide la contraseña con repetir contraseña
                    cliente.setPass(passNuevo);
                    crudPersona.editar(cliente);

                    Utilidades.mensaje("Contraseña modificada");
                    limpiarCamposMisDatos();
                }
            } else {
                Utilidades.mensaje("La contraseña antigua no coincide");
            }

        } else {
            Utilidades.mensaje(errorCamposVacios);
        }
    }

    private void limpiarCamposMisDatos() {
        vistaCuentaCliente.getTxtPassAntiguo().setText("");
        vistaCuentaCliente.getTxtPassNuevo().setText("");
        vistaCuentaCliente.getTxtRepitePass().setText("");
    }

    private void cargarDireccion() {
        Direccion direccion = ControladorLogin.getCliente().getDireccion();

        if (direccion != null) {
            direccion = crudDireccion.buscar(direccion.getIdDireccion());

            vistaCuentaCliente.getTxtCalle().setText(direccion.getCalle());
            vistaCuentaCliente.getTxtNumero().setText(String.valueOf(direccion.getNumero()));
            vistaCuentaCliente.getTxtCodPostal().setText(direccion.getCodigoPostal());
            vistaCuentaCliente.getComboLocalidad().setSelectedItem(direccion.getLocalidad());
            vistaCuentaCliente.getTxtTelefono().setText(direccion.getTelefono());
        }
    }

    private void crearDireccion() {
        Direccion direccion = ControladorLogin.getCliente().getDireccion();

        String calle = vistaCuentaCliente.getTxtCalle().getText();
        String numeroString = vistaCuentaCliente.getTxtNumero().getText();
        String codPostal = vistaCuentaCliente.getTxtCodPostal().getText();
        String localidad = vistaCuentaCliente.getComboLocalidad().getSelectedItem().toString();
        String telefono = vistaCuentaCliente.getTxtTelefono().getText();

        String errorCamposVacios = validaciones.validarCamposVaciosDireccion(calle, numeroString, codPostal, telefono);

        if (errorCamposVacios.isEmpty()) {
            int numero = Integer.parseInt(numeroString);

            if (direccion == null) {
                Persona cliente = ControladorLogin.getCliente();
                direccion = new Direccion(calle, numero, codPostal, localidad, telefono);

                cliente.setDireccion(direccion);

                crudDireccion.alta(direccion);
                crudPersona.editar(cliente);
            } else {
                direccion = crudDireccion.buscar(ControladorLogin.getCliente().getDireccion().getIdDireccion());

                direccion.setCalle(calle);
                direccion.setNumero(numero);
                direccion.setCodigoPostal(codPostal);
                direccion.setLocalidad(localidad);
                direccion.setTelefono(telefono);

                crudDireccion.editar(direccion);
            }

        } else {
            Utilidades.mensaje(errorCamposVacios);
        }
    }

}
