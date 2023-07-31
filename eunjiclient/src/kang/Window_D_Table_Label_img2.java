package kang;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import swing_d.dialog.Dialog_Select;
import swing_d.inter.Window_interface_D;

public class Window_D_Table_Label_img2 extends JLabel {

	int x;
	int y;
	int x_paint;
    int y_paint;
    int width;
    int height;
    //ImageIcon icon;
	int rownd;
    
	public Window_D_Table_Label_img2(ImageIcon icon, int x, int y, int x_location, int y_location, int width, int height ,int rownd, Runnable run){
		setSize(width,height);
		setPreferredSize(new Dimension(width,height));
		setOpaque(false);
		setLocation(x_location, y_location);
		this.rownd = rownd;
		this.setIcon(icon);;
		this.width = width;
		this.height = height;
		this.x_paint = x;
		this.y_paint = y;		
				
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {run.run();}
			
			 public void mouseClicked(MouseEvent e) {
		          	
	                if (SwingUtilities.isLeftMouseButton(e)) { 
	                
	                	Window_interface_D.dialog_select.dispose(); /*여기는 왼쪽 클릭 기준임*/
	                	
	                }
	               
	                else if (SwingUtilities.isRightMouseButton(e)) {  /*여기는 오른쪽 클릭 기준임*/
	                	
	                	Dialog_Select A = Window_interface_D.dialog_select;
	                	
	                	A.setLocation(e.getXOnScreen() ,e.getYOnScreen());
	                	A.setVisible(true);

	                }
	            }
		
		
		});
		
		
		
	};

	@Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2d = (Graphics2D) g.create();
         
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.table_panel_border_setStroke));
        
        graphics2d.setColor(new Color(235,235,235,200));
        
        graphics2d.fillRoundRect(
        		x_paint,
        		y_paint,
        		width - x_paint *2 -1 ,
        		height - y_paint *2 -1,
        		rownd,
        		rownd
        );
    
        int width_height = 52;
        graphics2d.drawImage(((ImageIcon)this.getIcon()).getImage(), (width /2) - (width_height/2) , (height /2) - (width_height/2), width_height,width_height,null);
        graphics2d.dispose();
        
	}
                
}
    
