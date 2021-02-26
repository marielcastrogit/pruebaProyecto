/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.jdesktop.swingx.border.DropShadowBorder;

public class PanelMostrarResultado extends javax.swing.JPanel {

    public PanelMostrarResultado() {
        initComponents();
        pnlRetroceder.setBackground(new Color(0,0,0,100));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMostrarResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMostrarIntervalo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGrafica = new javax.swing.JButton();
        pnlRetroceder = new javax.swing.JPanel();
        lblRetroceder = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(430, 230));
        setMinimumSize(new java.awt.Dimension(430, 230));
        setPreferredSize(new java.awt.Dimension(430, 230));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());

        lblMostrarResultado.setBackground(new java.awt.Color(255, 255, 255));
        lblMostrarResultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMostrarResultado.setForeground(new java.awt.Color(0, 0, 0));
        lblMostrarResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrarResultado.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblMostrarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblMostrarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        add(jPanel1);
        jPanel1.setBounds(80, 34, 258, 90);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());

        lblMostrarIntervalo.setBackground(new java.awt.Color(255, 255, 255));
        lblMostrarIntervalo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMostrarIntervalo.setForeground(new java.awt.Color(0, 0, 0));
        lblMostrarIntervalo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrarIntervalo.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Intervalo solucion: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblMostrarIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMostrarIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel2);
        jPanel2.setBounds(80, 140, 257, 80);

        btnGrafica.setBackground(new java.awt.Color(0, 0, 0));
        btnGrafica.setForeground(new java.awt.Color(255, 255, 255));
        btnGrafica.setText("Grafica");
        add(btnGrafica);
        btnGrafica.setBounds(350, 170, 60, 30);

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
            .addComponent(lblRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        add(pnlRetroceder);
        pnlRetroceder.setBounds(0, 0, 420, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo sin fondo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        jLabel4.setBorder(dropShadowBorder1);
        add(jLabel4);
        jLabel4.setBounds(0, 0, 430, 230);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnGrafica() {
        return btnGrafica;
    }

    public JLabel getLblRetroceder() {
        return lblRetroceder;
    }

    public JLabel getLblMostrarIntervalo() {
        return lblMostrarIntervalo;
    }

    public JLabel getLblMostrarResultado() {
        return lblMostrarResultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrafica;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMostrarIntervalo;
    private javax.swing.JLabel lblMostrarResultado;
    private javax.swing.JLabel lblRetroceder;
    private javax.swing.JPanel pnlRetroceder;
    // End of variables declaration//GEN-END:variables
}
