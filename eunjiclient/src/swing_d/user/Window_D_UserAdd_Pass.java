package swing_d.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Window_D_UserAdd_Pass extends JPasswordField{
	int x;
	int y;
	int width;
	int height;
	int rownd = 10;
	boolean key = true;
	public boolean pass = false;
	
	
	public Window_D_UserAdd_Pass(int x, int y, int location_x , int location_y, int width , int height){
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		setForeground(Color.black);
		setOpaque(false);
		setSize(width, height);
		setLocation(location_x, location_y);
		setBackground(new Color(255,255,255,0));
		setBorder(new EmptyBorder(0, 15, 0, 15));  //여백을 줍니다.

		
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(getText().length()==0) {
					key = true;
					pass = false;
					Window_interface_D.User_Pass_labeL.a = "패스워드를 입력해 주세요";
					Window_interface_D.User_Pass_labeL.repaint();
				
				}
				
				else if(getText().length()< 7 || 16 < getText().length()) {
					key = true;
					pass = false;
					Window_interface_D.User_Pass_labeL.a = "패스워드 길이는 8 ~ 16자로 입력해주세요";
					Window_interface_D.User_Pass_labeL.repaint();
				}
				else {
					key = false;
					pass = true;
					Window_interface_D.User_Pass_labeL.a = "패스워드 완료";
					Window_interface_D.User_Pass_labeL.repaint();
				}
				repaint();
			}
		});
		
	}
	

	@Override
    protected void paintComponent(Graphics g) {
	 
	    Graphics2D graphics2d = (Graphics2D) g.create();
	 
	    graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	    graphics2d.setColor(new Color(255,255,255,220));
	    graphics2d.fillRoundRect(x, y, width - x * 2 -1 , height - y *2 -1 , rownd, rownd);
	
	    if(key) { graphics2d.setColor(Color.red);}
	    else {graphics2d.setColor(new Color(120,180,180,255));}
	    graphics2d.drawRoundRect(x, y, width - x * 2 -1 , height - y *2  -1 , rownd, rownd);
	   
	    graphics2d.dispose();
	    
	    super.paintComponent(g);
	    
	 
	}
}
