package views;

import controllers.AjustesControllers;
import models.otros.LabelCircular;
import models.otros.PanelDegradado;
import org.jdesktop.swingx.border.DropShadowBorder;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Mariel
 */
public class Ajustes extends javax.swing.JInternalFrame {

    public Ajustes() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBorderInternal();
        setPanelDegradado();
        setControllers();

    }
    private LabelCircular lc;

    public JPanel getPnlUsuario() {
        return pnlUsuario;
    }

    private void setBorderInternal() {
        DropShadowBorder border = (DropShadowBorder) this.getBorder();
        border.setShowBottomShadow(false);
        border.setShowRightShadow(true);
        border.setShowLeftShadow(true);
        border.setShowTopShadow(true);
        border.setShadowSize(15);
    }

    private void setPanelDegradado() {
        p = new PanelDegradado();
        p.setLocation(0, 54);
        p.setSize(148, 15);
        pnlUsuario.add(p);
    }

    public void redimensionar(boolean redimensionar) {
        if (redimensionar) {
            this.setSize(459, 412);
            pnlUsuario.setBounds(60, 290, 230, 70);
        } else {
            this.setSize(622, 408);
            pnlUsuario.setBounds(340, 40, 230, 70);
        }
    }

    private void setControllers() {
        ac = new AjustesControllers(this);
        lblSonido.addMouseListener(ac);//quitar sonido
    }
    private AjustesControllers ac;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUsuario = new javax.swing.JPanel();
        lblSonido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        pnlUsuario.setLayout(null);

        lblSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-audio-35.png"))); // NOI18N
        pnlUsuario.add(lblSonido);
        lblSonido.setBounds(40, 0, 35, 70);

        getContentPane().add(pnlUsuario);
        pnlUsuario.setBounds(200, 160, 230, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private PanelDegradado p;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel lblSonido;
    private javax.swing.JPanel pnlUsuario;
    // End of variables declaration//GEN-END:variables

}
