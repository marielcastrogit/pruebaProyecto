package controllers;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import models.otros.Sonido;
import views.AcercaDeNosotros;
import views.Ajustes;
import views.DocumentoPrincipal;
import views.MMDocumento;
import views.MMResolver;
import views.MainFrame;
import views.InicioSesion;
import views.Resolver;

public class MainFrameController implements MouseListener {

    protected static MainFrame mf;
    private int clic;
    private JInternalFrame internoAnterior;
    public static InicioSesion iniciarSesion;
    private Resolver resolver;
    private Ajustes ajustes;
    private DocumentoPrincipal documento;
    private AcercaDeNosotros info;

    private MMResolver resolverMM;
    private MMDocumento documentoMM;

    private String interno;

    public MainFrameController(MainFrame mf) {
        this.mf = mf;
        clic = 0;
        interno = "";
        iniciarInternos();
    }

    private void iniciarInternos() {
        //OM - Ocultar Menu
        iniciarSesion = new InicioSesion();
        resolver = new Resolver();
        ajustes = new Ajustes();
        documento = new DocumentoPrincipal();
        info = new AcercaDeNosotros();

        iniciarSesion.setVisible(false);
        resolver.setVisible(true);
        ajustes.setVisible(false);
        documento.setVisible(false);
        info.setVisible(false);

        iniciarSesion.setLocation(35, 18);
        resolver.setLocation(35, 18);
        ajustes.setLocation(35, 18);;
        documento.setLocation(35, 18);;
        info.setLocation(35, 18);

        mf.getjDesktopPane1().add(iniciarSesion);
        mf.getjDesktopPane1().add(resolver);
        mf.getjDesktopPane1().add(ajustes);
        mf.getjDesktopPane1().add(documento);
        mf.getjDesktopPane1().add(info);
        //MM - Mostrar Menu
        resolverMM = new MMResolver();
        documentoMM = new MMDocumento();

        resolverMM.setVisible(false);
        documentoMM.setVisible(false);

        resolverMM.setLocation(20, 18);
        documentoMM.setLocation(20, 18);

        mf.getjDesktopPane1().add(resolverMM);
        mf.getjDesktopPane1().add(documentoMM);
        internoAnterior = resolver;
        interno = "Resolver";

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();//o de origen del evento
/////////////////////////////CLICK EN EL LABEL DEL MENU///////////////////////////////////
        if (o == mf.getLblMenu()) {
            clic++;
            if (clic % 2 == 0) {
                ocultarMenu();
            }
            if (clic % 2 != 0) {
                mostrarMenu();
            }

            System.out.println("INTERNO ANTERIOR: " + internoAnterior);
            if (mf.getjDesktopPane1().getWidth() == 495 && mf.getjDesktopPane1().getHeight() == 440) {
                System.out.println("PANEL DE 495 POR 440");

                if (interno.equals("Iniciar Sesion")) {
                    iniciarSesion.redimensionar(true);
                }
                if (interno.equals("Ajustes")) {
                    ajustes.redimensionar(true);
                }
                if (interno.equals("Resolver")) {
                    resolver.redimensionar(true);
                }
                if (interno.equals("Documentos")) {
                    documento.redimensionar(true);
                }
                if (interno.equals("Info")) {
                    info.redimensionar(true);
                }
//                if (interno.equals("Examen")) {
//                    iniciarSesion.redimensionar();
//                }
            } else if (mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {

                if (interno.equals("Iniciar Sesion")) {
                    iniciarSesion.redimensionar(false);
                }
                if (interno.equals("Ajustes")) {
                    ajustes.redimensionar(false);
                }
                if (interno.equals("Resolver")) {
                    resolver.redimensionar(false);
                }
                if (interno.equals("Documentos")) {
                    documento.redimensionar(false);
                }
                if (interno.equals("Info")) {
                    info.redimensionar(false);
                }
            }

        }
/////////////////////////////CLICK EN EL LABEL DEL USUARIO INICIO SESION///////////////////////////////////
        if (o == mf.getLblIconoUsuario() || o == mf.getLblInicioSesion() || o == mf.getPnlInicioSesion()) {
            Sonido.entrada();
            ocultarMenu();
            System.out.println("INTERNO ANTERIOR: " + internoAnterior);

            internoAnterior.setVisible(false);
            iniciarSesion.setVisible(true);
            if (clic % 2 == 0) {
                clic++;
            }
            if (clic % 2 != 0) {
                clic--;
            }
            if (mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {
                iniciarSesion.redimensionar(false);
            } else {
                iniciarSesion.redimensionar(true);
            }
            interno = "Iniciar Sesion";

            internoAnterior = iniciarSesion;
        }
/////////////////////////////CLICK EN EL LABEL DE AJUSTES///////////////////////////////////
        if (o == mf.getPnlAjustes() || o == mf.getLblAjustes() || o == mf.getLblIconoAjustes()) {
            Sonido.entrada();
            ocultarMenu();
            System.out.println("INTERNO ANTERIOR: " + internoAnterior);

            internoAnterior.setVisible(false);
            ajustes.setVisible(true);
            if (clic % 2 == 0) {
                clic++;
            }
            if (clic % 2 != 0) {
                clic--;
            }
            if (mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {
                ajustes.redimensionar(false);
            } else {
                ajustes.redimensionar(true);
            }
            interno = "Ajustes";
            internoAnterior = ajustes;
        }
/////////////////////////////CLICK EN EL PANEL DE RESOLVER///////////////////////////////////
        if (o == mf.getPnlResolver() || o == mf.getLblResolver() || o == mf.getLblIconoResolver()) {
            Sonido.entrada();
            ocultarMenu();
            internoAnterior.setVisible(false);
            resolver.setVisible(true);
            if (clic % 2 == 0) {
                clic++;
            }
            if (clic % 2 != 0) {
                clic--;
            }
            if (mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {
                resolver.redimensionar(false);
            } else {
                resolver.redimensionar(true);
            }
            interno = "Resolver";
            internoAnterior = resolver;
        }
/////////////////////////////CLICK EN EL PANEL DE DOCUMENTOS//////////////////////////////////
        if (o == mf.getPnlDocumentos() || o == mf.getLblDocumentos() || o == mf.getLblIconoDocumentos()) {
            Sonido.entrada();
            ocultarMenu();

            internoAnterior.setVisible(false);
            documento.setVisible(true);
            if (clic % 2 == 0) {
                clic++;
            }
            if (clic % 2 != 0) {
                clic--;
            }
            if (mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {
                documento.redimensionar(false);
            } else {
                documento.redimensionar(true);
            }
            interno = "Documento";

            internoAnterior = documento;
        }
///////////////////////////////CLICK EN EL PANEL DE PRACTICA//////////////////////////////////
        if (o == mf.getPnlInfo() || o == mf.getLblInfo() || o == mf.getLblIconoInfo()) {
            Sonido.entrada();
            ocultarMenu();

            info.setVisible(false);
            info.setVisible(true);
            if (clic % 2 == 0) {
                clic++;
            }
            if (clic % 2 != 0) {
                clic--;
            }
            if (mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {
                info.redimensionar(false);
            } else {
                info.redimensionar(true);
            }
            interno = "Info";

            internoAnterior = info;
        }
/////////////////////////////CLICK EN EL PANEL DE EXAMENES//////////////////////////////////
//        if (o == mf.getPnlExamen() || o == mf.getLblExamen() || o == mf.getLblIconoExamen()) {
//            Sonido.entrada();
//            ocultarMenu();
//            resolver.setVisible(true);
//            if (clic % 2 == 0) {
//                clic++;
//            }
//            if (clic % 2 != 0) {
//                clic--;
//            }
//            interno = "Examen";
//        }

    }

    private void mostrarMenu() {//frame pequeño
        mf.getPnlMenu().setSize(250, 502);
        mf.getjDesktopPane1().setBounds(260, 103, 495, 440);
    }

    private void ocultarMenu() {//frame grande
        mf.getPnlMenu().setSize(49, 502);
        mf.getjDesktopPane1().setBounds(65, 103, 690, 440);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object o = e.getSource();

        if (o == mf.getLblIconoUsuario() || o == mf.getLblInicioSesion() || o == mf.getPnlInicioSesion()) {
            mf.getLblIconoUsuario().setSize(83, 45);
            Sonido.icono();
        }

        if (o == mf.getPnlAjustes() || o == mf.getLblAjustes() || o == mf.getLblIconoAjustes()) {
            mf.getLblIconoAjustes().setSize(83, 45);
            Sonido.icono();
        }

        if (o == mf.getPnlResolver() || o == mf.getLblResolver() || o == mf.getLblIconoResolver()) {
            mf.getLblIconoResolver().setSize(83, 45);
            Sonido.icono();
        }

        if (o == mf.getPnlDocumentos() || o == mf.getLblDocumentos() || o == mf.getLblIconoDocumentos()) {
            mf.getLblIconoDocumentos().setSize(100, 45);
            Sonido.icono();
        }

        if (o == mf.getPnlInfo() || o == mf.getLblInfo() || o == mf.getLblIconoInfo()) {
            mf.getLblIconoInfo().setSize(100, 45);
            Sonido.icono();
        }

        if (o == mf.getPnlExamen() || o == mf.getLblExamen() || o == mf.getLblIconoExamen()) {
            mf.getLblIconoExamen().setSize(100, 45);
            Sonido.icono();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object o = e.getSource();

        if ((o == mf.getPnlInicioSesion() || o == mf.getLblIconoUsuario()
                || o == mf.getLblInicioSesion())) {
            mf.getLblIconoUsuario().setSize(35, 35);
            mf.getLblIconoUsuario().setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-male-user-35.png")));
        }

        if (o == mf.getPnlAjustes() || o == mf.getLblAjustes() || o == mf.getLblIconoAjustes()) {
            mf.getLblIconoAjustes().setSize(35, 35);
        }

        if (o == mf.getPnlResolver() || o == mf.getLblResolver() || o == mf.getLblIconoResolver()) {
            mf.getLblIconoResolver().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-approve-35.png")));
            mf.getLblIconoResolver().setSize(35, 35);
        }

        if (o == mf.getPnlDocumentos() || o == mf.getLblDocumentos() || o == mf.getLblIconoDocumentos()) {
            mf.getLblIconoDocumentos().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-documents-35.png")));
            mf.getLblIconoDocumentos().setSize(35, 35);
        }

        if (o == mf.getPnlInfo() || o == mf.getLblInfo() || o == mf.getLblIconoInfo()) {
            mf.getLblIconoInfo().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-high-importance-35.png")));
            mf.getLblIconoInfo().setSize(35, 35);
        }

        if (o == mf.getPnlExamen() || o == mf.getLblExamen() || o == mf.getLblIconoExamen()) {
            mf.getLblIconoExamen().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-test-passed-35.png")));
            mf.getLblIconoExamen().setSize(35, 35);
        }
    }


}
