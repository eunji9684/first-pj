package FunBack;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setSize(1920,1080);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            frame.getContentPane().add(panel, BorderLayout.CENTER);

            Function2 function2 = new Function2();
            panel.add(function2.frame.getContentPane(), BorderLayout.CENTER);

            Comudia comudia = new Comudia();
            panel.add(comudia.getContentPane(), BorderLayout.NORTH);

            frame.setVisible(true);
        });
    }
}
