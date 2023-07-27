package swing_d.user;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Window_D_UserAdd_Label2 extends JLabel {

	boolean set_color = true;
	
	int width;
	int height;
	int x;
	int y;
	public String a;
	float fontsize;
	
	public Window_D_UserAdd_Label2(String a,int x,int y ,int location_x , int location_y ,int width,int height, float fontsize){
		
		this.x = x ;
		this.y = y ;	
		this.a = a;
		this.width = width;
		this.height = height;
		this.fontsize = fontsize;
		
		setSize(width, height);
		setLocation(location_x, location_y);
		
	};
	
		@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D graphics2d = (Graphics2D) g;

	        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.team_label_border_setStroke));
	        	        
	        graphics2d.setColor(new Color(0,0,140,240));
	        graphics2d.setFont(Window_Font_Install.font.deriveFont(fontsize));
	        
            FontMetrics fontmet = graphics2d.getFontMetrics();
            int t_Width = fontmet.stringWidth(a);
            int t_Height = fontmet.getHeight();

            int x = (width - t_Width) / 2;
            int y = (height - t_Height) / 2 + fontmet.getAscent();
	        
            double angle = Math.toRadians(350);
            
            graphics2d.rotate(angle, x, y);
	        graphics2d.drawString(a, 0, y);
	        graphics2d.dispose();
		
	}};
	
