package views;

import controllers.InicioSesionController;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jdesktop.swingx.border.DropShadowBorder;

public class InicioSesion extends javax.swing.JInternalFrame {

    public InicioSesion() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBorderInternal();
        setControllers();
    }

    private void setBorderInternal() {
        DropShadowBorder border = (DropShadowBorder) this.getBorder();
        border.setShowBottomShadow(false);
        border.setShowRightShadow(true);
        border.setShowLeftShadow(true);
        border.setShowTopShadow(true);
        border.setShadowSize(15);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIconoUsuario = new javax.swing.JLabel();
        pnlEmail = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblIconoContraseña = new javax.swing.JLabel();
        pnlContraseña = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        checkContraseña = new javax.swing.JCheckBox();
        lblCrearCuenta = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(52,55,59));
        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        lblIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-checked-user-male-35.png"))); // NOI18N
        getContentPane().add(lblIconoUsuario);
        lblIconoUsuario.setBounds(110, 90, 35, 35);

        pnlEmail.setLayout(null);

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setText("usuario@gmail.com");
        txtUsuario.setActionCommand("txtCorreo");
        pnlEmail.add(txtUsuario);
        txtUsuario.setBounds(6, 15, 318, 30);

        getContentPane().add(pnlEmail);
        pnlEmail.setBounds(200, 80, 330, 60);

        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(200, 60, 32, 16);

        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña");
        getContentPane().add(lblContraseña);
        lblContraseña.setBounds(200, 160, 70, 16);

        lblIconoContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-password-1-35.png"))); // NOI18N
        getContentPane().add(lblIconoContraseña);
        lblIconoContraseña.setBounds(110, 190, 35, 35);

        pnlContraseña.setLayout(null);

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setForeground(new java.awt.Color(0, 0, 0));
        pnlContraseña.add(password);
        password.setBounds(6, 13, 318, 30);

        getContentPane().add(pnlContraseña);
        pnlContraseña.setBounds(200, 180, 330, 60);

        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(280, 290, 90, 30);

        checkContraseña.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        checkContraseña.setForeground(new java.awt.Color(255, 255, 255));
        checkContraseña.setText("Mostrar contraseña");
        checkContraseña.setOpaque(false);
        getContentPane().add(checkContraseña);
        checkContraseña.setBounds(240, 240, 190, 24);

        lblCrearCuenta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblCrearCuenta.setText("Registrate en MekApp");
        getContentPane().add(lblCrearCuenta);
        lblCrearCuenta.setBounds(250, 326, 270, 30);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(1, -4, 620, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setControllers() {
        isc = new InicioSesionController(this);
        txtUsuario.addKeyListener(isc);
        password.addKeyListener(isc);
        checkContraseña.addActionListener(isc);
        lblCrearCuenta.addMouseListener(isc);
        btnIngresar.addMouseListener(isc);

    }

    public JLabel getLblRegistrarse() {
        return lblCrearCuenta;
    }

    public JCheckBox getCheckContraseña() {
        return checkContraseña;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public JButton getBtnIngresar() {
        return btnIngresar;
    }

    public void redimensionar(boolean redimensionar) {
        if (redimensionar) {
            setSize(459, 412);
            lblEmail.setBounds(117, 80, 258, 60);
            pnlEmail.setBounds(117, 83, 258, 60);
            lblContraseña.setBounds(117, 158, 258, 60);
            pnlContraseña.setBounds(117, 161, 258, 60);
            lblIconoUsuario.setBounds(64, 98, 35, 35);
            lblIconoContraseña.setBounds(64, 194, 35, 35);
            lblCrearCuenta.setBounds(203, 302, 120, 16);
        } else {
            setSize(622, 408);
            lblIconoUsuario.setBounds(110, 90, 35, 35);
            txtUsuario.setBounds(6, 15, 318, 30);
            pnlEmail.setBounds(200, 80, 330, 60);
            lblEmail.setBounds(200, 60, 32, 16);
            lblContraseña.setBounds(200, 160, 70, 16);
            lblIconoContraseña.setBounds(110, 190, 35, 35);
            password.setBounds(6, 13, 318, 30);
            pnlContraseña.setBounds(200, 180, 330, 60);
            btnIngresar.setBounds(280, 290, 90, 30);
            checkContraseña.setBounds(240, 240, 190, 24);
            lblCrearCuenta.setBounds(250, 326, 270, 30);
            lblFondo.setBounds(1, -4, 620, 390);
        }
    }

    private InicioSesionController isc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox checkContraseña;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIconoContraseña;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel pnlContraseña;
    private javax.swing.JPanel pnlEmail;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
