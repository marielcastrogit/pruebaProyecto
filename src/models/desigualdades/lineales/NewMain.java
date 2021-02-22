package models.desigualdades.lineales;

import org.matheclipse.core.eval.EvalUtilities;
import org.matheclipse.core.interfaces.IExpr;

public class NewMain {

    public static void main(String[] args) {
        /*
        Desigualdades lineales simples
        x-9>-5x+10
        100≥20x+15
         */
        System.out.println("DESIGUALDADES LINEALES SIMPLES");
        String dat = "3x+3<5x+5";
        DesigualdadesLinealesSimples dls = new DesigualdadesLinealesSimples(dat);
        dls.getParte1();
        dls.getSigno();
        dls.getParte3();
        System.out.println(dls.resultado());
        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("DESIGUALDADES LINEALES SIMPLES PARENTESIS");
        //2(x-2)-(x+1)(x-2+x)
        String lp = "(7x)-(8x)-2(x+3)+5-x(2+4)-6<0";
        DesigualdadesLinealesParentesis dlp = new DesigualdadesLinealesParentesis(lp);
        System.out.println("resultadoLinealParentesis: " + dlp.getResultadoFinal());

        //////////////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.println("DESIGUALDADES CUADRATICAS");
        String desigualdadCuadratica = "x+7x-3x-1-12x^2≤";
        DesigualdadesCuadraticasSimples dcs = new DesigualdadesCuadraticasSimples(desigualdadCuadratica);
        String replace = "";
        String name = dcs.getA();
        System.out.println(name);
        String cadenaSignoCambiado = "";
        if (name.startsWith("-")) {
            char[] toCharArray = desigualdadCuadratica.toCharArray();
            for (int i = 0; i < desigualdadCuadratica.length(); i++) {
                if (toCharArray[i] == '-') {
                    toCharArray[i] = '+';
                } else if (toCharArray[i] == '+') {
                    toCharArray[i] = '-';
                }

                if (toCharArray[i] == '<') {
                    toCharArray[i] = '>';
                } else if (toCharArray[i] == '>') {
                    toCharArray[i] = '<';
                }
                if (toCharArray[i] == '≤') {
                    toCharArray[i] = '≥';
                } else if (toCharArray[i] == '≥') {
                    toCharArray[i] = '≤';
                }

            }

            for (int i = 0; i < toCharArray.length; i++) {
                cadenaSignoCambiado += toCharArray[i];
            }
        }

        System.out.println(cadenaSignoCambiado);
    }
}
