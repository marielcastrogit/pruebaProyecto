/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.examen;

/**
 *
 * @author Kenneth Granados
 */
public class Datos2 extends DatosExamen{
//hay me corrigen las falta de acento XD
    String []pregunta2 = {
    "Una ecuacion es la expresion matematica de una condicion de igualdad","La expresion x+3 = 5 es una:"
     ,"La expresion 2x+4 = 7, a x se le denomina:","La ecuación 3y+6=0,y vale:","La expresion 2x=x+x, es una:"
        
};
 
     String []respuesta2 = {
    "Verdadero","Ecuacion","Incognita","-2","Igualdad"
};
   
     String[] posRespuesta2={
         "Verdadero,Falso,Ni idea,Ninguna de las anteriores",
         "Igualdad,Ecuación,Ninguna de las anteriores,Ni idea",
         "Miembro,Incognita,Solucion,Ninguna de las anteriores",
         "-2,0,Infinito,Ninguna de las anteriores",
         "Igualdad,Ecuación,Ninguna de las anteriores,Ni idea",
     };

    @Override
    public String getPregunta(int pos) {
        return pregunta2[pos];
    }
      
    @Override
    public String getRespuesta(int pos) {
        return respuesta2[pos]; 
    }

    @Override
    public String[] setSepRespuesta(int pos) {
        String s1 = posRespuesta2[pos];
        String[] s2 = Separador(s1,",");
        return s2;
    }
  
}
