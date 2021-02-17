package models.desigualdades.lineales;

public class NewMain {

    public static void main(String[] args) {
        String dat = "-9+6<-3+4";
        DesigualdadesLinealesSimples dls = new DesigualdadesLinealesSimples(dat);
        dls.setParte1();
        dls.setSigno();
        dls.setParte3();
        System.out.println("numeros:");
        System.out.println(dls.operar(dls.setNumeros()));
        System.out.println();
//        System.out.println("numeros x:");
//        System.out.println(dls.operar(dls.setTerminosX()));

    }

}
