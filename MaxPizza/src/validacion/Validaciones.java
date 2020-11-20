package validacion;

import hibernate.CrudPersona;
import maxpizza.modelo.Persona;

public class Validaciones {

    private CrudPersona crudPersona;

    public Validaciones() {
        crudPersona = new CrudPersona();
    }

    public Persona validarLogin(String usuario, String pass) {

        Persona persona = crudPersona.buscar(usuario);

        if (persona != null) {
            if (persona.getPass().equals(pass)) {

                return persona;

            } else {
                Utilidades.mensaje("Usuario o contraseña no válido");
                return null;
            }
        }
        Utilidades.mensaje("Usuario no existe");
        return null;
    }

    public boolean validarPassRepetido(String pass, String repitePass) {

        if (pass.equals(repitePass)) {
            return true;
        } else {
            Utilidades.mensaje("Repetir contraseña no coincide");
            return false;
        }
    }

    public String validarCamposVaciosLogin(String usuario, String pass) {
        String error = "";

        if (usuario.isEmpty()) {
            error += "El Usuario no puede estar vacío \n";
        }
        if (usuario.length() < 4) {
            error += "El Usuario no puede tener menos de 4 caracteres \n";
        }
        if (pass.isEmpty()) {
            error += "La contraseña no puede estar vacía \n";
        }
        if (pass.length() < 6) {
            error += "La contraseña no puede tener menos de 6 caracteres \n";
        }

        return error;
    }

    public String validarCamposVaciosModificarPass(String passAntiguo, String passNuevo) {
        String error = "";

        if (passAntiguo.isEmpty()) {
            error += "La antigua contraseña no puede estar vacía \n";
        }
        if (passAntiguo.length() < 6) {
            error += "La antigua contraseña no puede tener menos de 6 caracteres \n";
        }
        if (passNuevo.isEmpty()) {
            error += "La nueva contraseña no puede estar vacía \n";
        }
        if (passNuevo.length() < 6) {
            error += "La nueva contraseña no puede tener menos de 6 caracteres \n";
        }

        return error;
    }

    public String validarCamposVaciosDireccion(String calle, String numero, String codPostal, String telefono) {
        String error = "";

        if (calle.isEmpty()) {
            error += "La calle no puede estar vacía \n";
        }
        if (numero.isEmpty()) {
            error += "El número no puede estar vacío \n";
        }
        if (!validarNumero(numero)) {
            error += "El número debe ser un entero \n";
        }
        if (!validarCodPostal(codPostal)) {
            error += "El codigo postal no es válido \n";
        }
        if (!validarTelefono(telefono)) {
            error += "El teléfono no válido \n";
        }

        return error;
    }

    private boolean validarNumero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validarCodPostal(String codPostal) {

        return codPostal.matches("^(?:0[1-9]|[1-4]\\d|5[0-2])\\d{3}$");
    }

    private boolean validarTelefono(String telefono) {

        return telefono.matches("[0-9]{9}");
    }

}
