package FunBack;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;


public class Comudia extends JFrame {
    private JLabel comuLabel;
    private JLabel diaryLabel;

    public Comudia() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" Comu Diary");
        setSize(300, 200);
        
        getContentPane().setLayout(null);

        comuLabel = new JLabel();
        comuLabel.setForeground(new Color(0, 0, 64));
        comuLabel.setOpaque(true);
        comuLabel.setBackground(new Color(133, 189, 239));
        comuLabel.setFont(new Font("Nanum Pen", Font.BOLD | Font.ITALIC, 40));
        comuLabel.setBounds(30, 10, 128, 50);
        getContentPane().add(comuLabel);

        diaryLabel = new JLabel();
        diaryLabel.setForeground(new Color(153, 203, 249));
        diaryLabel.setOpaque(true);
        diaryLabel.setBackground(new Color(0, 0, 64)); 
        diaryLabel.setFont(new Font("Nanum Pen", Font.BOLD, 40));
        diaryLabel.setBounds(56, 59, 128, 50);
        getContentPane().add(diaryLabel);

        setVisible(true);

        Thread thread = new Thread(new LabelUpdateThread());
        thread.start();
    }

   public static void main(String[] args) {
        new Comudia();
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
                    Thread.sleep(500);
                }

                Thread.sleep(700);

                while (diaryIndex < diaryTexts.length) {
                    updateDiaryLabel(diaryTexts[diaryIndex]);
                    diaryIndex++;
                    Thread.sleep(500);
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
