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

    public static Examen ex;
    private ExamenFrame ef;

    public ExamenPrincipalController(Examen ex) {
        this.ex = ex;
        ef = new ExamenFrame();
        ef.setLocation(35, 18);
        ef.setVisible(false);
        MainFrame.desktop.add(ef);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Examen.btnEmpezarExamen) {
            ex.setVisible(false);
            ef.setVisible(true);
            MainFrame.pnlMenu.setVisible(false);
        }
    }

}
