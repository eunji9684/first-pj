package swing_d.table;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import swing_d.inter.Window_interface_D;

public class Window_D_Table_Head extends JLabel {

	int x_paint;
    int y_paint;
    int width;
    int height;
	int rownd;
	Color back_color = new Color(255,255,255);
	Color line_color = new Color(0,0,0);

	
	public Window_D_Table_Head(int x,int y,int location_x,int location_y,int width,int height, int rownd){		
		this.width = width;
		this.height = height;
		this.x_paint = location_x;
		this.y_paint = location_y;		
		this.rownd = rownd;
		
		setOpaque(false); // 배경을 투명하게 설정
		setLocation(x,y);
		setSize(0,height);
		setLayout(null);
		setPreferredSize(new Dimension(Window_interface_D.목록테이블.getWidth(), height));
		
		addMouseListener(new MouseAdapter() {
		
			public void mousePressed(MouseEvent e) {}});
		
		};
		
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    
        Graphics2D graphics2d = (Graphics2D) g.create();
        
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       
        graphics2d.setColor(new Color(180,180,180,180));
        graphics2d.drawLine(
        		x_paint,
        		getHeight() -11, 
        		getWidth() -x_paint *2,
        		getHeight() -11
        );
      
        graphics2d.dispose();
        
		}
   	}
   
