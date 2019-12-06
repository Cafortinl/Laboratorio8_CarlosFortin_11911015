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
    private String emisor;
    private String receptor;
    private boolean vive;
    private ArrayList<llamada> llamadas=new ArrayList();

    public adminLlamada(JLabel tiempo,String emisor,String receptor) {
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

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public ArrayList<llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<llamada> llamadas) {
        this.llamadas = llamadas;
    }
    
    
    
    @Override
    public void run(){
        Date h=new Date(0);
        while(vive){
            h.setSeconds(h.getSeconds()+1);
            SimpleDateFormat f=new SimpleDateFormat("mm:ss");
            tiempo.setText(f.format(h));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        Date d=new Date();
        DateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        llamadas.add(new llamada(emisor, receptor, f.format(d), tiempo.getText()));
        System.out.println(llamadas);
        tiempo.setText("00:00");    
    }
}
