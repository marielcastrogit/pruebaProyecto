package controllers;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import views.MMAjustes;
import views.MMInicioSesion;
import views.MMResolver;
import views.MainFrame;
import views.OMAjustes;
import views.OMInicioSesion;
import views.OMResolver;

public class MainFrameController implements MouseListener {

    private final MainFrame mf;
    private int clic;
    private Clip efectoSonido;
    private JInternalFrame interno;

    private OMInicioSesion iniciarSesionOM;
    private OMResolver resolverOM;
    private OMAjustes ajustesOM;

    private MMInicioSesion iniciarSesionMM;
    private MMResolver resolverMM;
    private MMAjustes ajustesMM;

    private JInternalFrame internoAnterior;

    public MainFrameController(MainFrame mf) {
        this.mf = mf;
        clic = 0;
        internoAnterior = new JInternalFrame();
        iniciarInternos();
    }

    private void iniciarInternos() {
        //OM - Ocultar Menu
        iniciarSesionOM = new OMInicioSesion();
        resolverOM = new OMResolver();
        ajustesOM = new OMAjustes();

        iniciarSesionOM.setVisible(false);
        resolverOM.setVisible(true);
        ajustesOM.setVisible(false);

        iniciarSesionOM.setLocation(35, 18);
        resolverOM.setLocation(35, 18);
        ajustesOM.setLocation(35, 18);;

        mf.getjDesktopPane1().add(iniciarSesionOM);
        mf.getjDesktopPane1().add(resolverOM);
        mf.getjDesktopPane1().add(ajustesOM);

        //MM - Mostrar Menu
        iniciarSesionMM = new MMInicioSesion();
        resolverMM = new MMResolver();
        ajustesMM = new MMAjustes();

        iniciarSesionMM.setVisible(false);
        resolverMM.setVisible(false);
        ajustesMM.setVisible(false);

        iniciarSesionMM.setLocation(20, 18);
        resolverMM.setLocation(20, 18);
        ajustesMM.setLocation(20, 18);

        mf.getjDesktopPane1().add(iniciarSesionMM);
        mf.getjDesktopPane1().add(resolverMM);
        mf.getjDesktopPane1().add(ajustesMM);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();//o de origen del evento

        if (o == mf.getLblMenu()) {

            clic++;
            System.out.println("label Menu" + clic);
            if (clic % 2 == 0) {
                ocultarMenu();
            }
            if (clic % 2 != 0) {
                mostrarMenu();
            }

            if (resolverOM.isVisible() && mf.getjDesktopPane1().getWidth() == 495 && mf.getjDesktopPane1().getHeight() == 440) {
                resolverOM.setVisible(false);
                resolverMM.setVisible(true);
                internoAnterior = resolverMM;
            }
            if (internoAnterior == resolverMM && mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {
                resolverOM.setVisible(true);
                resolverMM.setVisible(false);
                internoAnterior = resolverOM;
            }
            if (internoAnterior == iniciarSesionOM && mf.getjDesktopPane1().getWidth() == 495 && mf.getjDesktopPane1().getHeight() == 440) {
                internoAnterior.setVisible(false);
                iniciarSesionMM.setVisible(true);
                internoAnterior = iniciarSesionMM;
            }

            if (internoAnterior == iniciarSesionMM && mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {
                internoAnterior.setVisible(false);
                iniciarSesionOM.setVisible(true);
                internoAnterior = iniciarSesionOM;
            }

            if (internoAnterior == ajustesOM && mf.getjDesktopPane1().getWidth() == 495 && mf.getjDesktopPane1().getHeight() == 440) {
                internoAnterior.setVisible(false);
                ajustesMM.setVisible(true);
                internoAnterior = ajustesMM;
            }

            if (internoAnterior == ajustesMM && mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {
                internoAnterior.setVisible(false);
                ajustesOM.setVisible(true);
                internoAnterior = ajustesOM;
            }

        }

        if (o == mf.getLblIconoUsuario() || o == mf.getLblInicioSesion() || o == mf.getPnlInicioSesion()) {
            reproducirSonidoEntrada();
            ocultarMenu();
            if (mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {
                if (clic % 2 == 0) {
                    clic++;
                }
                if (clic % 2 != 0) {
                    clic--;
                }
                internoAnterior.setVisible(false);
                iniciarSesionOM.setVisible(true);
                internoAnterior = iniciarSesionOM;

            }

        }

        if (o == mf.getPnlAjustes() || o == mf.getLblAjustes() || o == mf.getLblIconoAjustes()) {
            reproducirSonidoEntrada();
            ocultarMenu();
            if (mf.getjDesktopPane1().getWidth() == 690 && mf.getjDesktopPane1().getHeight() == 440) {

                if (clic % 2 == 0) {
                    clic++;
                }
                if (clic % 2 != 0) {
                    clic--;
                }
                System.out.println("ajustes:" + clic);
                internoAnterior.setVisible(false);
                ajustesOM.setVisible(true);
                internoAnterior = ajustesOM;
            }
        }

        if (o == mf.getPnlResolver() || o == mf.getLblResolver() || o == mf.getLblIconoResolver()) {
            reproducirSonidoEntrada();
        }

        if (o == mf.getPnlDocumentos() || o == mf.getLblDocumentos() || o == mf.getLblIconoDocumentos()) {
            reproducirSonidoEntrada();
        }

        if (o == mf.getPnlPractica() || o == mf.getLblPractica() || o == mf.getLblIconoPractica()) {
            reproducirSonidoEntrada();
        }

        if (o == mf.getPnlExamen() || o == mf.getLblExamen() || o == mf.getLblIconoExamen()) {
            reproducirSonidoEntrada();
        }

    }

    private void mostrarMenu() {//frame pequeño
        mf.getPnlMenu().setSize(255, 502);
        mf.getjDesktopPane1().setBounds(260, 103, 495, 440);
    }

    private void ocultarMenu() {//frame grande
        mf.getPnlMenu().setSize(49, 502);
        mf.getjDesktopPane1().setBounds(65, 103, 690, 440);
    }

    private void reproducirSonidoIcono() {
        try {
            efectoSonido = AudioSystem.getClip();
            File archivoSonido = new File("src/resources/audio/sonidoMenu.wav");
            efectoSonido.open(AudioSystem.getAudioInputStream(archivoSonido));
            efectoSonido.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException error) {
        }

    }

    private void reproducirSonidoEntrada() {
        try {
            efectoSonido = AudioSystem.getClip();
            File archivoSonido = new File("src/resources/audio/sonidoEntradaMenu.wav");
            efectoSonido.open(AudioSystem.getAudioInputStream(archivoSonido));
            efectoSonido.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException error) {
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object o = e.getSource();

        if (o == mf.getLblIconoUsuario() || o == mf.getLblInicioSesion() || o == mf.getPnlInicioSesion()) {
//            
            mf.getLblIconoUsuario().setSize(83, 45);
//            mf.getLblIconoUsuario().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-male-user-45.png")));
            reproducirSonidoIcono();
        }

        if (o == mf.getPnlAjustes() || o == mf.getLblAjustes() || o == mf.getLblIconoAjustes()) {
//            mf.getLblIconoAjustes().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-settings-45.png")));
            mf.getLblIconoAjustes().setSize(83, 45);
            reproducirSonidoIcono();
        }

        if (o == mf.getPnlResolver() || o == mf.getLblResolver() || o == mf.getLblIconoResolver()) {
//            mf.getLblIconoResolver().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-approve-45.png")));
            mf.getLblIconoResolver().setSize(83, 45);
            reproducirSonidoIcono();
        }

        if (o == mf.getPnlDocumentos() || o == mf.getLblDocumentos() || o == mf.getLblIconoDocumentos()) {
//            mf.getLblIconoDocumentos().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-documents-40.png")));
            mf.getLblIconoDocumentos().setSize(100, 45);
            reproducirSonidoIcono();
        }

        if (o == mf.getPnlPractica()
                || o == mf.getLblPractica() || o == mf.getLblIconoPractica()) {
//            mf.getLblIconoPractica().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-pencil-45.png")));
            mf.getLblIconoPractica().setSize(100, 45);
            reproducirSonidoIcono();
        }

        if (o
                == mf.getPnlExamen()
                || o == mf.getLblExamen() || o == mf.getLblIconoExamen()) {
//            mf.getLblIconoExamen().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-test-passed-45.png")));
            mf.getLblIconoExamen().setSize(100, 45);
            reproducirSonidoIcono();
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
//            mf.getLblIconoAjustes().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-settings-35.png")));
        }

        if (o == mf.getPnlResolver() || o == mf.getLblResolver() || o == mf.getLblIconoResolver()) {
            mf.getLblIconoResolver().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-approve-35.png")));
            mf.getLblIconoResolver().setSize(35, 35);
        }

        if (o == mf.getPnlDocumentos() || o == mf.getLblDocumentos() || o == mf.getLblIconoDocumentos()) {
            mf.getLblIconoDocumentos().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-documents-35.png")));
            mf.getLblIconoDocumentos().setSize(35, 35);
        }

        if (o == mf.getPnlPractica() || o == mf.getLblPractica() || o == mf.getLblIconoPractica()) {
            mf.getLblIconoPractica().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-pencil-35.png")));
            mf.getLblIconoPractica().setSize(35, 35);
        }

        if (o == mf.getPnlExamen() || o == mf.getLblExamen() || o == mf.getLblIconoExamen()) {
            mf.getLblIconoExamen().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-test-passed-35.png")));
            mf.getLblIconoExamen().setSize(35, 35);

        }
    }
}
