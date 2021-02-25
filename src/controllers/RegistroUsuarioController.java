package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.otros.Sonido;
import models.usuario.HiloEnvioMensaje;
import models.usuario.Usuario;
import models.usuario.ValidarContraseña;
import models.usuario.ValidarEmail;
import views.MainFrame;
import views.OMRegistroUsuario;
import views.OMVerificarCodigo;

public class RegistroUsuarioController implements MouseListener, KeyListener, ActionListener, FocusListener {

    private OMRegistroUsuario registrarUsuario;
    private OMVerificarCodigo verificarCodigo;
    private ValidarEmail validacionCorreo;
    private String correoUsuario;
    private ArrayList<Usuario> usuarios;
    private int c;

    public RegistroUsuarioController(OMRegistroUsuario registrarUsuario) {
        this.registrarUsuario = registrarUsuario;
        validacionCorreo = new ValidarEmail();
        usuarios = new ArrayList<Usuario>();
        correoUsuario = "";
        c = 0;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == registrarUsuario.getBtnRegistrarse()) {
            System.out.println();

            correoUsuario = registrarUsuario.getTxtEmail().getText();
            char contraseñaUsuario[] = registrarUsuario.getTxtContraseña().getPassword();
            char contraseñaComprobar[] = registrarUsuario.getTxtVerificarContraseña().getPassword();

            String usuarioContraseña = new String(contraseñaUsuario);
            String comprobarContraseña = new String(contraseñaComprobar);
            
            System.out.println("usuarioContraseña: " + usuarioContraseña);
            System.out.println("comprobarContraseña: " + comprobarContraseña);
            
            if (registroValido(correoUsuario, usuarioContraseña, comprobarContraseña)) {
                OMRegistroUsuario.lblInicioIncorrecto.setVisible(false);
                registrarUsuario.setVisible(false);

                verificarCodigo = new OMVerificarCodigo();
                verificarCodigo.setLocation(35, 18);
                verificarCodigo.setVisible(true);
                MainFrame.desktop.add(verificarCodigo);;

                Thread hilo = new Thread(new HiloEnvioMensaje(correoUsuario));
                hilo.start();

            } else {
                OMRegistroUsuario.lblInicioIncorrecto.setText("ERROR AL REGISTRARSE");
            }
        }
    }

    private boolean registroValido(String correo, String contraseña, String comprobarContraseña) {
        boolean correoValido = validacionCorreo.esValido(correo);
        boolean comprobacionValida = contraseña.equals(comprobarContraseña);
        boolean contraseñaValida = ValidarContraseña.contraseñaValida(contraseña);

        if (correoValido && contraseñaValida && comprobacionValida) {
            return true;
        } else {
            return false;
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
        if (e.getSource() == registrarUsuario.getTxtEmail()) {
            if (registrarUsuario.getTxtEmail().getText().equals("Ejemplo: usuario@gmail.com")) {
                registrarUsuario.getTxtEmail().setText("");
            }
            registrarUsuario.getTxtEmail().setForeground(new Color(0, 0, 0));
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registrarUsuario.getCheckContraseñas()) {
            if (registrarUsuario.getCheckContraseñas().isSelected()) {
                registrarUsuario.getTxtContraseña().setEchoChar((char) 0);
                registrarUsuario.getTxtVerificarContraseña().setEchoChar((char) 0);
            } else {
                registrarUsuario.getTxtContraseña().setEchoChar('\u2022');
                registrarUsuario.getTxtVerificarContraseña().setEchoChar('\u2022');
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

        boolean valido = validacionCorreo.esValido(registrarUsuario.getTxtEmail().getText());
        if (!valido) {
            OMRegistroUsuario.lblInicioIncorrecto.setText("Dirección de correo no valida");
            OMRegistroUsuario.lblInicioIncorrecto.setVisible(true);
        }

        if (e.getSource() == registrarUsuario.getTxtContraseña()) {
            String contra = new String(registrarUsuario.getTxtContraseña().getPassword());
            ValidarContraseña.contraseñaValida(contra);
            OMRegistroUsuario.lblInicioIncorrecto.setText(ValidarContraseña.getMensaje());
            OMRegistroUsuario.lblInicioIncorrecto.setVisible(true);
        }

        if (e.getSource() == registrarUsuario.getTxtVerificarContraseña()) {
            char contraseñaUsuario[] = registrarUsuario.getTxtContraseña().getPassword();
            char contraseñaComprobar[] = registrarUsuario.getTxtVerificarContraseña().getPassword();

            String usuarioContraseña = new String(contraseñaUsuario);
            String comprobarContraseña = new String(contraseñaComprobar);
            if (!usuarioContraseña.equals(comprobarContraseña)) {
                OMRegistroUsuario.lblContraseñaComprobacion.setText("Contraseña no coincide");
                OMRegistroUsuario.lblContraseñaComprobacion.setVisible(true);
            }
        }

    }

}
