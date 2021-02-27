
package models.examen;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import views.funcion.ExamenFrame;

public class Cronometro extends Thread {
    JLabel etiq;
    
    public Cronometro(JLabel cronometro) {
      this.etiq=cronometro;
      
    }

    
    @Override
    public void run(){
        try {
            int x=0; 
            while (ExamenFrame.inicio==true) {                
               Thread.sleep(1000);
               ejecutarCronometro(x);
               x++;              
            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null,"Exception: " +e.getMessage());
        }
    }

    private void ejecutarCronometro(int x) {
 
      ExamenFrame.segundos++;
        if ( ExamenFrame.segundos>59) {
           ExamenFrame.segundos=0;
           ExamenFrame.minutos++;
           if ( ExamenFrame.minutos>59) {
           ExamenFrame.segundos=0;
           ExamenFrame.minutos=0;
           ExamenFrame.hora++;
        }
        }
        String textseg="",textmin="",texthora="";
        textseg+=ExamenFrame.segundos;
        textmin+=ExamenFrame.minutos;
        texthora+=ExamenFrame.hora;
        String reloj= texthora+":"+textmin+":"+textseg;
         etiq.setText(reloj);
    }
    }
