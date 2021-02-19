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
                System.out.println("ITERANDO EL FOR : " + a);
                System.out.println();

                bf:
                for (int i = 0; i < toCharArray.length; i++) {
                    System.out.println("tocharArray: " + i + " " + toCharArray[i]);
                    if (toCharArray[i] == '(') {
                        comienzo = i;
                        System.out.println("comienzo: " + i+ " " + comienzo);
                        break bf;
                    }
                }

                bf2:
                for (int i = 0; i < toCharArray.length; i++) {
                    if (toCharArray[i] == ')') {
                        fin = i;
                        System.out.println("fin: " + i + " " + fin);
                        break bf2;
                    }
                }

                if (comienzo != 0) {
                    int x = comienzo;
                    bw:
                    while (x >= 0) {
                        if (toCharArray[x] == '-' || toCharArray[x] == '+') {
                            signo = x;
                            System.out.println("signo: " + signo);
                            break bw;
                        }
                        x--;
                    }
                    terminoParentesis = cadena.substring(signo, fin+1);
                    System.out.println("termino parentesis comienzo diferente de 0: " + terminoParentesis);

                } else {
                    terminoParentesis = cadena.substring(comienzo, fin + 1);
                     System.out.println("termino parentesis comienzo 0: " + terminoParentesis);
                }
                tParentesis += terminoParentesis;

                System.out.println(cadena);
                String reemplazo = cadena.replace(terminoParentesis, "");
                cadena = reemplazo;
                System.out.println("cadena:"  + cadena);
                System.out.println("split:" + reemplazo);
            }
        }
        return "tPARENTESIS:" + tParentesis;
    }

    //        if (!terminoParentesis.startsWith("-") && !terminoParentesis.startsWith("+")) {
//            terminoParentesis = "+" + terminoParentesis;
//        }
}
