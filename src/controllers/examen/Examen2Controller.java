/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.funcion.Examen2Frame;

/**
 *
 * @author Kenneth Granados
 */
public class Examen2Controller implements ActionListener{
    Examen2Frame e2f;
   
    public Examen2Controller(Examen2Frame e2f) {
        this.e2f = e2f;
    }
  
    
    @Override
    public void actionPerformed(ActionEvent ae) {
   switch(ae.getActionCommand()){
         case "Regresar":
             e2f.RegresarData();
             break;
         case "Terminar":
             e2f.Resultado();
             e2f.FinTiempo();
             e2f.dispose();
             break;
         case "Avanzar":
             e2f.AvanceData();
             break;
         
             
     } 
    }  
    
    
}
