package models.desigualdades.lineales;
//@author Mariel Castro

import java.util.ArrayList;
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
    public String getParte1() {
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

    private String signo;

    //Parte 2 signo
    public String getSigno() {
        int posicionSigno = 0;
        for (int i = 0; i < desigualdad.length(); i++) {
            if (desigualdad.charAt(i) == '<' || desigualdad.charAt(i) == '>' || desigualdad.charAt(i) == '≤' || desigualdad.charAt(i) == '≥') {
                posicionSigno = i;
            }
        }
        char[] toCharArray = desigualdad.toCharArray();
        this.signo = toCharArray[posicionSigno] + "";
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    //Parte 3 de la desigualdad - lado derecho
    public String getParte3() {
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

    public ArrayList<String> getTerminosX() {
        //LADO IZQUIERDO - PARTE1:
        String replace = (getParte1().replace("+", ",+"));
        String remplazo = replace.replace("-", ",-");
        String[] split1 = remplazo.split(",");
        /*Todos los terminos con x deben de seguir el siguiente patron:*/
        Pattern patronX = Pattern.compile("[-+]\\d*x{1}");
        for (int i = 0; i < split1.length; i++) {
            if (patronX.matcher(split1[i]).matches()) {
                if (split1[i].equals("+x")) {
                    split1[i] = "+1x";
                }
                if (split1[i].equals("-x")) {
                    split1[i] = "-1x";
                }
                listaX.add(split1[i]);
            }
        }

        //LADO DERECHO - PARTE 3:
        replace = (getParte3().replace("+", ",+"));
        remplazo = replace.replace("-", ",-");
        split1 = remplazo.split(",");

        for (int i = 0; i < split1.length; i++) {
            if (patronX.matcher(split1[i]).matches()) {
                if (split1[i].startsWith("-")) {
                    if (split1[i].equals("-x")) {
                        split1[i] = "-1x";
                    }
                    listaX.add(split1[i].replace("-", "+"));
                }
                if (split1[i].startsWith("+")) {
                    if (split1[i].equals("+x")) {
                        split1[i] = "+1x";
                    }
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
        String[] split = x.split("x");
        listaX.clear();

        for (int s = 0; s < split.length; s++) {
            if (!split[s].equals("")) {
                listaX.add(split[s]);
            }
        }
        return listaX;

    }

    public ArrayList<String> getNumeros() {
        /*Todos los terminos que no tienen que x deberan tener el siguiente patron:*/
        Pattern patronX = Pattern.compile("[+-]*\\d*(?!\\d*x)");
        String replace = (getParte3().replace("+", ",+"));
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

        replace = (getParte1().replace("+", ",+"));
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
        return listaN;
    }

    public String resultado() {
        String x = Operacion.operar(getTerminosX());
        System.out.println(x);
        String n = Operacion.operar(getNumeros());
        System.out.println(n);
        if (x.startsWith("-")) {
            //Si el coeficiente de la x es un numero negativo entonces se cambia el signo
            //≤' || desigualdad.charAt(i) == '≥'
            if (getSigno().equals("<")) {
                setSigno(">");

            } else if (getSigno().equals(">")) {
                setSigno("<");
            } else if (getSigno().equals("≤")) {
                setSigno("≥");
            } else if (getSigno().equals("≥")) {
                setSigno("≤");
            }
        }
        Fraccion f = new Fraccion();
        String dividirFraccion = f.dividirFraccion(n, x);
        return "x " + signo + " " + dividirFraccion;

    }

}
