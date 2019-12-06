package laboratorio8_carlosfortin_11911015;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Carlos Fortin
 */
public class adminLlamada extends Thread{
    private JLabel tiempo;
    private String emisor;
    private String receptor;
    private boolean vive;
    private ArrayList<llamada> llamadas=new ArrayList();

    public adminLlamada(JLabel hora,String emisor,String receptor) {
        this.tiempo = tiempo;
        this.vive=true;
        this.emisor=emisor;
        this.receptor=receptor;
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
            if(vive){
                Date h=new Date();
                SimpleDateFormat f=new SimpleDateFormat("mm:ss");
                tiempo.setText(f.format(h));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }else{
                Date d=new Date();
                DateFormat f=new SimpleDateFormat("dd/MM/yyyy");
                llamadas.add(new llamada(emisor, receptor, f.format(d), tiempo.getText()));
                tiempo.setText("00:00");
            }
        }
    }
}
