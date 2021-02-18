package models.desigualdades.lineales;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Operacion {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static String operar(ArrayList<String> operacion) {

        Pattern patronmasAmasB = Pattern.compile("([+]\\d*)([+]\\d*)");//+a+b
        Pattern patronmenosAmenosB = Pattern.compile("([-]\\d*)([-]\\d*)");//-a-b
        Pattern patronmasAmenosB = Pattern.compile("([+]\\d*)([-]\\d*)");//+a-b
        Pattern patronmenosAmasB = Pattern.compile("([-]\\d*)([+]\\d*)");//-a+b

        int resultado = 0;
        String resultadoS = "";
        if (operacion.size() > 1) {
            String p = operacion.get(0).toString() + operacion.get(1).toString();

            //+a+b
            if (patronmasAmasB.matcher(p).matches()) {
                try {
                    Double num1 = Double.parseDouble(operacion.get(0).toString());
                    Double num2 = Double.parseDouble(operacion.get(1).toString());
                    resultado = (int) sumar(num1, num2);
                    resultadoS = "+" + resultado;
                } catch (NumberFormatException ex) {
                }
            }

            //-a-b
            if (patronmenosAmenosB.matcher(p).matches()) {
                try {
                    Double num1 = Double.parseDouble(operacion.get(0).toString());
                    Double num2 = Double.parseDouble(operacion.get(1).toString());
                    resultado = (int) sumar(num1, num2);
                    resultadoS = "" + resultado;
                } catch (NumberFormatException ex) {
                }
            }

            //-a+b
            if (patronmenosAmasB.matcher(p).matches()) {
                try {
                    Double num1 = Double.parseDouble(operacion.get(0).toString());
                    Double num2 = Double.parseDouble(operacion.get(1).toString());
                    resultado = (int) sumar(num1, num2);
                    if (Math.abs(num1) > Math.abs(num2)) {
                        resultadoS = "" + resultado;
                    } else {
                        resultadoS = "+" + resultado;
                    }
                } catch (NumberFormatException ex) {
                }
            }

            //+a-b
            if (patronmasAmenosB.matcher(p).matches()) {
                try {
                    Double num1 = Double.parseDouble(operacion.get(0).toString());
                    Double num2 = Double.parseDouble(operacion.get(1).toString());
                    resultado = (int) sumar(num1, num2);
                    if (Math.abs(num1) > Math.abs(num2)) {
                        resultadoS = "+" + resultado;
                    } else {
                        resultadoS = "" + resultado;
                    }
                } catch (NumberFormatException ex) {
                }
            }

            for (int i = 2; i < operacion.size(); i++) {
                p = resultadoS + operacion.get(i);

                //+a+b
                if (patronmasAmasB.matcher(p).matches()) {
                    try {
                        Double num1 = Double.parseDouble(resultadoS);
                        Double num2 = Double.parseDouble(operacion.get(i).toString());
                        resultado = (int) sumar(num1, num2);
                        resultadoS = "+" + resultado;
                    } catch (NumberFormatException ex) {
                    }
                }

                //-a-b
                if (patronmenosAmenosB.matcher(p).matches()) {
                    try {
                        Double num1 = Double.parseDouble(resultadoS);
                        Double num2 = Double.parseDouble(operacion.get(i).toString());
                        resultado = (int) sumar(num1, num2);
                        resultadoS = "" + resultado;
                    } catch (NumberFormatException ex) {
                    }
                }

                //-a+b
                if (patronmenosAmasB.matcher(p).matches()) {
                    try {
                        Double num1 = Double.parseDouble(resultadoS);
                        Double num2 = Double.parseDouble(operacion.get(i).toString());
                        resultado = (int) sumar(num1, num2);
                        if (Math.abs(num1) > Math.abs(num2)) {
                            resultadoS = "" + resultado;
                        } else {
                            resultadoS = "+" + resultado;
                        }
                    } catch (NumberFormatException ex) {
                    }
                }

                //+a-b
                if (patronmasAmenosB.matcher(p).matches()) {
                    try {
                        Double num1 = Double.parseDouble(resultadoS);
                        Double num2 = Double.parseDouble(operacion.get(i).toString());
                        resultado = (int) sumar(num1, num2);
                        if (Math.abs(num1) > Math.abs(num2)) {
                            resultadoS = "+" + resultado;
                        } else {
                            resultadoS = "" + resultado;
                        }
                    } catch (NumberFormatException ex) {
                    }
                }
            }
            return resultadoS;
        } else {
            return operacion.get(0).toString();
        }
    }
}
