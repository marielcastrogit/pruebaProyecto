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

        System.out.println("DESIGUALDADES LINEALES PARENTESIS");
        String lp = "4(x+2)-3x-5";
        /*
        3x+2(x-2)>4x
        -(x+1)(x+2)(x+3)<0
        5x-(3-2x)+8>9+3(2x-4)
        */
        boolean contieneParentesis = lp.contains("(") && lp.contains(")");
        int numApertura = 0;
        int numCierre = 0;
        //Determinar si los parentesis estan completos:
        char[] toCharArray = lp.toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] == '(') {
                numApertura++;
            }
            if (toCharArray[i] == ')') {
                numCierre++;
            }
        }

        if (numApertura == numCierre) {//Si los parentesis estan completos
         
        }
        
        System.out.println(contieneParentesis);
    }

}
