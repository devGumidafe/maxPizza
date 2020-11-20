package maxpizza.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import maxpizza.controlador.ControladorPrincipal;
import validacion.Utilidades;

public class VistaCuentaCliente extends javax.swing.JFrame {

    boolean vpas1 = true;
    boolean vpas2 = true;
    boolean vpas3 = true;

    public VistaCuentaCliente() {
        initComponents();
        setLocationRelativeTo(null);

        formatoCabeceraTabla();

        Image icon = new ImageIcon(getClass().getResource("/maxpizza/imagen/iconPizza.png")).getImage();
        setIconImage(icon);
    }

    private void formatoCabeceraTabla() {
        tablaPedidos.getTableHeader().setBackground(new Color(102, 102, 102));
        tablaPedidos.getTableHeader().setFont(new Font("Segoe UI", 1, 12));
        tablaPedidos.getTableHeader().setForeground(new Color(255, 255, 255));

    }

    public JComboBox<String> getComboLocalidad() {
        return comboLocalidad;
    }

    public void setComboLocalidad(JComboBox<String> comboLocalidad) {
        this.comboLocalidad = comboLocalidad;
    }

    public JButton getBtnGuardarCambiosDireccion() {
        return btnGuardarCambiosDireccion;
    }

    public void setBtnGuardarCambiosDireccion(JButton btnGuardarCambiosDireccion) {
        this.btnGuardarCambiosDireccion = btnGuardarCambiosDireccion;
    }

    public JTextField getTxtCalle() {
        return txtCalle;
    }

    public void setTxtCalle(JTextField txtCalle) {
        this.txtCalle = txtCalle;
    }

    public JTextField getTxtCodPostal() {
        return txtCodPostal;
    }

    public void setTxtCodPostal(JTextField txtCodPostal) {
        this.txtCodPostal = txtCodPostal;
    }

    public JTextField getTxtNumero() {
        return txtNumero;
    }

