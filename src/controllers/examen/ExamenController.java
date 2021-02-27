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
import views.funcion.ExamenFrame;

/**
 *
 * @author Kenneth Granados
 */
public class ExamenController implements ActionListener {

    private ExamenFrame ef;

    public ExamenController(ExamenFrame ef) {
        this.ef = ef;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "Regresar":
                ef.RegresarData();
                break;
            case "Terminar":
                ef.Resultado();
                ef.FinTiempo();
//                ef.dispose();
                ef.setVisible(false);
                ExamenPrincipalController.ex.setVisible(true);
                MainFrame.pnlMenu.setVisible(true);
                break;
            case "Avanzar":
                if (ExamenFrame.resp1RadioButton.isSelected() | ExamenFrame.resp2RadioButton.isSelected()
                        | ExamenFrame.resp3RadioButton.isSelected() | ExamenFrame.resp4RadioButton.isSelected()) {
                    ef.AvanceData();
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona una respuesta para avanzar");
                }
                break;

        }
    }
}
