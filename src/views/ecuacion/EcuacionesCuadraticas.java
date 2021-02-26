package views.ecuacion;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import controllers.ecuaciones.ControlEcCuadratica;
import models.ecuaciones.Logica;
/**
 *
 * @author Eddy
 */
public class EcuacionesCuadraticas extends javax.swing.JInternalFrame {

    public EcuacionesCuadraticas() {
        initComponents();
        setSize(622, 408);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setControllers();
    }

    public void limpiar() {
        respuesta.setText("");
        respuesta2.setText("");
        a.setText("");
        b.setText("");
        c.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        respuesta = new javax.swing.JTextField();
        respuesta2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblSubrayado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblRetroceder = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ecuación Cuadrática");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 60, 120, 22);

        a.setBackground(new java.awt.Color(255, 255, 255));
        a.setForeground(new java.awt.Color(0, 0, 0));
        a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a);
        a.setBounds(130, 120, 70, 24);

        b.setBackground(new java.awt.Color(255, 255, 255));
        b.setForeground(new java.awt.Color(0, 0, 0));
        b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(b);
        b.setBounds(250, 120, 70, 24);

        c.setBackground(new java.awt.Color(255, 255, 255));
        c.setForeground(new java.awt.Color(0, 0, 0));
        c.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(c);
        c.setBounds(370, 120, 70, 24);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("=");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 120, 21, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X = ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 270, 50, 20);

        respuesta.setBackground(new java.awt.Color(255, 255, 255));
        respuesta.setForeground(new java.awt.Color(0, 0, 0));
        respuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaActionPerformed(evt);
            }
        });
        getContentPane().add(respuesta);
        respuesta.setBounds(220, 270, 160, 24);

        respuesta2.setBackground(new java.awt.Color(255, 255, 255));
        respuesta2.setForeground(new java.awt.Color(0, 0, 0));
        respuesta2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(respuesta2);
        respuesta2.setBounds(220, 310, 160, 24);

        jLabel5.setText("0");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 120, 19, 24);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 210, 100, 24);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X = ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 320, 30, 16);

        lblSubrayado.setBackground(new java.awt.Color(51, 0, 51));
        lblSubrayado.setForeground(new java.awt.Color(51, 0, 51));
        lblSubrayado.setOpaque(true);
        getContentPane().add(lblSubrayado);
        lblSubrayado.setBounds(80, 80, 170, 10);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        lblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-arrow-pointing-left-35.png"))); // NOI18N
        jPanel1.add(lblRetroceder);
        lblRetroceder.setBounds(15, 0, 40, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 600, 30);
        getContentPane().add(lblInfo);
        lblInfo.setBounds(20, 340, 580, 30);

        jLabel4.setText("x^2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 100, 30, 20);

        jLabel7.setText("x");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 100, 20, 16);

        jLabel8.setText("c");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 100, 20, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void respuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setControllers() {
        g = new Logica();
        cec = new ControlEcCuadratica(g, this);
        jButton1.addActionListener(cec);
    }
    private Logica g;
    private ControlEcCuadratica cec;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField a;
    public javax.swing.JTextField b;
    public javax.swing.JTextField c;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblInfo;
    public static javax.swing.JLabel lblRetroceder;
    private javax.swing.JLabel lblSubrayado;
    public javax.swing.JTextField respuesta;
    public javax.swing.JTextField respuesta2;
    // End of variables declaration//GEN-END:variables
}
