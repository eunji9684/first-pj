package movecomu;

import java.awt.AWTEventMulticaster;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class RoundButton extends JButton {

    private static final int ARC_WIDTH = 20; // 버튼의 둥근 모서리 너비
    private static final int ARC_HEIGHT = 20; // 버튼의 둥근 모서리 높이
    private Color normalBackgroundColor = new Color(0xffe6e6); // 일반 상태의 배경색상
    private Color clickBorderColor = new Color(0x1e90ff); // 클릭 상태의 테두리 색상
    private Color ClickBackgroundColor = new Color(0xf6495ed);
    private float strokeWidth = 1.0f; // 테두리 두께
    
    
    public RoundButton(String text) {
        super(text);
        setOpaque(false); // 배경 불투명 설정
       //setForeground(Color.black); // 전경 색상 설정
        setContentAreaFilled(false); // 내용 영역 채우기 비활성화
        setFocusPainted(false); // 포커스 표시 비활성화
        setBorderPainted(false); // 테두리 표시 비활성화
        setPreferredSize(new Dimension(80,30)); // 버튼 크기 설정
    }

    public void setNormalBackgroundColor(int rgb) {
      
       setNormalBackgroundColor(new Color( 0x50B4F5));
    }

    public void setNormalBackgroundColor(Color color) {
        normalBackgroundColor = color;
    }
    public void setClickBackgroundColor(Color clickBackgroundColor) {
		ClickBackgroundColor = clickBackgroundColor;
	}
    
    public void setClickBorderColor(Color color) {
        clickBorderColor = color;
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (getModel().isArmed()) {
        	 g2.setColor(ClickBackgroundColor);// 클릭 상태일 때 색상
        	 g2.fill(new RoundRectangle2D.Double(0, 0, getWidth()-1, getHeight()-2, 30,30));
        	 setFont(new Font("Nanum Pen", Font.BOLD, 20));
            setForeground(new Color( 0xf0ffff));
            g2.setStroke(new BasicStroke(strokeWidth)); // 클릭 상태일 때 테두리 두께
            g2.setColor(clickBorderColor); // 클릭 상태일 때 테두리 색상
            g2.draw(new RoundRectangle2D.Double(0, 0, getWidth()-1, getHeight()-2, 30, 30)); // 테두리 그리기
            
            
        } else {        	
        	g2.setColor(normalBackgroundColor); // 일반 상태일 때 배경색상 사용
        	 g2.fill(new RoundRectangle2D.Double(0, 0, getWidth()-1, getHeight()-2, 30,30));
        	setFont(new Font("Nanum Pen", Font.BOLD, 18));
            setForeground(new Color(0x315593));
            g2.setColor(new Color(0x191970)); // 일반 상태일 때 테두리 색상
            g2.setStroke(new BasicStroke(strokeWidth)); // 일반 상태일 때 테두리 두께
            g2.draw(new RoundRectangle2D.Double(0, 0, getWidth()-1, getHeight()-2, 30, 30)); // 테두리 그리기
            
        }
        
        int x = (int) (strokeWidth / 2);
        int y = (int) (strokeWidth / 2);
        int width = getWidth() - (int) strokeWidth;
        int height = getHeight() - (int) strokeWidth;
        

       
        
        
        
        g2.dispose();
        
        super.paintComponent(g);
    }
}
