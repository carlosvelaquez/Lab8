package lab8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Llamada extends Thread{
    Contacto receptor;
    String duracion;
    String tipo;
    int tiempo;
    boolean vive;

    public Llamada(Contacto receptor, String tipo) {
        this.receptor = receptor;
        this.duracion = "";
        this.vive = true;
        this.tiempo = 0;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    

    public Contacto getReceptor() {
        return receptor;
    }

    public void setReceptor(Contacto receptor) {
        this.receptor = receptor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public void run(){
        while(vive){
            try {
                tiempo ++;
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Llamada.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public String toString() {
        return tipo + " - " + receptor + " - " + tiempo + 's';
    }
    
    
}
