package maxpizza.controlador;

import hibernate.CrudPersona;
import java.awt.event.ActionEvent;
import maxpizza.modelo.Persona;
import maxpizza.vista.VistaRegistroCliente;
import validacion.Utilidades;
import validacion.Validaciones;

public class ControladorRegistroCliente extends ControladorGenerico {

    VistaRegistroCliente vistaRegistroCliente;
    CrudPersona crudPersona;
    Validaciones validaciones;

    public ControladorRegistroCliente() {
        iniciarComponentes();
        iniciarEventos();

        vistaRegistroCliente.setVisible(true);
    }

    @Override
    void iniciarComponentes() {
        vistaRegistroCliente = new VistaRegistroCliente();
        crudPersona = new CrudPersona();
        validaciones = new Validaciones();
    }

    @Override
    void cargarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarEventos() {
        vistaRegistroCliente.getBtnCrearCuenta().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "crearCuenta":
                if (getDatosFormulario() != null) {
                    if (crudPersona.alta(getDatosFormulario())) {
                        vistaRegistroCliente.dispose();
                    }
                }

                break;
        }
    }

    private Persona getDatosFormulario() {
        Persona persona = null;

        String usuario = vistaRegistroCliente.getTxtNuevoCliente().getText();
        String pass = String.valueOf(vistaRegistroCliente.getTxtPassNuevo().getPassword());
        String repitePass = String.valueOf(vistaRegistroCliente.getTxtPassNuevoRepetir().getPassword());

        String errorCamposVacios = validaciones.validarCamposVaciosLogin(usuario, pass);

        if (errorCamposVacios.isEmpty()) {
            if (validaciones.validarPassRepetido(pass, repitePass)) {
                persona = new Persona(usuario, pass, "cliente");

                return persona;
            }
        } else {
            Utilidades.mensaje(errorCamposVacios);
        }
        return persona;
    }

}
