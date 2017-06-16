package lab8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class HiloHora extends Thread{

    JLabel lb;
    SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");

    public HiloHora(JLabel lb) {
        this.lb = lb;
    }
    
    @Override
    public void run(){
        while(true){
            lb.setText(df.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloHora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
