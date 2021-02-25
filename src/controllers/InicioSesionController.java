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
import views.MMInicioSesion;
import views.MainFrame;
import views.OMInicioSesion;
import views.OMRegistroUsuario;

public class InicioSesionController implements KeyListener, ActionListener, MouseListener {

    public static OMInicioSesion om;
    private MMInicioSesion mm;
    private Pattern patronEmail;
    private OMRegistroUsuario omRegistrarUsuario;

    public InicioSesionController(OMInicioSesion om) {
        this.om = om;
        mm = new MMInicioSesion();
        patronEmail = Pattern.compile("");
    }

    public InicioSesionController(MMInicioSesion mm) {
        this.mm = mm;
        om = new OMInicioSesion();
        patronEmail = Pattern.compile("");
        omRegistrarUsuario = new OMRegistroUsuario();
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
                if (om.isVisible()) {
                    //Muestro la contraseña si es seleccionado, sino que oculte la contraseña.
                    JCheckBox checkContraseña = om.getCheckContraseña();
                    if (checkContraseña.isSelected()) {
                        om.getPassword().setEchoChar((char) 0);
                    } else {
                        om.getPassword().setEchoChar('\u2022');
                    }

                }

                if (mm.isVisible()) {

                }

                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (om.isVisible()) {
            if (e.getSource() == om.getLblRegistrarse()) {;
                omRegistrarUsuario = new OMRegistroUsuario();
                om.setVisible(false);
                MainFrame.desktop.add(omRegistrarUsuario);;
                omRegistrarUsuario.setLocation(35, 18);
                omRegistrarUsuario.setVisible(true);
                MainFrame.pnlMenu.setVisible(false);
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
        if (om.isVisible()) {
            if (e.getSource() == om.getLblRegistrarse()) {
                om.getLblRegistrarse().setForeground(new Color(66, 11, 156));
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (om.isVisible()) {
            if (e.getSource() == om.getLblRegistrarse()) {
                om.getLblRegistrarse().setForeground(new Color(255, 255, 255));
            }
        }
    }

}
