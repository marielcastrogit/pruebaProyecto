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

    public String setParte1() {
        String[] split = desigualdad.split("(<|>|≥|≤)([+-]?\\d*x?)*");
        String p1 = "";
        for (int i = 0; i < split.length; i++) {
            System.out.println(p1 = p1 + split[i]);
        }

//        for (int i = 0; i < desigualdad.length(); i++) {
//            while (!(desigualdad.charAt(i) == '<' || desigualdad.charAt(i) == '>' || desigualdad.charAt(i) == '≥'
//                    || desigualdad.charAt(i) == '≤')) {
//            }
//        }
        return p1;
    }

}
