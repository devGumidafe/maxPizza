package validacion;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Utilidades {

    public Utilidades() {
    }

    public static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static boolean verPass(boolean verPass, JPasswordField txtPass) {
        if (verPass) {
            txtPass.setEchoChar((char) 0);
            verPass = false;
        } else {
            txtPass.setEchoChar('*');
            txtPass.setVisible(true);
            verPass = true;
        }

        return verPass;
    }

}
