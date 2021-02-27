package views.desigualdades;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Mariel
 */
public class PanelEscribir extends javax.swing.JPanel {

    public PanelEscribir() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnResultado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtEscribirProblema = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(430, 230));
        setMinimumSize(new java.awt.Dimension(430, 230));
        setPreferredSize(new java.awt.Dimension(430, 230));
        setLayout(null);

        btnResultado.setBackground(new java.awt.Color(0, 0, 0));
        btnResultado.setForeground(new java.awt.Color(255, 255, 255));
        btnResultado.setText("Resultado");
        add(btnResultado);
        btnResultado.setBounds(270, 180, 112, 24);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        txtEscribirProblema.setBackground(new java.awt.Color(255, 255, 255));
        txtEscribirProblema.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtEscribirProblema);
        txtEscribirProblema.setBounds(10, 30, 360, 30);

        add(jPanel1);
        jPanel1.setBounds(30, 50, 380, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo sin fondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 430, 230);
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTxtEscribirProblema() {
        return txtEscribirProblema;
    }

    public JButton getBtnResultado() {
        return btnResultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEscribirProblema;
    // End of variables declaration//GEN-END:variables
}
