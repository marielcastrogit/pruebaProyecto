package models.usuario;

import java.util.ArrayList;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *
 * @author Mariel
 */
public class EnviarCodigoVerificacion {

    private int codigoAleatorio;
    private String codigo;
    private ArrayList codigos;
    private Pattern patronCodigo;
    private String mekAppCorreo;
    private String mekAppContraseña;
//    private final String codigoFijo;

    public EnviarCodigoVerificacion() {
        codigoAleatorio = 0;
        codigos = new ArrayList();
        codigos.add("M");//M de MekApp
        codigo = "";
        /*
        M el codigo debe contener una M al inicio 
        \d seguido de digitos entre 0-9
        {6} los digitos entre 0-9 se repiten 6 veces
         */
        patronCodigo = Pattern.compile("M\\d{6}");
        mekAppCorreo = "";
        mekAppContraseña = "";
        setCodigoAleatorio();
//        codigoFijo = getCodigo();
//        System.out.println("Codigo fijo: " + codigoFijo);
    }

    public void setCodigoAleatorio() {
        for (int i = 0; i < 6; i++) {// un codigo de 6 digitos
            codigoAleatorio = (int) (Math.random() * 10);        //numero entre 0 y 9;
            codigos.add(codigoAleatorio);
        }
    }

    public String getCodigo() {
        for (int i = 0; i < codigos.size(); i++) {
            codigo += codigos.get(i).toString();
        }
        return codigo;
    }

    public void enviarCodigo(String correoUsuario) {
        mekAppCorreo = "mekapp41@gmail.com";
        mekAppContraseña = "proyecto123";

        Properties configPropiedades = new Properties();
        configPropiedades.put("mail.smtp.host", "smtp.gmail.com");
        configPropiedades.put("mail.smtp.starttls.enable", "true");
        configPropiedades.put("mail.smtp.port", "587");//587
        configPropiedades.put("mail.smtp.auth", "true");
        configPropiedades.put("mail.user", mekAppCorreo);
        configPropiedades.put("mail.password", mekAppContraseña);

        Session sesion = Session.getInstance(configPropiedades, null);

        try {
            MimeMessage mensaje = new MimeMessage(sesion);

            mensaje.setFrom(new InternetAddress(mekAppCorreo, "MekApp: Codigo de verificacion"));

            InternetAddress usuario = new InternetAddress(correoUsuario);

            mensaje.addRecipient(Message.RecipientType.TO, usuario);

            mensaje.setSubject(codigo);

            MimeBodyPart cuerpoDelMensaje = new MimeBodyPart();
            cuerpoDelMensaje.setText("Gracias por usar MekApp");

            Multipart contenedorCuerpoMensaje = new MimeMultipart();
            contenedorCuerpoMensaje.addBodyPart(cuerpoDelMensaje);

            mensaje.setContent(contenedorCuerpoMensaje);

            //Ahora ya podemos transportar el mensaje:
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(mekAppCorreo, mekAppContraseña);
            transporte.sendMessage(mensaje, mensaje.getAllRecipients());
            transporte.close();
        } catch (Exception ex) {
            System.out.println("error enviar Email");
        }
    }

    public boolean esCodigoCorrecto(String codigo) {
        if (patronCodigo.matcher(codigo).matches() && codigo.equals(codigo)) {
            return true;
        } else {
            return false;
        }
    }

}
