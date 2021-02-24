package views;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jdesktop.swingx.border.DropShadowBorder;

public class MMInicioSesion extends javax.swing.JInternalFrame {

    public MMInicioSesion() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBorderInternal();
        kGradientPanel1.setkStartColor(new Color(59, 10, 86));
        kGradientPanel1.setkEndColor(new Color(20, 194, 115));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new models.otros.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        lblCrearCuenta = new javax.swing.JLabel();
        checkContraseña = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(459, 412));
        setMinimumSize(new java.awt.Dimension(459, 412));
        setPreferredSize(new java.awt.Dimension(459, 412));
        getContentPane().setLayout(null);

        kGradientPanel1.setForeground(new java.awt.Color(60, 63, 65));
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 0, 51));
        kGradientPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-checked-user-male-35.png"))); // NOI18N
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(64, 98, 35, 35);

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setText("contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(117, 161, 259, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-password-1-35.png"))); // NOI18N
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(64, 194, 35, 35);

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setText("nombreUsuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel2);
        jPanel2.setBounds(117, 83, 258, 60);

        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        kGradientPanel1.add(btnIngresar);
        btnIngresar.setBounds(203, 272, 80, 24);

        lblCrearCuenta.setText("Crear cuenta");
        kGradientPanel1.add(lblCrearCuenta);
        lblCrearCuenta.setBounds(203, 302, 120, 16);

        checkContraseña.setBackground(new java.awt.Color(255, 255, 255));
        checkContraseña.setText("Mostrar contraseña");
        checkContraseña.setOpaque(false);
        kGradientPanel1.add(checkContraseña);
        checkContraseña.setBounds(149, 230, 190, 24);

        jLabel4.setText("o continuar con ");
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(203, 321, 130, 16);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Google");
        kGradientPanel1.add(jButton2);
        jButton2.setBounds(161, 349, 156, 24);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-google-35.png"))); // NOI18N
        kGradientPanel1.add(jLabel5);
        jLabel5.setBounds(120, 335, 35, 55);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, -20, 460, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setBorderInternal() {
        DropShadowBorder border = (DropShadowBorder) this.getBorder();
        border.setShowBottomShadow(false);
        border.setShowRightShadow(true);
        border.setShowLeftShadow(true);
        border.setShowTopShadow(true);
        border.setShadowSize(15);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox checkContraseña;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private models.otros.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
