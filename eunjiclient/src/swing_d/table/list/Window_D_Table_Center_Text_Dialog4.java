package swing_d.table.list;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JPanel;

import swing_d.inter.Window_interface_D;

public class Window_D_Table_Center_Text_Dialog4 extends JDialog{

boolean set_color = true;
	
	int x;
	int y;	
	int width;
	int height;

	public Window_D_Table_Center_Text_Dialog4(int x,int y ,int width,int height){
		
		this.x = x ;
		this.y = y ;	
		this.width = width;
		this.height = height;
		
		setSize(width, height);
		setLocation(x, y);
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBackground(new Color(255, 255, 255, 255));
		
			JPanel a = new JPanel();
			add(a,BorderLayout.CENTER);
		
		a.add (Window_interface_D.텍스트);
		a.add (Window_interface_D.인트);
		a.add (Window_interface_D.사용자);
		a.add (Window_interface_D.날짜);
		a.add (Window_interface_D.분류);

	};
}

	

