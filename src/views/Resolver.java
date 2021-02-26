package views;

import controllers.ResolverController;
import javax.swing.JComboBox;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jdesktop.swingx.border.DropShadowBorder;

public class Resolver extends javax.swing.JInternalFrame {

    public Resolver() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBorderInternal();
        pnlCard.setVisible(false);
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

        jTextField2 = new javax.swing.JTextField();
        pnlTemas = new javax.swing.JPanel();
        listaTemas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pnlCard = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setBackground(new java.awt.Color(52,55,59));
        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        pnlTemas.setLayout(null);

        listaTemas.setBackground(new java.awt.Color(255, 255, 255));
        listaTemas.setForeground(new java.awt.Color(0, 0, 0));
        pnlTemas.add(listaTemas);
        listaTemas.setBounds(10, 10, 410, 30);

        getContentPane().add(pnlTemas);
        pnlTemas.setBounds(90, 70, 430, 50);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Eliga el tema");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 40, 240, 16);

        pnlCard.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnlCard);
        pnlCard.setBounds(90, 140, 430, 230);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        lblFondo.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 620, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setControllers() {
        rc = new ResolverController(this);
        listaTemas.addItemListener(rc);
    }

    public JComboBox<String> getListaTemas() {
        return listaTemas;
    }

    private ResolverController rc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JComboBox<String> listaTemas;
    public static javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlTemas;
    // End of variables declaration//GEN-END:variables
}
