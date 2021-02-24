package models.usuario;

public class PruebaUsuario {

    public static void main(String[] args) {
        EnviarCodigoVerificacion codigo = new EnviarCodigoVerificacion();
        codigo.enviarCodigo("marielfx89@gmail.com");
    }

}
