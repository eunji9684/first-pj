package swing_d.table.one;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Window_D_Table_Center_One_Head_Textfiled extends JTextField {

	int x_paint;
    int y_paint;
    int width;
    int height;
	public String string;
	float font_size;
	int x_location;
	int y_location;
	int 행;
	int 열;
	boolean focuse = true;
	boolean string_view = true;
	boolean drow_line = false;
	boolean linebar = true;
	int type;
	
	
	public Window_D_Table_Center_One_Head_Textfiled(String string,int 행, int 열, int x, int y, int x_location, int y_location,int width,int height,float font_size, int type){
		this.type = type;
		this.행 = 행;
		this.열 = 열;
		this.font_size = font_size;
		this.string = string;
		this.width = width;
		this.height = height;
		this.x_paint = x;
		this.y_paint = y;	
		this.x_location = x_location;
		this.y_location = y_location;
		
		setFont(Window_Font_Install.font.deriveFont(font_size));
		setLocation(x_location,y_location);
		setSize(width,height);
		setPreferredSize(new Dimension(width,height));
		setOpaque(false); // 배경을 투명하게 설정
		setForeground(Color.black);
		setBorder(new EmptyBorder(0, 15, 0, 15));  //여백을 줍니다.
		event_add();

	}
	
	public void event_add() {
		this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            	linebar = false;
            }

            @Override
            public void focusLost(FocusEvent e) {
            	linebar= false;
            	focuse= false;
            	string_view = true;
            	
            	if(getText().isEmpty()) {}
            	else {string = getText(); setText("");}  
            	repaint();
            	
            }
        });
				
		
		this.addMouseListener(new MouseAdapter() {
		    public void mousePressed(MouseEvent e) {
		    	linebar= true;
		    	focuse= true;
		    	string_view = false;
		    	repaint();
		    	System.out.println(행 +","+ 열);
		    }
		    
		    public void mouseEntered(MouseEvent e) {
		    	drow_line= true;
		    	repaint();
		    }
		    public void mouseExited(MouseEvent e)  {
		    	
		    	drow_line= false;
		    	repaint();
		    }
		 
		    
		});
	
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					
						linebar= false;
		            	string_view = true;
		            	drow_line= false;
		            	if(getText().isEmpty()) {}
		            	else {string = getText(); setText("");}  
		            	
		            	repaint();
				}
			}
		});	
	}
	
	public void istype() {
		
		switch (this.type) {
		
		case 1:  //string
			break;
		case 2:  //int
			break;
		case 3:  //date
			break;
		case 4:  //selecter
			break;
		case 5:  //method
			break;
		case 6:  
			break;
			

		default:
			break;
		}
		
	};
	
	@Override
    protected void paintComponent(Graphics g) {
		super.paintComponent(g); 
        Graphics2D graphics2d = (Graphics2D) g.create();
         
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(0.5f));
       
        if(focuse) {graphics2d.setColor(Color.white);}
        else {graphics2d.setColor(new Color(245,245,245));}
        
        graphics2d.fillRect(
        		x_paint,
        		y_paint, 
        		getWidth() - x_paint * 2 -1,
        		getHeight() - y_paint * 2 -1       	
        );
        graphics2d.setColor(new Color(180,180,180,180));
        if(drow_line) {
        	
        	graphics2d.drawRect(
            		x_paint,
            		y_paint, 
            		getWidth() - x_paint * 2 -1,
            		getHeight() - y_paint * 2 -1       	
            );
        } 
        graphics2d.setColor(Color.black);
        FontMetrics fontmet = graphics2d.getFontMetrics();
        int t_Width = fontmet.stringWidth(string);
        int t_Height = fontmet.getHeight();

        int x = (getWidth() - t_Width) /2;
        int y = (getHeight() - t_Height) / 2 + fontmet.getAscent();
        
        if(string_view){graphics2d.drawString(string, x, y);};
        
	    graphics2d.dispose();
	    
	    if(linebar) {super.paintComponent(g);}
        
    }
}
