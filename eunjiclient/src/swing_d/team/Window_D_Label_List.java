package swing_d.team;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

import swing_d.inter.Window_interface_D;

public class Window_D_Label_List extends JPanel {

	boolean set_color = true;
	
	int x;
	int y;	
	int width;
	int height;
	int radius = 10; 
	
	String a;
	
	public Window_D_Label_List(Runnable run,int x,int y ,int width,int height){
		
		this.x = x ;
		this.y = y ;	
		this.a = a;
		this.width = width;
		this.height = height;
		
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(500,500));
		setBackground(Color.red);
			
	};
};
	
