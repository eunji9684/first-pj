package swing_d.user;

import java.awt.BasicStroke;
import java.awt.Color;
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
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Window_D_UserAdd_Circle_btn extends JLabel {

	int width;
	int height;
	String a;
	float font_size;
	public Window_D_UserAdd_Circle_btn(Runnable run , String a, float font_size ,int x, int y, int width, int height){
		this.font_size= font_size;	
		this.a = a;
		this.width = width;
		this.height = height;
		setVisible(true);
		setSize(width, height);
		setLocation(x, y);
		setHorizontalAlignment(SwingConstants.CENTER);

		addMouseListener(new MouseAdapter() {public void mouseReleased(MouseEvent e) {run.run();}});
			
	};

		@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D graphics2d = (Graphics2D) g;

	        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.btn_label_border_setStroke));
	        
	        int radius = Math.min(getWidth()-1, getHeight()-1) / 2; 
	        
	        graphics2d.setColor(new Color(180,180,180));
	        graphics2d.fillOval(this.width / 2 - radius, this.height / 2 - radius, radius * 2, radius* 2);
	        graphics2d.setColor(new Color(190,190,190));
	        graphics2d.fillOval(this.width / 2 - radius, this.height / 2 - radius, radius * 2 -1, radius* 2 -1);
	        graphics2d.setColor(new Color(200,200,200));
	        graphics2d.fillOval(this.width / 2 - radius, this.height / 2 - radius, radius * 2 -2, radius* 2 -2);
	        graphics2d.setColor(new Color(235,235,235));
	        graphics2d.fillOval(this.width / 2 - radius, this.height / 2 - radius, radius * 2 -3, radius* 2 -3);
	        
	        
	        if(Window_interface_D.option.btn_label_border_rownd) {
	        	if(Window_interface_D.option.btn_label_circle_layout) {
	        	graphics2d.setColor(Window_interface_D.option.btn_label_set_layout_color);
		    
	        	}
	        }
	        else{
	        	if(Window_interface_D.option.btn_label_circle_layout) {
	        	graphics2d.setColor(Window_interface_D.option.btn_label_set_layout_color);
	        	graphics2d.drawRect(0, 0, width, height);
	        	}
	        
	        }
	        
	        graphics2d.setColor(Window_interface_D.option.btn_label_set_font_color);
	        graphics2d.setFont(Window_Font_Install.font.deriveFont(this.font_size));
	        
            FontMetrics fontmet = graphics2d.getFontMetrics();
            int t_Width = fontmet.stringWidth(a);
            int t_Height = fontmet.getHeight();

            int x = (getWidth() - t_Width) /2;
            int y = (getHeight() - t_Height) / 2 + fontmet.getAscent();
	        
	        graphics2d.drawString(a, x, y);
	        graphics2d.dispose();
	    }
		
	};
	
