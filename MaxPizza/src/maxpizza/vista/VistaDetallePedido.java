package maxpizza.vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import maxpizza.controlador.ControladorCuentaCliente;

public class VistaDetallePedido extends javax.swing.JFrame {

    public VistaDetallePedido() {
        initComponents();
        formatoCabeceraTabla();

        setLocationRelativeTo(null);
    }

    private void formatoCabeceraTabla() {
        tablaDetallePedido.getTableHeader().setBackground(new Color(102, 102, 102));
        tablaDetallePedido.getTableHeader().setFont(new Font("Segoe UI", 1, 14));
        tablaDetallePedido.getTableHeader().setForeground(new Color(255, 255, 255));
    }

    public JButton getBtnListaPDF() {
        return btnListaPDF;
    }

    public void setBtnListaPDF(JButton btnListaPDF) {
        this.btnListaPDF = btnListaPDF;
    }

    public JLabel getLabelTotal() {
        return labelTotal;
    }

    public void setLabelTotal(JLabel labelTotal) {
        this.labelTotal = labelTotal;
    }

    public JLabel getLabelEnvio() {
        return labelEnvio;
    }

    public void setLabelEnvio(JLabel labelEnvio) {
        this.labelEnvio = labelEnvio;
    }

    public JLabel getLabelFecha() {
        return labelFecha;
    }

    public void setLabelFecha(JLabel labelFecha) {
        this.labelFecha = labelFecha;
    }

    public JLabel getLabelNumeroPedido() {
        return labelNumeroPedido;
    }

    public void setLabelNumeroPedido(JLabel labelNumeroPedido) {
        this.labelNumeroPedido = labelNumeroPedido;
    }

    public JLabel getLabelSubTotal() {
        return labelSubTotal;
    }

    public void setLabelSubTotal(JLabel labelSubTotal) {
        this.labelSubTotal = labelSubTotal;
    }

    public JTable getTablaDetallePedido() {
        return tablaDetallePedido;
    }

    public void setTablaDetallePedido(JTable tablaDetallePedido) {
        this.tablaDetallePedido = tablaDetallePedido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelTituloDetallePedido = new javax.swing.JLabel();
        labelTxtPedido = new javax.swing.JLabel();
        labelNumeroPedido = new javax.swing.JLabel();
        labelTxtFecha = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelTxtSubTotal = new javax.swing.JLabel();
        labelTxtEnvio = new javax.swing.JLabel();
        labelTxtTotal = new javax.swing.JLabel();
        labelSubTotal = new javax.swing.JLabel();
        labelEnvio = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        scrollDetallePedido = new javax.swing.JScrollPane();
        tablaDetallePedido = new javax.swing.JTable();
        btnListaPDF = new javax.swing.JButton();
        labelFondoDetallePedido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DETALLE PEDIDO");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(600, 400));
        panelPrincipal.setLayout(null);

        labelTituloDetallePedido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTituloDetallePedido.setForeground(new java.awt.Color(204, 204, 204));
        labelTituloDetallePedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloDetallePedido.setText("DETALLE PEDIDO");
        panelPrincipal.add(labelTituloDetallePedido);
        labelTituloDetallePedido.setBounds(0, 0, 600, 40);

        labelTxtPedido.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelTxtPedido.setForeground(new java.awt.Color(204, 204, 204));
        labelTxtPedido.setText("Nº de pedido:");
        panelPrincipal.add(labelTxtPedido);
        labelTxtPedido.setBounds(30, 50, 110, 30);

        labelNumeroPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNumeroPedido.setForeground(new java.awt.Color(204, 204, 204));
        panelPrincipal.add(labelNumeroPedido);
        labelNumeroPedido.setBounds(140, 50, 70, 30);

        labelTxtFecha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelTxtFecha.setForeground(new java.awt.Color(204, 204, 204));
        labelTxtFecha.setText("Fecha:");
        panelPrincipal.add(labelTxtFecha);
        labelTxtFecha.setBounds(440, 50, 50, 30);

        labelFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(204, 204, 204));
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelPrincipal.add(labelFecha);
        labelFecha.setBounds(490, 50, 80, 30);

        labelTxtSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTxtSubTotal.setForeground(new java.awt.Color(204, 204, 204));
        labelTxtSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTxtSubTotal.setText("SubTotal:");
        panelPrincipal.add(labelTxtSubTotal);
        labelTxtSubTotal.setBounds(360, 275, 70, 30);

        labelTxtEnvio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTxtEnvio.setForeground(new java.awt.Color(204, 204, 204));
        labelTxtEnvio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTxtEnvio.setText("Envío:");
        panelPrincipal.add(labelTxtEnvio);
        labelTxtEnvio.setBounds(380, 305, 50, 30);

        labelTxtTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTxtTotal.setForeground(new java.awt.Color(204, 204, 204));
        labelTxtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTxtTotal.setText("Total:");
        panelPrincipal.add(labelTxtTotal);
        labelTxtTotal.setBounds(380, 335, 50, 30);

        labelSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSubTotal.setForeground(new java.awt.Color(204, 204, 204));
        labelSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelPrincipal.add(labelSubTotal);
        labelSubTotal.setBounds(460, 275, 100, 30);

        labelEnvio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEnvio.setForeground(new java.awt.Color(204, 204, 204));
        labelEnvio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelPrincipal.add(labelEnvio);
        labelEnvio.setBounds(460, 305, 100, 30);

        labelTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(204, 204, 204));
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelPrincipal.add(labelTotal);
        labelTotal.setBounds(460, 335, 100, 30);

        tablaDetallePedido.setBackground(new java.awt.Color(204, 204, 204));
        tablaDetallePedido.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablaDetallePedido.setForeground(new java.awt.Color(51, 51, 51));
        tablaDetallePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ARTÍCULOS", "PRECIO", "CANTIDAD", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDetallePedido.setRowHeight(20);
        tablaDetallePedido.setShowHorizontalLines(false);
        tablaDetallePedido.setShowVerticalLines(false);
        scrollDetallePedido.setViewportView(tablaDetallePedido);

        panelPrincipal.add(scrollDetallePedido);
        scrollDetallePedido.setBounds(10, 100, 570, 170);

        btnListaPDF.setBackground(new java.awt.Color(102, 102, 102));
        btnListaPDF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListaPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnListaPDF.setText("Impresión Pedido PDF");
        btnListaPDF.setActionCommand("pedidoPdf");
        panelPrincipal.add(btnListaPDF);
        btnListaPDF.setBounds(20, 310, 220, 30);

        labelFondoDetallePedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/fondoCuentaCliente.png"))); // NOI18N
        panelPrincipal.add(labelFondoDetallePedido);
        labelFondoDetallePedido.setBounds(-10, 0, 610, 400);

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
        ControladorCuentaCliente ctrlCuentaCliente = new ControladorCuentaCliente("pedidos");
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListaPDF;
    private javax.swing.JLabel labelEnvio;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFondoDetallePedido;
    private javax.swing.JLabel labelNumeroPedido;
    private javax.swing.JLabel labelSubTotal;
    private javax.swing.JLabel labelTituloDetallePedido;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTxtEnvio;
    private javax.swing.JLabel labelTxtFecha;
    private javax.swing.JLabel labelTxtPedido;
    private javax.swing.JLabel labelTxtSubTotal;
    private javax.swing.JLabel labelTxtTotal;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollDetallePedido;
    private javax.swing.JTable tablaDetallePedido;
    // End of variables declaration//GEN-END:variables

    private static class tabla {

        public tabla() {
        }
    }

}
