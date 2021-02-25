package views;

import controllers.VerificarCodigoController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jdesktop.swingx.border.DropShadowBorder;

public class OMVerificarCodigo extends javax.swing.JInternalFrame {

    public OMVerificarCodigo() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBordeClickAqui();
        setControllers();
        lblIconoCodigoIncorrecto.setVisible(false);
        lblCodigoIncorrecto.setVisible(false);
        retornarRegistroUsuario.setBackground(new Color(255, 255, 255, 80));
    }

    private void setBordeClickAqui() {
        Border border = pnlReenviarCodigo.getBorder();
        ((DropShadowBorder) border).setShowBottomShadow(true);
        ((DropShadowBorder) border).setShowLeftShadow(false);
        ((DropShadowBorder) border).setShowRightShadow(false);
        ((DropShadowBorder) border).setShowTopShadow(false);
        ((DropShadowBorder) border).setShadowColor(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        retornarRegistroUsuario = new javax.swing.JPanel();
        lblRetroceder = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCodigoIncorrecto = new javax.swing.JLabel();
        lblIconoCodigoIncorrecto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pnlReenviarCodigo = new javax.swing.JPanel();
        lblReenviarCodigo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoRegistro_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 50, 220, 260);

        retornarRegistroUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        retornarRegistroUsuario.setLayout(null);

        lblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-arrow-pointing-left-35.png"))); // NOI18N
        retornarRegistroUsuario.add(lblRetroceder);
        lblRetroceder.setBounds(10, 0, 35, 30);

        getContentPane().add(retornarRegistroUsuario);
        retornarRegistroUsuario.setBounds(0, 0, 620, 30);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 220, 400);

        lblCodigoIncorrecto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodigoIncorrecto.setForeground(new java.awt.Color(102, 0, 102));
        lblCodigoIncorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoIncorrecto.setText("Codigo incorrecto");
        getContentPane().add(lblCodigoIncorrecto);
        lblCodigoIncorrecto.setBounds(380, 320, 130, 30);

        lblIconoCodigoIncorrecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-high-priority-64.png"))); // NOI18N
        lblIconoCodigoIncorrecto.setToolTipText("");
        lblIconoCodigoIncorrecto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblIconoCodigoIncorrecto);
        lblIconoCodigoIncorrecto.setBounds(320, 310, 60, 60);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hemos enviado un código de verificacion a tu correo ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 40, 310, 20);

        btnAcceder.setBackground(new java.awt.Color(0, 0, 0));
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("Acceder");
        getContentPane().add(btnAcceder);
        btnAcceder.setBounds(380, 270, 100, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No recibiste el correo de verificacion?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 76, 230, 20);

        pnlReenviarCodigo.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        pnlReenviarCodigo.setOpaque(false);
        pnlReenviarCodigo.setLayout(null);

        lblReenviarCodigo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblReenviarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblReenviarCodigo.setText("Reenviar código");
        pnlReenviarCodigo.add(lblReenviarCodigo);
        lblReenviarCodigo.setBounds(10, 5, 100, 20);

        getContentPane().add(pnlReenviarCodigo);
        pnlReenviarCodigo.setBounds(490, 70, 120, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingresa el código de verificación ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 130, 250, 16);

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(270, 180, 310, 60);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(220, 0, 410, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public JButton getBtnAcceder() {
        return btnAcceder;
    }

    public JLabel getLblReenviarCodigo() {
        return lblReenviarCodigo;
    }

    public JPanel getPnlReenviarCodigo() {
        return pnlReenviarCodigo;
    }

    private void setControllers() {
        vcc = new VerificarCodigoController(this);
        txtCodigo.addKeyListener(vcc);
        btnAcceder.addMouseListener(vcc);
        lblRetroceder.addMouseListener(vcc);
    }

    public JLabel getLblRetroceder() {
        return lblRetroceder;
    }

    private VerificarCodigoController vcc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblCodigoIncorrecto;
    private javax.swing.JLabel lblFondo;
    public static javax.swing.JLabel lblIconoCodigoIncorrecto;
    private javax.swing.JLabel lblReenviarCodigo;
    private javax.swing.JLabel lblRetroceder;
    private javax.swing.JPanel pnlReenviarCodigo;
    private javax.swing.JPanel retornarRegistroUsuario;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
