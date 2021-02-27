
package models.examen;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import views.funcion.Examen2Frame;

public class Cronometro2 extends Thread{
    JLabel etiq;
    
    public Cronometro2(JLabel cronometro) {
      this.etiq=cronometro;
      
    }

    
    @Override
    public void run(){
        try {
            int x=0;
            while (Examen2Frame.inicio==true) {                
               Thread.sleep(1000);
               ejecutarCronometro(x);
               x++;
            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null,"Exception: " +e.getMessage());
        }
    }

    private void ejecutarCronometro(int x) {
          Examen2Frame.segundos++;
        if ( Examen2Frame.segundos>59) {
           Examen2Frame.segundos=0;
           Examen2Frame.minutos++;
           if ( Examen2Frame.minutos>59) {
           Examen2Frame.segundos=0;
           Examen2Frame.minutos=0;
           Examen2Frame.hora++;
        }
        }
        String textseg="",textmin="",texthora="";
        textseg+=Examen2Frame.segundos;
        textmin+=Examen2Frame.minutos;
        texthora+=Examen2Frame.hora;
        String reloj= texthora+":"+textmin+":"+textseg;
        etiq.setText(reloj);
}
}