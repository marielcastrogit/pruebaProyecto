/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Font;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Usuario
 */
public class AcercaDeNosotros extends javax.swing.JInternalFrame {

    /**
     * Creates new form AcercaDeNosotros
     */
    public AcercaDeNosotros() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setSize(622, 408);
         lblFondo.setBounds(0, 0, 622, 408);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nuestro solucionador de ecuaciones y desigualdades ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 200, 390, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("lineales, cuadráticas y funciones permite a observar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 230, 380, 19);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("la solución de estas, e incluso las funciones contienen");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 260, 390, 19);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Aplicación creada por estudiantes de UNI modalidad sabatina 2021");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 60, 470, 19);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-math-96.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 90, 100, 90);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("gráficas.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 290, 70, 20);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 622, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void redimensionar(boolean redimensionar) {
        if (redimensionar) {
            this.setSize(459, 412);
            jLabel6.setFont(new Font("Dialog", Font.BOLD, 12));
            jLabel6.setBounds(30, 20, 410, 16);
            jLabel2.setBounds(180, 50, 100, 90);
            jLabel3.setBounds(30, 180, 390, 20);
            jLabel4.setBounds(30, 210, 380, 19);
            jLabel5.setBounds(30, 240, 390, 19);
            jLabel8.setBounds(30, 270, 70, 20);
            lblFondo.setBounds(0, 0, 459, 412);
        } else {
            this.setSize(622, 408);
            jLabel3.setBounds(140, 200, 390, 20);
            jLabel4.setBounds(140, 230, 380, 19);
            jLabel5.setBounds(140, 260, 390, 19);
            jLabel6.setFont(new Font("Dialog", Font.BOLD, 14));
            jLabel6.setBounds(70, 60, 470, 19);
            jLabel2.setBounds(250, 90, 100, 90);
            jLabel8.setBounds(140, 290, 70, 20);
            lblFondo.setBounds(0, 0, 622, 408);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
