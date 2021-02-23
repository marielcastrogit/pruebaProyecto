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
        String lp = "(7x)-(8x)-2(x+3)+5-x(2+4)-6<0";
        DesigualdadesLinealesParentesis dlp = new DesigualdadesLinealesParentesis(lp);
        System.out.println("resultadoLinealParentesis: " + dlp.getResultadoFinal());

        System.out.println();
        System.out.println("DESIGUALDADES CUADRATICAS");
        //-3x^2-3+41+x^2+7x-3x-8x
        String desigualdadCuadratica = "2x^2-3+41-x^2+7x-3x-8x";
        DesigualdadesCuadraticasSimples dcs = new DesigualdadesCuadraticasSimples(desigualdadCuadratica);
        dcs.getDiscriminante();
        //        EvalUtilities evaluador = new EvalUtilities(false, false);
        //        IExpr resultado = evaluador.evaluate("-12x^2-12x^2");
        //        System.out.println(resultado);
        //
        //        System.out.println(cadenaSignoCambiado);
    }
}
