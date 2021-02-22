package models.desigualdades.lineales;

import java.util.ArrayList;
import org.matheclipse.core.eval.EvalUtilities;
import org.matheclipse.core.interfaces.IExpr;

public class DesigualdadesLinealesParentesis {

    private String cadena, c, t, signo;
    private String listaLI;
    private String listaLD;
    private String tParentesis;

    public DesigualdadesLinealesParentesis(String cadena) {
        this.cadena = cadena;
        listaLI = "";
        listaLD = "";
        signo = "";
        tParentesis = "";
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
        (7x)-(8x)-2(x+3)+5-x(2+4)-6<0
         */
        //ejemplo:hola -> substring(0,2)-> resultado ->ho

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
                if (a != (numParentesis - 1)) {
                    while (y <= fin) {
                        l.remove(v);
                        y++;
                    }
                }
                for (int i = 0; i < l.size(); i++) {
                    reemplazo += l.get(i).toString();

                }

                cadena = reemplazo;
                if (a == numParentesis - 1) {
                    c = cadena;
                    t = terminoParentesis;
                }
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
        String resultado = "", r = "";
        for (int i = 0; i < l.size(); i++) {
            char[] toCharArray = l.get(i).toString().toCharArray();
            for (int b = 0; b < toCharArray.length; b++) {
            }
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

            if (comienzanConParentesisPos) {
                substringNum = "+1";
            }

            if (!comienzanConParentesisNeg && !comienzanConParentesisSolo && !comienzanConParentesisPos) {
                substringNum = l.get(i).toString().substring(0, posParentesisInicial);
            }

            for (int x = 1; x < splitParentesis.length; x++) {

                if (comienzanConParentesisSolo) {
                    resultado += splitParentesis[x];
                } else {
                    resultado += substringNum + "*" + splitParentesis[x];
                }
            }
        }
        return (resultado);
    }

    public String evaluarMulti(String valorParentesis) {
        EvalUtilities evaluador = new EvalUtilities(false, false);
        IExpr resultado = evaluador.evaluate(valorParentesis);
        return resultado.toString().replace("*", "");
    }

    public String resultadoLinealParentesis(String evaluarMulti) {
        String replace = c.replace(t, evaluarMulti);
        return replace;
    }

    public String getSigno() {
        int posicionSigno = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '<' || cadena.charAt(i) == '>' || cadena.charAt(i) == '≤' || cadena.charAt(i) == '≥') {
                posicionSigno = i;
            }
        }
        char[] toCharArray = cadena.toCharArray();
        this.signo = toCharArray[posicionSigno] + "";
        return signo;
    }

    public String getDesigualdadSimple() {
        ArrayList terminosParentesisli, terminosParentesisld;
        String multili, multild, resultadoMultiParentesisli, resultadoMultiParentesisld, resultadoLinealParentesisli, resultadoLinealParentesisld;
        setPartes();
        String parte1 = getParte1();
        String sig = getSigno();
        String parte2 = getParte2();

        terminosParentesisli = getTerminosParentesis(parte1);
        if (!parte1.equals("0")) {
            multili = getMulti(terminosParentesisli);
            resultadoMultiParentesisli = evaluarMulti(multili);
            resultadoLinealParentesisli = resultadoLinealParentesis(resultadoMultiParentesisli);
        } else {
            resultadoLinealParentesisli = "0";
        }
        terminosParentesisld = getTerminosParentesis(parte2);
        if (!parte2.equals("0")) {
            multild = getMulti(terminosParentesisld);
            resultadoMultiParentesisld = evaluarMulti(multild);
            resultadoLinealParentesisld = resultadoLinealParentesis(resultadoMultiParentesisld);
        } else {
            resultadoLinealParentesisld = "0";
        }
        return resultadoLinealParentesisli + getSigno() + resultadoLinealParentesisld;

    }

    public String getResultadoFinal() {
        DesigualdadesLinealesSimples dls = new DesigualdadesLinealesSimples(getDesigualdadSimple());
        dls.getParte1();
        dls.getSigno();
        dls.getParte3();
        return dls.resultado();
    }
}
