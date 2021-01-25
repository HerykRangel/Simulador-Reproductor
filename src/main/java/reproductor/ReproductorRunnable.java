package reproductor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;                // MAVEN REPOSITORY: PAGINA DE DONDE FUE DESCARGARDO DRIVE DE JAVA
import javazoom.jl.player.Player;               // JLAYER = INTERFAZ QUE PERMITE REPRODUCIR MP3

public class ReproductorRunnable implements Runnable{
    
    // CONSTRUCTOR VACIO DE LA CLASE.
    public ReproductorRunnable(){
        
    }
    
    // METODO PUBLICO ABSTRACTO DE LA INTERFAZ "Runnable" - HILO DE EJECUCION DEL REPRODUCTOR
    @Override
    public void run() {
        try {
            // EL CONSTRUCTOR "Player" PIDE COMO MINIMO UN "InputStream"
            new Player(new FileInputStream(new File("llovia.mp3"))).play();     // LA CLASE "Player" POSEE VARIOS METODOS
            // EL METODO "play" POSEE SU PROPIO MANEJO DE EXCEPCIONES PERO PARA ESTES CASO SERA MANEJADA ASI 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
