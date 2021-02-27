package models.usuario;
/**
 *
 * @author Mariel
 */
import java.util.regex.Pattern;

public class ValidarContraseña {

    private static String mensaje;

    /*
    La contrase+a debe tener entre 8 a 16 digitos
    Debe contener al menos una mayuscula 
    Debe contener al menos una minuscula
    no puede iniciar con _ bajo 
    La contraseña no puede terminar con un espacio
    
    //Validare de dos formas: 
    - Revisando la cadena con charAt y evaluando que contenga todo lo anterior 
    o como sea el caso
    - Con una expresion regular
     */
    public static boolean contraseñaValida(String contraseña) {
        mensaje = "";
        Pattern patronMayusculas = Pattern.compile("[A-Z]");
        Pattern patronMinusculas = Pattern.compile("[a-z]");

        boolean longitudContraseña = contraseña.length() >= 8 && contraseña.length() <= 16;

        int numMayusculas = 0; //si contiene al menos una mayuscula es valido
        int numMinusculas = 0;
        int caracterEspecial = 0;

        boolean contieneEspacios = false;

        char[] caracterContraseña = contraseña.toCharArray();
        if (contraseña.length() > 0) {

            if (contraseña.contains("contraseña") | contraseña.contains("password")) {
                if (contraseña.length() >= 8 && contraseña.length() <= 10) {
                    mensaje = "Introduzca una contraseña mas segura";
                }
            }

            for (int i = 0; i < caracterContraseña.length; i++) {

                //que contenga al menos una mayuscula, una minuscula, es decir un caracter alfanumerico
                if (patronMayusculas.matcher(caracterContraseña[i] + "").matches()) {
                    numMayusculas++;
                }
                if (patronMinusculas.matcher(caracterContraseña[i] + "").matches()) {
                    numMinusculas++;
                }

                if (caracterContraseña[i] == ' ') {
                    contieneEspacios = true;
                    mensaje = "Contraseña no debe contener espacios";
                }
                //Trabajando con la tabla ASCII
                if ((caracterContraseña[i] >= 33 && caracterContraseña[i] <= 47) || (caracterContraseña[i] >= 58 && caracterContraseña[i] <= 64) || (caracterContraseña[i] >= 91 && caracterContraseña[i] <= 95) || (caracterContraseña[i] >= 123 && caracterContraseña[i] <= 126)) {
                    caracterEspecial++;
                    System.out.println("es un caracter especial  " + caracterContraseña[i] );
                }

            }
        }

        /*
        Tiene al menos una maysucula 
        Tiene al menos una minuscula
        La longitud de la contraseña esta en una longitud de 0 a 16
        No empieza ni termina con un espacio
         */
        if (contraseña.length() == 0) {
            return false;
        } else if ((numMayusculas > 0) && (numMinusculas > 0) && (longitudContraseña) && !(contieneEspacios) && (caracterEspecial > 0)) {
            return true;
        } else {
            return false;
        }

    }

    public static String getMensaje() {
        return mensaje;
    }

}
