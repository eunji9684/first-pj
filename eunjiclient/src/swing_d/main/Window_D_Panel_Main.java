package swing_d.main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JPanel;
import javax.swing.plaf.basic.DefaultMenuLayout;

import swing_d.inter.Window_interface_D;
import swing_d.user.Window_D_UserAdd_Circle_btn;
import swing_d.user.Window_D_UserAdd_Label;
import swing_d.user.Window_D_UserAdd_Pass;
import swing_d.user.Window_D_UserAdd_Text;

public class Window_D_Panel_Main extends JPanel {

	int x_paint;
    int y_paint;
    int width;
    int height;
    
    int a = -1;
    int b =  a * 2-1;
 			
	
	public Window_D_Panel_Main(BorderLayout layout,int x, int y ,int x_paint, int y_paint,int width,int height){
		
		this.x_paint = x_paint;
		this.y_paint = y_paint;
		this.width = width;
		this.height = height;
		
		setSize(width,height);
		setLocation(x, y);		
		setLayout(layout);
		setOpaque(false);
		
	};
		
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2d = (Graphics2D) g.create();
 
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.main_panel_border_setStroke));
        
         
        if(Window_interface_D.option.main_panel_border_rownd) {
        	
        	graphics2d.setColor(Window_interface_D.option.main_set_fill_color);
            graphics2d.fillRoundRect(
            		x_paint, 
            		y_paint, 
            		getSize().width - x_paint*2 -1, 
            		getSize().height - y_paint *2 -1, 
            		Window_interface_D.option.main_panel_width_rownd,
            		Window_interface_D.option.main_panel_height_rownd
            );
            
    
                    
        	
        if(Window_interface_D.option.main_panel_border_layout){
        
        	graphics2d.setColor(Window_interface_D.option.main_set_layout_color); // 패널의 배경색 설정
        	graphics2d.drawRoundRect(
        			x_paint, 
        			y_paint, 
        			getSize().width- x_paint *2 -1, 
        			getSize().height - y_paint *2 -1,  
        			Window_interface_D.option.main_panel_width_rownd, 
        			Window_interface_D.option.main_panel_height_rownd
        	);
        
        	}
        }
        else{
        	
        	graphics2d.setColor(Window_interface_D.option.main_set_fill_color);
            graphics2d.fillRect(x_paint, y_paint, getSize().width- x_paint *2 -1, getSize().height - y_paint *2 -1);
        	
        	if(Window_interface_D.option.main_panel_border_layout){
        		graphics2d.setColor(Window_interface_D.option.main_set_layout_color); // 패널의 배경색 설정
        		graphics2d.drawRect(x_paint, y_paint, getSize().width- x_paint *2 -1, getSize().height - y_paint *2 -1);
        	}
        }              
        
        
        graphics2d.dispose();
    }
    
}
