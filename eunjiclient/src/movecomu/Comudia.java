package movecomu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;


public class Comudia extends JPanel {
    private JLabel comuLabel;
    private JLabel diaryLabel;

    public Comudia() {

        setSize(332, 236);
        
        
        setLayout(null);
        setBackground(new Color(206,251,235));
       
        comuLabel = new JLabel();
        comuLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 160), new Color(0, 0, 160), new Color(163, 217, 250), new Color(163, 217, 250)));
        comuLabel.setHorizontalAlignment(SwingConstants.LEFT);
        comuLabel.setForeground(new Color(0, 0, 64));
        comuLabel.setOpaque(true);
        comuLabel.setBackground(new Color(133, 189, 239));
        comuLabel.setFont(new Font("Nanum Pen", Font.BOLD | Font.ITALIC, 55));
        comuLabel.setBounds(25, 43, 183, 75);
      
        
        add(comuLabel);

        diaryLabel = new JLabel();
        diaryLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
        diaryLabel.setForeground(new Color(153, 203, 249));
        diaryLabel.setOpaque(true);
        diaryLabel.setBackground(new Color(14, 23, 197)); 
        diaryLabel.setFont(new Font("Nanum Pen", Font.BOLD | Font.ITALIC, 50));
        diaryLabel.setBounds(63, 119, 201, 81);
     
       
        add(diaryLabel);

        Thread thread = new Thread(new LabelUpdateThread());
        thread.start();
    }
    
    private class LabelUpdateThread implements Runnable {
        private final String[] comuTexts = { "  C", "O", "M", "U" };
        private final String[] diaryTexts = {    "  D", "I", "A", "R", "Y","!" };
        private int comuIndex = 0;
        private int diaryIndex = 0;
        private StringBuilder comuStringBuilder = new StringBuilder();
        private StringBuilder diaryStringBuilder = new StringBuilder();

        @Override
        public void run() {
            try {
                while (comuIndex < comuTexts.length) {
                    updateComuLabel(comuTexts[comuIndex]);
                    comuIndex++;
                    Thread.sleep(300);
                }

                Thread.sleep(300);

                while (diaryIndex < diaryTexts.length) {
                    updateDiaryLabel(diaryTexts[diaryIndex]);
                    diaryIndex++;
                    Thread.sleep(400);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void updateComuLabel(String text) {
            comuStringBuilder.append(text);
            comuLabel.setText(comuStringBuilder.toString());
        }

        public void updateDiaryLabel(String text) {
            diaryStringBuilder.append(text);
            diaryLabel.setText(diaryStringBuilder.toString());
        }
    }
}
