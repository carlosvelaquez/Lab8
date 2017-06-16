package lab8;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class MonitorLlamadas extends Thread{
    JList jl;
    ArrayList<Llamada> l;

    public MonitorLlamadas(JList jl, ArrayList<Llamada> l) {
        this.jl = jl;
        this.l = l;
    }
    
    
    
    @Override
    public void run(){
        while(true){
            DefaultListModel lm = new DefaultListModel();
            
            for (Llamada ll : l) {
                lm.addElement(ll);
            }
            
            jl.setModel(lm);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MonitorLlamadas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
