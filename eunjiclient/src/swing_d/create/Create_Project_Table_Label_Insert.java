package swing_d.create;

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

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Create_Project_Table_Label_Insert extends JLabel {

	boolean set_color = true;
	
	int width;
	int height;
	int x;
	int y;
	public String a;
	float fontsize;
	int rownd = 10;
	int textmarginleft;
	
	public boolean event = true;
	
	
	public Create_Project_Table_Label_Insert(Runnable run,String a,int x,int y ,int location_x , int location_y ,int width,int height, float fontsize, boolean event ,int textmarginleft){
		
		this.event = event;
		this.textmarginleft = textmarginleft;
		this.x = x ;
		this.y = y ;	
		this.a = a;
		this.width = width;
		this.height = height;
		this.fontsize = fontsize;
		
		setSize(width, height);
		setLocation(location_x, location_y);
	
			addMouseListener(new MouseAdapter() {
			
			    public void mousePressed(MouseEvent e) {
			    	
		             if (SwingUtilities.isLeftMouseButton(e)) { /*여기는 오른쪽 클릭 기준임*/
		            	 
		            	 if(!Window_interface_D.생성하기.event) {run.run();}
		            
		             }
		             
		             else if (SwingUtilities.isRightMouseButton(e)) { 
		                	
		                Window_interface_D.dialog_select.dispose(); /*여기는 왼쪽 클릭 기준임*/
			             
		             }
			    	
			    }
			
			});
		
	};
	
		@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D graphics2d = (Graphics2D) g;

	        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        graphics2d.setStroke(new BasicStroke(1.0f));
	        	        
		    graphics2d.setColor(new Color(235,235,235,255));
		    graphics2d.fillRoundRect(x, y, width - x * 2 -1 , height - y *2 -1 , rownd, rownd);
		
		    graphics2d.setColor(new Color(120,180,180,255));
		    graphics2d.drawRoundRect(x, y, width - x * 2 -1 , height - y *2  -1 , rownd, rownd);
	        
		    if(event) {graphics2d.setColor(new Color(100,100,100,255));}
	        else {graphics2d.setColor(Window_interface_D.option.btn_label_set_font_color);}
	        
	        graphics2d.setFont(Window_Font_Install.font.deriveFont(fontsize));
		    
            FontMetrics fontmet = graphics2d.getFontMetrics();
            int t_Width = fontmet.stringWidth(a);
            int t_Height = fontmet.getHeight();

            int x = (width - t_Width) / 2;
            int y = (height - t_Height) / 2 + fontmet.getAscent();
	        
            if(textmarginleft == 999) {textmarginleft = x;}
             	
	        graphics2d.drawString(a, textmarginleft, y);
	        
	        graphics2d.dispose();
	}};
	
