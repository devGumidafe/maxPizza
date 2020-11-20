package maxpizza.vista;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import maxpizza.controlador.ControladorRegistroCliente;
import validacion.Utilidades;

public class VistaLogin extends javax.swing.JFrame {

    public boolean vpass = true;

    public VistaLogin() {
        initComponents();
        setLocationRelativeTo(null);

        Image icon = new ImageIcon(getClass().getResource("/maxpizza/imagen/iconPizza.png")).getImage();
        setIconImage(icon);
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JButton getBtnContinuar() {
        return btnContinuar;
    }

    public void setBtnContinuar(JButton btnContinuar) {
        this.btnContinuar = btnContinuar;
    }

    public JLabel getLabelClienteNuevo() {
        return labelClienteNuevo;
    }

    public void setLabelClienteNuevo(JLabel labelClienteNuevo) {
        this.labelClienteNuevo = labelClienteNuevo;
    }

    public JLabel getLabelContraseña() {
        return labelContraseña;
    }

    public void setLabelContraseña(JLabel labelContraseña) {
        this.labelContraseña = labelContraseña;
    }

    public JLabel getLabelFondo() {
        return labelFondo;
    }

    public void setLabelFondo(JLabel labelFondo) {
        this.labelFondo = labelFondo;
    }

    public JLabel getLabelRegistrate() {
        return labelRegistrate;
    }

    public void setLabelRegistrate(JLabel labelRegistrate) {
        this.labelRegistrate = labelRegistrate;
    }

    public JLabel getLabelUsuario() {
        return labelUsuario;
    }

    public void setLabelUsuario(JLabel labelUsuario) {
        this.labelUsuario = labelUsuario;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelContraseña = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        labelRegistrate = new javax.swing.JLabel();
        labelClienteNuevo = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnView = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MaxPizza");
        setBackground(new java.awt.Color(159, 159, 160));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("ventanaLogin"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        panelPrincipal.setMinimumSize(new java.awt.Dimension(800, 600));
        panelPrincipal.setLayout(null);

        labelContraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(159, 159, 160));
        labelContraseña.setText("CONTRASEÑA");
        panelPrincipal.add(labelContraseña);
        labelContraseña.setBounds(350, 390, 130, 30);

        labelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(159, 159, 160));
        labelUsuario.setText("USUARIO");
        panelPrincipal.add(labelUsuario);
        labelUsuario.setBounds(350, 310, 130, 30);

        txtUsuario.setBackground(new java.awt.Color(159, 159, 160));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        panelPrincipal.add(txtUsuario);
        txtUsuario.setBounds(350, 340, 270, 30);

        btnContinuar.setBackground(new java.awt.Color(0, 102, 0));
        btnContinuar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.setActionCommand("continuar");
        btnContinuar.setFocusable(false);
        panelPrincipal.add(btnContinuar);
        btnContinuar.setBounds(350, 480, 270, 40);

        labelRegistrate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRegistrate.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistrate.setText("Registrate");
        labelRegistrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistrateMouseClicked(evt);
            }
        });
        panelPrincipal.add(labelRegistrate);
        labelRegistrate.setBounds(540, 560, 80, 25);

        labelClienteNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelClienteNuevo.setForeground(new java.awt.Color(255, 255, 255));
        labelClienteNuevo.setText("¿Eres un cliente nuevo?   ");
        panelPrincipal.add(labelClienteNuevo);
        labelClienteNuevo.setBounds(340, 560, 200, 25);

        txtPassword.setBackground(new java.awt.Color(159, 159, 160));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        panelPrincipal.add(txtPassword);
        txtPassword.setBounds(350, 420, 230, 30);

        btnView.setBackground(new java.awt.Color(159, 159, 160));
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/no_visible_icon_1.jpg"))); // NOI18N
        btnView.setMaximumSize(new java.awt.Dimension(77, 39));
        btnView.setMinimumSize(new java.awt.Dimension(77, 39));
        btnView.setPreferredSize(new java.awt.Dimension(77, 39));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnView);
        btnView.setBounds(580, 420, 40, 30);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/fondoLogin.png"))); // NOI18N
        panelPrincipal.add(labelFondo);
        labelFondo.setBounds(0, 0, 800, 600);

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

    private void labelRegistrateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrateMouseClicked
        ControladorRegistroCliente ctrlRegistroCliente = new ControladorRegistroCliente();
        this.dispose();
    }//GEN-LAST:event_labelRegistrateMouseClicked

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        vpass = Utilidades.verPass(vpass, txtPassword);
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel labelClienteNuevo;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelRegistrate;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
