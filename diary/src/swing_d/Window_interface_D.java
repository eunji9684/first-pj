package swing_d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;

public interface Window_interface_D {
	
	Init option = new Init();

	int[] resize = new int[4];
	
	int a = 1;
	
	int[] aa = new int[1]; 
	
	public static Size_D_GraphicsEnvironment size  			= new Size_D_GraphicsEnvironment();
	
	public static Window_D_frame diary_frame 				= new Window_D_frame();
	
	public static Window_D_panel_main main_panel 			= new Window_D_panel_main(new Color(255,255,255,0),new BorderLayout(1, 1),	 0,    0, size.resize_screen_width, size.resize_screen_height);
	public static Window_D_panel_resizer resizer_top 		= new Window_D_panel_resizer(new Runnable() {@Override public void run() {}},new Color(255,0,0,255),0,0,0,size.resize_screen_width,2);
	public static Window_D_panel_resizer resizer_left 		= new Window_D_panel_resizer(new Runnable() {@Override public void run() {}},new Color(255,0,0,255),0,0,0,2,size.resize_screen_height);
	public static Window_D_panel_resizer resizer_right 		= new Window_D_panel_resizer(new Runnable() {@Override public void run() {resize_right();	}},new Color(255,0,0,255),11,0,0,2,size.resize_screen_height);
	public static Window_D_panel_resizer resizer_down 		= new Window_D_panel_resizer(new Runnable() {@Override public void run() {resize_down();	}},new Color(255,0,0,255),8,0,0,size.resize_screen_width,2);
	
	public static Window_D_panel_center main_panel_center	= new Window_D_panel_center(new Color(255,255,255,0),new BorderLayout(option.other_border_layout_width, 0),	 0,    0, size.resize_screen_width, size.resize_screen_height);
	
	/*여기부터 수정*/
	public static Window_D_panel_head diary_head 			= new Window_D_panel_head(new Color(255,255,255,0),	   5, 5, size.resize_screen_width, option.head_panel_height);
	public static Window_D_panel_team diary_team 			= new Window_D_panel_team(new Color(180,180,180,0),	   5, option.other_panel_margin, option.head_panel_size_fix, size.resize_screen_height-option.other_panel_height);
	public static Window_D_panel_message diary_message		= new Window_D_panel_message(new Color(150,150,150,0), 5, option.other_panel_margin, option.message_panel_size_fix, size.resize_screen_height-option.other_panel_height);
	public static Window_D_panel_table diary_table	 		= new Window_D_panel_table(new Color(120,120,120,0),   5, option.other_panel_margin, main_panel.getWidth() - option.table_panel_size -5,  size.resize_screen_height-option.other_panel_height);
	public static 황은지_Accountbook account = new 황은지_Accountbook();
	/*window header*/
	public static Window_D_Label_Circle btn_x	 			= new Window_D_Label_Circle(new Runnable() {@Override public void run() {exit();}},"X", size.resize_screen_width-50, 13, 33, 33);
	public static Window_D_Label_Circle btn_ㅁ	 			= new Window_D_Label_Circle(new Runnable() {@Override public void run() {max();}},"ㅁ",  size.resize_screen_width-90, 13, 33, 33);
	public static Window_D_Label_Circle btn_ㅡ	 			= new Window_D_Label_Circle(new Runnable() {@Override public void run() {hide();}},"ㅡ", size.resize_screen_width-130, 13, 33, 33);
	
	public static void panel_Add(){
		
		diary_frame.getContentPane().add(main_panel);
		
		main_panel.add(resizer_top,BorderLayout.NORTH);
		main_panel.add(resizer_right,BorderLayout.EAST);
		main_panel.add(resizer_left,BorderLayout.WEST);
		main_panel.add(resizer_down,BorderLayout.SOUTH);
		main_panel.add(main_panel_center,BorderLayout.CENTER);
		
		main_panel_center.add(diary_head,BorderLayout.NORTH);
		main_panel_center.add(diary_team,BorderLayout.WEST);
	    main_panel_center.add(diary_table,BorderLayout.CENTER);
		main_panel_center.add(diary_message,BorderLayout.EAST);
	
	}
	
