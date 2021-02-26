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
        String dat = "-x+x<1";
        DesigualdadesLinealesSimples dls = new DesigualdadesLinealesSimples(dat);
        dls.getParte1();
        dls.getSigno();
        dls.getParte3();
        System.out.println(dls.resultado());
        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("DESIGUALDADES LINEALES SIMPLES PARENTESIS");
        String lp = "";
        DesigualdadesLinealesParentesis dlp = new DesigualdadesLinealesParentesis(lp);
        System.out.println("resultadoLinealParentesis: " + dlp.getResultadoFinal());

        System.out.println();
        System.out.println("DESIGUALDADES CUADRATICAS");
        //-3x^2-3+41+x^2+7x-3x-8x
        //2x^2-3+41-x^2+7x-3x-8x
        //x^2-5x+4<32-x^2
        //x^2-3+41-x^2+7x-3x<-8x
        String desigualdadCuadratica = "x^2-3+41+7x-3x<0";
        DesigualdadesCuadraticasSimples dcs = new DesigualdadesCuadraticasSimples(desigualdadCuadratica);
        System.out.println(dcs.resolver());

        EvalUtilities evaluador = new EvalUtilities(false, false);
        IExpr res = evaluador.evaluate("8x<7");
//        String r = res.toString().replace("*", "").replace("(", "").replace(")", "");
        System.out.println("resultado: " + res);
    }
}
