package models.usuario;

public class HiloEnvioMensaje implements Runnable {

    private String correoUsuario;

    public HiloEnvioMensaje(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    @Override
    public void run() {
        EnviarCodigoVerificacion codigo = new EnviarCodigoVerificacion();
        codigo.enviarCodigo(correoUsuario);
    }

}
