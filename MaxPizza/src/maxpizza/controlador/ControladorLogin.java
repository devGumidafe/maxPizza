package maxpizza.controlador;

import java.awt.event.ActionEvent;
import maxpizza.modelo.Persona;
import maxpizza.vista.VistaLogin;
import validacion.Utilidades;
import validacion.Validaciones;

public class ControladorLogin extends ControladorGenerico {

    private VistaLogin vistaLogin;
    private Validaciones validaciones;
    public static Persona cliente;

    public ControladorLogin() {
        iniciarComponentes();
        iniciarEventos();

        vistaLogin.setVisible(true);
    }

    @Override
    void iniciarComponentes() {
        vistaLogin = new VistaLogin();
        validaciones = new Validaciones();
    }

    @Override
    void cargarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarEventos() {
        vistaLogin.getBtnContinuar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "continuar":
                String usuario = vistaLogin.getTxtUsuario().getText().toLowerCase();
                String pass = String.valueOf(vistaLogin.getTxtPassword().getPassword());

                String errorCamposVacios = validaciones.validarCamposVaciosLogin(usuario, pass);

                if (errorCamposVacios.isEmpty()) {
                    cliente = validaciones.validarLogin(usuario, pass);

                    if (cliente != null) {
                        Utilidades.mensaje("Bienvenido " + cliente.getUsuario().toUpperCase());

                        ControladorPrincipal ctrlPrincipal = new ControladorPrincipal();
                        vistaLogin.dispose();
                    }
                } else {
                    Utilidades.mensaje(errorCamposVacios);
                }
                break;
        }
    }

    public static Persona getCliente() {
        return cliente;
    }

    public static void setCliente(Persona cliente) {
        ControladorLogin.cliente = cliente;
    }

}
