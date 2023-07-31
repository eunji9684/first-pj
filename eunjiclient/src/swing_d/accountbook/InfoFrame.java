package swing_d.accountbook;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class InfoFrame extends JFrame {
    private JLabel nameLabel;
    private JLabel priceLabel;
    private JLabel placeLabel;
    private JLabel importantLabel;
    private JLabel memoLabel;

    public InfoFrame(String name, String price, String place, String important, String memo) {
        setTitle("Information for " + name);
        setSize(300, 200);
        setLocationRelativeTo(null);

        nameLabel = new JLabel("Name: " + name);
        priceLabel = new JLabel("Price: " + price);
        placeLabel = new JLabel("Place: " + place);
        importantLabel = new JLabel("Important: " + important);
        memoLabel = new JLabel("Memo: " + memo);

        setLayout(new FlowLayout());
        add(nameLabel);
        add(priceLabel);
        add(placeLabel);
        add(importantLabel);
        add(memoLabel);

        setVisible(true);
    }
}
