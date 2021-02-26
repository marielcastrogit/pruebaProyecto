package views.Ecuaciones;

import controllers.ecuaciones.ControlEcLineal;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import models.ecuaciones.Logica;

/**
 *
 * @author Eddy
 */
public class EcuacionesLineales extends javax.swing.JInternalFrame {
    
    public EcuacionesLineales() {
        initComponents();
        setSize(622, 408);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setControllers();
    }
    
    public void limpiar() {
        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");
        respuesta.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        respuesta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblSubrayado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblRetroceder = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ecuación Lineal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 50, 110, 16);

        b.setBackground(new java.awt.Color(255, 255, 255));
        b.setForeground(new java.awt.Color(0, 0, 0));
        b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        getContentPane().add(b);
        b.setBounds(150, 120, 70, 30);

        c.setBackground(new java.awt.Color(255, 255, 255));
        c.setForeground(new java.awt.Color(0, 0, 0));
        c.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        getContentPane().add(c);
        c.setBounds(300, 120, 70, 30);

        d.setBackground(new java.awt.Color(255, 255, 255));
        d.setForeground(new java.awt.Color(0, 0, 0));
        d.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        getContentPane().add(d);
        d.setBounds(430, 120, 70, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("=");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 120, 7, 30);

        lblResultado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Resultado");
        getContentPane().add(lblResultado);
        lblResultado.setBounds(150, 290, 84, 17);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("=");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 290, 8, 19);

        respuesta.setBackground(new java.awt.Color(255, 255, 255));
        respuesta.setForeground(new java.awt.Color(0, 0, 0));
        respuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaActionPerformed(evt);
            }
        });
        getContentPane().add(respuesta);
        respuesta.setBounds(280, 284, 120, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("X");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 120, 8, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("-");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 120, 8, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("+");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 120, 21, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("X");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 120, 19, 30);

        a.setBackground(new java.awt.Color(255, 255, 255));
        a.setForeground(new java.awt.Color(0, 0, 0));
        a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a);
        a.setBounds(50, 120, 70, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("(");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 120, 6, 24);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText(")");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(378, 120, 10, 22);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 200, 80, 24);

        lblSubrayado.setBackground(new java.awt.Color(51, 0, 51));
        lblSubrayado.setForeground(new java.awt.Color(51, 0, 51));
        lblSubrayado.setOpaque(true);
        getContentPane().add(lblSubrayado);
        lblSubrayado.setBounds(80, 70, 170, 10);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        lblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-arrow-pointing-left-35.png"))); // NOI18N
        jPanel1.add(lblRetroceder);
        lblRetroceder.setBounds(15, 0, 40, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 600, 30);
        getContentPane().add(lblInfo);
        lblInfo.setBounds(30, 330, 570, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void respuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void setControllers() {
        g = new Logica();
        cel = new ControlEcLineal(this, g);
        jButton1.addActionListener(cel);
    }
    
    private Logica g;
    private ControlEcLineal cel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField a;
    public javax.swing.JTextField b;
    public javax.swing.JTextField c;
    public javax.swing.JTextField d;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblResultado;
    public static javax.swing.JLabel lblRetroceder;
    private javax.swing.JLabel lblSubrayado;
    public javax.swing.JTextField respuesta;
    // End of variables declaration//GEN-END:variables
}
