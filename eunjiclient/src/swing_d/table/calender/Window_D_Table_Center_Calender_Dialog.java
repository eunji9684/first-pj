package swing_d.table.calender;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JPanel;

import swing_d.inter.Window_interface_D;

public class Window_D_Table_Center_Calender_Dialog extends JDialog{

boolean set_color = true;
	
	int x;
	int y;	
	int width;
	int height;

	public Window_D_Table_Center_Calender_Dialog(int x,int y ,int width,int height){
		
		this.x = x ;
		this.y = y ;	
		this.width = width;
		this.height = height;
		
	
		setSize(width, height);
		setLocation(x, y);
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBackground(new Color(255, 255, 255, 1));
		
		add(Window_interface_D.달력패널,BorderLayout.CENTER);

	};
}

	

