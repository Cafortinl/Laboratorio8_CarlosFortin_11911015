package laboratorio8_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
public class llamada {
   private String emisor;
   private String receptor;
   private String fecha;
   private String duracion;

    public llamada() {
    }

    public llamada(String emisor, String receptor, String fecha, String duracion) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.duracion = duracion;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "llamada{" + "emisor=" + emisor + ", receptor=" + receptor + ", fecha=" + fecha + ", duracion=" + duracion + '}';
    }
   
   
   
}
