package laboratorio8_carlosfortin_11911015;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Carlos Fortin
 */
public class adminLlamada extends Thread{
    private JLabel tiempo;
    private boolean vive;

    public adminLlamada(JLabel tiempo) {
        this.tiempo = tiempo;
        this.vive=true;
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel hora) {
        this.tiempo = hora;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    
    
    @Override
    public void run(){
        Date h=new Date(21600000);
        while(vive){
            h.setSeconds(h.getSeconds()+1);
            System.out.println(h);
            SimpleDateFormat f=new SimpleDateFormat("HH:mm:ss");
            tiempo.setText(f.format(h));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }  
    }
    
}
