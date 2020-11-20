package maxpizza.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import maxpizza.controlador.ControladorPrincipal;

public class VistaCarrito extends javax.swing.JFrame {

    public VistaCarrito() {
        initComponents();
        setLocationRelativeTo(null);

        formatoCabeceraTabla();

        Image icon = new ImageIcon(getClass().getResource("/maxpizza/imagen/iconPizza.png")).getImage();
        setIconImage(icon);
    }

    private void formatoCabeceraTabla() {
        tablaCesta.getTableHeader().setBackground(new Color(102, 102, 102));
        tablaCesta.getTableHeader().setFont(new Font("Segoe UI", 1, 16));
        tablaCesta.getTableHeader().setForeground(new Color(255, 255, 255));

    }

    public JTextArea getAreaTextDireccion() {
        return AreaTextDireccion;
    }

    public void setAreaTextDireccion(JTextArea AreaTextDireccion) {
        this.AreaTextDireccion = AreaTextDireccion;
    }

    public JButton getBtnModificarDireccion() {
        return btnModificarDireccion;
    }

    public void setBtnModificarDireccion(JButton btnModificarDireccion) {
        this.btnModificarDireccion = btnModificarDireccion;
    }

    public ButtonGroup getBtnGrupo() {
        return btnGrupo;
    }

    public void setBtnGrupo(ButtonGroup btnGrupo) {
        this.btnGrupo = btnGrupo;
    }

    public JRadioButton getRadioBtnEfectivo() {
        return radioBtnEfectivo;
    }

    public void setRadioBtnEfectivo(JRadioButton radioBtnEfectivo) {
        this.radioBtnEfectivo = radioBtnEfectivo;
    }

    public JRadioButton getRadioBtnTarjeta() {
        return radioBtnTarjeta;
    }

    public void setRadioBtnTarjeta(JRadioButton radioBtnTarjeta) {
        this.radioBtnTarjeta = radioBtnTarjeta;
    }

    public JLabel getArticulos() {
        return articulos;
    }

    public void setArticulos(JLabel articulos) {
        this.articulos = articulos;
    }

    public JLabel getEnvio() {
        return envio;
    }

    public void setEnvio(JLabel envio) {
        this.envio = envio;
    }

    public JLabel getTotal() {
        return total;
    }

    public void setTotal(JLabel total) {
        this.total = total;
    }

    public JButton getBtnQuitarArticulo() {
        return btnQuitarArticulo;
    }

    public void setBtnQuitarArticulo(JButton btnQuitarArticulo) {
        this.btnQuitarArticulo = btnQuitarArticulo;
    }

    public JButton getBtnPagar() {
        return btnPagar;
    }

    public void setBtnPagar(JButton btnPagar) {
        this.btnPagar = btnPagar;
    }

    public JButton getBtnSeguirComprando() {
        return btnSeguirComprando;
    }

    public void setBtnSeguirComprando(JButton btnSeguirComprando) {
        this.btnSeguirComprando = btnSeguirComprando;
    }

    public JButton getBtnVaciarCesta() {
        return btnVaciarCesta;
    }

    public void setBtnVaciarCesta(JButton btnVaciarCesta) {
        this.btnVaciarCesta = btnVaciarCesta;
    }

    public JTable getTablaCesta() {
        return tablaCesta;
    }

