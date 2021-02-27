package controllers;

import static controllers.MainFrameController.mf;
import static controllers.RegistroUsuarioController.registrarUsuario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Pattern;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import models.otros.Sonido;
import views.MainFrame;
import views.InicioSesion;
import views.RegistroUsuario;

public class InicioSesionController implements KeyListener, ActionListener, MouseListener {

    public static InicioSesion sesion;
    private Pattern patronEmail;
    private RegistroUsuario registrarUsuario;
    public static boolean usuarioActivo;

    public InicioSesionController(InicioSesion sesion) {
        this.sesion = sesion;
        patronEmail = Pattern.compile("");
        usuarioActivo = false;
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

        if (e.getSource() == sesion.getBtnIngresar()) {

            String email = InicioSesion.txtUsuario.getText();
            char contraseñaUsuario[] = InicioSesion.password.getPassword();
            String contraseña = new String(contraseñaUsuario);

            if (VerificarCodigoController.usuarios.size() > 0) {
                f1:
                for (int i = 0; i < VerificarCodigoController.usuarios.size(); i++) {
                    String emailG = VerificarCodigoController.usuarios.get(i).getCorreo();
                    String contraseñaG = VerificarCodigoController.usuarios.get(i).getContraseña();

                    if (email.equals(emailG) && contraseña.equals(contraseñaG)) {
                        usuarioActivo = true;
                        break f1;
                    }
                }
            }
            System.out.println("usuario Activo?" + usuarioActivo);
            if (usuarioActivo) {
                sesion.setVisible(false);
                JInternalFrame[] allFrames = MainFrame.desktop.getAllFrames();
                for (int i = 0; i < allFrames.length; i++) {
                    allFrames[i].setVisible(false);
                }
                MainFrame.desktop.setBackground(new Color(0, 0, 0));
                mf.getPnlMenu().setSize(49, 502);
                mf.getPnlMenu().setVisible(true);
                mf.getjDesktopPane1().setBounds(65, 103, 690, 440);
                MainFrame.lblIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/cerrarSesion.png")));
                MainFrame.lblInicioSesion.setText("Cerrar sesion");
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