    public void setTxtNumero(JTextField txtNumero) {
        this.txtNumero = txtNumero;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTable getTablaPedidos() {
        return tablaPedidos;
    }

    public JButton getBtnDetallePedido() {
        return btnDetallePedido;
    }

    public void setBtnDetallePedido(JButton btnDetallePedido) {
        this.btnDetallePedido = btnDetallePedido;
    }

    public JButton getBtnGuardarPdf() {
        return btnGuardarPdf;
    }

    public void setBtnGuardarPdf(JButton btnGuardarPdf) {
        this.btnGuardarPdf = btnGuardarPdf;
    }

    public JButton getBtnGuardarCambiosMisDatos() {
        return btnGuardarCambiosMisDatos;
    }

    public void setBtnGuardarCambiosMisDatos(JButton btnGuardarCambiosMisDatos) {
        this.btnGuardarCambiosMisDatos = btnGuardarCambiosMisDatos;
    }

    public JTextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public void setTxtNombreUsuario(JTextField txtNombreUsuario) {
        this.txtNombreUsuario = txtNombreUsuario;
    }

    public JPasswordField getTxtPassAntiguo() {
        return txtPassAntiguo;
    }

    public void setTxtPassAntiguo(JPasswordField txtPassAntiguo) {
        this.txtPassAntiguo = txtPassAntiguo;
    }

    public JPasswordField getTxtPassNuevo() {
        return txtPassNuevo;
    }

    public void setTxtPassNuevo(JPasswordField txtPassNuevo) {
        this.txtPassNuevo = txtPassNuevo;
    }

    public JPasswordField getTxtRepitePass() {
        return txtRepitePass;
    }

    public void setTxtRepitePass(JPasswordField txtRepitePass) {
        this.txtRepitePass = txtRepitePass;
    }

    public JButton getBtnDireccionEnvio() {
        return btnDireccionEnvio;
    }

    public void setBtnDireccionEnvio(JButton btnDireccionEnvio) {
        this.btnDireccionEnvio = btnDireccionEnvio;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JButton getBtnMisDatos() {
        return btnMisDatos;
    }

    public void setBtnMisDatos(JButton btnMisDatos) {
        this.btnMisDatos = btnMisDatos;
    }

    public JButton getBtnPedidos() {
        return btnPedidos;
    }

    public void setBtnPedidos(JButton btnPedidos) {
        this.btnPedidos = btnPedidos;
    }

    public JPanel getPanelDireccionEnvio() {
        return panelDireccionEnvio;
    }

    public void setPanelDireccionEnvio(JPanel panelDireccionEnvio) {
        this.panelDireccionEnvio = panelDireccionEnvio;
    }

    public JPanel getPanelMisDatos() {
        return panelMisDatos;
    }

    public void setPanelMisDatos(JPanel panelMisDatos) {
        this.panelMisDatos = panelMisDatos;
    }

    public JPanel getPanelPedidos() {
        return panelPedidos;
    }

    public void setPanelPedidos(JPanel panelPedidos) {
        this.panelPedidos = panelPedidos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelDireccionEnvio = new javax.swing.JPanel();
        panelTituloDireccion = new javax.swing.JPanel();
        labelTituloDireccion = new javax.swing.JLabel();
        panelMidDireccion = new javax.swing.JPanel();
        labelCalle = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelCodPostal = new javax.swing.JLabel();
        labelLocalidad = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCodPostal = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardarCambiosDireccion = new javax.swing.JButton();
        comboLocalidad = new javax.swing.JComboBox<>();
        panelPedidos = new javax.swing.JPanel();
        panelTituloPedidos = new javax.swing.JPanel();
        labelTituloPedidos = new javax.swing.JLabel();
        midPanelPedidos = new javax.swing.JPanel();
        scrollTablaPedidos = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        btnGuardarPdf = new javax.swing.JButton();
        btnDetallePedido = new javax.swing.JButton();
        panelMisDatos = new javax.swing.JPanel();
        panelTituloMisDatos = new javax.swing.JPanel();
        labelNombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        btnViewPass1 = new javax.swing.JButton();
        labelPassAntiguo = new javax.swing.JLabel();
        labelPassNuevo = new javax.swing.JLabel();
        txtPassNuevo = new javax.swing.JPasswordField();
        btnViewPass2 = new javax.swing.JButton();
        labelRepitePass = new javax.swing.JLabel();
        txtRepitePass = new javax.swing.JPasswordField();
        btnViewPass3 = new javax.swing.JButton();
        btnGuardarCambiosMisDatos = new javax.swing.JButton();
        txtPassAntiguo = new javax.swing.JPasswordField();
        lablelTituloMisDatos = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        btnMisDatos = new javax.swing.JButton();
        btnDireccionEnvio = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        labelMiCuenta = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mi Cuenta");
        setMinimumSize(new java.awt.Dimension(700, 428));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelPrincipal.setMaximumSize(new java.awt.Dimension(600, 480));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(600, 480));
        panelPrincipal.setLayout(null);

        panelDireccionEnvio.setOpaque(false);
        panelDireccionEnvio.setLayout(null);

        panelTituloDireccion.setOpaque(false);

        labelTituloDireccion.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTituloDireccion.setForeground(new java.awt.Color(153, 153, 153));
        labelTituloDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloDireccion.setText("DIRECCIÓN ENVÍO");

        javax.swing.GroupLayout panelTituloDireccionLayout = new javax.swing.GroupLayout(panelTituloDireccion);
        panelTituloDireccion.setLayout(panelTituloDireccionLayout);
        panelTituloDireccionLayout.setHorizontalGroup(
            panelTituloDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloDireccionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelTituloDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTituloDireccionLayout.setVerticalGroup(
            panelTituloDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTituloDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        panelDireccionEnvio.add(panelTituloDireccion);
        panelTituloDireccion.setBounds(0, 0, 480, 60);

        panelMidDireccion.setOpaque(false);
        panelMidDireccion.setLayout(null);

        labelCalle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelCalle.setForeground(new java.awt.Color(159, 159, 160));
        labelCalle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCalle.setText("CALLE:");
        panelMidDireccion.add(labelCalle);
        labelCalle.setBounds(10, 11, 129, 32);

        labelNumero.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelNumero.setForeground(new java.awt.Color(159, 159, 160));
        labelNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNumero.setText("NÚMERO:");
        panelMidDireccion.add(labelNumero);
        labelNumero.setBounds(10, 61, 129, 32);

        labelCodPostal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelCodPostal.setForeground(new java.awt.Color(159, 159, 160));
        labelCodPostal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCodPostal.setText("CODIGO POSTAL:");
        panelMidDireccion.add(labelCodPostal);
        labelCodPostal.setBounds(10, 111, 129, 32);

        labelLocalidad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelLocalidad.setForeground(new java.awt.Color(159, 159, 160));
        labelLocalidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelLocalidad.setText("LOCALIDAD:");
        panelMidDireccion.add(labelLocalidad);
        labelLocalidad.setBounds(10, 161, 129, 32);

        labelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(159, 159, 160));
        labelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTelefono.setText("TELÉFONO:");
        panelMidDireccion.add(labelTelefono);
        labelTelefono.setBounds(20, 210, 119, 32);

        txtCalle.setBackground(new java.awt.Color(159, 159, 160));
        txtCalle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCalle.setForeground(new java.awt.Color(51, 51, 51));
        panelMidDireccion.add(txtCalle);
        txtCalle.setBounds(149, 13, 321, 30);

        txtNumero.setBackground(new java.awt.Color(159, 159, 160));
        txtNumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(51, 51, 51));
        panelMidDireccion.add(txtNumero);
        txtNumero.setBounds(149, 63, 321, 30);

        txtCodPostal.setBackground(new java.awt.Color(159, 159, 160));
        txtCodPostal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodPostal.setForeground(new java.awt.Color(51, 51, 51));
        panelMidDireccion.add(txtCodPostal);
        txtCodPostal.setBounds(149, 113, 321, 30);

        txtTelefono.setBackground(new java.awt.Color(159, 159, 160));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        panelMidDireccion.add(txtTelefono);
        txtTelefono.setBounds(150, 210, 321, 30);

        btnGuardarCambiosDireccion.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardarCambiosDireccion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGuardarCambiosDireccion.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambiosDireccion.setText("GUARDAR CAMBIOS");
        btnGuardarCambiosDireccion.setActionCommand("guardarDireccion");
        btnGuardarCambiosDireccion.setFocusable(false);
        panelMidDireccion.add(btnGuardarCambiosDireccion);
        btnGuardarCambiosDireccion.setBounds(149, 269, 321, 33);

        comboLocalidad.setBackground(new java.awt.Color(159, 159, 160));
        comboLocalidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        comboLocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAS PALMAS DE GRAN CANARIA", "TELDE", "SANTA BRIGIDA", "INGENIO", "AGUIMES" }));
        panelMidDireccion.add(comboLocalidad);
        comboLocalidad.setBounds(149, 161, 321, 30);

        panelDireccionEnvio.add(panelMidDireccion);
        panelMidDireccion.setBounds(0, 60, 480, 340);

        panelPrincipal.add(panelDireccionEnvio);
        panelDireccionEnvio.setBounds(220, 0, 480, 400);

        panelPedidos.setOpaque(false);
        panelPedidos.setLayout(null);

        panelTituloPedidos.setOpaque(false);

        labelTituloPedidos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTituloPedidos.setForeground(new java.awt.Color(153, 153, 153));
        labelTituloPedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloPedidos.setText("PEDIDOS");

        javax.swing.GroupLayout panelTituloPedidosLayout = new javax.swing.GroupLayout(panelTituloPedidos);
        panelTituloPedidos.setLayout(panelTituloPedidosLayout);
        panelTituloPedidosLayout.setHorizontalGroup(
            panelTituloPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
            .addGroup(panelTituloPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTituloPedidosLayout.createSequentialGroup()
                    .addComponent(labelTituloPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelTituloPedidosLayout.setVerticalGroup(
            panelTituloPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(panelTituloPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelTituloPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        panelPedidos.add(panelTituloPedidos);
        panelTituloPedidos.setBounds(0, 0, 480, 60);

        midPanelPedidos.setOpaque(false);
        midPanelPedidos.setLayout(null);

        tablaPedidos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PEDIDO", "ID_CLIENTE", "FECHA", "PAGO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPedidos.setRowHeight(20);
        tablaPedidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaPedidos.setShowVerticalLines(false);
        tablaPedidos.getTableHeader().setReorderingAllowed(false);
        scrollTablaPedidos.setViewportView(tablaPedidos);
        if (tablaPedidos.getColumnModel().getColumnCount() > 0) {
            tablaPedidos.getColumnModel().getColumn(0).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(1).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(2).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(3).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(4).setResizable(false);
        }

        midPanelPedidos.add(scrollTablaPedidos);
        scrollTablaPedidos.setBounds(10, 10, 450, 270);

        btnGuardarPdf.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardarPdf.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGuardarPdf.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarPdf.setText("IMPRIMIR PEDIDOS PDF");
        btnGuardarPdf.setActionCommand("guardarPdf");
        btnGuardarPdf.setFocusable(false);
        midPanelPedidos.add(btnGuardarPdf);
        btnGuardarPdf.setBounds(240, 290, 220, 31);

        btnDetallePedido.setBackground(new java.awt.Color(102, 102, 102));
        btnDetallePedido.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDetallePedido.setForeground(new java.awt.Color(255, 255, 255));
        btnDetallePedido.setText("DETALLE PEDIDO");
        btnDetallePedido.setActionCommand("detallePedido");
        btnDetallePedido.setFocusable(false);
        midPanelPedidos.add(btnDetallePedido);
        btnDetallePedido.setBounds(10, 290, 210, 31);

        panelPedidos.add(midPanelPedidos);
        midPanelPedidos.setBounds(0, 60, 480, 340);

        panelPrincipal.add(panelPedidos);
        panelPedidos.setBounds(220, 0, 480, 400);

        panelMisDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelMisDatos.setMaximumSize(new java.awt.Dimension(640, 480));
        panelMisDatos.setOpaque(false);
        panelMisDatos.setPreferredSize(new java.awt.Dimension(640, 480));

        panelTituloMisDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelTituloMisDatos.setMaximumSize(new java.awt.Dimension(571, 480));
        panelTituloMisDatos.setMinimumSize(new java.awt.Dimension(571, 480));
        panelTituloMisDatos.setOpaque(false);
        panelTituloMisDatos.setPreferredSize(new java.awt.Dimension(571, 480));
        panelTituloMisDatos.setLayout(null);

        labelNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelNombreUsuario.setForeground(new java.awt.Color(159, 159, 160));
        labelNombreUsuario.setText("USUARIO");
        panelTituloMisDatos.add(labelNombreUsuario);
        labelNombreUsuario.setBounds(45, 0, 100, 22);

        txtNombreUsuario.setEditable(false);
        txtNombreUsuario.setBackground(new java.awt.Color(159, 159, 160));
        txtNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(51, 51, 51));
        panelTituloMisDatos.add(txtNombreUsuario);
        txtNombreUsuario.setBounds(45, 28, 353, 30);

        btnViewPass1.setBackground(new java.awt.Color(159, 159, 160));
        btnViewPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/no_visible_icon_1.jpg"))); // NOI18N
        btnViewPass1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewPass1.setMaximumSize(new java.awt.Dimension(77, 39));
        btnViewPass1.setMinimumSize(new java.awt.Dimension(77, 39));
        btnViewPass1.setPreferredSize(new java.awt.Dimension(77, 39));
        btnViewPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPass1PassActionPerformed(evt);
            }
        });
        panelTituloMisDatos.add(btnViewPass1);
        btnViewPass1.setBounds(399, 97, 40, 31);

        labelPassAntiguo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelPassAntiguo.setForeground(new java.awt.Color(159, 159, 160));
        labelPassAntiguo.setText("ANTIGUA CONTRASEÑA");
        panelTituloMisDatos.add(labelPassAntiguo);
        labelPassAntiguo.setBounds(45, 69, 183, 22);

        labelPassNuevo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelPassNuevo.setForeground(new java.awt.Color(159, 159, 160));
        labelPassNuevo.setText("NUEVA CONTRASEÑA");
        panelTituloMisDatos.add(labelPassNuevo);
        labelPassNuevo.setBounds(45, 138, 167, 22);

        txtPassNuevo.setBackground(new java.awt.Color(159, 159, 160));
        txtPassNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassNuevo.setMaximumSize(new java.awt.Dimension(6, 26));
        panelTituloMisDatos.add(txtPassNuevo);
        txtPassNuevo.setBounds(45, 166, 353, 30);

        btnViewPass2.setBackground(new java.awt.Color(159, 159, 160));
        btnViewPass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/no_visible_icon_1.jpg"))); // NOI18N
        btnViewPass2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewPass2.setMaximumSize(new java.awt.Dimension(77, 39));
        btnViewPass2.setMinimumSize(new java.awt.Dimension(77, 39));
        btnViewPass2.setPreferredSize(new java.awt.Dimension(77, 39));
        btnViewPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPass2PassActionPerformed(evt);
            }
        });
        panelTituloMisDatos.add(btnViewPass2);
        btnViewPass2.setBounds(399, 166, 40, 31);

