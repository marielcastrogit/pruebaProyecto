package models.desigualdades.lineales;


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
        String lp = "(7x)-(8x)-2(x+3)+5-x(2+4)-6<0";
        DesigualdadesLinealesParentesis dlp = new DesigualdadesLinealesParentesis(lp);
//        dlp.setPartes();
////        System.out.println(dlp.getTerminosParentesis(dlp.getParte1()));
////        System.out.println(dlp.getTerminosParentesis(dlp.getParte2()));
////        dlp.getMulti(dlp.getTerminosParentesis(dlp.getParte1()));
//        String parte1 = dlp.getParte1();
//        ArrayList terminosParentesis = dlp.getTerminosParentesis(parte1);
//        String multi = dlp.getMulti(terminosParentesis);
//        String resultadoMultiParentesis = dlp.evaluarMulti(multi);
//        String resultadoLinealParentesis = dlp.resultadoLinealParentesis(resultadoMultiParentesis);
//        System.out.println("PARTE 1: " + parte1);
//        System.out.println("Terminos en parentesis: " + terminosParentesis.toString());
//        System.out.println("A multiplicar: " + multi);
//        System.out.println("resultadoMultiParentesis: " + resultadoMultiParentesis);
//        System.out.println();
        System.out.println("resultadoLinealParentesis: " + dlp.getResultadoFinal());
        
        

    }
}
