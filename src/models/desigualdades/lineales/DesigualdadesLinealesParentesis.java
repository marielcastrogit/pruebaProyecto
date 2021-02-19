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
        listaLI = (split[0]);
        listaLD = (split[1]);
    }

    public String getParte1() {
        return listaLI;
    }

    public String getParte2() {
        return listaLD;
    }

    public String getTerminosParentesis(String cadena) {
        /*
        3x+2(x-2)>4x
        -(x+1)(x+2)(x+3)<0
        5x-(3-2x)+8>9+3(2x-4)
         */
        //ejemplo:hola -> substring(0,2)-> resultado ->ho

        String tParentesis = "";
        int comienzo = 0, fin = 0, signo = 0;
        char[] toCharArray = cadena.toCharArray();
        int numParentesisApertura = 0;
        int numParentesisCierre = 0;
        int numParentesis = 0;
        String terminoParentesis = "";

        //Determino cuantos parentesis tiene
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] == '(') {
                numParentesisApertura++;
            }
            if (toCharArray[i] == ')') {
                numParentesisCierre++;
            }
        }
        //Si el numero de los parentesis de apertura es igual al de cierre entonces empieza a resolver
        if (numParentesisApertura == numParentesisCierre) {
            numParentesis = numParentesisCierre;
            for (int a = 0; a < numParentesis; a++) {
                toCharArray = cadena.toCharArray();

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
                tParentesis += terminoParentesis;

                String reemplazo = cadena.replace(terminoParentesis, "");
                cadena = reemplazo;
            }
        }
        return tParentesis;
    }

    public void multiplicacionParentesis(String cadena) {
        String coeficiente = "", cadenaParentesis = "";
        ArrayList l = new ArrayList();
        char[] toCharArray = cadena.toCharArray();
        int posParentesisInicio = 0, posParentesisFinal = 0;
        int x = 0;

        b1:
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] == '(') {
                posParentesisInicio = i;
                break b1;
            }
        }

        while (x <= posParentesisInicio - 1) {
            coeficiente += toCharArray[x];
            x++;
        }

        b2:
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] == ')') {
                posParentesisFinal = i;
                break b2;
            }
        }

        cadenaParentesis = cadena.substring(posParentesisInicio, posParentesisFinal + 1);
        String replace = cadenaParentesis.replace("+", ",+").replace("-", ",-").replace("(", ",").replace(")", ",");
        String[] split = replace.split(",");
        
        for(int i=0; i<split.length; i++){
            if(!split[i].equals("")){
                l.add(split[i]);
            }
        }
        
        
        
        System.out.println(l.toString());

    }

    //        if (!terminoParentesis.startsWith("-") && !terminoParentesis.startsWith("+")) {
//            terminoParentesis = "+" + terminoParentesis;
//        }
}
