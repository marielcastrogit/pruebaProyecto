  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.ecuaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ecuaciones.Logica;
import views.Ecuaciones.EcuacionesCuadraticas;

/**
 *
 * @author Eddy
 */
public class ControlEcCuadratica implements ActionListener {

    private Logica d;
    private EcuacionesCuadraticas v;

    public ControlEcCuadratica(Logica d, EcuacionesCuadraticas v) {
        this.d = d;
        this.v = v;
        this.v.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         d.setA(Integer.parseInt(v.a.getText()));
         d.setB(Integer.parseInt(v.b.getText()));
         d.setC(Integer.parseInt(v.c.getText()));
         d.cuadratica();
         v.respuesta.setText(String.valueOf(d.getR1()));
         v.respuesta2.setText(String.valueOf(d.getR2 ()));
    }

   
}
