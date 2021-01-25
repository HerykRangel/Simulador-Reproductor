package reproductor;

import java.text.DecimalFormat;
import javax.swing.JTextField;

// CLASE QUE CONFIGURA EL CRONOMETRO - IMPLEMENTACION INTERFAZ RUNNABLE
public class CronometroRunnable implements Runnable {
  
    private JTextField txt;                     // ELEMENTO DEL JFRAMEN DONDE SE ALOJA EL CRONOMETRO (CAJA DE TEXTO)
    private int contador = 0;                   // CONTADOR DEL CRONOMETRO
    private boolean start = false;              // CONTROLADOR ARRANQUE CRONOMETRO

    // CONSTRUCTOR VACIO DE LA CLASE
    public CronometroRunnable(){
    
    }
    
    // CONSTRUCTOR DE LA CLASE  
    public CronometroRunnable(JTextField txt) {
        this.txt = txt;
    }
    
    //METODO PUBLICO ABSTRACTO DE LA INTERFAZ "Runnable"
    @Override
    public void run() {
        while(true){
            
            // SI "Start" ES "true" SE SUMA +1 AL CONTADOR
            if(start){
                contador++;
                DecimalFormat df = new DecimalFormat("0000");       // SE TRABAJA CON FORMATO DE 4 DIGITOS 
                txt.setText(df.format(contador));                   // SE SETEA EL VALOR "contador" EN EL FORMATO ESCOGIDO EN EL "JTextField"  
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                //System.println("SE ESTA QUEMANDO LA COMPUTADORA");
            }
        }
    }
    // METODO PARA COMENZAR EL CRONOMETRO.
    public void comenzar(){
        start = true;
    }
    // METODO PARA PAUSAR EL CRONOMETRO.
    public void pausar (){
        start = false;
    }
    // METODO PARA RESETEAR EL CRONOMETRO.
    public void resetear (){
        start = false;
        contador = 0;
        txt.setText("0000");
    }
}
