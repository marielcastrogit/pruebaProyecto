package views;

import controllers.AjustesControllers;
import models.otros.LabelCircular;
import models.otros.PanelDegradado;
import org.jdesktop.swingx.border.DropShadowBorder;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
        setLabelFoto();
        setControllers();
        btnTemaAnterior.setVisible(false);
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

    private void setLabelFoto() {
        lc = new LabelCircular();
        lc.setLocation(148, 0);
        Dimension d = new Dimension(80, 70);
        lc.setSize(d);
        lc.setLineBorder(3);
        lc.setLineColor(new java.awt.Color(20, 194, 115));
        lc.setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-no-image-64.png")));
        pnlUsuario.add(lc);
    }

    public static JButton getBtnAplicarTema() {
        return btnAplicarTema;
    }

    public void redimensionar(boolean redimensionar) {
        if (redimensionar) {
            this.setSize(459, 412);
            pnlTemas.setBounds(60, 10, 320, 270);
            pnlUsuario.setBounds(60, 290, 230, 70);
        } else {
            this.setSize(622, 408);
            pnlUsuario.setBounds(340, 40, 230, 70);
            pnlTemas.setBounds(10, 40, 320, 270);

        }
    }

    private void setControllers() {
        ac = new AjustesControllers(this);
        lblSonido.addMouseListener(ac);//quitar sonido
        lc.addMouseListener(ac);//label de la foto
        btnTemaAnterior.addMouseListener(ac);
        btnSiguienteTema.addMouseListener(ac);
        btnAplicarTema.addMouseListener(ac);
    }
    private AjustesControllers ac;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTemas = new javax.swing.JPanel();
        pnlMostrarTemas = new javax.swing.JPanel();
        btnSiguienteTema = new javax.swing.JLabel();
        btnTemaAnterior = new javax.swing.JLabel();
        btnAplicarTema = new javax.swing.JButton();
        pnlUsuario = new javax.swing.JPanel();
        lblSonido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        pnlTemas.setLayout(null);

        pnlMostrarTemas.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        pnlMostrarTemas.setLayout(new java.awt.CardLayout());
        pnlTemas.add(pnlMostrarTemas);
        pnlMostrarTemas.setBounds(68, 36, 180, 174);

        btnSiguienteTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-next-35.png"))); // NOI18N
        pnlTemas.add(btnSiguienteTema);
        btnSiguienteTema.setBounds(260, 100, 35, 35);

        btnTemaAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-previous-35.png"))); // NOI18N
        pnlTemas.add(btnTemaAnterior);
        btnTemaAnterior.setBounds(21, 100, 35, 35);

        btnAplicarTema.setBackground(new java.awt.Color(0, 0, 0));
        btnAplicarTema.setForeground(new java.awt.Color(255, 255, 255));
        btnAplicarTema.setText("Aplicar tema");
        pnlTemas.add(btnAplicarTema);
        btnAplicarTema.setBounds(100, 220, 100, 24);

        getContentPane().add(pnlTemas);
        pnlTemas.setBounds(10, 40, 320, 270);

        pnlUsuario.setLayout(null);

        lblSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-audio-35.png"))); // NOI18N
        pnlUsuario.add(lblSonido);
        lblSonido.setBounds(40, 0, 35, 70);

        getContentPane().add(pnlUsuario);
        pnlUsuario.setBounds(340, 40, 230, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private PanelDegradado p;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAplicarTema;
    public static javax.swing.JLabel btnSiguienteTema;
    public static javax.swing.JLabel btnTemaAnterior;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel lblSonido;
    public static javax.swing.JPanel pnlMostrarTemas;
    private javax.swing.JPanel pnlTemas;
    private javax.swing.JPanel pnlUsuario;
    // End of variables declaration//GEN-END:variables

}