    public void setTablaCesta(JTable tablaCesta) {
        this.tablaCesta = tablaCesta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        panelCesta = new javax.swing.JPanel();
        scrollTablaCesta = new javax.swing.JScrollPane();
        tablaCesta = new javax.swing.JTable();
        btnSeguirComprando = new javax.swing.JButton();
        btnVaciarCesta = new javax.swing.JButton();
        btnQuitarArticulo = new javax.swing.JButton();
        panelFinalizarCompra = new javax.swing.JPanel();
        btnPagar = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        envio = new javax.swing.JLabel();
        labelEnvio = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        labelTotal = new javax.swing.JLabel();
        labelArticulos1 = new javax.swing.JLabel();
        labelArticulos = new javax.swing.JLabel();
        articulos = new javax.swing.JLabel();
        panelTituloResumenCesta = new javax.swing.JPanel();
        labelTituloResumenCesta = new javax.swing.JLabel();
        panelDireccion = new javax.swing.JPanel();
        btnModificarDireccion = new javax.swing.JButton();
        panelTituloDireccion = new javax.swing.JPanel();
        labelTituloDireccion = new javax.swing.JLabel();
        scrollTxtDireccion = new javax.swing.JScrollPane();
        AreaTextDireccion = new javax.swing.JTextArea();
        panelFormaPago = new javax.swing.JPanel();
        panelTituloFormaPago = new javax.swing.JPanel();
        labelTituloFormaPago = new javax.swing.JLabel();
        radioBtnTarjeta = new javax.swing.JRadioButton();
        radioBtnEfectivo = new javax.swing.JRadioButton();
        labelLogo = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carrito");
        setMinimumSize(new java.awt.Dimension(800, 628));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelPrincipal.setMaximumSize(new java.awt.Dimension(700, 400));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(700, 400));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));
        panelPrincipal.setLayout(null);

        panelCesta.setBackground(new java.awt.Color(255, 255, 255));
        panelCesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        tablaCesta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaCesta.setForeground(new java.awt.Color(102, 102, 102));
        tablaCesta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ARTÍCULO", "PRECIO", "UNIDADES", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCesta.setRowHeight(20);
        tablaCesta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCesta.setShowHorizontalLines(false);
        tablaCesta.setShowVerticalLines(false);
        scrollTablaCesta.setViewportView(tablaCesta);
        if (tablaCesta.getColumnModel().getColumnCount() > 0) {
            tablaCesta.getColumnModel().getColumn(0).setResizable(false);
            tablaCesta.getColumnModel().getColumn(0).setPreferredWidth(280);
            tablaCesta.getColumnModel().getColumn(1).setResizable(false);
            tablaCesta.getColumnModel().getColumn(1).setPreferredWidth(60);
            tablaCesta.getColumnModel().getColumn(2).setResizable(false);
            tablaCesta.getColumnModel().getColumn(2).setPreferredWidth(70);
            tablaCesta.getColumnModel().getColumn(3).setResizable(false);
            tablaCesta.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        btnSeguirComprando.setBackground(new java.awt.Color(102, 102, 102));
        btnSeguirComprando.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSeguirComprando.setForeground(new java.awt.Color(255, 255, 255));
        btnSeguirComprando.setText("SEGUIR COMPRANDO");
        btnSeguirComprando.setActionCommand("seguirComprando");

        btnVaciarCesta.setBackground(new java.awt.Color(102, 102, 102));
        btnVaciarCesta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVaciarCesta.setForeground(new java.awt.Color(255, 255, 255));
        btnVaciarCesta.setText("VACIAR CESTA");
        btnVaciarCesta.setActionCommand("vaciarCesta");

        btnQuitarArticulo.setBackground(new java.awt.Color(102, 102, 102));
        btnQuitarArticulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuitarArticulo.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarArticulo.setText("QUITAR ARTÍCULO");
        btnQuitarArticulo.setActionCommand("quitarArticulo");

        javax.swing.GroupLayout panelCestaLayout = new javax.swing.GroupLayout(panelCesta);
        panelCesta.setLayout(panelCestaLayout);
        panelCestaLayout.setHorizontalGroup(
            panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCestaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVaciarCesta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnQuitarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnSeguirComprando, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollTablaCesta)
        );
        panelCestaLayout.setVerticalGroup(
            panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCestaLayout.createSequentialGroup()
                .addComponent(scrollTablaCesta, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVaciarCesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSeguirComprando, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnQuitarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panelPrincipal.add(panelCesta);
        panelCesta.setBounds(0, 0, 570, 290);

        panelFinalizarCompra.setBackground(new java.awt.Color(255, 255, 255));
        panelFinalizarCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelFinalizarCompra.setLayout(null);

        btnPagar.setBackground(new java.awt.Color(0, 102, 0));
        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("PAGAR Y FINALIZAR");
        btnPagar.setActionCommand("pagar");
        panelFinalizarCompra.add(btnPagar);
        btnPagar.setBounds(10, 230, 206, 40);

        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(102, 102, 102));
        total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total.setText("0,00€");
        panelFinalizarCompra.add(total);
        total.setBounds(80, 180, 130, 30);

        envio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        envio.setForeground(new java.awt.Color(102, 102, 102));
        envio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        envio.setText("0,00€");
        panelFinalizarCompra.add(envio);
        envio.setBounds(80, 140, 130, 30);

        labelEnvio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEnvio.setForeground(new java.awt.Color(102, 102, 102));
        labelEnvio.setText("Envío:");
        panelFinalizarCompra.add(labelEnvio);
        labelEnvio.setBounds(10, 140, 88, 30);

        separador.setBackground(new java.awt.Color(102, 102, 102));
        separador.setForeground(new java.awt.Color(102, 102, 102));
        panelFinalizarCompra.add(separador);
        separador.setBounds(10, 180, 206, 10);

        labelTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(102, 102, 102));
        labelTotal.setText("TOTAL:");
        panelFinalizarCompra.add(labelTotal);
        labelTotal.setBounds(10, 180, 88, 30);

        labelArticulos1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelArticulos1.setForeground(new java.awt.Color(102, 102, 102));
        labelArticulos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelArticulos1.setText("<html><body>ENVIO GRATIS PARA PEDIDOS<br><center>SUPERIORES A 20€</center></body></html>");
        panelFinalizarCompra.add(labelArticulos1);
        labelArticulos1.setBounds(10, 50, 210, 60);

        labelArticulos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelArticulos.setForeground(new java.awt.Color(102, 102, 102));
        labelArticulos.setText("SubTotal:");
        panelFinalizarCompra.add(labelArticulos);
        labelArticulos.setBounds(10, 110, 88, 30);

        articulos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        articulos.setForeground(new java.awt.Color(102, 102, 102));
        articulos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        articulos.setText("0,00€");
        panelFinalizarCompra.add(articulos);
        articulos.setBounds(80, 110, 130, 30);

        panelTituloResumenCesta.setBackground(new java.awt.Color(0, 102, 0));

        labelTituloResumenCesta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloResumenCesta.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloResumenCesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloResumenCesta.setText("RESUMEN DE LA CESTA");

        javax.swing.GroupLayout panelTituloResumenCestaLayout = new javax.swing.GroupLayout(panelTituloResumenCesta);
        panelTituloResumenCesta.setLayout(panelTituloResumenCestaLayout);
        panelTituloResumenCestaLayout.setHorizontalGroup(
            panelTituloResumenCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTituloResumenCesta, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        panelTituloResumenCestaLayout.setVerticalGroup(
            panelTituloResumenCestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTituloResumenCesta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelFinalizarCompra.add(panelTituloResumenCesta);
        panelTituloResumenCesta.setBounds(8, 10, 210, 40);

        panelPrincipal.add(panelFinalizarCompra);
        panelFinalizarCompra.setBounds(570, 0, 230, 290);

        panelDireccion.setBackground(new java.awt.Color(255, 255, 255));
        panelDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelDireccion.setLayout(null);

        btnModificarDireccion.setBackground(new java.awt.Color(102, 102, 102));
        btnModificarDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificarDireccion.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarDireccion.setText("MODIFICAR DIRECCIÓN");
        btnModificarDireccion.setActionCommand("modificarDireccion");
        panelDireccion.add(btnModificarDireccion);
        btnModificarDireccion.setBounds(10, 165, 240, 30);

        panelTituloDireccion.setBackground(new java.awt.Color(252, 194, 120));

        labelTituloDireccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloDireccion.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloDireccion.setText("DIRECCIÓN DE ENTREGA");

        javax.swing.GroupLayout panelTituloDireccionLayout = new javax.swing.GroupLayout(panelTituloDireccion);
        panelTituloDireccion.setLayout(panelTituloDireccionLayout);
        panelTituloDireccionLayout.setHorizontalGroup(
            panelTituloDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTituloDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        panelTituloDireccionLayout.setVerticalGroup(
            panelTituloDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloDireccionLayout.createSequentialGroup()
                .addComponent(labelTituloDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelDireccion.add(panelTituloDireccion);
        panelTituloDireccion.setBounds(1, 0, 568, 40);

        AreaTextDireccion.setEditable(false);
        AreaTextDireccion.setColumns(20);
        AreaTextDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AreaTextDireccion.setForeground(new java.awt.Color(102, 102, 102));
        AreaTextDireccion.setRows(4);
        AreaTextDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        scrollTxtDireccion.setViewportView(AreaTextDireccion);

        panelDireccion.add(scrollTxtDireccion);
        scrollTxtDireccion.setBounds(0, 40, 570, 120);

        panelPrincipal.add(panelDireccion);
        panelDireccion.setBounds(0, 290, 570, 200);

        panelFormaPago.setBackground(new java.awt.Color(255, 255, 255));
        panelFormaPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelFormaPago.setLayout(null);

        panelTituloFormaPago.setBackground(new java.awt.Color(252, 194, 120));

        labelTituloFormaPago.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloFormaPago.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloFormaPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloFormaPago.setText("FORMA DE PAGO");

        javax.swing.GroupLayout panelTituloFormaPagoLayout = new javax.swing.GroupLayout(panelTituloFormaPago);
        panelTituloFormaPago.setLayout(panelTituloFormaPagoLayout);
        panelTituloFormaPagoLayout.setHorizontalGroup(
            panelTituloFormaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloFormaPagoLayout.createSequentialGroup()
                .addComponent(labelTituloFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTituloFormaPagoLayout.setVerticalGroup(
            panelTituloFormaPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTituloFormaPago, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelFormaPago.add(panelTituloFormaPago);
        panelTituloFormaPago.setBounds(1, 0, 568, 40);

        radioBtnTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo.add(radioBtnTarjeta);
        radioBtnTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBtnTarjeta.setForeground(new java.awt.Color(102, 102, 102));
        radioBtnTarjeta.setText("TARJETA");
        radioBtnTarjeta.setActionCommand("Tarjeta");
        panelFormaPago.add(radioBtnTarjeta);
        radioBtnTarjeta.setBounds(20, 75, 230, 23);

        radioBtnEfectivo.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo.add(radioBtnEfectivo);
        radioBtnEfectivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBtnEfectivo.setForeground(new java.awt.Color(102, 102, 102));
        radioBtnEfectivo.setSelected(true);
        radioBtnEfectivo.setText("EFECTIVO");
        radioBtnEfectivo.setActionCommand("Efectivo");
        panelFormaPago.add(radioBtnEfectivo);
        radioBtnEfectivo.setBounds(20, 45, 87, 29);

        panelPrincipal.add(panelFormaPago);
        panelFormaPago.setBounds(0, 490, 570, 110);

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/logo.png"))); // NOI18N
        labelLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelPrincipal.add(labelLogo);
        labelLogo.setBounds(570, 270, 230, 330);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/fondoCarrito.png"))); // NOI18N
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControladorPrincipal ctrlPrincipal = new ControladorPrincipal();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTextDireccion;
    private javax.swing.JLabel articulos;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnModificarDireccion;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnQuitarArticulo;
    private javax.swing.JButton btnSeguirComprando;
    private javax.swing.JButton btnVaciarCesta;
    private javax.swing.JLabel envio;
    private javax.swing.JLabel labelArticulos;
    private javax.swing.JLabel labelArticulos1;
    private javax.swing.JLabel labelEnvio;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTituloDireccion;
    private javax.swing.JLabel labelTituloFormaPago;
    private javax.swing.JLabel labelTituloResumenCesta;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel panelCesta;
    private javax.swing.JPanel panelDireccion;
    private javax.swing.JPanel panelFinalizarCompra;
    private javax.swing.JPanel panelFormaPago;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTituloDireccion;
    private javax.swing.JPanel panelTituloFormaPago;
    private javax.swing.JPanel panelTituloResumenCesta;
    private javax.swing.JRadioButton radioBtnEfectivo;
    private javax.swing.JRadioButton radioBtnTarjeta;
    private javax.swing.JScrollPane scrollTablaCesta;
    private javax.swing.JScrollPane scrollTxtDireccion;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tablaCesta;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
