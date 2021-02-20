package models.desigualdades.lineales;

import java.util.ArrayList;
import org.matheclipse.core.eval.EvalUtilities;

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

    public ArrayList getTerminosParentesis(String cadena) {
        /*
        3x+2(x-2)>4x
        -(x+1)(x+2)(x+3)<0
        5x-(3-2x)+8>9+3(2x-4)
         */
        //ejemplo:hola -> substring(0,2)-> resultado ->ho

        String tParentesis = "";
        int comienzo = 0, fin = 0, signo = 0, v = 0;
        char[] toCharArray = cadena.toCharArray();
        int numParentesisApertura = 0;
        int numParentesisCierre = 0;
        int numParentesis = 0;
        String terminoParentesis = "";
        String reemplazo = "";

        ArrayList l = new ArrayList();
        ArrayList lp = new ArrayList();

        for (int i = 0; i < toCharArray.length; i++) {
            l.add(toCharArray[i]);
        }

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
            for (int a = 0; a < numParentesisCierre; a++) {
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
                    lp.add(terminoParentesis);
                    v = signo;
                } else {
                    terminoParentesis = cadena.substring(comienzo, fin + 1);
                    lp.add(terminoParentesis);//lista que contiene los terminos de los parentesis
                    v = comienzo;
                }

                tParentesis += terminoParentesis;

                int y = 0;
                while (y < fin - 1) {
                    l.remove(v);
                    y++;

                }

                for (int i = 0; i < l.size(); i++) {
                    reemplazo += l.get(i).toString();

                }

                cadena = reemplazo;
                reemplazo = "";
            }
        }
        return lp;
    }

    public String getMulti(ArrayList l) {
        boolean comienzanConParentesisNeg, comienzanConParentesisSolo, comienzanConParentesisPos;
        int num = 0, posParentesisInicial = 0;
        String valorParentesis, replaceParentesis;
        String[] splitParentesis;
        String substringNum = "";
        String resultado = "",r="";
        for (int i = 0; i < l.size(); i++) {
            char[] toCharArray = l.get(i).toString().toCharArray();
            //obtengo la posicion del parentesis de apertura:
            b1:
            for (int x = 0; x < toCharArray.length; x++) {
                if (toCharArray[x] == '(') {
                    posParentesisInicial = x;
                    break b1;
                }
            }
            //Obtengo desde el parentesis de apertura al de cierre por ejemplo de -2(x+1) solo obtendria (x+1)
            String substringParentesis = l.get(i).toString().substring(posParentesisInicial, l.get(i).toString().length());
            replaceParentesis = substringParentesis.replace("(", ",").replace(")", ",").replace("+", ",+").replace("-", ",-");
            splitParentesis = replaceParentesis.split(",");// ejemplo x en la posicion 1 y +1 en la posicion 2

            comienzanConParentesisNeg = l.get(i).toString().startsWith("-(");
            comienzanConParentesisPos = l.get(i).toString().startsWith("+(");
            comienzanConParentesisSolo = l.get(i).toString().startsWith("(");

            if (comienzanConParentesisNeg) {
                substringNum = "-1";
            }
            if (comienzanConParentesisSolo) {

                resultado += l.get(i).toString();
            }

            if (comienzanConParentesisPos) {
                substringNum = "+1";
            }

            if (!comienzanConParentesisNeg && !comienzanConParentesisSolo) {
                substringNum = l.get(i).toString().substring(0, posParentesisInicial);
            }

            if (!comienzanConParentesisSolo) {
                for (int x = 1; x < splitParentesis.length; x++) {
                    resultado = substringNum + splitParentesis[x]+"*";
                    if(x==splitParentesis.length-1){
                        resultado = substringNum + splitParentesis[x];
                    }
                    r += resultado;
                    System.out.print(resultado);
                }
            }
        }
        return (r);
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

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                l.add(split[i]);
            }
        }

        System.out.println(l.toString());

    }

    //        if (!terminoParentesis.startsWith("-") && !terminoParentesis.startsWith("+")) {
//            terminoParentesis = "+" + terminoParentesis;
//        }
}
