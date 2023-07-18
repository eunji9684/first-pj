package swing_d;

import javax.swing.JButton;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class CalButton extends JButton {

    private static final int ARC_WIDTH = 20; // 버튼의 둥근 모서리 너비
    private static final int ARC_HEIGHT = 20; // 버튼의 둥근 모서리 높이
    private float strokeWidth = 1.0f; // 테두리 두께
    
    
    public CalButton(String text) {
       super(text);
        setOpaque(false); // 배경 불투명 설정
        setForeground(Color.black); // 전경 색상 설정
        setContentAreaFilled(false); // 내용 영역 채우기 비활성화
        setBackground(new Color(0xC5DFF8)); // 버튼 배경색 설정
        //setFont(new Font("Nanum Pen", Font.BOLD, 30)); // 폰트 크기 조정 (예: 14)
        setPreferredSize(new Dimension(20, 20)); // 버튼 크기 조정
        setFocusPainted(false); // 포커스 표시 비활성화
        setBorderPainted(false); // 테두리 표시 비활성화

       
      
    }


 

 
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // 그림자 효과 추가
            g2.setColor(new Color(0x000000));
            g2.fillRoundRect(3, 0, getWidth()  - 5, getHeight()  - 5, 20, 20);

            if (getModel().isArmed()) {
                g2.setColor(new Color(0x2D4356)); // 클릭 상태일 때 배경색상
                g2.fill(new RoundRectangle2D.Double(2, -2, getWidth() - 5, getHeight() - 5, 20,20));
                setFont(new Font("Nanum Pen", Font.BOLD, 25));
                setForeground(Color.white);
            } else {
                g2.setColor(new Color(0xC5DFF8)); // 일반 상태일 때 배경색상 사용
                g2.fill(new RoundRectangle2D.Double(0, -2, getWidth() - 5, getHeight() - 5, 20, 20));
                setFont(new Font("Nanum Pen", Font.BOLD, 25));
                setForeground(new Color(0x001C30));
            }

            // 텍스트 그리기
            FontMetrics fontMetrics = g2.getFontMetrics();
            int stringWidth = fontMetrics.stringWidth(getText());
            int stringHeight = fontMetrics.getAscent();
            int x = (getWidth() - stringWidth) / 2;
            int y = (getHeight() + stringHeight) / 2;
            g2.drawString(getText(), x, y);

            g2.dispose();

            super.paintComponent(g);
        }
   
}
