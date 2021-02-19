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
        String lp = "-(x+1)+3(x-2)-(x+8)+9+7<0";
        DesigualdadesLinealesParentesis dlp = new DesigualdadesLinealesParentesis(lp);
        dlp.setPartes();
        System.out.println(dlp.getTerminosParentesis(dlp.getParte1()));
        //System.out.println(dlp.getTerminosParentesis(dlp.getParte2()));
    }
}