	public static void lable_Add(){
				
		diary_head.add(btn_x);
		diary_head.add(btn_ㅁ);
		diary_head.add(btn_ㅡ);
		diary_table.add(account);
	}
	
	public static void exit() {System.exit(0);};
	
		
	public static void max() {
		
		
		if(	diary_frame.getHeight() == size.resize_screen_height) {
			
			diary_frame.setSize(1680,800);
			main_panel.setSize(1680,800);
			
			diary_team.setPreferredSize(new Dimension(option.head_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			diary_table.setPreferredSize(new Dimension(main_panel.getWidth() - option.table_panel_size -5,main_panel.getHeight()-option.other_panel_height));
			diary_message.setPreferredSize(new Dimension(option.message_panel_size_fix,main_panel.getHeight()-option.other_panel_height));

			
			diary_frame.setExtendedState(diary_frame.NORMAL);
		
			btn_x.setLocation(diary_frame.getSize().width-50, 13);
			btn_ㅁ.setLocation(diary_frame.getSize().width-90, 13);
			btn_ㅡ.setLocation(diary_frame.getSize().width-130, 13);
			
			diary_frame.repaint();
		}
		else {
			
			diary_frame.setExtendedState(diary_frame.MAXIMIZED_BOTH);
		
			diary_frame.setSize(size.resize_screen_width,size.resize_screen_height);
			main_panel.setSize(size.resize_screen_width,size.resize_screen_height);
		
			diary_team.setPreferredSize(new Dimension(option.head_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			diary_table.setPreferredSize(new Dimension(main_panel.getWidth() - option.table_panel_size -5,main_panel.getHeight()-option.other_panel_height));
			diary_message.setPreferredSize(new Dimension(option.message_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			
			btn_x.setLocation(diary_frame.getSize().width-50, 13);
			btn_ㅁ.setLocation(diary_frame.getSize().width-90, 13);
			btn_ㅡ.setLocation(diary_frame.getSize().width-130, 13);
			
			diary_frame.repaint();
		}
	}
	
	public static void resize_right() {main_panel.setSize(resize[0] + resize[2],  resize[1]);};
	
	public static void resize_down() {main_panel.setSize(resize[0],resize[1] + resize[3]);};
	
	public static void resize_relayout_() {
		
		main_panel.revalidate();
		diary_frame.revalidate();
		diary_head.revalidate();
		
		diary_frame.setSize(main_panel.getSize());	
		
		btn_x.setLocation(diary_frame.getSize().width-50, 13);
		btn_ㅁ.setLocation(diary_frame.getSize().width-90, 13);
		btn_ㅡ.setLocation(diary_frame.getSize().width-130, 13);
		
		if(btn_x.getLocation().x < 0) {btn_x.setVisible(false);}
		else {btn_x.setVisible(true);}
		if(btn_ㅁ.getLocation().x < 0) {btn_ㅁ.setVisible(false);}
		else {btn_ㅁ.setVisible(true);}
		if(btn_ㅡ.getLocation().x < 0) {btn_ㅡ.setVisible(false);}
		else {btn_ㅡ.setVisible(true);}
		
		diary_team.setPreferredSize(new Dimension(option.head_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
		diary_table.setPreferredSize(new Dimension(main_panel.getWidth() - option.table_panel_size -5,main_panel.getHeight()-option.other_panel_height));
		diary_message.setPreferredSize(new Dimension(option.message_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
		
		diary_frame.repaint();
	};
	
	public static void hide() {diary_frame.setExtendedState(diary_frame.ICONIFIED);}
	

    //Window_interface_D.main_panel.revalidate();
}
