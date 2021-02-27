package models.usuario;

/**
 *
 * @author Mariel
 */
public class HiloEnvioMensaje implements Runnable {

    private String correoUsuario;
    public static EnviarCodigoVerificacion codigo;
    public static String correo ;

    public HiloEnvioMensaje(String correoUsuario) {
        this.correoUsuario = correoUsuario;
        correo = correoUsuario;
        codigo = new EnviarCodigoVerificacion();
    }

    @Override
    public void run() {
        codigo.enviarCodigo(correoUsuario);
    }


}
