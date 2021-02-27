/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.examen;

import controllers.ExamenPrincipalController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.MainFrame;
import views.funcion.Examen2Frame;

/**
 *
 * @author Kenneth Granados
 */
public class Examen2Controller implements ActionListener {

    Examen2Frame e2f;

    public Examen2Controller(Examen2Frame e2f) {
        this.e2f = e2f;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "Regresar":
                e2f.RegresarData();
                break;
            case "Terminar":
                e2f.Resultado();
                e2f.FinTiempo();
                e2f.setVisible(false);
                ExamenPrincipalController.ex.setVisible(true);
                MainFrame.pnlMenu.setVisible(true);
                break;
            case "Avanzar":
                if (Examen2Frame.resp1RadioButton.isSelected() | Examen2Frame.resp2RadioButton.isSelected()
                        | Examen2Frame.resp3RadioButton.isSelected() | Examen2Frame.resp4RadioButton.isSelected()) {
                    e2f.AvanceData();
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona una respuesta para avanzar");
                }
                break;

        }
    }

}
