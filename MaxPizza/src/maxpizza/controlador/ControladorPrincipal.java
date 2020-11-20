package maxpizza.controlador;

import hibernate.CrudProducto;
import java.awt.event.ActionEvent;
import maxpizza.modelo.Carrito;
import maxpizza.modelo.Producto;
import maxpizza.modelo.ProductoID;
import maxpizza.vista.VistaPrincipal;

public class ControladorPrincipal extends ControladorGenerico {

    VistaPrincipal vistaPrincipal;
    CrudProducto crudProducto;

    public ControladorPrincipal() {
        iniciarComponentes();
        iniciarEventos();
        cargarDatos();

        vistaPrincipal.setVisible(true);
    }

    @Override
    void iniciarComponentes() {
        vistaPrincipal = new VistaPrincipal();
        crudProducto = new CrudProducto();
    }

    @Override
    void cargarDatos() {
        totalUnidadesCarrito();
    }

    @Override
    void iniciarEventos() {
        //Botones Pizzas
        vistaPrincipal.getBtnCuatroQuesos().addActionListener(this);
        vistaPrincipal.getBtnCarbonara().addActionListener(this);
        vistaPrincipal.getBtnFlorentina().addActionListener(this);
        vistaPrincipal.getBtnHawaiana().addActionListener(this);
        vistaPrincipal.getBtnSupreme().addActionListener(this);
        vistaPrincipal.getBtnEspecial().addActionListener(this);
        vistaPrincipal.getBtnBarbacoa().addActionListener(this);
        vistaPrincipal.getBtnBacon().addActionListener(this);
        vistaPrincipal.getBtnPeperoni().addActionListener(this);
        vistaPrincipal.getBtnPanAjo().addActionListener(this);

        //Botones Bebidas
        vistaPrincipal.getBtnAgua().addActionListener(this);
        vistaPrincipal.getBtnCerveza().addActionListener(this);
        vistaPrincipal.getBtnSprite().addActionListener(this);
        vistaPrincipal.getBtnCola().addActionListener(this);
        vistaPrincipal.getBtnFanta().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int pizza;
        int selTamanio;//Tamaño seleccionado en el ComboBox(Mediana o Familiar)

        switch (e.getActionCommand()) {
            case "cuatroQuesos":
                pizza = ProductoID.CUATROQUESOS;
                selTamanio = vistaPrincipal.getComboCuatroQuesos().getSelectedIndex();
                if (selTamanio == 1) {
                    pizza = ProductoID.CUATROQUESOSFAMILIAR;
                }
                addProductoCarrito(pizza);

                break;
            case "carbonara":
                pizza = ProductoID.CARBONARA;
                selTamanio = vistaPrincipal.getComboCarbonara().getSelectedIndex();
                if (selTamanio == 1) {
                    pizza = ProductoID.CARBONARAFAMILIAR;
                }
                addProductoCarrito(pizza);

                break;
            case "florentina":
                pizza = ProductoID.FLORENTINA;
                selTamanio = vistaPrincipal.getComboFlorentina().getSelectedIndex();
                if (selTamanio == 1) {
                    pizza = ProductoID.FLORENTINAFAMILIAR;
                }
                addProductoCarrito(pizza);

                break;
            case "hawaiana":
                pizza = ProductoID.HAWAIANA;
                selTamanio = vistaPrincipal.getComboHawaiana().getSelectedIndex();
                if (selTamanio == 1) {
                    pizza = ProductoID.HAWAIANAFAMILIAR;
                }
                addProductoCarrito(pizza);

                break;
            case "supreme":
                pizza = ProductoID.SUPREME;
                selTamanio = vistaPrincipal.getComboSupreme().getSelectedIndex();
                if (selTamanio == 1) {
                    pizza = ProductoID.SUPREMEFAMILIAR;
                }
                addProductoCarrito(pizza);

                break;
            case "especial":
                pizza = ProductoID.ESPECIAL;
                selTamanio = vistaPrincipal.getComboEspecial().getSelectedIndex();
                if (selTamanio == 1) {
                    pizza = ProductoID.ESPECIALFAMILIAR;
                }
                addProductoCarrito(pizza);

                break;
            case "barbacoa":
                pizza = ProductoID.BARBACOA;
                selTamanio = vistaPrincipal.getComboBarbacoa().getSelectedIndex();
                if (selTamanio == 1) {
                    pizza = ProductoID.BARBACOAFAMILIAR;
                }
                addProductoCarrito(pizza);
                break;

            case "bacon":
                pizza = ProductoID.BACON;
                selTamanio = vistaPrincipal.getComboBacon().getSelectedIndex();
                if (selTamanio == 1) {
                    pizza = ProductoID.BACONFAMILIAR;
                }
                addProductoCarrito(pizza);
                break;

            case "peperoni":
                pizza = ProductoID.PEPERONI;
                selTamanio = vistaPrincipal.getComboPeperoni().getSelectedIndex();
                if (selTamanio == 1) {
                    pizza = ProductoID.PEPERONIFAMILIAR;
                }
                addProductoCarrito(pizza);
                break;

            case "panAjo":
                pizza = ProductoID.PANAJOUNID;
                selTamanio = vistaPrincipal.getComboPanAjo().getSelectedIndex();
                if (selTamanio == 1) {
                    pizza = ProductoID.PANAJO;
                }
                if (selTamanio == 2) {
                    pizza = ProductoID.PANAJOGRANDE;
                }
                addProductoCarrito(pizza);
                break;

            case "agua":
                addProductoCarrito(ProductoID.AGUA);
                break;

            case "cerveza":
                addProductoCarrito(ProductoID.CERVEZA);
                break;

            case "sprite":
                addProductoCarrito(ProductoID.SPRITE);
                break;

            case "cola":
                addProductoCarrito(ProductoID.COLA);
                break;

            case "fanta":
                addProductoCarrito(ProductoID.FANTA);
                break;

        }
        totalUnidadesCarrito();
    }

    private void totalUnidadesCarrito() {
        String cantidadTotal = String.valueOf(Carrito.getUnidadesTotales());
        vistaPrincipal.getLabelCantidadCarrito().setText(cantidadTotal);
    }

    private void addProductoCarrito(int idProducto) {
        Producto producto = crudProducto.buscar(idProducto);

        Carrito.addLineas(new Carrito(producto, 1));
    }

}
