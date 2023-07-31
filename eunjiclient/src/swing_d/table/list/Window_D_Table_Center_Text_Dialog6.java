package swing_d.table.list;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JPanel;

import swing_d.inter.Window_interface_D;

public class Window_D_Table_Center_Text_Dialog6 extends JDialog{

	public int 행;
	public int 열;
	public int x_location;
	public int y_location;
	public int width;
	public int height;
	public String a;
	public float font_size;
	public String type;
	
	boolean set_color = true;

	public Window_D_Table_Center_Text_Dialog6(){
		
		Window_interface_D.기본명칭추가();
		
		setSize(200, 60);
		setLocation(0, 0);
		setUndecorated(true);
		setLayout(new BorderLayout());
		setBackground(new Color(255, 255, 255, 255));
		
		JPanel a = new JPanel();
		add(a,BorderLayout.CENTER);
		
		for (int i = 0; i < Window_interface_D.담당자명칭.size(); i++) {
			
			a.add (new Window_D_Table_Lable_Filed7(5, i * 30, 200,30,Window_interface_D.담당자명칭.get(i)));
			
			setSize(200, 30 * i);
		}
		
	};
}

	

