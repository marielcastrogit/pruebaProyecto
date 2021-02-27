package controllers;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import models.otros.Sonido;
import models.usuario.HiloEnvioMensaje;
import models.usuario.Usuario;
import views.MainFrame;
import views.VerificarCodigo;

public class VerificarCodigoController implements KeyListener, MouseListener {

    private VerificarCodigo verificarCodigo;
    public static ArrayList<Usuario> usuarios;

    public VerificarCodigoController(VerificarCodigo verificarCodigo) {
        this.verificarCodigo = verificarCodigo;
        usuarios = new ArrayList<Usuario>();
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
            boolean codCorrecto = HiloEnvioMensaje.codigo.esCodigoCorrecto((verificarCodigo.getTxtCodigo().getText()));

            if (codCorrecto) {
                usuarios.add(new Usuario(RegistroUsuarioController.correoUsuario, RegistroUsuarioController.usuarioContraseña));
                MainFrameController.iniciarSesion.setVisible(true);  
            } else {
                VerificarCodigo.lblCodigoIncorrecto.setVisible(true);
                VerificarCodigo.lblIconoCodigoIncorrecto.setVisible(true);
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
