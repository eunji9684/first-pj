package swing_d.user;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Window_D_UserAdd_Text extends JTextField{
	int x;
	int y;
	int width;
	int height;
	int rownd = 10;
	float fontsize;
	public boolean key = true;
	public boolean pass = false;
	private boolean isFocused;
	
	public Window_D_UserAdd_Text(int x, int y, int location_x , int location_y, int width , int height, float fontsize){
		this.fontsize = fontsize;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		setFocusable(true);
		
		setFont(Window_Font_Install.font.deriveFont(fontsize));
		setOpaque(false);
		setSize(width, height);
		setLocation(location_x, location_y);
		setBackground(new Color(0,0,0,255));
		setBorder(new EmptyBorder(0, 15, 0, 15));  //여백을 줍니다.

		Window_interface_D.main_User_add.repaint();
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				Window_interface_D.main_User_add.repaint();
			}
			 
		    @Override
     		public void keyReleased(KeyEvent e) {
		    	repaint();
				if(getText().length()==0) {
					
					key = true;
					pass = false;
	
					Window_interface_D.User_Text_labeL.a = "이메일을 입력해 주세요";
				}
				
				else if(getText().indexOf("@") == -1) {
	
					key = true;
					pass = false;
					Window_interface_D.User_Text_labeL.a =  "@이가 빠졌어요!";
					
				}
				else if(getText().indexOf(".") == -1) {

					key = true;
					pass = false;
	
					Window_interface_D.User_Text_labeL.a =  ".com << dot이 빠졌어요!";
					
				}
				
				else if(getText().split("@")[0].isEmpty()) {

					key = true;
					pass = false;
					Window_interface_D.User_Text_labeL.a =  "@ 옆에 아이디가 없어요 !";
						
				
				}
						
				
				else {
					key = false;
					pass = true;
					Window_interface_D.User_Text_labeL.a =  "이메일 입력 완료";
				
				}

				repaint();
				
			}
	
		});
		
	}
	
	@Override
    protected void paintComponent(Graphics g) {
		
	    Graphics2D graphics2d = (Graphics2D) g.create();
	 
	    graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	    graphics2d.setColor(new Color(255,255,255,255));
	    
	    graphics2d.fillRoundRect(x, y, width - x * 2 -1 , height - y *2 -1 , rownd, rownd);
	    
	    if(key) { graphics2d.setColor(Color.red);}
	    
	    else {graphics2d.setColor(new Color(120,180,180,255));}
	    
	    graphics2d.drawRoundRect(x, y, width - x * 2 -1 , height - y *2  -1 , rownd, rownd);


	    graphics2d.dispose();    

	    super.paintComponent(g);
	    

	}
	
}
