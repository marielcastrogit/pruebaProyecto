package views;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jdesktop.swingx.border.DropShadowBorder;

public class OMVerificarCodigo extends javax.swing.JInternalFrame {

    public OMVerificarCodigo() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBordeClickAqui();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlReenviarCodigo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoRegistro_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 50, 220, 260);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 220, 390);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hemos enviado un código de verificacion a tu correo ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 40, 310, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No recibiste el correo de verificacion?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 76, 230, 20);

        pnlReenviarCodigo.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        pnlReenviarCodigo.setOpaque(false);
        pnlReenviarCodigo.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reenviar código");
        pnlReenviarCodigo.add(jLabel5);
        jLabel5.setBounds(10, 5, 100, 20);

        getContentPane().add(pnlReenviarCodigo);
        pnlReenviarCodigo.setBounds(490, 70, 120, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingresa el código de verificación ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 130, 250, 16);

        jPanel2.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-play-64.png"))); // NOI18N
        jLabel7.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 60, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(390, 270, 60, 60);

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(270, 180, 310, 60);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(220, 0, 400, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPanel pnlReenviarCodigo;
    // End of variables declaration//GEN-END:variables
}
