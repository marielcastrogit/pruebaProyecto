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
import views.funcion.ExamenFrame;

/**
 *
 * @author Usuario
 */
public class ExamenPrincipalController implements ActionListener {

    private Examen ex;

    public ExamenPrincipalController(Examen ex) {
        this.ex = ex;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ExamenFrame ef = new ExamenFrame();
        ef.setVisible(true);
        ef.setLocation(35,18);
        MainFrame.desktop.add(ef);
        MainFrame.pnlMenu.setVisible(false);

    }

}
