package swing_d.dialog;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Dialog_option_String extends JLabel {

	public int 행_label;
	public int 열_label;
	public int x_location_label;
	public int y_location_label;
	public int width_label;
	public int height_label;
	public float font_size_label;

	public String a_label;
	public String type_label = "String";
	
	boolean set_color = true;
	
	String 라벨네임;
	int x_paint;
	int y_paint;
	int width;
	int height;
    int radius = 10;
	
	public Dialog_option_String(Runnable run, String 라벨네임, int x, int y , int x_paint, int y_paint, int width, int height){
		
		this.라벨네임 = 라벨네임;
		this.x_paint = x_paint ;
		this.y_paint = y_paint ;	
		this.width = width;
		this.height = height;
		setBackground(new Color(255,255,255,0));
		setOpaque(true);
		setPreferredSize(new Dimension(width, height));
		addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {	
				if (라벨네임.equals("열 삭제하기")) {
					
					Window_interface_D.열_삭제(
							행_label,
							열_label,
							x_location_label,
							y_location_label,
							width_label,
							height_label,
							a_label,
							font_size_label,
							type_label
					);
					Window_interface_D.좌표조정();
					Window_interface_D.리스트_업로드();
					Window_interface_D.table_center_center.repaint();
				}
				else if(라벨네임.equals("행 삭제하기")) {
					
						Window_interface_D.행_삭제(
								행_label,
								열_label,
								x_location_label,
								y_location_label,
								width_label,
								height_label,
								a_label,
								font_size_label,
								type_label
						);
						Window_interface_D.좌표조정();
						Window_interface_D.리스트_업로드();
						Window_interface_D.table_center_center.repaint();
					
				}
				else {
					run.run();	
				}
				Window_interface_D.dialog_행_열_add.dispose();
			}
			
			public void mouseEntered(MouseEvent e) {
				
	    		set_color = false;
	    		repaint();
			};
	    	public void mouseExited(MouseEvent e) {
	    		set_color = true;
	    		repaint();
	    	};
	
	    	
			}
		);
			
	};
		@Override
	    protected void paintComponent(Graphics g) {
			super.paintComponent(g);
	        Graphics2D graphics2d = (Graphics2D) g;

	        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        graphics2d.setStroke(new BasicStroke(1.0f));
	      
	        if (set_color) {graphics2d.setColor(new Color(245,245,245));}
	        else {graphics2d.setColor(new Color(205,205,205));}
	        
	        graphics2d.fillRoundRect(x_paint, y_paint , width - x_paint *2 -1 , height - y_paint * 2 -1, radius, radius);
	       
	        graphics2d.setColor(new Color(0,0,0));
	        graphics2d.setFont(Window_Font_Install.font.deriveFont(16.0f));
	        
            FontMetrics fontmet = graphics2d.getFontMetrics();
            int t_Width = fontmet.stringWidth(라벨네임);
            int t_Height = fontmet.getHeight();

            int x = (width - t_Width) / 2;
            int y = (height - t_Height) / 2 + fontmet.getAscent();
	        
	        graphics2d.drawString(라벨네임, x, y);
	        graphics2d.dispose();        
	   
	}
		
};
	
