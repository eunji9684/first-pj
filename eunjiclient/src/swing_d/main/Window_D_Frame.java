package swing_d.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import swing_d.inter.Window_interface_D;

public class Window_D_Frame extends JFrame{

	public Window_D_Frame(){
		
		if(Window_interface_D.option.mainframe_auto_size) {
			setSize(Window_interface_D.size.resize_screen_width,Window_interface_D.size.resize_screen_height);
			setPreferredSize(new Dimension(Window_interface_D.size.resize_screen_width,Window_interface_D.size.resize_screen_height));
		}
		else {
			setSize(900,815);	
		}
		
		//최초 실행되는 프레임의 레이아웃을 null로 설정
		getContentPane().setLayout(null);
		
		//최초 프레임의 헤드를 제거함
		setUndecorated(swing_d.init.Window_Init.Frame_head);
		
		//최초 실행되는 프레임의 getcontentpane의 색상을 투명하게 설정
		setBackground(swing_d.init.Window_Init.Frame_backcolor);
	}
}
