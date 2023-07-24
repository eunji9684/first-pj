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

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import swing_d.inter.Window_interface_D;

public class Window_D_Table_Label_img extends JLabel {

	int x;
	int y;
	int x_paint;
    int y_paint;
    int width;
    int height;
    ImageIcon icon;
	int rownd;
    
	public Window_D_Table_Label_img(ImageIcon icon, int x, int y, int x_location, int y_location, int width, int height ,int rownd){
		setSize(width,height);
		setPreferredSize(new Dimension(width,height));
		setOpaque(false);
		setLocation(x_location, y_location);
		this.rownd = rownd;
		this.icon = icon;
		this.width = width;
		this.height = height;
		this.x_paint = x;
		this.y_paint = y;		
		
		addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) {}});};

	@Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2d = (Graphics2D) g.create();
         
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(Window_interface_D.option.table_panel_border_setStroke));
        
        graphics2d.setColor(Color.white);
        graphics2d.fillRoundRect(
        		x_paint,
        		y_paint,
        		width - x_paint *2 -1 ,
        		height - y_paint *2 -1,
        		rownd,
        		rownd
        );
        graphics2d.setColor(Color.black);
        graphics2d.drawRoundRect(
        		x_paint,
        		y_paint,
        		width - x_paint *2 -1 ,
        		height - y_paint *2 -1,
        		rownd,
        		rownd
        );
        
        graphics2d.drawImage(icon.getImage(), x, y, null);
        
        graphics2d.dispose();
        
	}
                
}
    
