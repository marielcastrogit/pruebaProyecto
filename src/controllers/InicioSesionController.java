package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JCheckBox;
import views.MMInicioSesion;
import views.OMInicioSesion;

public class InicioSesionController implements KeyListener, ActionListener, MouseListener {

    private OMInicioSesion om;
    private MMInicioSesion mm;
    private Pattern patronEmail;

    public InicioSesionController(OMInicioSesion om) {
        this.om = om;
        mm = new MMInicioSesion();
        patronEmail = Pattern.compile("");
    }

    public InicioSesionController(MMInicioSesion mm) {
        this.mm = mm;
        om = new OMInicioSesion();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        reproducirSonidoTeclado();
        if (e.getKeyChar() == ' ') {
            e.consume();
        }
    }

    private void reproducirSonidoTeclado() {

        Clip efectoSonido;
        try {
            efectoSonido = AudioSystem.getClip();
            File archivoSonido = new File("src/resources/audio/teclado (2).wav");
            efectoSonido.open(AudioSystem.getAudioInputStream(archivoSonido));
            efectoSonido.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException error) {
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
            if (e.getSource() == om.getLblCrearCuenta()) {
                
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
            if (e.getSource() == om.getLblCrearCuenta()) {
                om.getLblCrearCuenta().setForeground(new Color(66, 11, 156));
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (om.isVisible()) {
            if (e.getSource() == om.getLblCrearCuenta()) {
                om.getLblCrearCuenta().setForeground(new Color(255, 255, 255));
            }
        }
    }

}
