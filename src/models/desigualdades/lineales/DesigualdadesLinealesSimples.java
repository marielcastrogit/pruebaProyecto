package models.desigualdades.lineales;
//@author Mariel Castro

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesigualdadesLinealesSimples {

    //-3x+4<11
    /*
    Pasos que debo seguir: 
    1- Dividir a la desigualdad en tres partes:
        Primera parte: la parte izquierda de la ecuacion
        Segunda parte: la parte que contiene el signo 
        Tercera parte: la parte derecha de la ecuacion
    2- Crear 2 listas una para guardar las x y otra para guardar los numeros 
     */
    private final String desigualdad;
    private final ArrayList listaX;
    private final ArrayList listaN;

    public DesigualdadesLinealesSimples(String desigualdad) {
        this.desigualdad = desigualdad;
        listaX = new ArrayList();
        listaN = new ArrayList();
    }

    //Parte 1 de la desigualdad - lado izquierdo
    public String setParte1() {
        String[] split = desigualdad.split("(<|>|≥|≤)([+-]?\\d*x?)*");
        String p1 = "";
        /*
        ("(<|>|≥|≤)([+-]?\\d*x?)*")
        (<|>|≥|≤) debe tener um signo de comparacion 
        
        Seguido por [+-]? signos aritmeticos opcionalmente 
        \d* digitos entre 0 -1 que se pueden repetir de 0 a mas veces 
        x? una x opcionalmente 
        y todo lo anterior se puede repetir 0 o mas veces
         */
        for (int i = 0; i < split.length; i++) {
            p1 = p1 + split[i];
        }

//        Si no tiene signo entonces que le agregue un + 
        if (!(p1.startsWith("+") || p1.startsWith("-"))) {
            p1 = "+" + p1;
        }
        return p1;
    }

    //Parte 2 signo
    public String setSigno() {
        int posicionSigno = 0;
        for (int i = 0; i < desigualdad.length(); i++) {
            if (desigualdad.charAt(i) == '<' || desigualdad.charAt(i) == '>' || desigualdad.charAt(i) == '≤' || desigualdad.charAt(i) == '≥') {
                posicionSigno = i;
            }
        }
        char[] toCharArray = desigualdad.toCharArray();

        return toCharArray[posicionSigno] + "";
    }

    //Parte 3 de la desigualdad - lado derecho
    public String setParte3() {
        String[] split = desigualdad.split("([+-]*\\d*x*)*(<|>|≥|≤)");
        /*
        ([+-]*\d*x*)* signos aritmeticos, digitos entre 0-9 y una x
        (<|>|≥|≤)debe de tener menor o mayor o mayor igual o menor igual 
         */
        String p2 = "";
        for (int i = 0; i < split.length; i++) {
            p2 += split[i];
        }

        if (!(p2.startsWith("+") || p2.startsWith("-"))) {
            p2 = "+" + p2;
        }
        return p2;
    }

    public String setTerminosX() {
        //LADO IZQUIERDO - PARTE1:
        String replace = (setParte1().replace("+", ",+"));
        String remplazo = replace.replace("-", ",-");
        String[] split1 = remplazo.split(",");
        /*Todos los terminos con x deben de seguir el siguiente patron:*/
        Pattern patronX = Pattern.compile("[-+]\\d*x{1}");
        for (int i = 0; i < split1.length; i++) {
            if (patronX.matcher(split1[i]).matches()) {
                listaX.add(split1[i]);
            }
        }

        //LADO DERECHO - PARTE 3:
        replace = (setParte3().replace("+", ",+"));
        remplazo = replace.replace("-", ",-");
        split1 = remplazo.split(",");

        for (int i = 0; i < split1.length; i++) {
            if (patronX.matcher(split1[i]).matches()) {
                if (split1[i].startsWith("-")) {
                    listaX.add(split1[i].replace("-", "+"));
                }
                if (split1[i].startsWith("+")) {
                    listaX.add(split1[i].replace('+', '-'));
                }
            }
        }
        String x = "";
        int i = 0;
        while (i < listaX.size()) {
            x += listaX.get(i).toString();
            i++;
        }

        //Elimo las x para que me queden solo los numeros:
        String coeficientesX = "";
        String[] split = x.split("x");

        i = 0;
        while (i < split.length) {
            coeficientesX += split[i];
            i++;
        }

        return coeficientesX;

    }

    public ArrayList<String> setNumeros() {
        /*Todos los terminos que no tienen que x deberan tener el siguiente patron:*/
        Pattern patronX = Pattern.compile("[+-]*\\d*(?!\\d*x)");
        String replace = (setParte3().replace("+", ",+"));
        String remplazo = replace.replace("-", ",-");
        String[] split1 = remplazo.split(",");
        //LADO DERECHO - PARTE 3:
        for (int i = 0; i < split1.length; i++) {
            if (patronX.matcher(split1[i]).matches()) {
                if (!split1[i].equals("")) {
                    listaN.add(split1[i]);
                }
            }
        }

        replace = (setParte1().replace("+", ",+"));
        remplazo = replace.replace("-", ",-");
        split1 = remplazo.split(",");
        //LADO IZQUIERDO - PARTE1:
        for (int i = 0; i < split1.length; i++) {
            if (patronX.matcher(split1[i]).matches()) {
                if (!split1[i].equals("")) {
                    if (split1[i].startsWith("-")) {
                        listaN.add(split1[i].replace("-", "+"));
                    }
                    if (split1[i].startsWith("+")) {
                        listaN.add(split1[i].replace('+', '-'));
                    }
                }
            }
        }

        String n = "";
        int i = 0;
        while (i < listaN.size()) {
            n += listaN.get(i).toString();
            i++;
        }

        return listaN;
    }

    public void operar(ArrayList<String> operacion) {
        Pattern patronmasAmasB = Pattern.compile("([+]\\d*)([+]\\d*)");

        ArrayList listaNS = new ArrayList();
        int resultado = 0;
        String resultadoS = "";
        String p = operacion.get(0).toString() + operacion.get(1).toString();
        System.out.println("p inicial" + p);
        System.out.println();

        if (patronmasAmasB.matcher(p).matches()) {
            String[] split = p.split("\\+");

            int x = 0;
            while (x < split.length) {
                if (!split[x].equals("")) {
                    listaNS.add(split[x]);
                }
                x++;
            }
            int t = 0;
            while (t < listaNS.size()) {
                System.out.println("lista [" + t + "] " + listaNS.get(t));
                System.out.println();
                t++;
            }

            try {
                Double num1 = Double.parseDouble(listaNS.get(0).toString());
                Double num2 = Double.parseDouble(listaNS.get(1).toString());
                resultado = (int) Operacion.sumar(num1, num2);
                resultadoS = "+" + resultado;
                listaNS.remove(0);
                listaNS.remove(0);
                listaNS.add(resultadoS);
            } catch (NumberFormatException ex) {
            }
            int Y = 0;
            while (Y < listaNS.size()) {
                System.out.println("lista [" + Y + "] " + listaNS.get(Y));
                System.out.println();
                Y++;
            }

        }

        for (int i = 2; i < listaN.size(); i++) {
            System.out.println();
            System.out.println("valor i" + i);

            p = resultadoS + listaN.get(i);
            System.out.println("valor de p en " + i + ": " + p);
            System.out.println(patronmasAmasB.matcher(p).matches());
            if (patronmasAmasB.matcher(p).matches()) {
                String[] split = p.split("\\+");
                System.out.println("entrooo");
                int x = 0;
                while (x < split.length) {
                    if (!split[x].equals("")) {
                        listaNS.add(split[x]);
                    }
                    x++;
                }

                try {
                    Double num1 = Double.parseDouble(resultadoS);
                    System.out.println("numero1: " + num1);
                    Double num2 = Double.parseDouble(listaN.get(i).toString());
                    System.out.println("numero2: " + num2);
                    resultado = (int) Operacion.sumar(num1, num2);
                    resultadoS = "+" + resultado;
//                    listaNS.remove(0);
//                    listaNS.add(resultadoS);
                } catch (NumberFormatException ex) {
                    System.out.println("error");
                }
            }
            System.out.println(resultadoS);
        }

    }

}
