package models.ecuaciones;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;
import views.ecuacion.EcuacionesCuadraticas;
import views.ecuacion.EcuacionesLineales;

public class Logica {

    public int a;
    private int b;
    private int c;
    private int d;
    private int r1;
    private int r2;
    private int resp;

    public Logica() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        r1 = 0;
        r2 = 0;
        resp = 0;
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

    private int calcularR1() {
        r1 = (int) ((((-1 * this.b) + sqrt(this.d)) / (2 * this.a)));
        return r1;
    }

    private int calcularR2() {
        r2 = (int) ((((-1 * this.b) - sqrt(this.d)) / (2 * this.a)));
        return r2;
    }

    public void cuadratica() {
        try {
            if (a == 0) {
               EcuacionesCuadraticas.lblInfo.setText("El coeficiente de x no puede ser igual a 0.");
            } else {
                EcuacionesCuadraticas.lblInfo.setText("");
                this.d = (int) ((pow(this.b, 2)) - (4 * this.a * this.c));
                if (this.d == 0) {//si el discriminante es igual a 0 entonces ambas respuestas son las mismas
                    setR1(calcularR1());
                    setR2(calcularR1());
               }
                
                if(this.d<0){//si el discriminante es negativo entonces no hay solucion
                    EcuacionesCuadraticas.lblInfo.setText("No tiene solución en los numeros reales.");
                }
                
                if(this.d>0){//si el discriminante es mayor a 0 entonces las soluciones son diferentes
                    setR1(calcularR1());
                    setR2(calcularR2());
                }
                
            }
        } catch (NumberFormatException a) {
        }
    }

    public int Lineal() {

        if (a == 0) {
            EcuacionesLineales.lblInfo.setText("No es una ecuacion lineal");
        } else {
            EcuacionesLineales.lblInfo.setText("");
            int x = a * b;
            int y = a * c;
            int b = x-1;
            int c = d + y;
            
            resp = c/b;
        }

        return resp;
    }

}
