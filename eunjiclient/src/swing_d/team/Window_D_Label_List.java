package swing_d.team;

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

import swing_d.inter.Window_interface_All_file;
import swing_d.inter.Window_interface_D;

public class Window_D_Label_List extends JLabel {

	boolean set_color = true;
	
	int x;
	int y;	
	int width;
	int height;

	String a;
	
	public Window_D_Label_List(Runnable run,int x,int y ,int width,int height){
		
		this.x = x ;
		this.y = y ;	
		this.a = a;
		this.width = width;
		this.height = height;
		
		setVisible(true);
		setPreferredSize(new Dimension(getWidth() -1 -Window_interface_D.option.user_team_space_x *2 -Window_interface_D.option.user_team_space_x , getHeight() -1 -Window_interface_D.option.user_team_space_y *2 -Window_interface_D.option.user_team_space_y ));
		setLocation(x, y);

		addMouseListener(new MouseAdapter() {
			
			public void mouseReleased(MouseEvent e) {run.run();};
	    	public void mouseEntered(MouseEvent e) {
	    		set_color = false;
	    		Window_interface_D.diary_team.repaint();
	    		};
	    	public void mouseExited(MouseEvent e) {
	    		set_color = true;
	    		Window_interface_D.diary_team.repaint();
	    		};
			
			}
		);
			
	};
		@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D graphics2d = (Graphics2D) g;

	        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.btn_label_border_setStroke));
	        
	        int radius = 10; 
	        
	        if (set_color) {graphics2d.setColor(Window_interface_D.option.team_set_fill_color);}
	        
	        else {graphics2d.setColor(new Color(180,180,180,255));}
	        
	        graphics2d.fillRoundRect(Window_interface_D.option.user_team_space_x *2, Window_interface_D.option.user_team_space_y , getWidth() -1 -Window_interface_D.option.user_team_space_x *2 -Window_interface_D.option.user_team_space_x , getHeight() -1 -Window_interface_D.option.user_team_space_y *2 -Window_interface_D.option.user_team_space_y , radius, radius);
	        
	        graphics2d.setColor(new Color(0,0,0,255));
	        
	        //graphics2d.drawRoundRect(Window_interface_D.option.user_team_space_x, Window_interface_D.option.user_team_space_y , getWidth() -1 -Window_interface_D.option.user_team_space_x *2 , getHeight() -1 -Window_interface_D.option.user_team_space_y*2, radius, radius);
		       
	        graphics2d.setColor(Window_interface_D.option.btn_label_set_font_color);
	        graphics2d.setFont(Window_interface_All_file.font_omu.deriveFont(Window_interface_D.option.btn_label_set_font_size));
	        
	}};
	
