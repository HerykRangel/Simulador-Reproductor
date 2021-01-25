package reproductor; 
import java.text.DecimalFormat;
import java.time.LocalTime;
import javax.swing.JTextField;

// CLASE QUE ACTUALIZA LA HORA DEL RELOJ
public class HoraRunnable implements Runnable {
    
    private JTextField txt;             // ELEMENTO DEL JFRAMEN DONDE SE ALOJA LA HORA (CAJA DE TEXTO)

    // CONSTRUCTOR VACIO DE LA CLASE
    public HoraRunnable(){
       
    }
    
    // CONSTRUCTOR DE LA CLASE 
    public HoraRunnable(JTextField txt) {
        this.txt = txt;
    }
    
    // METODO PUBLICO ABSTRACTO DE LA INTERFAZ "Runnable"
    @Override
    public void run() {
        while(true){                    // BUCLE INFINITO MIETRAS SE EJCUTA EL PROGRAMA
            try{
                LocalTime lt = LocalTime.now();                    // VARIABLE QUE ALMACENE LA HORA DEL MOMENTO - "LocalDateTime" DA LA FECHA Y LA HORA.
                DecimalFormat df = new DecimalFormat("00");        // FORMATO EN EL QUE SE DESEA LA HORA
                txt.setText(
                        df.format(lt.getHour()) +":"+              // SE SETEA LOS VALORES DE LA HORA, MINUTOS Y SEGUNDOS INDIVIDUALMENTE.
                        df.format(lt.getMinute())+":"+             
                        df.format(lt.getSecond())
                );      
                Thread.sleep(1000);                                // SE DUERME EL HILO 1 SEGUNDO - HORA CAMBIA POR SEGUNDO.
            }catch(InterruptedException e){
               // System.println("SE ESTA QUEMANDO LA COMPUTADORA");
            }  
        }
    }
}
