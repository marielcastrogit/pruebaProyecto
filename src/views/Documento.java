package views;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.jdesktop.swingx.border.DropShadowBorder;
import org.icepdf.ri.common.MyAnnotationCallback;

/**
 *
 * @author Mariel
 */
public class Documento extends javax.swing.JInternalFrame {


    public Documento() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        pnlRetroceder.setBackground(new Color(0, 0, 0, 80));
        setBorderInternal();
        this.setSize(622,408);
    }

    private void setBorderInternal() {
        DropShadowBorder border = (DropShadowBorder) this.getBorder();
        border.setShowBottomShadow(false);
        border.setShowRightShadow(true);
        border.setShowLeftShadow(true);
        border.setShowTopShadow(true);
        border.setShadowSize(15);
    }

    public void abrirDocumento(String nombreArchivo) {
        try {
            SwingController control = new SwingController();
            SwingViewBuilder constructorVista = new SwingViewBuilder(control);
            JPanel pnlVista = constructorVista.buildViewerPanel();

            ComponentKeyBinding.install(control,pnlVista);
            control.getDocumentViewController().setAnnotationCallback(
                    new MyAnnotationCallback(control.getDocumentViewController())
            );
            control.openDocument(nombreArchivo);
            pnlVistaPDF.add(pnlVista);
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRetroceder = new javax.swing.JPanel();
        lblRetroceder = new javax.swing.JLabel();
        pnlVistaPDF = new javax.swing.JPanel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));

        pnlRetroceder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlRetroceder.setPreferredSize(new java.awt.Dimension(100, 30));
        pnlRetroceder.setLayout(null);

        lblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-arrow-pointing-left-35.png"))); // NOI18N
        pnlRetroceder.add(lblRetroceder);
        lblRetroceder.setBounds(10, 0, 50, 30);

        getContentPane().add(pnlRetroceder, java.awt.BorderLayout.PAGE_START);

        pnlVistaPDF.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlVistaPDF, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel lblRetroceder;
    private javax.swing.JPanel pnlRetroceder;
    public static javax.swing.JPanel pnlVistaPDF;
    // End of variables declaration//GEN-END:variables
}
