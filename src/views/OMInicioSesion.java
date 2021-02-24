package views;

import controllers.InicioSesionController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jdesktop.swingx.border.DropShadowBorder;

public class OMInicioSesion extends javax.swing.JInternalFrame {
    
    public OMInicioSesion() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-checked-user-male-35.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 90, 35, 35);

        jPanel2.setLayout(null);

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setText("usuario@gmail.com");
        txtUsuario.setActionCommand("txtCorreo");
        jPanel2.add(txtUsuario);
        txtUsuario.setBounds(6, 15, 318, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(200, 80, 330, 60);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 60, 32, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 160, 70, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-password-1-35.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 190, 35, 35);

        jPanel1.setLayout(null);

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(password);
        password.setBounds(6, 13, 318, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(200, 180, 330, 60);

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
    
    
    
    private InicioSesionController isc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox checkContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
