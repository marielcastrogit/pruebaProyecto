package controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import models.otros.Sonido;
import models.usuario.EnviarCodigoVerificacion;
import models.usuario.Usuario;
import models.usuario.ValidarContraseña;
import models.usuario.ValidarEmail;
import views.MainFrame;
import views.OMRegistroUsuario;
import views.OMVerificarCodigo;

public class RegistroUsuarioController implements MouseListener, KeyListener {

    private OMRegistroUsuario registrarUsuario;
    private OMVerificarCodigo verificarCodigo;
    private ValidarEmail validacionCorreo;
    private ValidarContraseña validacionContraseña;
    private ArrayList<Usuario> usuarios;
    private ArrayList contraseña;
    private ArrayList contraseñaComprobacion;

    public RegistroUsuarioController(OMRegistroUsuario registrarUsuario) {
        this.registrarUsuario = registrarUsuario;
        validacionCorreo = new ValidarEmail();
        usuarios = new ArrayList<Usuario>();
        contraseña = new ArrayList();
        contraseñaComprobacion = new ArrayList();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == registrarUsuario.getBtnRegistrarse()) {
            System.out.println("REGISTRANDO USUARIO");

            String correoUsuario = registrarUsuario.getTxtEmail().getText();
            String contraseñaUsuario = "";
            String contraseñaComprobar = "";

            for (int i = 0; i < contraseña.size(); i++) {
                contraseñaUsuario += contraseña.get(i).toString();
            }

            for (int i = 0; i < contraseñaComprobacion.size(); i++) {
                contraseñaComprobar += contraseñaComprobacion.get(i).toString();
            }

            System.out.println("usuario contraseña: " + contraseñaUsuario);
            System.out.println("usuario contraseña de comprobacion: " + contraseñaComprobar);

            boolean correoValido = validacionCorreo.esValido(correoUsuario);
            System.out.println("usuario correo: " + registrarUsuario.getTxtEmail().getText() + " es valido? " + correoValido);
            boolean comprobacionValida = contraseñaUsuario.equals(contraseñaComprobar);

            boolean contraseñaValida = ValidarContraseña.contraseñaValida(contraseñaUsuario);

            System.out.println("es valida la contraseña: " + contraseñaValida);
            System.out.println("es valida la contraseña de comproacion: " + comprobacionValida);

            if (correoValido && contraseñaValida && comprobacionValida) {
                verificarCodigo = new OMVerificarCodigo();
                registrarUsuario.setVisible(false);
                MainFrame.desktop.add(verificarCodigo);;
                verificarCodigo.setLocation(35, 18);
                verificarCodigo.setVisible(true);
                EnviarCodigoVerificacion codigo = new EnviarCodigoVerificacion();
                codigo.enviarCodigo(correoUsuario);
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

    @Override
    public void keyTyped(KeyEvent e) {
        Sonido.teclado();
        if (e.getKeyChar() == ' ') {
            e.consume();
        }

        if (e.getSource() == registrarUsuario.getTxtContraseña()) {

//            if (e.getKeyChar() == KeyEvent.VK) {
//                e.consume();
//                 System.out.println("PEGANDO");
//            }
            if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                if (!contraseña.isEmpty()) {
                    contraseña.remove(contraseña.size() - 1);
                }
            } else {
                contraseña.add(e.getKeyChar());
            }
        }

        if (e.getSource() == registrarUsuario.getTxtVerificarContraseña()) {
//            if (e.getKeyChar() == KeyEvent.VK_PASTE) {
//                e.consume();
//                System.out.println("PEGANDO");
//            }
            if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                if (!contraseñaComprobacion.isEmpty()) {
                    contraseñaComprobacion.remove(contraseñaComprobacion.size() - 1);
                }
            } else {
                contraseñaComprobacion.add(e.getKeyChar());
            }
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
