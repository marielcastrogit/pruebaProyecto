package models.usuario;

import java.util.regex.Pattern;

public class ValidarEmail {

    private String regexEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Pattern patronEmail;

    public ValidarEmail() {
        patronEmail = Pattern.compile(regexEmail);
    }

    public boolean esValido(String txtCorreo) {
        if (patronEmail.matcher(txtCorreo).matches()) {
            return true;
        } else {
            return false;
        }
    }
}
