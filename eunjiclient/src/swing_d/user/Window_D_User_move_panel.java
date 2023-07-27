package swing_d.user;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import swing_d.inter.Window_interface_D;

public class Window_D_User_move_panel extends JPanel {

	Point initialClick;
	
	int x_paint;
    int y_paint;
    int width;
    int height;
    
	public Window_D_User_move_panel(GridBagLayout Layout,int x, int y ,int width, int height){
		this.x_paint = x;
		this.y_paint = y;
		this.width = width;
		this.height = height;
	
		setSize(width,height);
		setPreferredSize(new Dimension(width, height));
	
		setLocation(x,y);
		setLayout(Layout);
		setOpaque(false); 
		
		
        /*배율설정 옵션*/
    
		
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
             	initialClick = e.getPoint();
            }
            public void mouseReleased(MouseEvent e) {}
            
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getX() - initialClick.x;
                int deltaY = e.getY() - initialClick.y;

                System.out.println();
                int newX = Window_interface_D.diary_frame.getLocation().x + deltaX;
                int newY = Window_interface_D.diary_frame.getLocation().y + deltaY;
              
                Window_interface_D.diary_frame.setLocation(newX, newY);
                Window_interface_D.diary_frame.revalidate();
                
            }
            
            public void mouseReleased(MouseEvent e) {Window_interface_D.diary_frame.revalidate();}
        });
	};
	
	
		
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2d = (Graphics2D) g.create();
        
        
        	graphics2d.setColor(new Color(100,100,100,10));
    		graphics2d.fillRoundRect(
    				x_paint, 
    				y_paint, 
    				getWidth() - x_paint*2-1, 
    				getHeight() - y_paint *2-1 , 
    				10,
    				10
    				
    				);
        	

        	graphics2d.setColor(new Color(100,100,100,10)); // 패널의 배경색 설정
        	graphics2d.drawRoundRect(    		
        			x_paint, 
    				y_paint, 
    				getWidth() - x_paint*2-1, 
    				getHeight() - y_paint *2-1 , 
    				10,
    				10
    				
        			);
    
        	
        	graphics2d.dispose();
    }
    
    
}