        labelRepitePass.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelRepitePass.setForeground(new java.awt.Color(159, 159, 160));
        labelRepitePass.setText("REPETIR CONTRASEÑA");
        panelTituloMisDatos.add(labelRepitePass);
        labelRepitePass.setBounds(45, 207, 173, 22);

        txtRepitePass.setBackground(new java.awt.Color(159, 159, 160));
        txtRepitePass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRepitePass.setMaximumSize(new java.awt.Dimension(6, 26));
        panelTituloMisDatos.add(txtRepitePass);
        txtRepitePass.setBounds(45, 240, 353, 30);

        btnViewPass3.setBackground(new java.awt.Color(159, 159, 160));
        btnViewPass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/no_visible_icon_1.jpg"))); // NOI18N
        btnViewPass3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewPass3.setMaximumSize(new java.awt.Dimension(77, 39));
        btnViewPass3.setMinimumSize(new java.awt.Dimension(77, 39));
        btnViewPass3.setPreferredSize(new java.awt.Dimension(77, 39));
        btnViewPass3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPass3ActionPerformed(evt);
            }
        });
        panelTituloMisDatos.add(btnViewPass3);
        btnViewPass3.setBounds(399, 240, 40, 31);

        btnGuardarCambiosMisDatos.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardarCambiosMisDatos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGuardarCambiosMisDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambiosMisDatos.setText("GUARDAR CAMBIOS");
        btnGuardarCambiosMisDatos.setActionCommand("cambiarPass");
        btnGuardarCambiosMisDatos.setFocusable(false);
        panelTituloMisDatos.add(btnGuardarCambiosMisDatos);
        btnGuardarCambiosMisDatos.setBounds(109, 288, 233, 33);

        txtPassAntiguo.setBackground(new java.awt.Color(159, 159, 160));
        txtPassAntiguo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassAntiguo.setMaximumSize(new java.awt.Dimension(6, 26));
        panelTituloMisDatos.add(txtPassAntiguo);
        txtPassAntiguo.setBounds(45, 97, 353, 30);

        lablelTituloMisDatos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lablelTituloMisDatos.setForeground(new java.awt.Color(153, 153, 153));
        lablelTituloMisDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lablelTituloMisDatos.setText("MIS DATOS");

        javax.swing.GroupLayout panelMisDatosLayout = new javax.swing.GroupLayout(panelMisDatos);
        panelMisDatos.setLayout(panelMisDatosLayout);
        panelMisDatosLayout.setHorizontalGroup(
            panelMisDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMisDatosLayout.createSequentialGroup()
                .addGroup(panelMisDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTituloMisDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lablelTituloMisDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMisDatosLayout.setVerticalGroup(
            panelMisDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMisDatosLayout.createSequentialGroup()
                .addComponent(lablelTituloMisDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTituloMisDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelMisDatos);
        panelMisDatos.setBounds(220, 0, 480, 400);

        panelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelMenu.setOpaque(false);
        panelMenu.setLayout(null);

        btnMisDatos.setBackground(new java.awt.Color(51, 51, 51));
        btnMisDatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMisDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnMisDatos.setText("MIS DATOS");
        btnMisDatos.setActionCommand("misDatos");
        btnMisDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMisDatos.setFocusPainted(false);
        btnMisDatos.setFocusable(false);
        panelMenu.add(btnMisDatos);
        btnMisDatos.setBounds(2, 108, 216, 49);

        btnDireccionEnvio.setBackground(new java.awt.Color(102, 102, 102));
        btnDireccionEnvio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDireccionEnvio.setForeground(new java.awt.Color(255, 255, 255));
        btnDireccionEnvio.setText("DIRECCIÓN ENVIO");
        btnDireccionEnvio.setActionCommand("direccionEnvio");
        btnDireccionEnvio.setFocusPainted(false);
        btnDireccionEnvio.setFocusable(false);
        panelMenu.add(btnDireccionEnvio);
        btnDireccionEnvio.setBounds(2, 157, 216, 50);

        btnPedidos.setBackground(new java.awt.Color(51, 51, 51));
        btnPedidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPedidos.setForeground(new java.awt.Color(255, 255, 255));
        btnPedidos.setText("PEDIDOS");
        btnPedidos.setActionCommand("pedidos");
        btnPedidos.setFocusPainted(false);
        btnPedidos.setFocusable(false);
        panelMenu.add(btnPedidos);
        btnPedidos.setBounds(2, 207, 216, 50);

        btnVolver.setBackground(new java.awt.Color(102, 102, 102));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.setActionCommand("volver");
        btnVolver.setFocusPainted(false);
        btnVolver.setFocusable(false);
        panelMenu.add(btnVolver);
        btnVolver.setBounds(2, 337, 216, 50);

        labelMiCuenta.setBackground(new java.awt.Color(159, 159, 160));
        labelMiCuenta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMiCuenta.setForeground(new java.awt.Color(255, 255, 255));
        labelMiCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/MiCuenta.png"))); // NOI18N
        panelMenu.add(labelMiCuenta);
        labelMiCuenta.setBounds(2, 2, 216, 60);

        panelPrincipal.add(panelMenu);
        panelMenu.setBounds(0, 0, 220, 400);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/fondoCuentaCliente.png"))); // NOI18N
        panelPrincipal.add(labelFondo);
        labelFondo.setBounds(0, 0, 700, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControladorPrincipal ctrlControladorPrincipal = new ControladorPrincipal();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnViewPass3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPass3ActionPerformed
        vpas3 = Utilidades.verPass(vpas3, txtRepitePass);
    }//GEN-LAST:event_btnViewPass3ActionPerformed

    private void btnViewPass2PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPass2PassActionPerformed
        vpas2 = Utilidades.verPass(vpas2, txtPassNuevo);
    }//GEN-LAST:event_btnViewPass2PassActionPerformed

    private void btnViewPass1PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPass1PassActionPerformed
        vpas1 = Utilidades.verPass(vpas1, txtPassAntiguo);
    }//GEN-LAST:event_btnViewPass1PassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetallePedido;
    private javax.swing.JButton btnDireccionEnvio;
    private javax.swing.JButton btnGuardarCambiosDireccion;
    private javax.swing.JButton btnGuardarCambiosMisDatos;
    private javax.swing.JButton btnGuardarPdf;
    private javax.swing.JButton btnMisDatos;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnViewPass1;
    private javax.swing.JButton btnViewPass2;
    private javax.swing.JButton btnViewPass3;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboLocalidad;
    private javax.swing.JLabel labelCalle;
    private javax.swing.JLabel labelCodPostal;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLocalidad;
    private javax.swing.JLabel labelMiCuenta;
    private javax.swing.JLabel labelNombreUsuario;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelPassAntiguo;
    private javax.swing.JLabel labelPassNuevo;
    private javax.swing.JLabel labelRepitePass;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTituloDireccion;
    private javax.swing.JLabel labelTituloPedidos;
    private javax.swing.JLabel lablelTituloMisDatos;
    private javax.swing.JPanel midPanelPedidos;
    private javax.swing.JPanel panelDireccionEnvio;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMidDireccion;
    private javax.swing.JPanel panelMisDatos;
    private javax.swing.JPanel panelPedidos;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTituloDireccion;
    private javax.swing.JPanel panelTituloMisDatos;
    private javax.swing.JPanel panelTituloPedidos;
    private javax.swing.JScrollPane scrollTablaPedidos;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodPostal;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JPasswordField txtPassAntiguo;
    private javax.swing.JPasswordField txtPassNuevo;
    private javax.swing.JPasswordField txtRepitePass;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
