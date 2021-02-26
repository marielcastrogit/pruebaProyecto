/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.funciones;

import com.bestcode.mathparser.IMathParser;
import com.bestcode.mathparser.MathParserFactory;
import java.lang.Math;

/**
 *
 * @author Kenneth Granados
 */
public class Funcion {
    String funcion;
  IMathParser imp = MathParserFactory.create();

    public Funcion(String fun) {
        funcion = fun;
        imp.setExpression(fun);
    }
 
   public Double Evaluar(double x)throws Exception{
       double result=Double.NaN;
       imp.setX(x);
       result= imp.getValue();
       return result;
   }
   
   public double [] evaluar(double[] x)throws Exception{
       int n=x.length;
       double[] result=new double[n];
       for (int i = 0; i < n; i++) {
          result[i] =Evaluar(x[i]);          
       }
       return result;
   }
   
   public double[] Rango(double x0,double xn,double d){
       int n = (int) (Math.abs(xn-x0)/d);
       double[] result=new double[n];
       for (int i = 0; i < n; i++) {
          result[i] =x0;
          x0+=d;        
       }
       return result;
   }
}
