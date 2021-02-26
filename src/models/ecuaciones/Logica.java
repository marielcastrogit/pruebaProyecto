
package models.ecuaciones;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

public class Logica {

    public int a;
    private int b;
    private int c;
    private int d;
    private int r1;
    private int r2;
    private int resp;

   public Logica(){
       
   }
    
    
    public int getResp() {
        return resp;
    }

    public void setResp(int resp) {
        this.resp = resp;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int cuadratica() {
        try{
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "El coeficiente no puede ser igual a 0.");
        } else {
            this.d = (int) pow(this.b, 2) - 4 * this.a * this.c;
            if (this.d <= 0) {
                r1 = (int) (-this.b + sqrt(this.d)) / (2 * this.a);
                r2 = (int) (-this.b + sqrt(this.d)) / (2 * this.a);
            } else {
                JOptionPane.showMessageDialog(null, "El Discriminsnte debe ser positivo.");
            }
        }
        return 0;
        }catch(NumberFormatException a){
        JOptionPane.showMessageDialog(null, "Ingrese Numeros" + a );

        
    }
        return 0;
      
    }
    
    public int Lineal(){
       
        if (a == 0) {
             JOptionPane.showMessageDialog(null, "No es una ecuacion lineal" );

        } else {

            r1 = a * b;
            r2 = a * c;
            resp = (r2 + d) / (r1-1);
            
        }
       
        return 0;
        
    }


}
