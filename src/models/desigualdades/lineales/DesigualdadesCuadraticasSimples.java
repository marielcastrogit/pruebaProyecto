package models.desigualdades.lineales;

public class DesigualdadesCuadraticasSimples {

    private String cadena, terminoA;

    public DesigualdadesCuadraticasSimples(String cadena) {
        this.cadena = cadena;
        terminoA = "";
    }

    public String getA() {
        String terminoA2 = "";
        f1:
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'x' && !(i == cadena.length() - 1)) {
                if (cadena.charAt(i + 1) == '^' && cadena.charAt(i + 2) == '2') {
                    int x = i;

                    b1:
                    while (x >= 0) {
                        System.out.println("x " + x);
                        terminoA = cadena.charAt(x) + terminoA;

                        if (cadena.charAt(x) == '-') {
                            break b1;
                        }
                        if (cadena.charAt(x) == '+') {
                            break b1;
                        }

                        
                        x--;
                    }

                    break f1;
                }
            }
        }
        if (terminoA.equals("")) {
            terminoA = "+1";
        }

        if (terminoA.equals("-")) {
            terminoA = "-1";
        }
        return terminoA;
    }
}
