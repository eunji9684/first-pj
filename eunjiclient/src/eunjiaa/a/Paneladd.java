package eunjiaa.a;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Paneladd extends JFrame {
    private JLabel WalkingLabel;
    private String text;
    private int length;
    private int index = 1;
    public Paneladd() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        getContentPane().setLayout(null);
        
        WalkingLabel = new JLabel("COMU");
        WalkingLabel.setBounds(74, 43, 35, 15);
        
        getContentPane().add(WalkingLabel);
        
        text = WalkingLabel.getText();
        length = text.length();
        
       Thread t = new Thread(new thread());
        t.run();
        
        this.setSize(300, 200);
        this.setVisible(true);
    }
    
    private class thread implements Runnable {
        public void run() {
            while(true) {
                WalkingLabel.setText(text.substring(0, index));
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) { return; }
                index++;
                if(index > length) index = 0;
            }
        }
    }
    
  
}