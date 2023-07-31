package swing_d.dialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import swing_d.inter.Window_interface_D;

public class Dialog_list extends JPanel {

    int radius = 10; 
	
	public Dialog_list(){
		setLayout(new BorderLayout());
		setBackground(new Color(0,0,0,1));
		add(Window_interface_D.페이지생성,BorderLayout.NORTH);
		Window_interface_D.페이지생성.repaint();
	};
	
		@Override
	    protected void paintComponent(Graphics g) {
	        Graphics2D graphics2d = (Graphics2D) g;

	        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        
	        graphics2d.setColor(new Color(142,192,248,180));
	        graphics2d.fillRoundRect(0,0, getWidth() -1 ,getHeight() -1, radius, radius);
	    
	        graphics2d.dispose();
		}
}
	
