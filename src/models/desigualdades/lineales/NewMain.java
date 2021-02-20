package models.desigualdades.lineales;

import java.util.ArrayList;
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

        System.out.println("DESIGUALDADES LINEALES PARENTESIS");
        //2(x-2)-(x+1)(x-2+x)
        String lp = "3(x+1)<0";
        DesigualdadesLinealesParentesis dlp = new DesigualdadesLinealesParentesis(lp);
        dlp.setPartes();
//        System.out.println(dlp.getTerminosParentesis(dlp.getParte1()));
//        System.out.println(dlp.getTerminosParentesis(dlp.getParte2()));
//        dlp.getMulti(dlp.getTerminosParentesis(dlp.getParte1()));
        EvalUtilities util = new EvalUtilities(false, true);
        String g = dlp.getMulti(dlp.getTerminosParentesis(dlp.getParte1()));
        System.out.println(g);
        IExpr result = util.evaluate(g);
        System.out.println(result);

    }
}
