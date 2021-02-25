package views;

import models.otros.LabelCircular;
import models.otros.PanelDegradado;
import org.jdesktop.swingx.border.DropShadowBorder;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Ajustes extends javax.swing.JInternalFrame {

    public Ajustes() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBorderInternal();
        setPanelDegradado();
        setLabelFoto();

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTemas = new javax.swing.JPanel();
        pnlMostrarTemas = new javax.swing.JPanel();
        btnSiguienteTema = new javax.swing.JLabel();
        btnTemaAnterior = new javax.swing.JLabel();
        btnAplicarTema = new javax.swing.JButton();
        pnlUsuario = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        pnlMostrarTemas.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        pnlMostrarTemas.setLayout(new java.awt.CardLayout());

        btnSiguienteTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-next-35.png"))); // NOI18N

        btnTemaAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-previous-35.png"))); // NOI18N

        btnAplicarTema.setBackground(new java.awt.Color(0, 0, 0));
        btnAplicarTema.setForeground(new java.awt.Color(255, 255, 255));
        btnAplicarTema.setText("Aplicar tema");

        javax.swing.GroupLayout pnlTemasLayout = new javax.swing.GroupLayout(pnlTemas);
        pnlTemas.setLayout(pnlTemasLayout);
        pnlTemasLayout.setHorizontalGroup(
            pnlTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTemasLayout.createSequentialGroup()
                .addGroup(pnlTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTemasLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnTemaAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlMostrarTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguienteTema))
                    .addGroup(pnlTemasLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnAplicarTema)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlTemasLayout.setVerticalGroup(
            pnlTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTemasLayout.createSequentialGroup()
                .addGroup(pnlTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTemasLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(pnlMostrarTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTemasLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnSiguienteTema))
                    .addGroup(pnlTemasLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnTemaAnterior)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAplicarTema)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTemas);
        pnlTemas.setBounds(10, 40, 320, 270);

        pnlUsuario.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-audio-35.png"))); // NOI18N
        pnlUsuario.add(jLabel4);
        jLabel4.setBounds(40, 0, 35, 70);

        getContentPane().add(pnlUsuario);
        pnlUsuario.setBounds(340, 40, 230, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private PanelDegradado p;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarTema;
    private javax.swing.JLabel btnSiguienteTema;
    private javax.swing.JLabel btnTemaAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnlMostrarTemas;
    private javax.swing.JPanel pnlTemas;
    private javax.swing.JPanel pnlUsuario;
    // End of variables declaration//GEN-END:variables

}
