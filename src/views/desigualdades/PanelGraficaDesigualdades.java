
package views.desigualdades;

import java.awt.Color;
import javax.swing.JLabel;
/**
 *
 * @author Mariel
 */
public class PanelGraficaDesigualdades extends javax.swing.JPanel {

    public PanelGraficaDesigualdades() {
        initComponents();
         pnlRetroceder.setBackground(new Color(0,0,0, 100));
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRetroceder = new javax.swing.JPanel();
        lblRetroceder = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(430, 230));
        setMinimumSize(new java.awt.Dimension(430, 230));
        setPreferredSize(new java.awt.Dimension(430, 230));
        setLayout(null);

        pnlRetroceder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-arrow-pointing-left-35.png"))); // NOI18N

        javax.swing.GroupLayout pnlRetrocederLayout = new javax.swing.GroupLayout(pnlRetroceder);
        pnlRetroceder.setLayout(pnlRetrocederLayout);
        pnlRetrocederLayout.setHorizontalGroup(
            pnlRetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRetrocederLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblRetroceder)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        pnlRetrocederLayout.setVerticalGroup(
            pnlRetrocederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        add(pnlRetroceder);
        pnlRetroceder.setBounds(0, 0, 420, 30);
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getLblRetroceder() {
        return lblRetroceder;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblRetroceder;
    private javax.swing.JPanel pnlRetroceder;
    // End of variables declaration//GEN-END:variables
}
