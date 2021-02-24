package views;

import controllers.RegistroUsuarioController;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jdesktop.swingx.border.DropShadowBorder;

public class OMRegistroUsuario extends javax.swing.JInternalFrame {

    public OMRegistroUsuario() {
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

    private void setControllers() {
        ruc = new RegistroUsuarioController(this);
        txtEmail.addKeyListener(ruc);
        txtContraseña.addKeyListener(ruc);
        txtVerificarContraseña.addKeyListener(ruc);
        btnRegistrarse.addMouseListener(ruc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtVerificarContraseña = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        txtContraseña = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        txtVerificarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtVerificarContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtVerificarContraseña);
        txtVerificarContraseña.setBounds(10, 10, 290, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(240, 260, 310, 50);

        jPanel3.setLayout(null);

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtContraseña);
        txtContraseña.setBounds(10, 10, 290, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(240, 170, 310, 50);

        jPanel1.setLayout(null);

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setText("Ejemplo: usuario@gmail.com");
        jPanel1.add(txtEmail);
        txtEmail.setBounds(10, 10, 290, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 70, 310, 50);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 50, 41, 16);

        btnRegistrarse.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        getContentPane().add(btnRegistrarse);
        btnRegistrarse.setBounds(350, 330, 110, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Verificar contraseña:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 240, 140, 16);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 150, 90, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(223, 0, 400, 390);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoRegistro_1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 50, 220, 270);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 230, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnRegistrarse() {
        return btnRegistrarse;
    }

    private RegistroUsuarioController ruc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtVerificarContraseña;
    // End of variables declaration//GEN-END:variables
}
