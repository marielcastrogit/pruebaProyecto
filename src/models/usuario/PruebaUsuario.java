package models.usuario;
/**
 *
 * @author Mariel
 */
public class PruebaUsuario {

    public static void main(String[] args) {
        EnviarCodigoVerificacion codigo = new EnviarCodigoVerificacion();
        codigo.enviarCodigo("marielcastrogit@gmail.com");
    }

}
