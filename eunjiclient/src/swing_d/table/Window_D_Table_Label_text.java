package swing_d.table;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import swing_d.inter.Window_interface_All_file;
import swing_d.inter.Window_interface_D;

public class Window_D_Table_Label_text extends JLabel {

	int x_paint;
    int y_paint;
    int width;
    int height;
	String string;
	float font_size;
	int x_location;
	int y_location;
	public Window_D_Table_Label_text(String string,int x,int y ,int x_location, int y_location,int width,int height,float font_size){
		
		this.font_size = font_size;
		this.string = string;
		this.width = width;
		this.height = height;
		this.x_paint = x;
		this.y_paint = y;	
		this.x_location = x_location;
		this.y_location = y_location;
		
		setLocation(x_location,y_location);
		setSize(width,height);
		setPreferredSize(new Dimension(width,height));
		setOpaque(false); // 배경을 투명하게 설정
				
		addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) {}});};
		
		
	@Override
    protected void paintComponent(Graphics g) {
		super.paintComponent(g); 
        Graphics2D graphics2d = (Graphics2D) g.create();
         
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.table_panel_border_setStroke));
        graphics2d.setFont(Window_interface_All_file.font_omu.deriveFont(font_size));
        graphics2d.setColor(Color.black);
        
        graphics2d.drawRect(
        		x_paint,
        		y_paint, 
        		width - x_paint * 2 -1,
        		height - y_paint * 2 -1       	
        );
        
        graphics2d.drawString(string, 0,y_location);
       
        graphics2d.dispose();
    }
}
