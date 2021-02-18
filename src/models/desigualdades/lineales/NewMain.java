package models.desigualdades.lineales;

public class NewMain {

    public static void main(String[] args) {
        String dat = "-x>17";
        DesigualdadesLinealesSimples dls = new DesigualdadesLinealesSimples(dat);
        dls.getParte1();
        dls.getSigno();
        dls.getParte3();
        System.out.println(dls.resultado());
    }

}
