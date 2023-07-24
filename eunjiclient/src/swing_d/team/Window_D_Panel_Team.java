package swing_d.team;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import swing_d.inter.Window_interface_D;

public class Window_D_Panel_Team extends JPanel {

	int x_paint;
    int y_paint;
    int width;
    int height;
	
	public Window_D_Panel_Team(BorderLayout Layout, int x,int y ,int width , int height){
		
		if(Window_interface_D.option.panel_auto_resize) {
			
			this.x_paint = Window_interface_D.option.team_panel_auto_x;
			this.y_paint = Window_interface_D.option.team_panel_auto_y;		
		}
		else {
			this.x_paint= x;
			this.y_paint= y;		
		}
		
		this.width = width;
		this.height = height;
		setVisible(true);
		
		setPreferredSize(new Dimension(width, height));
		
		if(Window_interface_D.option.panel_auto_resize) {
			setLocation(Window_interface_D.option.team_panel_auto_x,Window_interface_D.option.team_panel_auto_y);		
		}
		else {
			setLocation(x,y);
		}	
		
		setLayout(Layout);
		setOpaque(false); // 배경을 투명하게 설정
		
	};
		
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2d = (Graphics2D) g.create();
        
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.team_panel_border_setStroke));
        
        if(Window_interface_D.option.team_panel_border_rownd) {
        	
        	graphics2d.setColor(Window_interface_D.option.team_set_fill_color);
            graphics2d.fillRoundRect(x_paint, y_paint, getWidth() - x_paint -1, Window_interface_D.main_panel_center.getHeight() - y_paint *2 - Window_interface_D.option.head_panel_x - Window_interface_D.option.head_panel_height, Window_interface_D.option.team_panel_width_rownd, Window_interface_D.option.team_panel_height_rownd);
        	
        	if(Window_interface_D.option.team_panel_border_layout) {
        		graphics2d.setColor(Window_interface_D.option.team_set_layout_color); // 패널의 배경색 설정
            	graphics2d.drawRoundRect(x_paint, y_paint,getWidth() - x_paint -1, Window_interface_D.main_panel_center.getHeight() - y_paint *2 - Window_interface_D.option.head_panel_x - Window_interface_D.option.head_panel_height, Window_interface_D.option.team_panel_width_rownd, Window_interface_D.option.team_panel_height_rownd);
        	}
        
        }
        else{
        	
         	graphics2d.setColor(Window_interface_D.option.team_set_fill_color);
            graphics2d.fillRect(x_paint, y_paint, getWidth() - x_paint -1, Window_interface_D.main_panel_center.getHeight() - y_paint *2 - Window_interface_D.option.head_panel_x - Window_interface_D.option.head_panel_height);
            
        	if(Window_interface_D.option.team_panel_border_layout) {
        		graphics2d.setColor(Window_interface_D.option.team_set_layout_color); // 패널의 배경색 설정
        		graphics2d.drawRect(x_paint, y_paint, getWidth() - x_paint -1, Window_interface_D.main_panel_center.getHeight() - y_paint *2 - Window_interface_D.option.head_panel_x - Window_interface_D.option.head_panel_height);
        	}
     
        }              
        
        
        graphics2d.dispose();
    }
    
}
