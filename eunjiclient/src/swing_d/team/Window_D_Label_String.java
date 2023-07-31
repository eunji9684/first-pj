package swing_d.team;

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

import swing_d.dialog.Dialog_Select;
import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Window_D_Label_String extends JLabel {

	boolean set_color = true;
	
    int radius = 10; 
	int width;
	int height;
	int x;
	int y;
	String a;
	
	public Window_D_Label_String(Runnable run,String a,int x,int y ,int width,int height){
		
		this.x = x ;
		this.y = y ;	
		this.a = a;
		this.width = width;
		this.height = height;
		
		setPreferredSize(new Dimension(width, height));
		setLocation(x, y);

		addMouseListener(new MouseAdapter() {
		
			public void mouseReleased(MouseEvent e) {
	               if (SwingUtilities.isLeftMouseButton(e)) { 
		                
	                	Window_interface_D.dialog_select.dispose(); /*여기는 왼쪽 클릭 기준임*/
	                	
	                }
	               
	                else if (SwingUtilities.isRightMouseButton(e)) {  /*여기는 오른쪽 클릭 기준임*/
	
	                	Dialog_Select A = Window_interface_D.dialog_select;
	                	run.run();

	                	A.setVisible(true);
	                	A.setLocation(e.getXOnScreen() ,e.getYOnScreen());
	                	A.repaint();
	                }
			};
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
	        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.team_label_border_setStroke));

	        if (set_color) {graphics2d.setColor(Window_interface_D.option.team_label_set_fill_color);}
	        else {graphics2d.setColor(Window_interface_D.option.team_label_set_fill_color1);}
	        
	        graphics2d.fillRoundRect(Window_interface_D.option.team_panel_x *2, y , width - Window_interface_D.option.team_panel_x*2 -Window_interface_D.option.team_panel_x , height -1 - y*2, radius, radius);
	        
	        graphics2d.setColor(Window_interface_D.option.btn_label_set_font_color);
	        graphics2d.setFont(Window_Font_Install.font.deriveFont(Window_interface_D.option.team_label_set_font_size));
	        
            FontMetrics fontmet = graphics2d.getFontMetrics();
            int t_Width = fontmet.stringWidth(a);
            int t_Height = fontmet.getHeight();

            int x = (width - t_Width) / 2;
            int y = (height - t_Height) / 2 + fontmet.getAscent();
	        
	        graphics2d.drawString(a, 25, y);
	        graphics2d.dispose();
	 		
	}
	
	};
	
