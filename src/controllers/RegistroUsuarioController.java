package controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.otros.Sonido;
import views.MainFrame;
import views.OMRegistroUsuario;
import views.OMVerificarCodigo;

public class RegistroUsuarioController implements MouseListener, KeyListener {

    private OMRegistroUsuario registrarUsuario;
    private OMVerificarCodigo verificarCodigo;

    public RegistroUsuarioController(OMRegistroUsuario registrarUsuario) {
        this.registrarUsuario = registrarUsuario;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == registrarUsuario.getBtnRegistrarse()) {
            verificarCodigo = new OMVerificarCodigo();
            registrarUsuario.setVisible(false);
            MainFrame.desktop.add(verificarCodigo);;
            verificarCodigo.setLocation(35, 18);
            verificarCodigo.setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        Sonido.teclado();
        if (e.getKeyChar() == ' ') {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
