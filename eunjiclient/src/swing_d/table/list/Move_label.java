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

public class Move_label extends JLabel {

	public String size= "list";
	
	int mouse;
	int x = 10;
	public int 총라벨좌표;
	int x_paint =10;
	int y_paint =5;

	
	public Move_label(int width, int height){

		setPreferredSize(new Dimension(width,height));
		setOpaque(false);
		setBorder(new EmptyBorder(0,0,0,0));
		setSize(40,10);
	
		addMouseMotionListener(new MouseAdapter() {
			
			 public void mouseDragged(MouseEvent e){
			
				 if(e.getX() < 10) {}
				 else if(e.getX() > getWidth()-30) {}
				 else {
					 if(x_paint < 10) {x_paint = 10;}
					 else {	 
						if (getWidth() < 총라벨좌표) {
							x_paint = e.getX();
							x -= (총라벨좌표 / getWidth()) * e.getX();
							
							if(size.equals("list")) {
							
								Window_interface_D.테이블X이동(x);
								  
							}
	
							else if(size.equals("accountbook")){
								
							//	Window_interface_D.가계부X이동(x);
							}
							
							else if(size.equals("timeline")){
								
								//	Window_interface_D.가계부X이동(x);
								}
							else {
								
								
							}
							
							x = (총라벨좌표 / getWidth()) * e.getX();
						}
						else {
							x_paint = e.getX();
							x -= e.getX();
							
							if(size.equals("list")) {
								
								Window_interface_D.테이블X이동(x);
								  
							}
			
							else if(size.equals("accountbook")){
								
							//	Window_interface_D.가계부X이동(x);
							}

							else {
								
								
							}
							
							x = e.getX();
						 } 
					 }
			 	}
			 }
		});
	}
	
	
	
	@Override
    protected void paintComponent(Graphics g) {
		super.paintComponent(g); 
        Graphics2D graphics2d = (Graphics2D) g.create();
         
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(1.0f));
        
        graphics2d.setColor(Color.black);

        graphics2d.fillRoundRect(
        		x_paint,
        		y_paint, 
        		20,
        		10,
        		10,
        		10
        );
        
        graphics2d.dispose();
    }
    
	
}
