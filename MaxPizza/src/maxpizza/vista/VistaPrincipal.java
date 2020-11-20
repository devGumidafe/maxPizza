package maxpizza.vista;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import maxpizza.controlador.ControladorCarrito;
import maxpizza.controlador.ControladorCuentaCliente;
import maxpizza.controlador.ControladorLogin;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);

        Image icon = new ImageIcon(getClass().getResource("/maxpizza/imagen/iconPizza.png")).getImage();
        setIconImage(icon);
    }

    public JButton getBtnPanAjo() {
        return btnPanAjo;
    }

    public void setBtnPanAjo(JButton btnPanAjo) {
        this.btnPanAjo = btnPanAjo;
    }

    public JComboBox<String> getComboPanAjo() {
        return comboPanAjo;
    }

    public void setComboPanAjo(JComboBox<String> comboPanAjo) {
        this.comboPanAjo = comboPanAjo;
    }

    public JLabel getLabelCantidadCarrito() {
        return labelCantidadCarrito;
    }

    public void setLabelCantidadCarrito(JLabel labelCantidadCarrito) {
        this.labelCantidadCarrito = labelCantidadCarrito;
    }

    public JButton getBtnCuatroQuesos() {
        return btnCuatroQuesos;
    }

    public void setBtnCuatroQuesos(JButton btnCuatroQuesos) {
        this.btnCuatroQuesos = btnCuatroQuesos;
    }

    public JButton getBtnFanta() {
        return btnFanta;
    }

    public void setBtnFanta(JButton btnFanta) {
        this.btnFanta = btnFanta;
    }

    public JButton getBtnHawaiana() {
        return btnHawaiana;
    }

    public void setBtnHawaiana(JButton btnHawaiana) {
        this.btnHawaiana = btnHawaiana;
    }

    public JButton getBtnPeperoni() {
        return btnPeperoni;
    }

    public void setBtnPeperoni(JButton btnPeperoni) {
        this.btnPeperoni = btnPeperoni;
    }

    public JComboBox<String> getComboFlorentina() {
        return comboFlorentina;
    }

    public void setComboFlorentina(JComboBox<String> comboFlorentina) {
        this.comboFlorentina = comboFlorentina;
    }

    public JButton getBtnAgua() {
        return btnAgua;
    }

    public void setBtnAgua(JButton btnAgua) {
        this.btnAgua = btnAgua;
    }

    public JButton getBtnBacon() {
        return btnBacon;
    }

    public void setBtnBacon(JButton btnBacon) {
        this.btnBacon = btnBacon;
    }

    public JButton getBtnBarbacoa() {
        return btnBarbacoa;
    }

    public void setBtnBarbacoa(JButton btnBarbacoa) {
        this.btnBarbacoa = btnBarbacoa;
    }

    public JButton getBtnCarbonara() {
        return btnCarbonara;
    }

    public void setBtnCarbonara(JButton btnCarbonara) {
        this.btnCarbonara = btnCarbonara;
    }

    public JButton getBtnCerveza() {
        return btnCerveza;
    }

    public void setBtnCerveza(JButton btnCerveza) {
        this.btnCerveza = btnCerveza;
    }

    public JButton getBtnCola() {
        return btnCola;
    }

    public void setBtnCola(JButton btnCola) {
        this.btnCola = btnCola;
    }

    public JButton getBtnEspecial() {
        return btnEspecial;
    }

    public void setBtnEspecial(JButton btnEspecial) {
        this.btnEspecial = btnEspecial;
    }

    public JButton getBtnFlorentina() {
        return btnFlorentina;
    }

    public void setBtnFlorentina(JButton btnFlorentina) {
        this.btnFlorentina = btnFlorentina;
    }

    public JButton getBtnSprite() {
        return btnSprite;
    }

    public void setBtnSprite(JButton btnSprite) {
        this.btnSprite = btnSprite;
    }

    public JButton getBtnSupreme() {
        return btnSupreme;
    }

    public void setBtnSupreme(JButton btnSupreme) {
        this.btnSupreme = btnSupreme;
    }

    public JComboBox<String> getComboBacon() {
        return comboBacon;
    }

    public void setComboBacon(JComboBox<String> comboBacon) {
        this.comboBacon = comboBacon;
    }

    public JComboBox<String> getComboBarbacoa() {
        return comboBarbacoa;
    }

    public void setComboBarbacoa(JComboBox<String> comboBarbacoa) {
        this.comboBarbacoa = comboBarbacoa;
    }

    public JComboBox<String> getComboCarbonara() {
        return comboCarbonara;
    }

    public void setComboCarbonara(JComboBox<String> comboCarbonara) {
        this.comboCarbonara = comboCarbonara;
    }

    public JComboBox<String> getComboCuatroQuesos() {
        return comboCuatroQuesos;
    }

    public void setComboCuatroQuesos(JComboBox<String> comboCuatroQuesos) {
        this.comboCuatroQuesos = comboCuatroQuesos;
    }

    public JComboBox<String> getComboEspecial() {
        return comboEspecial;
    }

    public void setComboEspecial(JComboBox<String> comboEspecial) {
        this.comboEspecial = comboEspecial;
    }

    public JComboBox<String> getComboHawaiana() {
        return comboHawaiana;
    }

    public void setComboHawaiana(JComboBox<String> comboHawaiana) {
        this.comboHawaiana = comboHawaiana;
    }

    public JComboBox<String> getComboPeperoni() {
        return comboPeperoni;
    }

    public void setComboPeperoni(JComboBox<String> comboPeperoni) {
        this.comboPeperoni = comboPeperoni;
    }

    public JComboBox<String> getComboSupreme() {
        return comboSupreme;
    }

    public void setComboSupreme(JComboBox<String> comboSupreme) {
        this.comboSupreme = comboSupreme;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelCuatroQuesos = new javax.swing.JPanel();
        labelFotoCuatroQuesos = new javax.swing.JLabel();
        labelTituloCuatroQuesos = new javax.swing.JLabel();
        labelDescripcionCuatroQuesos = new javax.swing.JLabel();
        comboCuatroQuesos = new javax.swing.JComboBox<>();
        btnCuatroQuesos = new javax.swing.JButton();
        panelCarbonara = new javax.swing.JPanel();
        labelFotoCabonara = new javax.swing.JLabel();
        labelTituloCarbonara = new javax.swing.JLabel();
        labelDescripcionCarbonara = new javax.swing.JLabel();
        comboCarbonara = new javax.swing.JComboBox<>();
        btnCarbonara = new javax.swing.JButton();
        panelFlorentina = new javax.swing.JPanel();
        labelFotoFlorentina = new javax.swing.JLabel();
        labelTituloFlorentina = new javax.swing.JLabel();
        labelDescripcionForentina = new javax.swing.JLabel();
        comboFlorentina = new javax.swing.JComboBox<>();
        btnFlorentina = new javax.swing.JButton();
        panelHawaiana = new javax.swing.JPanel();
        labelFotoHawaiana = new javax.swing.JLabel();
        labelTituloHawaiana = new javax.swing.JLabel();
        labelDescripcionHawaiana = new javax.swing.JLabel();
        comboHawaiana = new javax.swing.JComboBox<>();
        btnHawaiana = new javax.swing.JButton();
        panelSupreme = new javax.swing.JPanel();
        labelFotoSupreme = new javax.swing.JLabel();
        labelTituloSupreme = new javax.swing.JLabel();
        labelDescripcionSupreme = new javax.swing.JLabel();
        comboSupreme = new javax.swing.JComboBox<>();
        btnSupreme = new javax.swing.JButton();
        panelEspecial = new javax.swing.JPanel();
        labelFotoEspecial = new javax.swing.JLabel();
        labelTituloEspecial = new javax.swing.JLabel();
        labelDescripcionEspecial = new javax.swing.JLabel();
        comboEspecial = new javax.swing.JComboBox<>();
        btnEspecial = new javax.swing.JButton();
        panelBarbacoa = new javax.swing.JPanel();
        labelFotoBarbacoa = new javax.swing.JLabel();
        labelTituloBarbacoa = new javax.swing.JLabel();
        labelDescripcionBarbacoa = new javax.swing.JLabel();
        comboBarbacoa = new javax.swing.JComboBox<>();
        btnBarbacoa = new javax.swing.JButton();
        panelBacon = new javax.swing.JPanel();
        labelFotoBacon = new javax.swing.JLabel();
        labelTituloBacon = new javax.swing.JLabel();
        labelDescripcionBacon = new javax.swing.JLabel();
        comboBacon = new javax.swing.JComboBox<>();
        btnBacon = new javax.swing.JButton();
        panelPeperoni = new javax.swing.JPanel();
        labelFotoPeperoni = new javax.swing.JLabel();
        labelTituloPeperoni = new javax.swing.JLabel();
        labelDescripcionPeperoni = new javax.swing.JLabel();
        comboPeperoni = new javax.swing.JComboBox<>();
        btnPeperoni = new javax.swing.JButton();
        panelPan = new javax.swing.JPanel();
        labelFotoPan = new javax.swing.JLabel();
        labelTituloPan = new javax.swing.JLabel();
        labelDescripcionPan = new javax.swing.JLabel();
        comboPanAjo = new javax.swing.JComboBox<>();
        btnPanAjo = new javax.swing.JButton();
        panelAgua = new javax.swing.JPanel();
        labelFotoAgua = new javax.swing.JLabel();
        labelTituloAgua = new javax.swing.JLabel();
        btnAgua = new javax.swing.JButton();
        panelCerveza = new javax.swing.JPanel();
        labelFotoCerveza = new javax.swing.JLabel();
        labelTituloCerveza = new javax.swing.JLabel();
        btnCerveza = new javax.swing.JButton();
        panelSprite = new javax.swing.JPanel();
        labelFotoSprite = new javax.swing.JLabel();
        labelTituloSprite = new javax.swing.JLabel();
        btnSprite = new javax.swing.JButton();
        panelCola = new javax.swing.JPanel();
        labelFotoCola = new javax.swing.JLabel();
        labelTituloCola = new javax.swing.JLabel();
        btnCola = new javax.swing.JButton();
        panelFanta = new javax.swing.JPanel();
        labelFotoFanta = new javax.swing.JLabel();
        labelTituloFanta = new javax.swing.JLabel();
        btnFanta = new javax.swing.JButton();
        labelCantidadCarrito = new javax.swing.JLabel();
        labelCarrito = new javax.swing.JLabel();
        labelMiCuenta = new javax.swing.JLabel();
        textoMiCuenta = new javax.swing.JLabel();
        textoCarrito = new javax.swing.JLabel();
        labelDesconectar = new javax.swing.JLabel();
        textoDesconectar = new javax.swing.JLabel();
        fondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PÁGINA PRINCIPAL");
        setMaximumSize(new java.awt.Dimension(1280, 1024));
        setMinimumSize(new java.awt.Dimension(1280, 1024));
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setMaximumSize(new java.awt.Dimension(1280, 1024));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1280, 1024));
        panelPrincipal.setLayout(null);

        panelCuatroQuesos.setBackground(new java.awt.Color(255, 255, 255));
        panelCuatroQuesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelCuatroQuesos.setForeground(new java.awt.Color(159, 159, 160));
        panelCuatroQuesos.setMinimumSize(new java.awt.Dimension(200, 150));
        panelCuatroQuesos.setLayout(null);

        labelFotoCuatroQuesos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoCuatroQuesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/pizzas/cuatroQuesos.png"))); // NOI18N
        panelCuatroQuesos.add(labelFotoCuatroQuesos);
        labelFotoCuatroQuesos.setBounds(9, 11, 220, 100);

        labelTituloCuatroQuesos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloCuatroQuesos.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloCuatroQuesos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloCuatroQuesos.setText("Cuatro Quesos");
        panelCuatroQuesos.add(labelTituloCuatroQuesos);
        labelTituloCuatroQuesos.setBounds(11, 110, 220, 36);

        labelDescripcionCuatroQuesos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcionCuatroQuesos.setForeground(new java.awt.Color(159, 159, 160));
        labelDescripcionCuatroQuesos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcionCuatroQuesos.setText("<html><body>Mezcla de 4 quesos: mozzarella,<br> queso azul, cheddar y emmental.</body></html>");
        panelCuatroQuesos.add(labelDescripcionCuatroQuesos);
        labelDescripcionCuatroQuesos.setBounds(10, 150, 228, 40);

        comboCuatroQuesos.setBackground(new java.awt.Color(102, 102, 102));
        comboCuatroQuesos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboCuatroQuesos.setForeground(new java.awt.Color(255, 255, 255));
        comboCuatroQuesos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mediana 9€", "Familiar 16€" }));
        panelCuatroQuesos.add(comboCuatroQuesos);
        comboCuatroQuesos.setBounds(10, 200, 220, 30);

        btnCuatroQuesos.setBackground(new java.awt.Color(0, 102, 0));
        btnCuatroQuesos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCuatroQuesos.setForeground(new java.awt.Color(255, 255, 255));
        btnCuatroQuesos.setText("AÑADIR");
        btnCuatroQuesos.setActionCommand("cuatroQuesos");
        panelCuatroQuesos.add(btnCuatroQuesos);
        btnCuatroQuesos.setBounds(10, 250, 220, 30);

        panelPrincipal.add(panelCuatroQuesos);
        panelCuatroQuesos.setBounds(20, 90, 240, 290);

        panelCarbonara.setBackground(new java.awt.Color(255, 255, 255));
        panelCarbonara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelCarbonara.setForeground(new java.awt.Color(159, 159, 160));
        panelCarbonara.setMinimumSize(new java.awt.Dimension(200, 150));
        panelCarbonara.setLayout(null);

        labelFotoCabonara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoCabonara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/pizzas/carbonara.png"))); // NOI18N
        panelCarbonara.add(labelFotoCabonara);
        labelFotoCabonara.setBounds(9, 11, 220, 100);

        labelTituloCarbonara.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloCarbonara.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloCarbonara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloCarbonara.setText("Carbonara");
        panelCarbonara.add(labelTituloCarbonara);
        labelTituloCarbonara.setBounds(11, 110, 220, 36);

        labelDescripcionCarbonara.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcionCarbonara.setForeground(new java.awt.Color(159, 159, 160));
        labelDescripcionCarbonara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcionCarbonara.setText("<html><body>Salsa carbonara, jamón York, <br> champiñones y cebolla roja.</body></html>");
        panelCarbonara.add(labelDescripcionCarbonara);
        labelDescripcionCarbonara.setBounds(10, 150, 228, 40);

        comboCarbonara.setBackground(new java.awt.Color(102, 102, 102));
        comboCarbonara.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboCarbonara.setForeground(new java.awt.Color(255, 255, 255));
        comboCarbonara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mediana 10€", "Familiar 18€" }));
        panelCarbonara.add(comboCarbonara);
        comboCarbonara.setBounds(10, 200, 220, 30);

        btnCarbonara.setBackground(new java.awt.Color(0, 102, 0));
        btnCarbonara.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarbonara.setForeground(new java.awt.Color(255, 255, 255));
        btnCarbonara.setText("AÑADIR");
        btnCarbonara.setActionCommand("carbonara");
        panelCarbonara.add(btnCarbonara);
        btnCarbonara.setBounds(10, 250, 220, 30);

        panelPrincipal.add(panelCarbonara);
        panelCarbonara.setBounds(270, 90, 240, 290);

        panelFlorentina.setBackground(new java.awt.Color(255, 255, 255));
        panelFlorentina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelFlorentina.setForeground(new java.awt.Color(159, 159, 160));
        panelFlorentina.setMinimumSize(new java.awt.Dimension(200, 150));
        panelFlorentina.setLayout(null);

        labelFotoFlorentina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoFlorentina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/pizzas/florentina.png"))); // NOI18N
        panelFlorentina.add(labelFotoFlorentina);
        labelFotoFlorentina.setBounds(9, 11, 220, 100);

        labelTituloFlorentina.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloFlorentina.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloFlorentina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloFlorentina.setText("Florentina");
        panelFlorentina.add(labelTituloFlorentina);
        labelTituloFlorentina.setBounds(11, 110, 220, 36);

        labelDescripcionForentina.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcionForentina.setForeground(new java.awt.Color(159, 159, 160));
        String text="<html><body>Salsa carbonara,rúcula<br>y queso de rulo.</body></html>";
        labelDescripcionForentina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcionForentina.setText(text);
        panelFlorentina.add(labelDescripcionForentina);
        labelDescripcionForentina.setBounds(10, 150, 228, 40);

        comboFlorentina.setBackground(new java.awt.Color(102, 102, 102));
        comboFlorentina.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboFlorentina.setForeground(new java.awt.Color(255, 255, 255));
        comboFlorentina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mediana 12€", "Familiar 18€" }));
        panelFlorentina.add(comboFlorentina);
        comboFlorentina.setBounds(10, 200, 220, 30);

        btnFlorentina.setBackground(new java.awt.Color(0, 102, 0));
        btnFlorentina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFlorentina.setForeground(new java.awt.Color(255, 255, 255));
        btnFlorentina.setText("AÑADIR");
        btnFlorentina.setActionCommand("florentina");
        panelFlorentina.add(btnFlorentina);
        btnFlorentina.setBounds(10, 250, 220, 30);

        panelPrincipal.add(panelFlorentina);
        panelFlorentina.setBounds(520, 90, 240, 290);

        panelHawaiana.setBackground(new java.awt.Color(255, 255, 255));
        panelHawaiana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelHawaiana.setForeground(new java.awt.Color(159, 159, 160));
        panelHawaiana.setMinimumSize(new java.awt.Dimension(200, 150));
        panelHawaiana.setLayout(null);

        labelFotoHawaiana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoHawaiana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/pizzas/hawaiana.png"))); // NOI18N
        panelHawaiana.add(labelFotoHawaiana);
        labelFotoHawaiana.setBounds(9, 11, 220, 100);

        labelTituloHawaiana.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloHawaiana.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloHawaiana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloHawaiana.setText("Hawaiana");
        panelHawaiana.add(labelTituloHawaiana);
        labelTituloHawaiana.setBounds(11, 110, 220, 36);

        labelDescripcionHawaiana.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcionHawaiana.setForeground(new java.awt.Color(159, 159, 160));
        labelDescripcionHawaiana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcionHawaiana.setText("<html><body>Doble jamón, doble de piña<br> y extra de mozzarella.</body></html>");
        panelHawaiana.add(labelDescripcionHawaiana);
        labelDescripcionHawaiana.setBounds(10, 150, 228, 40);

        comboHawaiana.setBackground(new java.awt.Color(102, 102, 102));
        comboHawaiana.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboHawaiana.setForeground(new java.awt.Color(255, 255, 255));
        comboHawaiana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mediana 14€", "Familiar 20€" }));
        panelHawaiana.add(comboHawaiana);
        comboHawaiana.setBounds(10, 200, 220, 30);

        btnHawaiana.setBackground(new java.awt.Color(0, 102, 0));
        btnHawaiana.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHawaiana.setForeground(new java.awt.Color(255, 255, 255));
        btnHawaiana.setText("AÑADIR");
        btnHawaiana.setActionCommand("hawaiana");
        panelHawaiana.add(btnHawaiana);
        btnHawaiana.setBounds(10, 250, 220, 30);

        panelPrincipal.add(panelHawaiana);
        panelHawaiana.setBounds(770, 90, 240, 290);

        panelSupreme.setBackground(new java.awt.Color(255, 255, 255));
        panelSupreme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelSupreme.setForeground(new java.awt.Color(159, 159, 160));
        panelSupreme.setMinimumSize(new java.awt.Dimension(200, 150));
        panelSupreme.setLayout(null);

        labelFotoSupreme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoSupreme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/pizzas/supreme.png"))); // NOI18N
        panelSupreme.add(labelFotoSupreme);
        labelFotoSupreme.setBounds(9, 11, 220, 100);

        labelTituloSupreme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloSupreme.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloSupreme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloSupreme.setText("Supreme");
        panelSupreme.add(labelTituloSupreme);
        labelTituloSupreme.setBounds(11, 110, 220, 36);

        labelDescripcionSupreme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcionSupreme.setForeground(new java.awt.Color(159, 159, 160));
        labelDescripcionSupreme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcionSupreme.setText("<html><body>Mozzarella,carne,pepperoni,cebolla,<br>pimiento y champiñones.</body></html>");
        panelSupreme.add(labelDescripcionSupreme);
        labelDescripcionSupreme.setBounds(10, 150, 228, 40);

        comboSupreme.setBackground(new java.awt.Color(102, 102, 102));
        comboSupreme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboSupreme.setForeground(new java.awt.Color(255, 255, 255));
        comboSupreme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mediana 16€", "Familiar 22€" }));
        panelSupreme.add(comboSupreme);
        comboSupreme.setBounds(10, 200, 220, 30);

        btnSupreme.setBackground(new java.awt.Color(0, 102, 0));
        btnSupreme.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSupreme.setForeground(new java.awt.Color(255, 255, 255));
        btnSupreme.setText("AÑADIR");
        btnSupreme.setActionCommand("supreme");
        panelSupreme.add(btnSupreme);
        btnSupreme.setBounds(10, 250, 220, 30);

        panelPrincipal.add(panelSupreme);
        panelSupreme.setBounds(1020, 90, 240, 290);

        panelEspecial.setBackground(new java.awt.Color(255, 255, 255));
        panelEspecial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelEspecial.setForeground(new java.awt.Color(159, 159, 160));
        panelEspecial.setMinimumSize(new java.awt.Dimension(200, 150));
        panelEspecial.setLayout(null);

        labelFotoEspecial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/pizzas/especial.png"))); // NOI18N
        panelEspecial.add(labelFotoEspecial);
        labelFotoEspecial.setBounds(9, 11, 220, 100);

        labelTituloEspecial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloEspecial.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloEspecial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloEspecial.setText("Especial de la Casa");
        panelEspecial.add(labelTituloEspecial);
        labelTituloEspecial.setBounds(11, 110, 220, 36);

        labelDescripcionEspecial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcionEspecial.setForeground(new java.awt.Color(159, 159, 160));
        labelDescripcionEspecial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcionEspecial.setText("<html><body>Tomate,orégano,mozzarella,<br>bacon y carne.</body></html>");
        panelEspecial.add(labelDescripcionEspecial);
        labelDescripcionEspecial.setBounds(10, 150, 228, 40);

        comboEspecial.setBackground(new java.awt.Color(102, 102, 102));
        comboEspecial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboEspecial.setForeground(new java.awt.Color(255, 255, 255));
        comboEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mediana 18€", "Familiar 28€" }));
        panelEspecial.add(comboEspecial);
        comboEspecial.setBounds(10, 200, 220, 30);

        btnEspecial.setBackground(new java.awt.Color(0, 102, 0));
        btnEspecial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEspecial.setForeground(new java.awt.Color(255, 255, 255));
        btnEspecial.setText("AÑADIR");
        btnEspecial.setActionCommand("especial");
        panelEspecial.add(btnEspecial);
        btnEspecial.setBounds(10, 250, 220, 30);

        panelPrincipal.add(panelEspecial);
        panelEspecial.setBounds(20, 390, 240, 290);

        panelBarbacoa.setBackground(new java.awt.Color(255, 255, 255));
        panelBarbacoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelBarbacoa.setForeground(new java.awt.Color(159, 159, 160));
        panelBarbacoa.setMinimumSize(new java.awt.Dimension(200, 150));
        panelBarbacoa.setLayout(null);

        labelFotoBarbacoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoBarbacoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/pizzas/barbacoa.png"))); // NOI18N
        panelBarbacoa.add(labelFotoBarbacoa);
        labelFotoBarbacoa.setBounds(9, 11, 220, 100);

        labelTituloBarbacoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloBarbacoa.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloBarbacoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloBarbacoa.setText("Barbacoa");
        panelBarbacoa.add(labelTituloBarbacoa);
        labelTituloBarbacoa.setBounds(11, 110, 220, 36);

        labelDescripcionBarbacoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcionBarbacoa.setForeground(new java.awt.Color(159, 159, 160));
        labelDescripcionBarbacoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcionBarbacoa.setText("<html><body>Salsa barbacoa, carne, cebolla roja,<br> bacon y maíz.</body></html>");
        panelBarbacoa.add(labelDescripcionBarbacoa);
        labelDescripcionBarbacoa.setBounds(10, 150, 228, 40);

        comboBarbacoa.setBackground(new java.awt.Color(102, 102, 102));
        comboBarbacoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBarbacoa.setForeground(new java.awt.Color(255, 255, 255));
        comboBarbacoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mediana 14€", "Familiar 20€" }));
        panelBarbacoa.add(comboBarbacoa);
        comboBarbacoa.setBounds(10, 200, 220, 30);

        btnBarbacoa.setBackground(new java.awt.Color(0, 102, 0));
        btnBarbacoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBarbacoa.setForeground(new java.awt.Color(255, 255, 255));
        btnBarbacoa.setText("AÑADIR");
        btnBarbacoa.setActionCommand("barbacoa");
        panelBarbacoa.add(btnBarbacoa);
        btnBarbacoa.setBounds(10, 250, 220, 30);

        panelPrincipal.add(panelBarbacoa);
        panelBarbacoa.setBounds(270, 390, 240, 290);

        panelBacon.setBackground(new java.awt.Color(255, 255, 255));
        panelBacon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelBacon.setForeground(new java.awt.Color(159, 159, 160));
        panelBacon.setMinimumSize(new java.awt.Dimension(200, 150));
        panelBacon.setLayout(null);

        labelFotoBacon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoBacon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/pizzas/bacon.png"))); // NOI18N
        panelBacon.add(labelFotoBacon);
        labelFotoBacon.setBounds(9, 11, 220, 100);

        labelTituloBacon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloBacon.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloBacon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloBacon.setText("Bacón");
        panelBacon.add(labelTituloBacon);
        labelTituloBacon.setBounds(11, 110, 220, 36);

        labelDescripcionBacon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcionBacon.setForeground(new java.awt.Color(159, 159, 160));
        labelDescripcionBacon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcionBacon.setText("<html><body>Mozzarella, extra de bacón,<br>barbacoa y cebolla roja.</body></html>");
        panelBacon.add(labelDescripcionBacon);
        labelDescripcionBacon.setBounds(10, 150, 228, 40);

        comboBacon.setBackground(new java.awt.Color(102, 102, 102));
        comboBacon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBacon.setForeground(new java.awt.Color(255, 255, 255));
        comboBacon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mediana 12€", "Familiar 18€" }));
        panelBacon.add(comboBacon);
        comboBacon.setBounds(10, 200, 220, 30);

        btnBacon.setBackground(new java.awt.Color(0, 102, 0));
        btnBacon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBacon.setForeground(new java.awt.Color(255, 255, 255));
        btnBacon.setText("AÑADIR");
        btnBacon.setActionCommand("bacon");
        panelBacon.add(btnBacon);
        btnBacon.setBounds(10, 250, 220, 30);

        panelPrincipal.add(panelBacon);
        panelBacon.setBounds(520, 390, 240, 290);

        panelPeperoni.setBackground(new java.awt.Color(255, 255, 255));
        panelPeperoni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelPeperoni.setForeground(new java.awt.Color(159, 159, 160));
        panelPeperoni.setMinimumSize(new java.awt.Dimension(200, 150));
        panelPeperoni.setLayout(null);

        labelFotoPeperoni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoPeperoni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/pizzas/peperoni.png"))); // NOI18N
        panelPeperoni.add(labelFotoPeperoni);
        labelFotoPeperoni.setBounds(9, 11, 220, 100);

        labelTituloPeperoni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloPeperoni.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloPeperoni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloPeperoni.setText("Peperoni");
        panelPeperoni.add(labelTituloPeperoni);
        labelTituloPeperoni.setBounds(11, 110, 220, 36);

        labelDescripcionPeperoni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcionPeperoni.setForeground(new java.awt.Color(159, 159, 160));
        labelDescripcionPeperoni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcionPeperoni.setText("<html><body>Salsa de tomate, doble de mozzarella<br> y doble de pepperoni.</body></html>");
        panelPeperoni.add(labelDescripcionPeperoni);
        labelDescripcionPeperoni.setBounds(10, 150, 228, 40);

        comboPeperoni.setBackground(new java.awt.Color(102, 102, 102));
        comboPeperoni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboPeperoni.setForeground(new java.awt.Color(255, 255, 255));
        comboPeperoni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mediana 10€", "Familiar 15€" }));
        panelPeperoni.add(comboPeperoni);
        comboPeperoni.setBounds(10, 200, 220, 30);

        btnPeperoni.setBackground(new java.awt.Color(0, 102, 0));
        btnPeperoni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPeperoni.setForeground(new java.awt.Color(255, 255, 255));
        btnPeperoni.setText("AÑADIR");
        btnPeperoni.setActionCommand("peperoni");
        panelPeperoni.add(btnPeperoni);
        btnPeperoni.setBounds(10, 250, 220, 30);

        panelPrincipal.add(panelPeperoni);
        panelPeperoni.setBounds(770, 390, 240, 290);

        panelPan.setBackground(new java.awt.Color(255, 255, 255));
        panelPan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelPan.setForeground(new java.awt.Color(159, 159, 160));
        panelPan.setMinimumSize(new java.awt.Dimension(200, 150));
        panelPan.setLayout(null);

        labelFotoPan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/panAjo.png"))); // NOI18N
        panelPan.add(labelFotoPan);
        labelFotoPan.setBounds(9, 11, 220, 100);

        labelTituloPan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloPan.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloPan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloPan.setText("Pan de Ajo");
        panelPan.add(labelTituloPan);
        labelTituloPan.setBounds(11, 110, 220, 36);

        labelDescripcionPan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcionPan.setForeground(new java.awt.Color(159, 159, 160));
        labelDescripcionPan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcionPan.setText("<html><body>Crujientes panes tostados<br>con ajo y perejil.</body></html>");
        panelPan.add(labelDescripcionPan);
        labelDescripcionPan.setBounds(10, 150, 228, 40);

        comboPanAjo.setBackground(new java.awt.Color(102, 102, 102));
        comboPanAjo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboPanAjo.setForeground(new java.awt.Color(255, 255, 255));
        comboPanAjo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 unidad 1€", "4 unidades 5€", "10 unidades 10€" }));
        panelPan.add(comboPanAjo);
        comboPanAjo.setBounds(10, 200, 220, 30);

        btnPanAjo.setBackground(new java.awt.Color(0, 102, 0));
        btnPanAjo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPanAjo.setForeground(new java.awt.Color(255, 255, 255));
        btnPanAjo.setText("AÑADIR");
        btnPanAjo.setActionCommand("panAjo");
        panelPan.add(btnPanAjo);
        btnPanAjo.setBounds(10, 250, 220, 30);

        panelPrincipal.add(panelPan);
        panelPan.setBounds(1020, 390, 240, 290);

        panelAgua.setBackground(new java.awt.Color(255, 255, 255));
        panelAgua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelAgua.setForeground(new java.awt.Color(159, 159, 160));
        panelAgua.setMinimumSize(new java.awt.Dimension(200, 150));
        panelAgua.setLayout(null);

        labelFotoAgua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/bebidas/agua.png"))); // NOI18N
        panelAgua.add(labelFotoAgua);
        labelFotoAgua.setBounds(9, 11, 220, 100);

        labelTituloAgua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloAgua.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloAgua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloAgua.setText("Agua");
        panelAgua.add(labelTituloAgua);
        labelTituloAgua.setBounds(11, 110, 220, 36);

        btnAgua.setBackground(new java.awt.Color(0, 102, 0));
        btnAgua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgua.setForeground(new java.awt.Color(255, 255, 255));
        btnAgua.setText("AÑADIR");
        btnAgua.setActionCommand("agua");
        panelAgua.add(btnAgua);
        btnAgua.setBounds(10, 170, 220, 30);

        panelPrincipal.add(panelAgua);
        panelAgua.setBounds(20, 790, 240, 210);

        panelCerveza.setBackground(new java.awt.Color(255, 255, 255));
        panelCerveza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelCerveza.setForeground(new java.awt.Color(159, 159, 160));
        panelCerveza.setMinimumSize(new java.awt.Dimension(200, 150));
        panelCerveza.setLayout(null);

        labelFotoCerveza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoCerveza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/bebidas/cerveza.png"))); // NOI18N
        panelCerveza.add(labelFotoCerveza);
        labelFotoCerveza.setBounds(9, 11, 220, 100);

        labelTituloCerveza.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloCerveza.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloCerveza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloCerveza.setText("Cerveza");
        panelCerveza.add(labelTituloCerveza);
        labelTituloCerveza.setBounds(11, 110, 220, 36);

        btnCerveza.setBackground(new java.awt.Color(0, 102, 0));
        btnCerveza.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerveza.setForeground(new java.awt.Color(255, 255, 255));
        btnCerveza.setText("AÑADIR");
        btnCerveza.setActionCommand("cerveza");
        panelCerveza.add(btnCerveza);
        btnCerveza.setBounds(10, 170, 220, 30);

        panelPrincipal.add(panelCerveza);
        panelCerveza.setBounds(270, 790, 240, 210);

        panelSprite.setBackground(new java.awt.Color(255, 255, 255));
        panelSprite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelSprite.setForeground(new java.awt.Color(159, 159, 160));
        panelSprite.setMinimumSize(new java.awt.Dimension(200, 150));
        panelSprite.setLayout(null);

        labelFotoSprite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/bebidas/sprite.png"))); // NOI18N
        panelSprite.add(labelFotoSprite);
        labelFotoSprite.setBounds(9, 11, 220, 100);

        labelTituloSprite.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloSprite.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloSprite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloSprite.setText("Sprite");
        panelSprite.add(labelTituloSprite);
        labelTituloSprite.setBounds(11, 110, 220, 36);

        btnSprite.setBackground(new java.awt.Color(0, 102, 0));
        btnSprite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSprite.setForeground(new java.awt.Color(255, 255, 255));
        btnSprite.setText("AÑADIR");
        btnSprite.setActionCommand("sprite");
        panelSprite.add(btnSprite);
        btnSprite.setBounds(10, 170, 220, 30);

        panelPrincipal.add(panelSprite);
        panelSprite.setBounds(520, 790, 240, 210);

        panelCola.setBackground(new java.awt.Color(255, 255, 255));
        panelCola.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelCola.setForeground(new java.awt.Color(159, 159, 160));
        panelCola.setMinimumSize(new java.awt.Dimension(200, 150));
        panelCola.setLayout(null);

        labelFotoCola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/bebidas/cola.png"))); // NOI18N
        panelCola.add(labelFotoCola);
        labelFotoCola.setBounds(9, 11, 220, 100);

        labelTituloCola.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloCola.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloCola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloCola.setText("Coca Cola");
        panelCola.add(labelTituloCola);
        labelTituloCola.setBounds(11, 110, 220, 36);

        btnCola.setBackground(new java.awt.Color(0, 102, 0));
        btnCola.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCola.setForeground(new java.awt.Color(255, 255, 255));
        btnCola.setText("AÑADIR");
        btnCola.setActionCommand("cola");
        panelCola.add(btnCola);
        btnCola.setBounds(10, 170, 220, 30);

        panelPrincipal.add(panelCola);
        panelCola.setBounds(770, 790, 240, 210);

        panelFanta.setBackground(new java.awt.Color(255, 255, 255));
        panelFanta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 160), 2));
        panelFanta.setForeground(new java.awt.Color(159, 159, 160));
        panelFanta.setMinimumSize(new java.awt.Dimension(200, 150));
        panelFanta.setLayout(null);

        labelFotoFanta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoFanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/bebidas/fanta.png"))); // NOI18N
        panelFanta.add(labelFotoFanta);
        labelFotoFanta.setBounds(9, 11, 220, 100);

        labelTituloFanta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloFanta.setForeground(new java.awt.Color(102, 102, 102));
        labelTituloFanta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloFanta.setText("Fanta Naranja");
        panelFanta.add(labelTituloFanta);
        labelTituloFanta.setBounds(11, 110, 220, 36);

        btnFanta.setBackground(new java.awt.Color(0, 102, 0));
        btnFanta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFanta.setForeground(new java.awt.Color(255, 255, 255));
        btnFanta.setText("AÑADIR");
        btnFanta.setActionCommand("fanta");
        panelFanta.add(btnFanta);
        btnFanta.setBounds(10, 170, 220, 30);

        panelPrincipal.add(panelFanta);
        panelFanta.setBounds(1020, 790, 240, 210);

        labelCantidadCarrito.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelCantidadCarrito.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidadCarrito.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCantidadCarrito.setText("0");
        labelCantidadCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCantidadCarritoMouseClicked(evt);
            }
        });
        panelPrincipal.add(labelCantidadCarrito);
        labelCantidadCarrito.setBounds(1150, 10, 30, 16);

        labelCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/iconCarrito.png"))); // NOI18N
        labelCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCarritoMouseClicked(evt);
            }
        });
        panelPrincipal.add(labelCarrito);
        labelCarrito.setBounds(1120, 10, 50, 30);

        labelMiCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/iconCuenta.png"))); // NOI18N
        labelMiCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMiCuentaMouseClicked(evt);
            }
        });
        panelPrincipal.add(labelMiCuenta);
        labelMiCuenta.setBounds(1040, 10, 30, 30);

        textoMiCuenta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textoMiCuenta.setForeground(new java.awt.Color(255, 255, 255));
        textoMiCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoMiCuenta.setText("Mi Cuenta");
        textoMiCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoMiCuentaMouseClicked(evt);
            }
        });
        panelPrincipal.add(textoMiCuenta);
        textoMiCuenta.setBounds(1010, 40, 80, 22);

        textoCarrito.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textoCarrito.setForeground(new java.awt.Color(255, 255, 255));
        textoCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCarrito.setText("Carrito");
        textoCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoCarritoMouseClicked(evt);
            }
        });
        panelPrincipal.add(textoCarrito);
        textoCarrito.setBounds(1110, 40, 50, 22);

        labelDesconectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/iconDesconectar.png"))); // NOI18N
        labelDesconectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDesconectarMouseClicked(evt);
            }
        });
        panelPrincipal.add(labelDesconectar);
        labelDesconectar.setBounds(1210, 10, 30, 30);

        textoDesconectar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textoDesconectar.setForeground(new java.awt.Color(255, 255, 255));
        textoDesconectar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoDesconectar.setText("Desconectar");
        textoDesconectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoDesconectarMouseClicked(evt);
            }
        });
        panelPrincipal.add(textoDesconectar);
        textoDesconectar.setBounds(1180, 40, 90, 22);

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxpizza/imagen/fondoPrincipal.png"))); // NOI18N
        panelPrincipal.add(fondoLabel);
        fondoLabel.setBounds(0, 0, 1280, 1024);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelMiCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiCuentaMouseClicked
        ControladorCuentaCliente ctrlCuentaCliente = new ControladorCuentaCliente("misDatos");
        this.dispose();
    }//GEN-LAST:event_labelMiCuentaMouseClicked

    private void textoMiCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoMiCuentaMouseClicked
        ControladorCuentaCliente ctrlCuentaCliente = new ControladorCuentaCliente("misDatos");
        this.dispose();
    }//GEN-LAST:event_textoMiCuentaMouseClicked

    private void labelCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCarritoMouseClicked
        ControladorCarrito ctrlCarrito = new ControladorCarrito();
        this.dispose();
    }//GEN-LAST:event_labelCarritoMouseClicked

    private void textoCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoCarritoMouseClicked
        ControladorCarrito ctrlCarrito = new ControladorCarrito();
        this.dispose();
    }//GEN-LAST:event_textoCarritoMouseClicked

    private void labelCantidadCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCantidadCarritoMouseClicked
        ControladorCarrito ctrlCarrito = new ControladorCarrito();
        this.dispose();
    }//GEN-LAST:event_labelCantidadCarritoMouseClicked

    private void textoDesconectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoDesconectarMouseClicked
        ControladorLogin ctrlLogin = new ControladorLogin();
        this.dispose();
    }//GEN-LAST:event_textoDesconectarMouseClicked

    private void labelDesconectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDesconectarMouseClicked
        ControladorLogin ctrlLogin = new ControladorLogin();
        this.dispose();
    }//GEN-LAST:event_labelDesconectarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgua;
    private javax.swing.JButton btnBacon;
    private javax.swing.JButton btnBarbacoa;
    private javax.swing.JButton btnCarbonara;
    private javax.swing.JButton btnCerveza;
    private javax.swing.JButton btnCola;
    private javax.swing.JButton btnCuatroQuesos;
    private javax.swing.JButton btnEspecial;
    private javax.swing.JButton btnFanta;
    private javax.swing.JButton btnFlorentina;
    private javax.swing.JButton btnHawaiana;
    private javax.swing.JButton btnPanAjo;
    private javax.swing.JButton btnPeperoni;
    private javax.swing.JButton btnSprite;
    private javax.swing.JButton btnSupreme;
    private javax.swing.JComboBox<String> comboBacon;
    private javax.swing.JComboBox<String> comboBarbacoa;
    private javax.swing.JComboBox<String> comboCarbonara;
    private javax.swing.JComboBox<String> comboCuatroQuesos;
    private javax.swing.JComboBox<String> comboEspecial;
    private javax.swing.JComboBox<String> comboFlorentina;
    private javax.swing.JComboBox<String> comboHawaiana;
    private javax.swing.JComboBox<String> comboPanAjo;
    private javax.swing.JComboBox<String> comboPeperoni;
    private javax.swing.JComboBox<String> comboSupreme;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JLabel labelCantidadCarrito;
    private javax.swing.JLabel labelCarrito;
    private javax.swing.JLabel labelDesconectar;
    private javax.swing.JLabel labelDescripcionBacon;
    private javax.swing.JLabel labelDescripcionBarbacoa;
    private javax.swing.JLabel labelDescripcionCarbonara;
    private javax.swing.JLabel labelDescripcionCuatroQuesos;
    private javax.swing.JLabel labelDescripcionEspecial;
    private javax.swing.JLabel labelDescripcionForentina;
    private javax.swing.JLabel labelDescripcionHawaiana;
    private javax.swing.JLabel labelDescripcionPan;
    private javax.swing.JLabel labelDescripcionPeperoni;
    private javax.swing.JLabel labelDescripcionSupreme;
    private javax.swing.JLabel labelFotoAgua;
    private javax.swing.JLabel labelFotoBacon;
    private javax.swing.JLabel labelFotoBarbacoa;
    private javax.swing.JLabel labelFotoCabonara;
    private javax.swing.JLabel labelFotoCerveza;
    private javax.swing.JLabel labelFotoCola;
    private javax.swing.JLabel labelFotoCuatroQuesos;
    private javax.swing.JLabel labelFotoEspecial;
    private javax.swing.JLabel labelFotoFanta;
    private javax.swing.JLabel labelFotoFlorentina;
    private javax.swing.JLabel labelFotoHawaiana;
    private javax.swing.JLabel labelFotoPan;
    private javax.swing.JLabel labelFotoPeperoni;
    private javax.swing.JLabel labelFotoSprite;
    private javax.swing.JLabel labelFotoSupreme;
    private javax.swing.JLabel labelMiCuenta;
    private javax.swing.JLabel labelTituloAgua;
    private javax.swing.JLabel labelTituloBacon;
    private javax.swing.JLabel labelTituloBarbacoa;
    private javax.swing.JLabel labelTituloCarbonara;
    private javax.swing.JLabel labelTituloCerveza;
    private javax.swing.JLabel labelTituloCola;
    private javax.swing.JLabel labelTituloCuatroQuesos;
    private javax.swing.JLabel labelTituloEspecial;
    private javax.swing.JLabel labelTituloFanta;
    private javax.swing.JLabel labelTituloFlorentina;
    private javax.swing.JLabel labelTituloHawaiana;
    private javax.swing.JLabel labelTituloPan;
    private javax.swing.JLabel labelTituloPeperoni;
    private javax.swing.JLabel labelTituloSprite;
    private javax.swing.JLabel labelTituloSupreme;
    private javax.swing.JPanel panelAgua;
    private javax.swing.JPanel panelBacon;
    private javax.swing.JPanel panelBarbacoa;
    private javax.swing.JPanel panelCarbonara;
    private javax.swing.JPanel panelCerveza;
    private javax.swing.JPanel panelCola;
    private javax.swing.JPanel panelCuatroQuesos;
    private javax.swing.JPanel panelEspecial;
    private javax.swing.JPanel panelFanta;
    private javax.swing.JPanel panelFlorentina;
    private javax.swing.JPanel panelHawaiana;
    private javax.swing.JPanel panelPan;
    private javax.swing.JPanel panelPeperoni;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSprite;
    private javax.swing.JPanel panelSupreme;
    private javax.swing.JLabel textoCarrito;
    private javax.swing.JLabel textoDesconectar;
    private javax.swing.JLabel textoMiCuenta;
    // End of variables declaration//GEN-END:variables
}
