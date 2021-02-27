package models.otros;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Mariel
 */
public class Sonido {

    private static boolean sonido = true;

    public static void setSonido(boolean quitarSonido) {
        if (quitarSonido) {
            sonido = false;
        } else {
            sonido = true;
        }
    }

    public static void teclado() {
        Clip efectoSonido;
        if (sonido){
        try {
            efectoSonido = AudioSystem.getClip();
            File archivoSonido = new File("src/resources/audio/teclado (2).wav");
            efectoSonido.open(AudioSystem.getAudioInputStream(archivoSonido));
            efectoSonido.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException error) {
        }
        }

    }

    public static void icono() {
        Clip efectoSonido;
        if(sonido){
        try {
            efectoSonido = AudioSystem.getClip();
            File archivoSonido = new File("src/resources/audio/sonidoMenu.wav");
            efectoSonido.open(AudioSystem.getAudioInputStream(archivoSonido));
            efectoSonido.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException error) {
        }
        }
    }

    public static void entrada() {
        Clip efectoSonido;
        if(sonido){
        try {
            efectoSonido = AudioSystem.getClip();
            File archivoSonido = new File("src/resources/audio/sonidoEntradaMenu.wav");
            efectoSonido.open(AudioSystem.getAudioInputStream(archivoSonido));
            efectoSonido.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException error) {
        }
        }
    }
}
