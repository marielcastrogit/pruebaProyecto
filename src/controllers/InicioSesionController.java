package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Pattern;
import javax.swing.JCheckBox;
import models.otros.Sonido;
import views.MainFrame;
import views.InicioSesion;
import views.RegistroUsuario;

public class InicioSesionController implements KeyListener, ActionListener, MouseListener {

    public static InicioSesion sesion;
    private Pattern patronEmail;
    private RegistroUsuario registrarUsuario;

    public InicioSesionController(InicioSesion sesion) {
        this.sesion = sesion;
        patronEmail = Pattern.compile("");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Mostrar contraseña":
                //Muestro la contraseña si es seleccionado, sino que oculte la contraseña.
                JCheckBox checkContraseña = sesion.getCheckContraseña();
                if (checkContraseña.isSelected()) {
                    sesion.getPassword().setEchoChar((char) 0);
                } else {
                    sesion.getPassword().setEchoChar('\u2022');
                }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == sesion.getLblRegistrarse()) {;

            if (MainFrame.desktop.getWidth() == 495) {
                MainFrame.desktop.setBounds(65, 103, 690, 440);
            }
            registrarUsuario = new RegistroUsuario();
            sesion.setVisible(false);
            MainFrame.desktop.add(registrarUsuario);;
            registrarUsuario.setLocation(35, 18);
            registrarUsuario.setVisible(true);
            MainFrame.pnlMenu.setVisible(false);
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

        if (e.getSource() == sesion.getLblRegistrarse()) {
            sesion.getLblRegistrarse().setForeground(new Color(66, 11, 156));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == sesion.getLblRegistrarse()) {
            sesion.getLblRegistrarse().setForeground(new Color(255, 255, 255));
        }

    }

}
