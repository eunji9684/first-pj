package swing_d.dialog;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JDialog;

import swing_d.inter.Window_interface_D;

public class Dialog_Select extends JDialog{

boolean set_color = true;
	
	int x;
	int y;	
	int width;
	int height;
	
	public Dialog_Select(int x,int y ,int width,int height){
		
		this.x = x ;
		this.y = y ;	
		this.width = width;
		this.height = height;
		
		setSize(width, height);
		setLocation(x, y);
		setUndecorated(true);
		setLayout(new BorderLayout());
		getContentPane().add(Window_interface_D.dialog_list,BorderLayout.CENTER);
		setBackground(new Color(0, 0, 0, 0));
	};
}

	

