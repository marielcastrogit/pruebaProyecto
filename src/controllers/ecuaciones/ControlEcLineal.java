/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.ecuaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ecuaciones.Logica;
import views.Ecuaciones.EcuacionesLineales;

/**
 *
 * @author Eddy
 */
public class ControlEcLineal implements ActionListener {

    private EcuacionesLineales t;
    private Logica r;

    public ControlEcLineal(EcuacionesLineales t, Logica r) {
        this.t = t;
        this.r = r;
        t.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        r.setA(Integer.parseInt(t.a.getText()));
        r.setB(Integer.parseInt(t.b.getText()));
        r.setB(Integer.parseInt(t.c.getText()));
        r.setB(Integer.parseInt(t.d.getText()));
        r.Lineal();
        t.respuesta.setText(String.valueOf(r.getResp()));
    }
}
