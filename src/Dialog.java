
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class Dialog {
    JFrame f;  
    public Dialog(String Dialog,File Audio) throws IOException{  
        f=new JFrame();        
        InputStream in = mainFrame.class.getResourceAsStream(Audio.getName());
        AudioStream as = new AudioStream(in);
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try{
                    AudioPlayer.player.start(as);
                    sleep(100000);
                }catch(InterruptedException e){
                    
                }
                AudioPlayer.player.stop(in);
            }
        };
        t1.start();
        JOptionPane.showMessageDialog(f,Dialog);
        t1.stop();
        t1.interrupt();
        f.dispose();
    }   
}  

