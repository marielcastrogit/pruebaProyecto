package models.usuario;
/**
 *
 * @author Mariel
 */
import java.util.regex.Pattern;

public class ValidarEmail {

    private String regexEmail;
    private Pattern patronEmail;

    public ValidarEmail() {
         regexEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        patronEmail = Pattern.compile(regexEmail);
       
    }

    public boolean esValido(String txtCorreo) {
        if (!txtCorreo.isEmpty()) {
            if (patronEmail.matcher(txtCorreo).matches()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
