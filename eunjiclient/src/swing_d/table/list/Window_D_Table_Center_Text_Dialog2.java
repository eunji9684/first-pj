package swing_d.table.list;

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

import swing_d.dialog.Dialog_option_String;
import swing_d.inter.Window_interface_D;

public class Window_D_Table_Center_Text_Dialog2 extends JDialog{

boolean set_color = true;
	
	int x;
	int y;	
	int width;
	int height;

	public Window_D_Table_Center_Text_Dialog2(int x,int y ,int width,int height){
		
		this.x = x ;
		this.y = y ;	
		this.width = width;
		this.height = height;
		
		setSize(width, height);
		setLocation(x, y);
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBackground(new Color(255, 255, 255, 0));
	
		add(Window_interface_D.행_열_추가하기패널,BorderLayout.CENTER);
		
	};
}

	

