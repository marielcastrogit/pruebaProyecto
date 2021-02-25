package controllers;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.otros.Sonido;
import models.usuario.EnviarCodigoVerificacion;
import views.MainFrame;
import views.OMVerificarCodigo;

public class VerificarCodigoController implements KeyListener, MouseListener {

    private OMVerificarCodigo verificarCodigo;

    public VerificarCodigoController(OMVerificarCodigo verificarCodigo) {
        this.verificarCodigo = verificarCodigo;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        Sonido.teclado();

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == verificarCodigo.getLblRetroceder()) {
            verificarCodigo.getLblRetroceder().setBackground(new Color(255, 255, 255, 50));
            RegistroUsuarioController.registrarUsuario.setVisible(true);
            MainFrame.pnlMenu.setVisible(false);
        }
        
        if (e.getSource() == verificarCodigo.getBtnAcceder()) {
            EnviarCodigoVerificacion codigoVerificar = new EnviarCodigoVerificacion();
            boolean codCorrecto = codigoVerificar.esCodigoCorrecto(verificarCodigo.getTxtCodigo().getText());

            if (codCorrecto) {
                MainFrameController.iniciarSesionOM.setVisible(true);
            } else {
                OMVerificarCodigo.lblCodigoIncorrecto.setVisible(true);
                OMVerificarCodigo.lblIconoCodigoIncorrecto.setVisible(true);
            }
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

}
