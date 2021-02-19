package models.desigualdades.lineales;

import java.util.ArrayList;

public class DesigualdadesLinealesParentesis {

    private String cadena;
    private String listaLI;
    private String listaLD;

    public DesigualdadesLinealesParentesis(String cadena) {
        this.cadena = cadena;
        listaLI = "";
        listaLD = "";
    }

    public void setPartes() {
        String[] split = cadena.split("(<|>|≥|≤)");
        listaLI=(split[0]);
        listaLD=(split[1]);
    }

    public String getParte1() {
        return listaLI;
    }

    public String getParte2() {
        return listaLD;
    }

    public String getTerminosParentesis(String cadena ) {
        /*
        3x+2(x-2)>4x
        -(x+1)(x+2)(x+3)<0
        5x-(3-2x)+8>9+3(2x-4)
         */
        //ejemplo:hola -> substring(0,2)-> resultado ->ho
        int comienzo = 0, fin = 0, signo = 0;
        String terminoParentesis = "";
        char[] toCharArray = cadena.toCharArray();
        bf:
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] == '(') {
                comienzo = i;
                break bf;
            }
        }

        bf2:
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] == ')') {
                fin = i;
                break bf2;
            }
        }

        if (comienzo != 0) {
            int x = comienzo;
            bw:
            while (x >= 0) {
                if (toCharArray[x] == '-' || toCharArray[x] == '+') {
                    signo = x;
                    break bw;
                }
                x--;
            }
            terminoParentesis = cadena.substring(signo, fin + 1);

        } else {
            terminoParentesis = cadena.substring(comienzo, fin + 1);
        }

        if (!terminoParentesis.startsWith("-") && !terminoParentesis.startsWith("+")) {
            terminoParentesis = "+" + terminoParentesis;
        }
        return terminoParentesis;
    }

}
