package swing_d;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

public class RoundedButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RoundButton button = new RoundButton("");
        button.setText("확인");
        button.setNormalBackgroundColor(0x523224); // 일반 상태의 배경색상 설정
       
        frame.getContentPane().add(button);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
