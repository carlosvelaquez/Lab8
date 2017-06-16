package lab8;

public class Mensaje {
    private Contacto receptor;
    private String emisor;
    private String fecha;
    private String contenido;

    public Mensaje(Contacto receptor, String emisor, String fecha, String contenido) {
        this.receptor = receptor;
        this.emisor = emisor;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public Contacto getReceptor() {
        return receptor;
    }

    public void setReceptor(Contacto receptor) {
        this.receptor = receptor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return  receptor + " - " + fecha;
    }
    
    
    
}
