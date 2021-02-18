package views;

import javax.swing.JPanel;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.MyAnnotationCallback;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

public class OMDocumento extends javax.swing.JInternalFrame {
    
    public OMDocumento() {
        initComponents();
        abrirPDF("src/resources/documentos/Resuelve.pdf");
    }
    
    private void abrirPDF(String nombreArchivo) {
        SwingController control = new SwingController();
        SwingViewBuilder constructorVista = new SwingViewBuilder(control);
        JPanel pnlVista2 = constructorVista.buildViewerPanel();
        ComponentKeyBinding.install(control, pnlVista2);
        control.getDocumentViewController().setAnnotationCallback(
                new MyAnnotationCallback(control.getDocumentViewController())
        );
        control.openDocument(nombreArchivo);
        pnlVista.add(pnlVista2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVista = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));

        pnlVista.setPreferredSize(new java.awt.Dimension(622, 408));

        javax.swing.GroupLayout pnlVistaLayout = new javax.swing.GroupLayout(pnlVista);
        pnlVista.setLayout(pnlVistaLayout);
        pnlVistaLayout.setHorizontalGroup(
            pnlVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        pnlVistaLayout.setVerticalGroup(
            pnlVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlVista;
    // End of variables declaration//GEN-END:variables
}
