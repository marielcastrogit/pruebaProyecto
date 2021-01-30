package views;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
//import javax.swing.border.MatteBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jdesktop.swingx.border.DropShadowBorder;

public class MMResolver extends javax.swing.JInternalFrame {

    public MMResolver() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBorderInternal();
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

        jPanel1 = new javax.swing.JPanel();
        txtProblema = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        listTemas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(52,55,59));
        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(459, 412));
        setMinimumSize(new java.awt.Dimension(459, 412));
        setPreferredSize(new java.awt.Dimension(459, 412));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        txtProblema.setBackground(new java.awt.Color(255, 255, 255));
        txtProblema.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtProblema);
        txtProblema.setBounds(6, 4, 400, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 180, 410, 40);

        jPanel2.setLayout(null);

        listTemas.setBackground(new java.awt.Color(255, 255, 255));
        listTemas.setForeground(new java.awt.Color(0, 0, 0));
        listTemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel2.add(listTemas);
        listTemas.setBounds(10, 10, 330, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 260, 350, 50);

        jLabel1.setText("Eliga el tema");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 240, 228, 16);

        btnCalcular.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(160, 340, 120, 24);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 460, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JComboBox<String> getListTemas() {
        return listTemas;
    }

    public JTextField getTxtProblema() {
        return txtProblema;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> listTemas;
    private javax.swing.JTextField txtProblema;
    // End of variables declaration//GEN-END:variables
}
