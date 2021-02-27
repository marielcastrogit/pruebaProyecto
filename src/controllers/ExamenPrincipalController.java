/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Examen;
import views.MainFrame;
import views.funcion.Examen2Frame;

/**
 *
 * @author Usuario
 */
public class ExamenPrincipalController implements ActionListener {

    public static Examen ex;
    private Examen2Frame ef;

    public ExamenPrincipalController(Examen ex) {
        this.ex = ex;
        ef = new Examen2Frame();
        ef.setLocation(35, 18);
        ef.setVisible(false);
        MainFrame.desktop.add(ef);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Examen.btnEmpezarExamen) {
            if (MainFrame.desktop.getWidth() == 495) {
                MainFrame.desktop.setBounds(65, 103, 690, 440);
            }
            ex.setVisible(false);
            ef.setVisible(true);
            ef.InicioTiempo();
            ef.iniciarCronometro();
            MainFrame.pnlMenu.setVisible(false);

        }
    }

}
