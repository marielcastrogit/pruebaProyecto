/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.examen;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 *
 * @author Kenneth Granados
 */
public class DatosExamen implements Serializable{
 String []pregunta = {
    "La inecuación 2x + 11 < -x + 20 es equivalente a:","¿Cuál de las siguientes inecuaciones es equivalente a: x - 6 < -y?",
     "¿Cómo se llama la expresión algebraica que expresa una desigualdad?","¿Cuál es el conjunto de soluciones de la inecuación 3x2 + 100 > 0"
         ,"¿Cuál de las siguientes afirmaciones es falsa?"
};
 
     String []respuesta = {
    "3x < 9","Ninguna","Inecuación","El conjunto vacío","a < b; c < 0 ---> ac < bc"
};
   
     String[] posRespuesta={
         "2x < 5x + 9,3x < 9,x > 3,x=0",
         "-x + 6 < y,Ninguna,x + 6 > y,-x - 6 > y",
         "Radical,Inecuación,Ecuación,Sistema de ecuaciones",
         "El conjunto vacío,Dos puntos de la recta real,Un intervalo de la recta real,El conjunto de todos los números reales",
         "a < b; c < d ---> a + c < b + d,a < b; c > 0 ---> ac < bc,a < b;c > d ---> a - c < b - d,a < b; c < 0 ---> ac < bc",
     };
     
    public String getPregunta(int pos) {
        return pregunta[pos];
    }

    public String getRespuesta(int pos) {
        return respuesta[pos];
    }
 
    public String[] Separador(String cad, String sep){
        StringTokenizer tok = new StringTokenizer(cad, sep);
        
        String[] a = new String[5];
        int i =0;
        
        while (tok.hasMoreTokens()) {            
            a[i]=tok.nextToken();
            i++;
        }
        return a;
}
    
    public String[] setSepRespuesta(int pos) {
        String s1 = posRespuesta[pos];
        String[] s2 = Separador(s1,",");
        return s2;
    }
 
}