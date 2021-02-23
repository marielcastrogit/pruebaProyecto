package models.desigualdades.lineales;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.matheclipse.core.eval.EvalUtilities;
import org.matheclipse.core.interfaces.IExpr;

public class DesigualdadesCuadraticasSimples {

    private String cadena, terminoA, c1, a, b, c;
    private double discriminante;

    public DesigualdadesCuadraticasSimples(String cadena) {
        this.cadena = cadena;
        terminoA = "";
        c1 = cadena;
        a = "";
        b = "";
        c = "";
        discriminante = 0;
    }

    public String getCadena() {
        return cadena;
    }

    public String getA() {

        int numXAlCuadrado = 0, posSigno = 0;
        ArrayList al = new ArrayList();

        for (int i = 0; i < c1.length(); i++) {
            if (c1.charAt(i) == 'x' && !(i == c1.length() - 1)) {
                if (c1.charAt(i + 1) == '^' && c1.charAt(i + 2) == '2') {
                    numXAlCuadrado++;
                }
            }
        }

        if (numXAlCuadrado > 1) {

            for (int i = 0; i < numXAlCuadrado; i++) {
                char[] toCharArray = c1.toCharArray();
                al.clear();
                for (int f = 0; f < toCharArray.length; f++) {
                    al.add(toCharArray[f]);
                }
                f1:
                for (int c = 0; c < al.size(); c++) {
                    if (al.get(c).toString().equals("x") && !(c == al.size() - 1)) {
                        if (al.get(c + 1).toString().equals("^") && al.get(c + 2).toString().equals("2")) {
                            int z = c - 1;

                            w1:
                            while (z >= 0) {
                                if (al.get(z).toString().equals("-")) {
                                    posSigno = z;
                                    break w1;
                                }
                                if (al.get(z).toString().equals("+")) {
                                    posSigno = z;
                                    break w1;
                                }
                                z--;
                            }

                            String substring = c1.substring(posSigno, c + 3);
                            terminoA += substring;
                            int x = c + 2;
                            w2:
                            while (x >= posSigno) {
                                al.remove(x);
                                x--;
                            }
                            break f1;
                        }
                    }
                }
                c1 = "";
                for (int m = 0; m < al.size(); m++) {
                    c1 += al.get(m).toString();

                }
            }
            EvalUtilities evaluador = new EvalUtilities(false, false);
            IExpr resultado = evaluador.evaluate(terminoA);
            if (resultado.toString() != "0") {
                String replace = resultado.toString().replace("(", "").replace("*", "").replace(")", "");
                terminoA = replace;
            } else {
                terminoA = resultado.toString();
            }
        } else {
            f1:
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == 'x' && !(i == cadena.length() - 1)) {
                    if (cadena.charAt(i + 1) == '^' && cadena.charAt(i + 2) == '2') {
                        int x = i - 1;

                        b1:
                        while (x >= 0) {
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
        }
        return terminoA;

    }

    private boolean esLineal() {
        if (terminoA.equals("0")) {
            return true;
        } else {
            return false;
        }
    }

    public void setABC() {
        String desigualdadC = getA() + c1;
        System.out.println("terminoA :" + terminoA);
        System.out.println("desigualdadC :" + desigualdadC);
        if (!esLineal()) {
            if (terminoA.startsWith("-")) {
                char[] toCharArray = desigualdadC.toCharArray();
                for (int i = 0; i < desigualdadC.length(); i++) {
                    if (toCharArray[i] == '-') {
                        toCharArray[i] = '+';
                    } else if (toCharArray[i] == '+') {
                        toCharArray[i] = '-';
                    }

                    if (toCharArray[i] == '<') {
                        toCharArray[i] = '>';
                    } else if (toCharArray[i] == '>') {
                        toCharArray[i] = '<';
                    }
                    if (toCharArray[i] == '≤') {
                        toCharArray[i] = '≥';
                    } else if (toCharArray[i] == '≥') {
                        toCharArray[i] = '≤';
                    }

                }
                desigualdadC = "";
                for (int i = 0; i < toCharArray.length; i++) {
                    System.out.println("toCharArray: " + toCharArray[i]);
                    desigualdadC += toCharArray[i];
                }
            }
            System.out.println("c1: " + c1);
            EvalUtilities evaluador = new EvalUtilities(false, true);
            IExpr resultado = evaluador.evaluate(desigualdadC);
            System.out.println("resultado: " + resultado.toString());
            String r = resultado.toString().replace("*", "").replace("(", "").replace(")", "");
            desigualdadC = r.toString();
            String c2 = "";

            if (!desigualdadC.startsWith("-") && !desigualdadC.startsWith("+")) {
                c2 = "+" + desigualdadC;
            } else {
                c2 = desigualdadC;
            }

            String r2 = c2.replace("+", ",+").replace("-", ",-");

            String[] split = r2.split(",");

            Pattern patronA = Pattern.compile("[+-]*\\d*x{1}\\^2");
            Pattern patronB = Pattern.compile("[+-]?\\d*x{1}");
            Pattern patronC = Pattern.compile("[+-]?\\d*");

            for (int i = 0; i < split.length; i++) {
                System.out.println();
                System.out.println(split[i]);
            }

            for (int i = 1; i < split.length; i++) {
                if (patronA.matcher(split[i]).matches()) {
                    String[] split1 = split[i].split("x");
                    if ("+".equals(split1[0])) {
                        a = "1";
                    } else if ("-".equals(split1[0])) {
                        a = "-1";
                    } else {
                        a = split1[0];
                    }
                }

                if (patronB.matcher(split[i]).matches()) {
                    String[] split1 = split[i].split("x");
                    if ("+".equals(split1[0])) {
                        b = "1";
                    } else if ("-".equals(split1[0])) {
                        b = "-1";
                    } else {
                        b = split1[0];
                    }

                }

                if (patronC.matcher(split[i]).matches()) {
                    c = split[i];
                }

            }
        }

        System.out.println("discriminante: " + discriminante);
        System.out.println(desigualdadC);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    private double getDiscriminante() {
        setABC();
        int a = 0, b = 0, c = 0;
        boolean esEntero = false;
        try {
            a = Integer.parseInt(this.a);
            b = Integer.parseInt(this.b);
            c = Integer.parseInt(this.c);
        } catch (NumberFormatException ex) {
            System.out.println("error al convertir");
        }
        discriminante = Math.pow(b, 2) - ((4) * (a) * (c));

        if (discriminante == 0.0) {
            System.out.println("es 0.0");
            return 0;
        } else {
            return discriminante;
        }

    }

    private String formulaX1() {
        int a = 0, b = 0, c = 0;
        String fx = "";
        try {
            a = Integer.parseInt(this.a);
            b = Integer.parseInt(this.b);
            c = Integer.parseInt(this.c);
        } catch (NumberFormatException ex) {
            System.out.println("error al convertir");
        }
        double x = (((-1 * (b)) + Math.sqrt(getDiscriminante())) / 2 * (a));
        fx = String.valueOf(x);
        return fx;
    }

    private String formulaX2() {
        int a = 0, b = 0, c = 0;
        String fx = "";
        try {
            a = Integer.parseInt(this.a);
            b = Integer.parseInt(this.b);
            c = Integer.parseInt(this.c);
        } catch (NumberFormatException ex) {
            System.out.println("error al convertir");
        }
        double x = (((-1 * (b)) - Math.sqrt(getDiscriminante())) / 2 * (a));
        fx = String.valueOf(x);
        return fx;
    }

    public String resolver() {
        System.out.println("DISCRIMINANTE: " + getDiscriminante());
        getDiscriminante();
        String resultado = "", x1 = "", x2, x;
        if (discriminante < 0) {
            resultado = " Este trinomio no es factorizable\n en los reales, posee\n raices imaginarias";
        }

        if (discriminante == 0) {
            resultado = "x = " + formulaX1();
        }

        if (discriminante > 0) {
            resultado = "x = " + formulaX1() + " x = " + formulaX2();
        }
        return resultado;
    }
}
