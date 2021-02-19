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
        String lp = "-(x+1)(x-2)<0";
        DesigualdadesLinealesParentesis dlp = new DesigualdadesLinealesParentesis(lp);
        dlp.setPartes();
        System.out.println(dlp.getTerminosParentesis(dlp.getParte1()));

        char[] toCharArray = lp.toCharArray();
        int numParentesisApertura = 0;
        int numParentesisCierre = 0;
        int numParentesis = 0;
        String terminoParentesis = "";
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] == '(') {
                numParentesisApertura++;
            }
            if (toCharArray[i] == ')') {
                numParentesisCierre++;
            }
        }
        if (numParentesisApertura == numParentesisCierre) {
            numParentesis = (numParentesisApertura + numParentesisCierre )/2;
            for (int i = 0; i < numParentesis; i++) {
System.out.println(numParentesis);
            }
        }
        //System.out.println(dlp.getTerminosParentesis(dlp.getParte2()));
    }
}
