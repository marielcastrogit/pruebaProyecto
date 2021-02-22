package models.desigualdades.lineales;

import java.util.ArrayList;

public class DesigualdadesCuadraticasSimples {

    private String cadena, terminoA;

    public DesigualdadesCuadraticasSimples(String cadena) {
        this.cadena = cadena;
        terminoA = "";
    }

    public String getA() {
        int numXAlCuadrado = 0, posSigno = 0;
        ArrayList al = new ArrayList();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'x' && !(i == cadena.length() - 1)) {
                if (cadena.charAt(i + 1) == '^' && cadena.charAt(i + 2) == '2') {
                    numXAlCuadrado++;
                }
            }
        }

        if (numXAlCuadrado > 1) {

            for (int i = 0; i < numXAlCuadrado; i++) {
                char[] toCharArray = cadena.toCharArray();
                al.clear();
                for (int f = 0; f < toCharArray.length; f++) {
                    al.add(toCharArray[f]);
                }
                f1:
                for (int c = 0; c < al.size(); c++) {
                    ////////////////////////////////////////////////////////////
                    if (al.get(c).toString().equals("x") && !(c == al.size() - 1)) {
//                        System.out.println();
//                        System.out.println("es una x " + c);

                        //////////////////////////////////////////////////////////////////
//                        System.out.println("al.get(i + 1).toString().equals(\"^\"): " + al.get(c + 1).toString());
                        if (al.get(c + 1).toString().equals("^") && al.get(c + 2).toString().equals("2")) {
//                            System.out.println();
//                            System.out.println("tercer if " + c);
                            int z = c - 1;
                            System.out.println("c: " + c + " z: " + z);
                            w1:
                            while (z >= 0) {
//                                terminoA = al.get(z).toString() + terminoA;
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
                            
                            String substring = cadena.substring(posSigno, c+3);
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
                cadena ="";
                for (int m = 0; m < al.size(); m++) {
                    cadena += al.get(m).toString();
                    
                }
                System.out.println("cadena:" + cadena);
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
}
