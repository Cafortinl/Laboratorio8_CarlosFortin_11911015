package laboratorio8_carlosfortin_11911015;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Carlos Fortin
 */
public class Llamada extends Thread{
    private JLabel tiempo;

    public Llamada(JLabel hora) {
        this.tiempo = tiempo;
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel hora) {
        this.tiempo = hora;
    }
    
    @Override
    public void run(){
        while(true){
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("mm:ss");
            tiempo.setText(f.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }
}
