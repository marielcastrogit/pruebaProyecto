package views;

import controllers.MainFrameController;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import models.otros.PanelDegradado;
import org.jdesktop.swingx.border.DropShadowBorder;

public class MainFrame extends javax.swing.JFrame {

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
        pnlMostrarMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        pnlIniciarSesion = new javax.swing.JPanel();
        lblInicioSesion = new javax.swing.JLabel();
        lblIconoUsuario = new javax.swing.JLabel();
        pnlAjustes = new javax.swing.JPanel();
        lblAjustes = new javax.swing.JLabel();
        lblIconoAjustes = new javax.swing.JLabel();
        pnlResolver = new javax.swing.JPanel();
        lblResolver = new javax.swing.JLabel();
        lblIconoResolver = new javax.swing.JLabel();
        pnlPractica = new javax.swing.JPanel();
        lblPractica = new javax.swing.JLabel();
        lblIconoPractica = new javax.swing.JLabel();
        pnlDocumentos = new javax.swing.JPanel();
        lblDocumentos = new javax.swing.JLabel();
        lblIconoDocumentos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(774, 581));
        setMinimumSize(new java.awt.Dimension(774, 581));
        setPreferredSize(new java.awt.Dimension(774, 581));
        getContentPane().setLayout(null);

        pnlMenu.setMinimumSize(new java.awt.Dimension(250, 474));
        pnlMenu.setPreferredSize(new java.awt.Dimension(255, 474));

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
                .addGap(10, 10, 10)
                .addGroup(pnlExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconoExamen))
                .addContainerGap(11, Short.MAX_VALUE))
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

        pnlIniciarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
            .addGroup(pnlIniciarSesionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconoUsuario))
                .addContainerGap(11, Short.MAX_VALUE))
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
                    .addComponent(lblAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconoAjustes))
                .addContainerGap(11, Short.MAX_VALUE))
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
            .addGroup(pnlResolverLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconoResolver))
                .addContainerGap(11, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(lblPractica, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPracticaLayout.setVerticalGroup(
            pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPracticaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlPracticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPractica, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconoPractica))
                .addContainerGap(11, Short.MAX_VALUE))
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
                    .addComponent(lblDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconoDocumentos))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(pnlMostrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlPractica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlDocumentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlResolver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlAjustes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlIniciarSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(39, 39, 39)
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
                .addContainerGap(104, Short.MAX_VALUE))
            .addComponent(pnlMostrarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(0, 96, 49, 503);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/LogoApp (3).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 0, 350, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(590, 60, 60, 10);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(660, 0, 110, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel4.setText("jLabel2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 50, 50, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel5.setText("jLabel2");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(660, 50, 50, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(590, 0, 60, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel7.setText("jLabel2");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(570, 0, 10, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel8.setText("jLabel2");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 60, 60, 10);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel9.setText("jLabel2");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 110, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel10.setText("jLabel2");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(720, 50, 50, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel11.setText("jLabel2");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 50, 50, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel12.setText("jLabel2");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(120, 0, 60, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoLogo.png"))); // NOI18N
        jLabel13.setText("jLabel2");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(190, 0, 10, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 78);

        desktop.setPreferredSize(new java.awt.Dimension(518, 700));
        getContentPane().add(desktop);
        desktop.setBounds(85, 103, 670, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciar() {
        setControllers();
        setSombraPanel();
        setPanelsDegradados();
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

        pnlAjustes.addMouseListener(mfc);
        lblIconoAjustes.addMouseListener(mfc);
        lblIconoAjustes.addMouseListener(mfc);

        pnlResolver.addMouseListener(mfc);
        lblResolver.addMouseListener(mfc);
        lblIconoResolver.addMouseListener(mfc);

        pnlDocumentos.addMouseListener(mfc);
        lblDocumentos.addMouseListener(mfc);
        lblIconoDocumentos.addMouseListener(mfc);

        pnlPractica.addMouseListener(mfc);
        lblPractica.addMouseListener(mfc);
        lblIconoPractica.addMouseListener(mfc);

        pnlExamen.addMouseListener(mfc);
        lblExamen.addMouseListener(mfc);
        lblIconoExamen.addMouseListener(mfc);
        desktop.addMouseListener(mfc);
    }

    public JLabel getLblAjustes() {
        return lblIconoAjustes;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
