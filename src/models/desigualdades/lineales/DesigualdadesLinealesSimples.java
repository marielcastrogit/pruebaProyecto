package models.desigualdades.lineales;
//@author Mariel Castro

import java.util.ArrayList;

public class DesigualdadesLinealesSimples {

    //-3x+4<11
    /*
    Pasos que debo seguir: 
    1- Dividir a la desigualdad en tres partes:
        Primera parte: la parte izquierda de la ecuacion
        Segunda parte: la parte que contiene el signo 
        Tercera parte: la parte derecha de la ecuacion
     */
    private final String desigualdad;
    private ArrayList parte1;

    public DesigualdadesLinealesSimples(String desigualdad) {
        this.desigualdad = desigualdad;
    }

    //Parte 1 de la desigualdad - lado izquierdo
    public String setParte1() {
        String[] split = desigualdad.split("(<|>|≥|≤)([+-]?\\d*x?)*");
        String p1 = "";
        /*
        ("(<|>|≥|≤)([+-]?\\d*x?)*")
        (<|>|≥|≤) debe tener um signo de comparacion 
        
        Seguido por [+-]? signos aritmeticos opcionalmente 
        \d* digitos entre 0 -1 que se pueden repetir de 0 a mas veces 
        x? una x opcionalmente 
        y todo lo anterior se puede repetir 0 o mas veces
         */
        for (int i = 0; i < split.length; i++) {
            p1 = p1 + split[i];
        }
        return p1;
    }

    //Parte 2 signo
    public String setSigno() {
        int posicionSigno = 0;
        for (int i = 0; i < desigualdad.length(); i++) {
            if (desigualdad.charAt(i) == '<' || desigualdad.charAt(i) == '>' || desigualdad.charAt(i) == '≤' || desigualdad.charAt(i) == '≥') {
                posicionSigno = i;
            }
        }
        char[] toCharArray = desigualdad.toCharArray();

        return toCharArray[posicionSigno] + "";
    }

    //Parte 3 de la desigualdad - lado derecho
    public String setParte3() {
        String[] split = desigualdad.split("([+-]*\\d*x*)*(<|>|≥|≤)");
        String p2 = "";
        for (int i = 0; i < split.length; i++) {
            p2 += split[i];
        }
        return p2;

    }

}
