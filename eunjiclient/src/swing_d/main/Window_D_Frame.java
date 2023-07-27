package swing_d.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

import swing_d.inter.Window_interface_D;

public class Window_D_Frame extends JFrame{

    private int arcWidth = 10;
    private int arcHeight = 10;
    
	public Window_D_Frame(){
		

	        
		if(Window_interface_D.option.mainframe_auto_size) {
			setSize(Window_interface_D.size.resize_screen_width,Window_interface_D.size.resize_screen_height);
			setPreferredSize(new Dimension(Window_interface_D.size.resize_screen_width,Window_interface_D.size.resize_screen_height));
		}
		else {
			setSize(900,815);	
		}
	
		//최초 실행되는 프레임의 레이아웃을 null로 설정
		getContentPane().setLayout(null);
		
		//최초 프레임의 헤드를 제거함
		setUndecorated(swing_d.init.Window_Init.Frame_head);
		
		//최초 실행되는 프레임의 getcontentpane의 색상을 투명하게 설정
		//setOpacity(0.7f);
		
		/*여기가 클라이언트가 깨지게 만드는 알파값 원인임*/
		setBackground(new Color(255,255,255,254));
		
	}
/*
    @Override
    public void paint(Graphics g) {
        super.paint(g); // 상위 클래스의 paint 메서드를 호출하여 기본 그리기를 수행합니다.

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = 100;

        g2d.setColor(Color.RED);
        g2d.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }
*/
	
}
