package maxpizza.controlador;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

abstract class ControladorGenerico extends MouseAdapter implements ActionListener {

    abstract void iniciarComponentes();

    abstract void cargarDatos();

    abstract void iniciarEventos();

}
