package models.usuario;
/**
 *
 * @author Mariel
 */
public class HiloEnvioMensaje implements Runnable {

    private String correoUsuario;
    public static EnviarCodigoVerificacion codigo;

    public HiloEnvioMensaje(String correoUsuario) {
        this.correoUsuario = correoUsuario;
        codigo = new EnviarCodigoVerificacion();
    }

    @Override
    public void run() {
        codigo.enviarCodigo(correoUsuario);
    }

}
