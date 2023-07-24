package swing_d.dialog;

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

import swing_d.inter.Window_interface_All_file;
import swing_d.inter.Window_interface_D;

public class Dialog_option_String extends JLabel {

	boolean set_color = true;
	
	int width;
	int height;
	int x;
	int y;
	String a;
	
	public Dialog_option_String(Runnable run,String a,int x,int y ,int width,int height){
		
		this.x = x ;
		this.y = y ;	
		this.a = a;
		this.width = width;
		this.height = height;
		
		setVisible(true);
		setSize(width, height);
		setPreferredSize(new Dimension(width, height));
		setLocation(x, y);

		
		addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {			
				set_color = true;
				run.run();
				Window_interface_D.dialog_select.dispose();
			}
			
			public void mouseEntered(MouseEvent e) {
				
	    		set_color = false;
	    		Window_interface_D.팀페이지생성.repaint();
	    		Window_interface_D.추가기능라벨.repaint();
	    		Window_interface_D.추가기능라벨1.repaint();
	    	
			};
			
	    	public void mouseExited(MouseEvent e) {
	    		
	    		set_color = true;
	    		Window_interface_D.팀페이지생성.repaint();
	    		Window_interface_D.추가기능라벨.repaint();
	    		Window_interface_D.추가기능라벨1.repaint();
	    	};
		
	    	
			public void mouseClicked(MouseEvent e) {}
			
			public void mouseReleased(MouseEvent e) {};
	    	
			}
		);
			
	};
		@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D graphics2d = (Graphics2D) g;

	        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.team_label_border_setStroke));
	        
	        int radius = 10; 
	        
	        if (set_color) {graphics2d.setColor(Window_interface_D.option.team_label_set_fill_color);}
	        
	        else {graphics2d.setColor(Window_interface_D.option.team_label_set_fill_color1);}
	        
	        graphics2d.fillRoundRect(x, y , width -1 - x *2 , height -1 - y*2, radius, radius);
	        
	        graphics2d.setColor(Window_interface_D.option.btn_label_set_font_color);
	        graphics2d.setFont(Window_interface_All_file.font_omu.deriveFont(Window_interface_D.option.team_label_set_font_size));
	        
            FontMetrics fontmet = graphics2d.getFontMetrics();
            int t_Width = fontmet.stringWidth(a);
            int t_Height = fontmet.getHeight();

            int x = (width - t_Width) / 2;
            int y = (height - t_Height) / 2 + fontmet.getAscent();
	        
	        graphics2d.drawString(a, x, y);
	        
	    
		
	}};
	
