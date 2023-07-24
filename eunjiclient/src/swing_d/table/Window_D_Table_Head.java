package swing_d.table;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

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
		
		setPreferredSize(new Dimension(width,height));
		setOpaque(false); // 배경을 투명하게 설정
		setLocation(x,y);
		setSize(width,height);
		setLayout(null);
		
		addMouseListener(new MouseAdapter() {
		
			public void mousePressed(MouseEvent e) {}});
		
		};
		
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    
        Graphics2D graphics2d = (Graphics2D) g.create();
         
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       
        graphics2d.setColor(back_color);
        graphics2d.fillRoundRect(
        		x_paint,
        		y_paint, 
            	this.width - x_paint * 2 - 1,
            	this.height - y_paint * 2 - 1,
            	rownd,rownd    	
        );
        graphics2d.setColor(line_color);
        graphics2d.drawRoundRect(
        		x_paint,
        		y_paint, 
            	this.width - x_paint * 2 - 1,
            	this.height - y_paint * 2 - 1,
            	rownd,rownd
        );
        
        graphics2d.dispose();
        
		}
   	}
   
