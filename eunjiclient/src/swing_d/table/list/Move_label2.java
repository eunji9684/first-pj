package swing_d.table.list;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import swing_d.inter.Window_interface_D;

public class Move_label2 extends JLabel {
	
	public String size= "list";
	int mouse;
	int x = 10;
	int y = 10;
	public int 총라벨좌표;
	int x_paint =0;
	int y_paint =0;

	
	public Move_label2(int width, int height){

		setPreferredSize(new Dimension(width,height));
		setOpaque(false);
		setBorder(new EmptyBorder(0,0,0,0));
	
		addMouseMotionListener(new MouseAdapter() {
			
			 public void mouseDragged(MouseEvent e){
				
				 if(size.equals("list")) {
					 if(e.getY() < 10) {}
					 else if(e.getY() > getHeight()-30) {}
					 else {
						 if(y_paint < 10) {y_paint = 10;}
						 else {	 
							if (getHeight() < 총라벨좌표) {
								y_paint = e.getY();
								y -= (총라벨좌표 / getHeight()) * e.getY();
								Window_interface_D.테이블Y이동(y);
								y = (총라벨좌표 / getHeight()) * e.getY();
							}
							else {
								y_paint = e.getY();
								y -= e.getY();
								Window_interface_D.테이블Y이동(y);							
								y = e.getY();
							} 
						 }
					 }
				 }
				 else {
					 
					 
				 }
				 
			 }
		});
	}
	
	
	
	@Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2d = (Graphics2D) g.create();
         
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(1.0f));
        
        graphics2d.setColor(Color.black);

        graphics2d.fillRoundRect(
        		x_paint,
        		y_paint, 
        		10,
        		20,
        		10,
        		10
        );
        
        graphics2d.dispose();
        super.paintComponent(g); 
    }
    
	
}
