package swing_d.dialog;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
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
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Dialog_list extends JPanel {

	boolean set_color = true;
	
	int x;
	int y;	
	int width;
	int height;
    int radius = 10; 
	
	public Dialog_list(int x,int y ,int width,int height){
		
		this.x = x ;
		this.y = y ;	
		this.width = width;
		this.height = height;
		
		setVisible(true);
		setPreferredSize(new Dimension(width,height));
		setOpaque(false);
		setLayout(new BorderLayout());
			
	};
	
		@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D graphics2d = (Graphics2D) g;

	        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.btn_label_border_setStroke));
	        
	        graphics2d.setColor(new Color(0,180,180,255));
	        
	        graphics2d.fillRoundRect(0,0, Window_interface_D.dialog_select.getWidth() - x *2 -1 ,Window_interface_D.dialog_select.getHeight() - y*2 -1, radius, radius);
	          
	        graphics2d.setColor(Window_interface_D.option.btn_label_set_font_color);
	        graphics2d.setFont(Window_Font_Install.font.deriveFont(Window_interface_D.option.btn_label_set_font_size));
	        
	        graphics2d.dispose();
	}
}
	
