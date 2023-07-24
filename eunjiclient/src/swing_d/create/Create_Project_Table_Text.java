package swing_d.create;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import swing_d.inter.Window_interface_All_file;
import swing_d.inter.Window_interface_D;

public class Create_Project_Table_Text extends JTextField{
	int x;
	int y;
	int width;
	int height;
	int rownd = 10;
	boolean key = true;
	
	public Create_Project_Table_Text(int x, int y, int location_x , int location_y, int width , int height, float fontsize){
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		setFont(Window_interface_All_file.font_omu.deriveFont(fontsize));
		
		setForeground(Color.black);
		setOpaque(false);
		setSize(width, height);
		setLocation(location_x, location_y);
		setBackground(new Color(255,255,255,0));
		setBorder(new EmptyBorder(0, 15, 0, 15));  //여백을 줍니다.

		
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
		
				key = getText().isEmpty();
				Window_interface_D.생성하기.event = getText().isEmpty();
				Window_interface_D.text.repaint();
				Window_interface_D.생성하기.repaint();
			
			}
			public void keyPressed(KeyEvent e) {}
		});
		
	}
	
	@Override
    protected void paintComponent(Graphics g) {
	 
	    Graphics2D graphics2d = (Graphics2D) g.create();
	 
	    graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	    graphics2d.setColor(new Color(235,235,235,255));
	    graphics2d.fillRoundRect(x, y, width - x * 2 -1 , height - y *2 -1 , rownd, rownd);
	
	    if(key) { graphics2d.setColor(Color.red);}
	    else {graphics2d.setColor(new Color(120,180,180,255));}
	    graphics2d.drawRoundRect(x, y, width - x * 2 -1 , height - y *2  -1 , rownd, rownd);
	   
	    graphics2d.dispose();
	    
	    super.paintComponent(g);
	    
	 
	}
}
