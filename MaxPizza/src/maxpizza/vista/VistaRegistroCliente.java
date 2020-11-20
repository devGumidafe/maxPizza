package maxpizza.vista;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import maxpizza.controlador.ControladorLogin;
import validacion.Utilidades;

public class VistaRegistroCliente extends javax.swing.JFrame {

    boolean vpas1 = true;
    boolean vpas2 = true;

    public VistaRegistroCliente() {
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/maxpizza/imagen/iconPizza.png")).getImage();
        setIconImage(icon);

        setLocationRelativeTo(null);
    }

    public JTextField getTxtNuevoCliente() {
        return txtNuevoCliente;
    }

    public void setTxtNuevoCliente(JTextField txtNuevoCliente) {
        this.txtNuevoCliente = txtNuevoCliente;
    }

    public JPasswordField getTxtPassNuevo() {
        return txtPassNuevo;
    }

    public void setTxtPassNuevo(JPasswordField txtPassNuevo) {
        this.txtPassNuevo = txtPassNuevo;
    }

    public JPasswordField getTxtPassNuevoRepetir() {
        return txtPassNuevoRepetir;
    }

    public void setTxtPassNuevoRepetir(JPasswordField txtPassNuevoRepetir) {
        this.txtPassNuevoRepetir = txtPassNuevoRepetir;
    }

    public JButton getBtnCrearCuenta() {
        return btnCrearCuenta;
    }

    public void setBtnCrearCuenta(JButton btnCrearCuenta) {
        this.btnCrearCuenta = btnCrearCuenta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelNuevoCliente = new javax.swing.JLabel();
        txtNuevoCliente = new javax.swing.JTextField();
        labelPassNuevoCliente = new javax.swing.JLabel();
        labelRepitePassNuevoCliente = new javax.swing.JLabel();
        labelPassMinimo = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JButton();
        txtPassNuevo = new javax.swing.JPasswordField();
        txtPassNuevoRepetir = new javax.swing.JPasswordField();
        btnViewPass1 = new javax.swing.JButton();
        btnViewPass2 = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Usuario");
        setMaximumSize(new java.awt.Dimension(350, 500));
        setMinimumSize(new java.awt.Dimension(350, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panelPrincipal.setMaximumSize(new java.awt.Dimension(350, 500));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(350, 500));
        panelPrincipal.setLayout(null);

        labelNuevoCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNuevoCliente.setForeground(new java.awt.Color(159, 159, 160));
        labelNuevoCliente.setText("USUARIO");
        panelPrincipal.add(labelNuevoCliente);
        labelNuevoCliente.setBounds(20, 160, 100, 25);

        txtNuevoCliente.setBackground(new java.awt.Color(159, 159, 160));
        txtNuevoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNuevoCliente.setForeground(new java.awt.Color(51, 51, 51));
        panelPrincipal.add(txtNuevoCliente);
        txtNuevoCliente.setBounds(20, 190, 310, 30);

        labelPassNuevoCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPassNuevoCliente.setForeground(new java.awt.Color(159, 159, 160));
        labelPassNuevoCliente.setText("CONTRASEÑA");
        panelPrincipal.add(labelPassNuevoCliente);
        labelPassNuevoCliente.setBounds(20, 240, 140, 25);

        labelRepitePassNuevoCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelRepitePassNuevoCliente.setForeground(new java.awt.Color(159, 159, 160));
        labelRepitePassNuevoCliente.setText("REPETIR CONTRASEÑA");
        panelPrincipal.add(labelRepitePassNuevoCliente);
        labelRepitePassNuevoCliente.setBounds(20, 320, 250, 25);

        labelPassMinimo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPassMinimo.setForeground(new java.awt.Color(159, 159, 160));
        labelPassMinimo.setText("La contraseña como mínimo 6 caracteres");
        panelPrincipal.add(labelPassMinimo);
        labelPassMinimo.setBounds(20, 380, 310, 25);

        btnCrearCuenta.setBackground(new java.awt.Color(0, 51, 51));
        btnCrearCuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("CREAR CUENTA");
        btnCrearCuenta.setActionCommand("crearCuenta");
        btnCrearCuenta.setFocusable(false);
        panelPrincipal.add(btnCrearCuenta);
        btnCrearCuenta.setBounds(20, 430, 310, 40);

        txtPassNuevo.setBackground(new java.awt.Color(159, 159, 160));
        txtPassNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassNuevo.setForeground(new java.awt.Color(51, 51, 51));
        panelPrincipal.add(txtPassNuevo);
        txtPassNuevo.setBounds(20, 270, 270, 30);

        txtPassNuevoRepetir.setBackground(new java.awt.Color(159, 159, 160));
        txtPassNuevoRepetir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassNuevoRepetir.setForeground(new java.awt.Color(51, 51, 51));
        panelPrincipal.add(txtPassNuevoRepetir);
        txtPassNuevoRepetir.setBounds(20, 350, 270, 30);

        btnViewPass1.setBackground(new java.awt.Color(159, 159, 160));
        btnViewPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/no_visible_icon_1.jpg"))); // NOI18N
        btnViewPass1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewPass1.setMaximumSize(new java.awt.Dimension(77, 39));
        btnViewPass1.setMinimumSize(new java.awt.Dimension(77, 39));
        btnViewPass1.setPreferredSize(new java.awt.Dimension(77, 39));
        btnViewPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPass1Pass1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnViewPass1);
        btnViewPass1.setBounds(290, 270, 40, 30);

        btnViewPass2.setBackground(new java.awt.Color(159, 159, 160));
        btnViewPass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/no_visible_icon_1.jpg"))); // NOI18N
        btnViewPass2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewPass2.setMaximumSize(new java.awt.Dimension(77, 39));
        btnViewPass2.setMinimumSize(new java.awt.Dimension(77, 39));
        btnViewPass2.setPreferredSize(new java.awt.Dimension(77, 39));
        btnViewPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPass2Pass1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnViewPass2);
        btnViewPass2.setBounds(290, 350, 40, 30);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/fondoRegistroUsuario.png"))); // NOI18N
        panelPrincipal.add(labelFondo);
        labelFondo.setBounds(0, 0, 350, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ControladorLogin ctrlLogin = new ControladorLogin();
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnViewPass1Pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPass1Pass1ActionPerformed
        vpas1 = Utilidades.verPass(vpas1, txtPassNuevo);
    }//GEN-LAST:event_btnViewPass1Pass1ActionPerformed

    private void btnViewPass2Pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPass2Pass1ActionPerformed
        vpas2 = Utilidades.verPass(vpas2, txtPassNuevoRepetir);
    }//GEN-LAST:event_btnViewPass2Pass1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnViewPass1;
    private javax.swing.JButton btnViewPass2;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNuevoCliente;
    private javax.swing.JLabel labelPassMinimo;
    private javax.swing.JLabel labelPassNuevoCliente;
    private javax.swing.JLabel labelRepitePassNuevoCliente;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtNuevoCliente;
    private javax.swing.JPasswordField txtPassNuevo;
    private javax.swing.JPasswordField txtPassNuevoRepetir;
    // End of variables declaration//GEN-END:variables
}
