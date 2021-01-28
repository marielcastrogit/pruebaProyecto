/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.swing.JPanel;
import javax.swing.border.Border;
import org.jdesktop.swingx.border.DropShadowBorder;
import views.MainFrame;

/**
 *
 * @author Usuario
 */
public class MainFrameController implements MouseListener {

    private final MainFrame mf;
    private int clic;
    private Clip efectoSonido;

    public MainFrameController(MainFrame mf) {
        this.mf = mf;
        clic = 0;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();//o de origen del evento
        System.out.println("MOUSECLICKED" + o);
        if (o == mf.getLblMenu()) {
            clic++;
            if (clic % 2 != 0) {
                mostrarMenu();

            }
            if (clic % 2 == 0) {
                System.out.println("OCULTAR CLICK EVALUACION" + clic % 2);
                ocultarMenu();
            }
        }

        if (o == mf.getLblIconoUsuario() || o == mf.getLblInicioSesion() || o == mf.getPnlInicioSesion()) {
            reproducirSonidoEntrada();
        }

        if (o == mf.getPnlAjustes() || o == mf.getLblAjustes() || o == mf.getLblIconoAjustes()) {
            reproducirSonidoEntrada();
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

    private void mostrarMenu() {
        mf.getPnlMenu().setSize(250, 502);
        mf.getjDesktopPane1().setSize(718, 481);
    }

    private void ocultarMenu() {
        mf.getPnlMenu().setSize(49, 502);
        mf.getjDesktopPane1().setSize(718, 503);
    }

    private void reproducirSonidoIcono() {
        try {
            efectoSonido = AudioSystem.getClip();
            File archivoSonido = new File("C:\\Users\\Usuario\\Documents\\Ingenieria en sistemas\\III Cuatrimestre\\Programacion\\Proyecto\\MathProject\\src\\resources\\sonidos\\sonidoMenu (online-audio-converter.com).wav");
            efectoSonido.open(AudioSystem.getAudioInputStream(archivoSonido));
            efectoSonido.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException error) {
        }

    }

    private void reproducirSonidoEntrada() {
        try {
            efectoSonido = AudioSystem.getClip();
            File archivoSonido = new File("C:\\Users\\Usuario\\Documents\\Ingenieria en sistemas\\III Cuatrimestre\\Programacion\\Proyecto\\MathProject\\src\\resources\\sonidos\\sonidoEntradaMenu.wav");
            efectoSonido.open(AudioSystem.getAudioInputStream(archivoSonido));
            efectoSonido.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException error) {
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("MOUSE ENTERED" + e.getSource());
        Object o = e.getSource();

        if (o == mf.getLblIconoUsuario() || o == mf.getLblInicioSesion() || o == mf.getPnlInicioSesion()) {
            mf.getLblIconoUsuario().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-male-user-45.png")));
            mf.getLblInicioSesion().setSize(83, 45);
            reproducirSonidoIcono();
        }

        if (o == mf.getPnlAjustes() || o == mf.getLblAjustes() || o == mf.getLblIconoAjustes()) {
            mf.getLblIconoAjustes().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-settings-45.png")));
            mf.getLblIconoAjustes().setSize(83, 45);
//            reproducirSonidoIcono();
        }

        if (o == mf.getPnlResolver() || o == mf.getLblResolver() || o == mf.getLblIconoResolver()) {
            mf.getLblIconoResolver().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-approve-45.png")));
            mf.getLblIconoResolver().setSize(83, 45);
//            reproducirSonidoIcono();
        }

        if (o == mf.getPnlDocumentos() || o == mf.getLblDocumentos() || o == mf.getLblIconoDocumentos()) {
            mf.getLblIconoDocumentos().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-documents-40.png")));
            mf.getLblIconoDocumentos().setSize(100, 45);
//            reproducirSonidoIcono();
        }

        if (o == mf.getPnlPractica() || o == mf.getLblPractica() || o == mf.getLblIconoPractica()) {
            mf.getLblIconoPractica().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-pencil-45.png")));
            mf.getLblIconoPractica().setSize(100, 45);
//            reproducirSonidoIcono();
        }

        if (o == mf.getPnlExamen() || o == mf.getLblExamen() || o == mf.getLblIconoExamen()) {
            mf.getLblIconoExamen().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-test-passed-45.png")));
            mf.getLblIconoExamen().setSize(100, 45);
//            reproducirSonidoIcono();
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
        System.out.println("MOUSE EXITED" + o);
        if ((o == mf.getPnlInicioSesion() || o == mf.getLblIconoUsuario()
                || o == mf.getLblInicioSesion())) {
            mf.getLblIconoUsuario().setSize(35, 35);
            mf.getLblIconoUsuario().setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-male-user-35.png")));
        }

        if (o == mf.getPnlAjustes() || o == mf.getLblAjustes() || o == mf.getLblIconoAjustes()) {
            mf.getLblIconoAjustes().setSize(35, 35);
            mf.getLblIconoAjustes().setIcon(new ImageIcon(getClass().getResource("/resources/images/icons8-settings-35.png")));
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
