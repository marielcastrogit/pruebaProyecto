package models.desigualdades.lineales;

public class Fraccion {

    private String numerador, denominador;

    public String dividirFraccion(String numerador, String denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        //Si el resultado de dividir esta fraccion no es un entero entones que simplifique la fraccion.
        double resultadoDivisionF = 0.0;
        boolean esEntero = false;
        try {
            double nume = Double.parseDouble(numerador);
            double deno = Double.parseDouble(denominador);
            if (deno != 0) {
                resultadoDivisionF = nume / deno;
            }
            if (Math.floor(resultadoDivisionF) - resultadoDivisionF == 0) {
                esEntero = true;
            }
        } catch (NumberFormatException ex) {
        }
        if (!esEntero) {
            return simplificarFraccion();
        } else {
            int resultadoEnteroDivision = (int)resultadoDivisionF;
            return resultadoEnteroDivision +"";
        }
    }

    public int mcd() {
        int n = Math.abs(Integer.parseInt(numerador));
        int d = Math.abs(Integer.parseInt(denominador));

        if (d == 0) {
            return n;
        }

        int r;
        while (d != 0) {
            r = n % d;
            n = d;
            d = r;
        }
        return n;
    }

    public String simplificarFraccion() {
        int n = 0;
        int d =0;
        try {
            int dividir = mcd();
            n = Integer.parseInt(numerador);
            d = Integer.parseInt(denominador);
            
            n /= dividir;
            d /= dividir;
        } catch (NumberFormatException ex) {

        }
        return n + "/" + d;
    }
}
