package views;

import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.jdesktop.swingx.border.DropShadowBorder;
import org.icepdf.ri.common.MyAnnotationCallback;

public class Documento extends javax.swing.JInternalFrame {

    private JPanel panelVistaPDF;

    public Documento() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        abrirDocumento("C:\\Users\\Usuario\\Documents\\TareaPROGII\\Proyecto Programacion.pdf");
    }

    private void setBorderInternal() {
        DropShadowBorder border = (DropShadowBorder) this.getBorder();
        border.setShowBottomShadow(false);
        border.setShowRightShadow(true);
        border.setShowLeftShadow(true);
        border.setShowTopShadow(true);
        border.setShadowSize(15);
    }

    private void abrirDocumento(String nombreArchivo) {
        try {
            SwingController control = new SwingController();
            SwingViewBuilder constructorVista = new SwingViewBuilder(control);
            panelVistaPDF = constructorVista.buildViewerPanel();

            ComponentKeyBinding.install(control, panelVistaPDF);
            control.getDocumentViewController().setAnnotationCallback(
                   new MyAnnotationCallback(control.getDocumentViewController())
            );
            control.openDocument(nombreArchivo);
            pnlVista.add(panelVistaPDF);
        } catch (Exception e) {}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVista = new javax.swing.JPanel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));

        pnlVista.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnlVista.setPreferredSize(new java.awt.Dimension(622, 408));
        pnlVista.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlVista, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlVista;
    // End of variables declaration//GEN-END:variables
}
