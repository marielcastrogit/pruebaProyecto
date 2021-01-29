
package views;

import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jdesktop.swingx.border.DropShadowBorder;


public class OMResolver extends javax.swing.JInternalFrame {


    public OMResolver() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
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

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setBackground(new java.awt.Color(52,55,59));
        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(6, 4, 428, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 180, 440, 40);

        jPanel2.setLayout(null);

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(10, 10, 330, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(130, 260, 350, 50);

        jLabel1.setText("Eliga el tema");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 240, 228, 16);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular");
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 340, 120, 24);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 630, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
