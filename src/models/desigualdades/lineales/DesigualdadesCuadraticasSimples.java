package models.desigualdades.lineales;

import java.util.ArrayList;
import org.matheclipse.core.eval.EvalUtilities;
import org.matheclipse.core.interfaces.IExpr;

public class DesigualdadesCuadraticasSimples {

    private String cadena, terminoA;

    public DesigualdadesCuadraticasSimples(String cadena) {
        this.cadena = cadena;
        terminoA = "";
    }

    public String getCadena() {
        return cadena;
    }

    public String getA() {
        String c1 = cadena;
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
                            System.out.println("c: " + c + " z: " + z);
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
                String replace = resultado.toString().replace("(", "").replace("*", "").replace(")","");
                terminoA = replace;
            }else{
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

    public boolean esLineal() {
        if (terminoA.equals("0")) {
            return true;
        } else {
            return false;
        }
    }
}
