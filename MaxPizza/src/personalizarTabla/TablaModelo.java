package personalizarTabla;

import hibernate.CrudProducto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import maxpizza.modelo.Carrito;
import maxpizza.modelo.Detallepedido;
import maxpizza.modelo.Pedido;
import maxpizza.modelo.Producto;

public class TablaModelo extends DefaultTableModel {

    public TablaModelo(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    private void actualizarCesta(int row, int colum) {
        try {
            int cantidad = Integer.parseInt((String) getValueAt(row, 2));//Capturamos la cantidad de la tabla
            if (cantidad > 0) {
                Carrito.getLineas().get(row).setUnidades(cantidad);//Modificamos la cantidad
                Carrito.getLineas().get(row).calcularPrecioTotal(Carrito.getLineas().get(row).getPrecio(),//Calculamos precioTotal
                        cantidad);
                Carrito.calcularUnidadesTotales();//Calculamos unidades totales

                setRowCount(0);//Limpia la tabla al poner el contador a cero
                rellenarTablaCesta(Carrito.getLineas());//Volvemos a recargar la tabla
            } else {
                setRowCount(0);
                rellenarTablaCesta(Carrito.getLineas());
            }

        } catch (NumberFormatException e) {
            setRowCount(0);
            rellenarTablaCesta(Carrito.getLineas());
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if (column == 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
        super.setValueAt(aValue, row, column);
        if (column == 2) {
            actualizarCesta(row, column);
        }
    }

    //Rellenamos tabla y damos formato a los valores numericos
    public void rellenarTablaCesta(ArrayList<Carrito> lineasCarrito) {
        for (Carrito carrito : lineasCarrito) {
            addRow(new Object[]{carrito.getProducto().getDescripcion() + " " + carrito.getProducto().getTam(), String.format("%.2f", carrito.getPrecio()) + "€",
                carrito.getUnidades(), String.format("%10.2f", carrito.getPrecioTotal()) + "€"});
        }
    }

    public void rellenarTablaPedidos(ArrayList<Pedido> pedidos) {
        for (Pedido pedido : pedidos) {
            addRow(new Object[]{pedido.getIdPedido(), pedido.getPersona().getUsuario(),
                new SimpleDateFormat("dd-MM-yyyy").format(pedido.getFecha()), pedido.getFormaPago(), String.format("%.2f", pedido.getPrecioTotal()) + "€"});
        }
    }

    public void rellenarTablaDetallePedidos(ArrayList<Detallepedido> detallePedido) {
        CrudProducto crudProducto = new CrudProducto();

        for (Detallepedido detalles : detallePedido) {
            Producto producto = crudProducto.buscar(detalles.getProducto().getIdProducto());

            addRow(new Object[]{producto.getDescripcion() + " " + producto.getTam(), String.format("%.2f", detalles.getPrecioUnidad()) + "€",
                detalles.getCantidad(), String.format("%10.2f", detalles.getPrecioTotal()) + "€"});
        }

    }

    public void formatoColumnasTablaCesta(JTable tabla) {
        //Alineamiento el texto de las columnas
        DefaultTableCellRenderer renderCenter = new DefaultTableCellRenderer();
        renderCenter.setHorizontalAlignment(SwingConstants.CENTER);

        DefaultTableCellRenderer renderLeft = new DefaultTableCellRenderer();
        renderLeft.setHorizontalAlignment(SwingConstants.LEFT);

        //Ancho y alineo de celdas
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            if (i == 0) {
                tabla.getColumnModel().getColumn(i).setResizable(false);
                tabla.getColumnModel().getColumn(i).setPreferredWidth(280);
                tabla.getColumnModel().getColumn(i).setCellRenderer(renderLeft);

            } else {
                tabla.getColumnModel().getColumn(i).setResizable(false);
                tabla.getColumnModel().getColumn(i).setPreferredWidth(70);
                tabla.getColumnModel().getColumn(i).setCellRenderer(renderCenter);
            }
        }
    }

    public void formatoColumnasTablaPedido(JTable tabla) {
        //Alineamiento texto columnas
        DefaultTableCellRenderer renderCenter = new DefaultTableCellRenderer();
        renderCenter.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setResizable(false);
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderCenter);
        }
    }

}
