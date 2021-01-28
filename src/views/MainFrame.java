/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.MainFrameController;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import models.otros.PanelDegradado;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Usuario
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        pnlExamen = new javax.swing.JPanel();
        lblExamen = new javax.swing.JLabel();
        lblIconoExamen = new javax.swing.JLabel();
        pnlIniciarSesion = new javax.swing.JPanel();
        lblInicioSesion = new javax.swing.JLabel();
        lblIconoUsuario = new javax.swing.JLabel();
        pnlAjustes = new javax.swing.JPanel();
        lblAjustes = new javax.swing.JLabel();
        lblIconoAjustes = new javax.swing.JLabel();
        pnlResolver = new javax.swing.JPanel();
        lblResolver = new javax.swing.JLabel();
        lblIconoResolver = new javax.swing.JLabel();
        pnlDocumentos = new javax.swing.JPanel();
        lblDocumentos = new javax.swing.JLabel();
        lblIconoDocumentos = new javax.swing.JLabel();
        pnlPractica = new javax.swing.JPanel();
        lblPractica = new javax.swing.JLabel();
        lblIconoPractica = new javax.swing.JLabel();
        pnlMostrarMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(774, 581));
        setMinimumSize(new java.awt.Dimension(774, 581));
        setPreferredSize(new java.awt.Dimension(774, 581));
        getContentPane().setLayout(null);

        pnlMenu.setMinimumSize(new java.awt.Dimension(250, 474));
        pnlMenu.setPreferredSize(new java.awt.Dimension(49, 474));

        pnlExamen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblExamen.setText("Examen");

        lblIconoExamen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-test-passed-35.png"))); // NOI18N

        javax.swing.GroupLayout pnlExamenLayout = new javax.swing.GroupLayout(pnlExamen);
        pnlExamen.setLayout(pnlExamenLayout);
        pnlExamenLayout.setHorizontalGroup(
            pnlExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExamenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlExamenLayout.setVerticalGroup(
            pnlExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExamenLayout.createSequentialGroup()
                .addGroup(pnlExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlExamenLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlExamenLayout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(lblIconoExamen)))
                .addContainerGap())
        );

        pnlIniciarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInicioSesion.setText("Iniciar sesión");

        lblIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-male-user-35.png"))); // NOI18N

        javax.swing.GroupLayout pnlIniciarSesionLayout = new javax.swing.GroupLayout(pnlIniciarSesion);
        pnlIniciarSesion.setLayout(pnlIniciarSesionLayout);
        pnlIniciarSesionLayout.setHorizontalGroup(
            pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIniciarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlIniciarSesionLayout.setVerticalGroup(
            pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIniciarSesionLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIconoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlAjustes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAjustes.setText("Ajustes");

        lblIconoAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-settings-35.png"))); // NOI18N

        javax.swing.GroupLayout pnlAjustesLayout = new javax.swing.GroupLayout(pnlAjustes);
        pnlAjustes.setLayout(pnlAjustesLayout);
        pnlAjustesLayout.setHorizontalGroup(
            pnlAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAjustesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAjustesLayout.setVerticalGroup(
            pnlAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAjustesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIconoAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlResolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblResolver.setText("Resolver");

        lblIconoResolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-approve-35.png"))); // NOI18N

        javax.swing.GroupLayout pnlResolverLayout = new javax.swing.GroupLayout(pnlResolver);
        pnlResolver.setLayout(pnlResolverLayout);
        pnlResolverLayout.setHorizontalGroup(
            pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlResolverLayout.setVerticalGroup(
            pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResolverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIconoResolver, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(lblResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlDocumentos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDocumentos.setText("Documentos");

        lblIconoDocumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-documents-35.png"))); // NOI18N

        javax.swing.GroupLayout pnlDocumentosLayout = new javax.swing.GroupLayout(pnlDocumentos);
        pnlDocumentos.setLayout(pnlDocumentosLayout);
        pnlDocumentosLayout.setHorizontalGroup(
            pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDocumentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoDocumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDocumentosLayout.setVerticalGroup(
            pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDocumentosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDocumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIconoDocumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlPractica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPractica.setText("Práctica");

        lblIconoPractica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-pencil-35.png"))); // NOI18N

        javax.swing.GroupLayout pnlPracticaLayout = new javax.swing.GroupLayout(pnlPractica);
        pnlPractica.setLayout(pnlPracticaLayout);
        pnlPracticaLayout.setHorizontalGroup(
            pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPracticaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoPractica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(lblPractica, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPracticaLayout.setVerticalGroup(
            pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPracticaLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblPractica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlPracticaLayout.createSequentialGroup()
                .addComponent(lblIconoPractica)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-menu-42.png"))); // NOI18N

        javax.swing.GroupLayout pnlMostrarMenuLayout = new javax.swing.GroupLayout(pnlMostrarMenu);
        pnlMostrarMenu.setLayout(pnlMostrarMenuLayout);
        pnlMostrarMenuLayout.setHorizontalGroup(
            pnlMostrarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostrarMenuLayout.createSequentialGroup()
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMostrarMenuLayout.setVerticalGroup(
            pnlMostrarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostrarMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(pnlMostrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPractica, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDocumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnlIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlResolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPractica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 123, Short.MAX_VALUE))
            .addComponent(pnlMostrarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(0, 96, 49, 503);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/LogoApp (3).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 0, 350, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 78);

        desktop.setPreferredSize(new java.awt.Dimension(518, 700));

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        desktop.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(desktop);
        desktop.setBounds(65, 103, 690, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciar() {
        setControllers();
        setSombraPanel();
        setPanelsDegradados();
        System.out.println(desktop.getWidth());
        System.out.println(desktop.getLocation());
        System.out.println(desktop.getHeight());
        setSombraMenu();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void setSombraPanel() {
        DropShadowBorder c = new DropShadowBorder();
        c.setShadowSize(8);
        c.setShowBottomShadow(false);

        c.setShadowOpacity(0.2f);
        c.setShadowColor(Color.WHITE);
        pnlMostrarMenu.setBorder(c);
    }

    private void setSombraMenu() {
        DropShadowBorder b = new DropShadowBorder();
        b.setShadowSize(8);
        b.setCornerSize(11);
        b.setShadowOpacity(1.0f);
        b.setShowBottomShadow(true);
        b.setShowRightShadow(true);
        b.setShowTopShadow(true);
        pnlMenu.setBorder(b);

    }

    private void setPanelsDegradados() {
        p1 = new PanelDegradado();
        p2 = new PanelDegradado();
        p3 = new PanelDegradado();
        p4 = new PanelDegradado();
        p5 = new PanelDegradado();
        p6 = new PanelDegradado();

        pnlIniciarSesion.add(p1);
        p1.setBounds(0, 48, 190, 10);

        pnlAjustes.add(p2);
        p2.setBounds(0, 48, 190, 10);

        pnlResolver.add(p3);
        p3.setBounds(0, 48, 190, 10);

        pnlDocumentos.add(p4);
        p4.setBounds(0, 48, 190, 10);

        pnlPractica.add(p5);
        p5.setBounds(0, 48, 190, 10);

        pnlExamen.add(p6);
        p6.setBounds(0, 48, 190, 10);

    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    private void setControllers() {
        mfc = new MainFrameController(this);

        lblMenu.addMouseListener(mfc);

        pnlIniciarSesion.addMouseListener(mfc);
        lblInicioSesion.addMouseListener(mfc);
        lblIconoUsuario.addMouseListener(mfc);

        pnlAjustes.addMouseListener(mfc2);
        lblAjustes.addMouseListener(mfc2);
        lblIconoAjustes.addMouseListener(mfc2);

        pnlResolver.addMouseListener(mfc2);
        lblResolver.addMouseListener(mfc2);
        lblIconoAjustes.addMouseListener(mfc2);

        pnlDocumentos.addMouseListener(mfc2);
        lblDocumentos.addMouseListener(mfc2);
        lblIconoDocumentos.addMouseListener(mfc2);

        pnlPractica.addMouseListener(mfc2);
        lblPractica.addMouseListener(mfc2);
        lblIconoPractica.addMouseListener(mfc2);

        pnlExamen.addMouseListener(mfc2);
        lblExamen.addMouseListener(mfc2);
        lblIconoExamen.addMouseListener(mfc2);
    }

    public JLabel getLblAjustes() {
        return lblAjustes;
    }

    public JLabel getLblIconoAjustes() {
        return lblIconoAjustes;
    }

    public JPanel getPnlAjustes() {
        return pnlExamen;
    }

    public JLabel getLblInicioSesion() {
        return lblInicioSesion;
    }

    public JPanel getPnlInicioSesion() {
        return pnlIniciarSesion;
    }

    public JLabel getInicio() {
        return lblInicioSesion;
    }

    public JLabel getLblIconoUsuario() {
        return lblIconoUsuario;
    }

    public JLabel getLblIconoResolver() {
        return lblIconoResolver;
    }

    public JLabel getLblResolver() {
        return lblResolver;
    }

    public JPanel getPnlResolver() {
        return pnlResolver;
    }

    public JLabel getLblMenu() {
        return lblMenu;
    }

    public JPanel getPnlMenu() {
        return pnlMenu;
    }

    public JLabel getLblDocumentos() {
        return lblDocumentos;
    }

    public JLabel getLblIconoDocumentos() {
        return lblIconoDocumentos;
    }

    public JPanel getPnlDocumentos() {
        return pnlDocumentos;
    }

    public JLabel getLblExamen() {
        return lblExamen;
    }

    public JLabel getLblPractica() {
        return lblPractica;
    }

    public JLabel getLblIconoExamen() {
        return lblIconoExamen;
    }

    public JLabel getLblIconoPractica() {
        return lblIconoPractica;
    }

    public JPanel getPnlExamen() {
        return pnlExamen;
    }

    public JPanel getPnlPractica() {
        return pnlPractica;
    }

    public PanelDegradado getP1() {
        return p1;
    }

    public PanelDegradado getP2() {
        return p2;
    }

    public PanelDegradado getP3() {
        return p3;
    }

    public PanelDegradado getP4() {
        return p4;
    }

    public PanelDegradado getP5() {
        return p5;
    }

    public JDesktopPane getjDesktopPane1() {
        return desktop;
    }

    private MainFrameController mfc, mfc2;

    private PanelDegradado p1;
    private PanelDegradado p2;
    private PanelDegradado p3;
    private PanelDegradado p4;
    private PanelDegradado p5;
    private PanelDegradado p6;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAjustes;
    private javax.swing.JLabel lblDocumentos;
    private javax.swing.JLabel lblExamen;
    private javax.swing.JLabel lblIconoAjustes;
    private javax.swing.JLabel lblIconoDocumentos;
    private javax.swing.JLabel lblIconoExamen;
    private javax.swing.JLabel lblIconoPractica;
    private javax.swing.JLabel lblIconoResolver;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblPractica;
    private javax.swing.JLabel lblResolver;
    private javax.swing.JPanel pnlAjustes;
    private javax.swing.JPanel pnlDocumentos;
    private javax.swing.JPanel pnlExamen;
    private javax.swing.JPanel pnlIniciarSesion;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMostrarMenu;
    private javax.swing.JPanel pnlPractica;
    private javax.swing.JPanel pnlResolver;
    // End of variables declaration//GEN-END:variables
}
