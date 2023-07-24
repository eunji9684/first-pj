package swing_d.inter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import swing_d.center.Window_D_Panel_Center;
import swing_d.create.Create_Project_Table;
import swing_d.create.Create_Project_Table_Label;
import swing_d.create.Create_Project_Table_Label_Insert;
import swing_d.create.Create_Project_Table_Label_Select_Show;
import swing_d.create.Create_Project_Table_Text;
import swing_d.dialog.Dialog_Select;
import swing_d.dialog.Dialog_list;
import swing_d.dialog.Dialog_option_String;
import swing_d.head.Window_D_Label_Circle;
import swing_d.head.Window_D_Label_Move;
import swing_d.head.Window_D_Panel_Head;
import swing_d.init.Window_Init;
import swing_d.login.Window_D_Login_Circle_btn;
import swing_d.login.Window_D_Login_Label;
import swing_d.login.Window_D_Login_Pass;
import swing_d.login.Window_D_Login_Text;
import swing_d.main.Window_D_Frame;
import swing_d.main.Window_D_Panel_Main;
import swing_d.main.Window_D_Panel_Resizer;
import swing_d.message.Window_D_Panel_Message;
import swing_d.size.Window_D_GraphicsEnvironment;
import swing_d.table.Window_D_Panel_Table;
import swing_d.team.Window_D_Label_List;
import swing_d.team.Window_D_Label_String;
import swing_d.team.Window_D_Panel_Team;
import swing_d.user.*;



public interface Window_interface_D {

	Window_Init option = new Window_Init();
		
	public static Window_D_GraphicsEnvironment size  			= new Window_D_GraphicsEnvironment();

	public static Window_D_Frame diary_frame 					= new Window_D_Frame();

	public static Window_D_Panel_Main main_User_add 			= new Window_D_Panel_Main(null,	(size.resize_screen_width/2) - (option.main_size_width/2), (size.resize_screen_height / 2) - (option.main_size_height / 2),option.main_login_x,option.main_login_y, option.main_size_width, option.main_size_height);
	public static Window_D_UserAdd_Circle_btn User_btn_x     	= new Window_D_UserAdd_Circle_btn(new Runnable() {@Override public void run() {exit();}}, "X", 20 ,5, 5, 30, 30);
	public static Window_D_UserAdd_Text	User_Text 				= new Window_D_UserAdd_Text(0, 0, 50, 50, 200, 30, 20);
	public static Window_D_UserAdd_Label	User_Text_labeL    	= new Window_D_UserAdd_Label("가입할 이메일을 입력해 주세요", 0, 0, 52, 68, 230, 50, 15);
	public static Window_D_UserAdd_Pass	User_Pass 				= new Window_D_UserAdd_Pass(0, 0, 50, 110, 200, 30);
	public static Window_D_UserAdd_Label	User_Pass_labeL  	= new Window_D_UserAdd_Label("패스워드를 입력해 주세요", 0, 0, 52, 128, 230, 50, 15);
	
	public static Window_D_Panel_Main main_login 				= new Window_D_Panel_Main(null,	(size.resize_screen_width/2) - (option.main_size_width/2), (size.resize_screen_height / 2) - (option.main_size_height / 2),option.main_login_x,option.main_login_y, option.main_size_width, option.main_size_height);
	public static Window_D_Login_Circle_btn login_btn_x     = new Window_D_Login_Circle_btn(new Runnable() {@Override public void run() {exit();}}, "X", 20 ,5, 5, 30, 30);
	public static Window_D_Login_Text	login_Text 			= new Window_D_Login_Text(0, 0, 50, 50, 200, 30, 20);
	public static Window_D_Login_Label	login_Text_labeL    = new Window_D_Login_Label("로그인 아이디를 입력해 주세요", 0, 0, 52, 68, 230, 50, 15);
	public static Window_D_Login_Pass	login_Pass 			= new Window_D_Login_Pass(0, 0, 50, 110, 200, 30);
	public static Window_D_Login_Label	login_Pass_labeL    = new Window_D_Login_Label("패스워드를 입력해 주세요", 0, 0, 52, 128, 230, 50, 15);
	
	public static Window_D_Panel_Main main_panel 			= new Window_D_Panel_Main(new BorderLayout(option.main_panel_border_layout_x, option.main_panel_border_layout_y),	option.main_panel_x, option.main_panel_y,option.main_panel_x,option.main_panel_y, size.resize_screen_width, size.resize_screen_height);
	public static Window_D_Panel_Resizer resizer_top 		= new Window_D_Panel_Resizer(new Runnable() {@Override public void run() {}},option.resize_color,0,0,0,size.resize_screen_width,2);
	public static Window_D_Panel_Resizer resizer_left 		= new Window_D_Panel_Resizer(new Runnable() {@Override public void run() {}},option.resize_color,0,0,0,2,size.resize_screen_height);
	public static Window_D_Panel_Resizer resizer_right 		= new Window_D_Panel_Resizer(new Runnable() {@Override public void run() {resize_right();}},option.resize_color,11,0,0,2,size.resize_screen_height);
	public static Window_D_Panel_Resizer resizer_down 		= new Window_D_Panel_Resizer(new Runnable() {@Override public void run() {resize_down(); }},option.resize_color,8,0,0,size.resize_screen_width,2);
	
	int[] resize = new int[4];
	public static void resize_right() {
		
		main_panel.setSize(resize[0] + resize[2],  resize[1]);
	
	};
	public static void resize_down() {
		
		main_panel.setSize(resize[0],resize[1] + resize[3]);
	
	};

	public static void resize_relayout_() {
		
		main_panel.revalidate();
		diary_frame.revalidate();
		diary_head.revalidate();
		
		diary_frame.setSize(main_panel.getSize());	
	
		if(btn_x.getLocation().x < 0) {btn_x.setVisible(false);}
		else {btn_x.setVisible(true);}
		if(btn_ㅁ.getLocation().x < 0) {btn_ㅁ.setVisible(false);}
		else {btn_ㅁ.setVisible(true);}
		if(btn_ㅡ.getLocation().x < 0) {btn_ㅡ.setVisible(false);}
		else {btn_ㅡ.setVisible(true);}
		
		diary_team.setPreferredSize(new Dimension(option.team_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
		diary_message.setPreferredSize(new Dimension(option.message_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
		diary_table.setPreferredSize(new Dimension(main_panel.getSize().width - option.table_panel_size - (option.table_panel_x_margin)  ,main_panel.getHeight()-option.other_panel_height));
		
		diary_frame.repaint();
};
	
	public static Window_D_Panel_Center main_panel_center	= new Window_D_Panel_Center(new BorderLayout(option.main_panel_center_border_layout_x,option.main_panel_center_border_layout_y),	option.main_panel_center_x, option.main_panel_center_y, size.resize_screen_width, size.resize_screen_height);
	
	public static void user_Add() {
		diary_frame.getContentPane().add(main_User_add);
		main_User_add.add(User_btn_x);
		main_User_add.add(User_Text);
		main_User_add.add(User_Text_labeL);
		main_User_add.add(User_Pass);
		main_User_add.add(User_Pass_labeL);
		
	}
	
	public static void login_Add() {
		diary_frame.getContentPane().add(main_login);
		main_login.add(login_btn_x);
		main_login.add(login_Text);
		main_login.add(login_Text_labeL);
		main_login.add(login_Pass);
		main_login.add(login_Pass_labeL);
		
	}
	
	public static void panel_Add(){
		
		diary_frame.getContentPane().add(main_panel);
		main_panel.add(resizer_top,BorderLayout.NORTH);
		main_panel.add(resizer_right,BorderLayout.EAST);
		main_panel.add(resizer_left,BorderLayout.WEST);
		main_panel.add(resizer_down,BorderLayout.SOUTH);
		main_panel.add(main_panel_center,BorderLayout.CENTER);
	
	}
	
	GridBagLayout GL_head 	 = new GridBagLayout();

	public static Window_D_Panel_Head diary_head 			= new Window_D_Panel_Head(option.GL_head(GL_head),   option.head_panel_x, option.head_panel_y, size.resize_screen_width, option.head_panel_height);
	
	public static Window_D_Label_Move btn_move_team			= new Window_D_Label_Move(new Runnable() {@Override public void run() {team_hide();}},"팀", 12, 0, 0, 20, 20);
	public static Window_D_Label_Move btn_move_message		= new Window_D_Label_Move(new Runnable() {@Override public void run() {message_hide();}},"M", 12, 0, 0, 20, 20);
	
	
	public static void team_hide() {
		if (option.hasPanel(main_panel_center,BorderLayout.WEST)) {main_panel_center.remove(diary_team);}
		else {main_panel_center.add(diary_team,BorderLayout.WEST);}
		main_panel_center.validate();
		main_panel_center.repaint();
	}

	public static void message_hide() {
		if (option.hasPanel(main_panel_center,BorderLayout.EAST)) {main_panel_center.remove(diary_message);}
		else {main_panel_center.add(diary_message,BorderLayout.EAST);}
		main_panel_center.validate();
		main_panel_center.repaint();
	}
	
	/*window header*/
	public static Window_D_Label_Circle btn_x	 			= new Window_D_Label_Circle(new Runnable() {@Override public void run() {exit();}},"X", 0, 0, option.btn_size, option.btn_size);
	
	public static void exit() {System.exit(0);};
	
	public static Window_D_Label_Circle btn_ㅁ	 			= new Window_D_Label_Circle(new Runnable() {@Override public void run() {max_min();}},"ㅁ",  0, 0, option.btn_size, option.btn_size);
	
	public static void max_min() {
		
		if(	diary_frame.getWidth() == (int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[1]))) {
			option.main_panel_border_rownd = true;
			
			diary_frame.setSize((int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[1])/ 1.2f),(int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[2])/ 1.2f - size.작업표시줄_사이즈));
			main_panel.setSize((int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[1])/ 1.2f),(int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[2])/ 1.2f- size.작업표시줄_사이즈));
			main_panel.revalidate();
			
			diary_team.setPreferredSize(new Dimension(option.team_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			diary_message.setPreferredSize(new Dimension(option.message_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			diary_table.setPreferredSize(new Dimension(main_panel.getSize().width - option.table_panel_size - (option.table_panel_x_margin)  ,main_panel.getHeight()-option.other_panel_height));
			
			diary_frame.setExtendedState(diary_frame.NORMAL);

			diary_frame.repaint();
		}
		else {

			diary_frame.setExtendedState(diary_frame.MAXIMIZED_BOTH);
			option.main_panel_border_rownd = false;
			diary_frame.setSize((int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[1])),(int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[2]) - size.작업표시줄_사이즈));
			main_panel.setSize((int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[1])),(int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[2]) - size.작업표시줄_사이즈));
			main_panel.revalidate();
			
			diary_team.setPreferredSize(new Dimension(option.team_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			diary_message.setPreferredSize(new Dimension(option.message_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			diary_table.setPreferredSize(new Dimension(main_panel.getSize().width - option.table_panel_size - (option.table_panel_x_margin)  ,main_panel.getHeight()-option.other_panel_height));
			
			diary_frame.repaint();
		}
	}
	
	public static Window_D_Label_Circle btn_ㅡ	 			= new Window_D_Label_Circle(new Runnable() {@Override public void run() {hide();}},"ㅡ", 0, 0, option.btn_size, option.btn_size);
	
	public static void hide() {diary_frame.setExtendedState(diary_frame.ICONIFIED);}
	
	GridBagConstraints head_GL_Label1 = new GridBagConstraints();
	GridBagConstraints head_GL_Label2 = new GridBagConstraints();
	GridBagConstraints head_GL_Label3 = new GridBagConstraints();

	public static void head_Add(){
	
		main_panel_center.add(diary_head,BorderLayout.NORTH);
		diary_head.add(btn_x, option.GL_label(head_GL_Label1, 1, 0, 0, 0, 0, 0));  //TOP, LEFT , DOWN ,RIGHT
		diary_head.add(btn_ㅁ, option.GL_label(head_GL_Label2, 2, 0, 0, 0, 0, 0));
		diary_head.add(btn_ㅡ, option.GL_label(head_GL_Label3, 3, 0, 0, 0, 0, 0));
				
		//diary_head.add(btn_move_team, option.GL_label(head_GL_Label1, 4, 0, 0, 0, 0, 0));  //TOP, LEFT , DOWN ,RIGHT
		//diary_head.add(btn_move_message, option.GL_label(head_GL_Label3, 5, 0, 0, 0, 0, 0));
	}
	
	public static Window_D_Panel_Team diary_team 			= new Window_D_Panel_Team(new BorderLayout(0,0),option.team_panel_x, option.other_panel_margin, option.team_panel_size_fix, size.resize_screen_height- option.other_panel_height);
	
	public static Window_D_Panel_Team diary_team_string 	= new Window_D_Panel_Team(new BorderLayout(0,0),option.team_panel_x, option.other_panel_margin, option.team_panel_size_fix, 80);
	
	public static Window_D_Label_String user_team_String    = new Window_D_Label_String(new Runnable() {@Override public void run() {
		dialog_select.setSize(125,125);
		dialog_list.removeAll();
		dialog_list.add(팀페이지생성,BorderLayout.NORTH);
		dialog_list.add(추가기능라벨,BorderLayout.CENTER);
		dialog_list.add(추가기능라벨1,BorderLayout.SOUTH);
		dialog_list.repaint();
		
	}}, "팀 스페이스", option.user_team_string_x, option.user_team_string_y, option.user_team_string_width, option.user_team_string_height);
	
	public static Window_D_Label_String user_my_String      = new Window_D_Label_String(new Runnable() {@Override public void run() {
		dialog_select.setSize(125,125);
		dialog_list.removeAll();
		dialog_list.add(팀페이지생성,BorderLayout.NORTH);
		dialog_list.add(추가기능라벨,BorderLayout.CENTER);
		dialog_list.add(추가기능라벨1,BorderLayout.SOUTH);
		dialog_list.repaint();
	}}, "내 스페이스", option.user_team_string_x, option.user_team_string_y, option.user_team_string_width, option.user_team_string_height);

	public static Window_D_Label_List diary_team_list 		= new Window_D_Label_List(new Runnable() {@Override public void run() {}}, option.user_team_space_x, option.user_team_space_y, option.user_team_space_width, option.user_team_space_height);

	public static Dialog_option_String 팀페이지생성           = new Dialog_option_String(new Runnable() {@Override public void run() {
		
		team_Link_String_Add();
	
	}}, "스페이스생성", 5, 5, 125, 45);
	
	public static Dialog_option_String 추가기능라벨            = new Dialog_option_String(new Runnable() {@Override public void run() {}}, "추가될기능", 5, 0, 125, 35);
	public static Dialog_option_String 추가기능라벨1           = new Dialog_option_String(new Runnable() {@Override public void run() {}}, "추가틸기능기능", 5, 5, 125, 45);
	
	public static Dialog_list dialog_list = new Dialog_list(0,0,125,125);

	public static Dialog_Select dialog_select = new Dialog_Select(10, 10, 125, 125);

	public static void team_Add(){
		main_panel_center.add(diary_team,BorderLayout.WEST);	
		
		diary_team.add(diary_team_string,BorderLayout.NORTH);
		diary_team_string.add(user_team_String,BorderLayout.NORTH);
		diary_team_string.add(user_my_String,BorderLayout.SOUTH);
		
		diary_team.add(diary_team_list,BorderLayout.CENTER);	
	}
	
	public static void team_Link_String_Add(){
	
		main_panel_center.remove(diary_team);
		main_panel_center.remove(diary_message);
		main_panel_center.remove(diary_table);
		main_panel_center.add(Create_table,BorderLayout.CENTER);
		main_panel_center.validate();
		main_panel_center.repaint();
		
	}
	
	BorderLayout GL_table			= new BorderLayout();
	
	public static Window_D_Panel_Table diary_table	 		 	= new Window_D_Panel_Table(GL_table,option.table_panel_x, option.other_panel_margin,main_panel.getPreferredSize().width - option.table_panel_size - (option.table_panel_x_margin *2-3)  ,  size.resize_screen_height-option.other_panel_height);	
		
	public static void table_Add(){
	
		main_panel_center.add(diary_table,BorderLayout.CENTER);	
		
	}
	
	public static Create_Project_Table Create_table	 		 	= new Create_Project_Table(option.table_panel_x, option.other_panel_margin,main_panel.getPreferredSize().width - option.table_panel_size - (option.table_panel_x_margin *2-3)  ,  size.resize_screen_height-option.other_panel_height);	
	
	public static Create_Project_Table_Label Create_main		= new Create_Project_Table_Label("새 스페이스 생성하기", 0, 5, 55, 40, 220, 40, 24.0f);
	
	public static Create_Project_Table_Label 안내텍스트 			= new Create_Project_Table_Label("스페이스이름", 0, 5, 55, 90, 260, 20, 16.0f);
	
	public static Create_Project_Table_Label 안내텍스트2 			= new Create_Project_Table_Label("스페이스위치", 0, 5, 55, 175, 260, 20, 16.0f);
	
	public static Create_Project_Table_Label_Select_Show 선택 	= new Create_Project_Table_Label_Select_Show(new Runnable() {@Override public void run() {
		dialog_select.setSize(125,85);
		dialog_list.removeAll();
		dialog_list.add(라벨텍스트체인지,BorderLayout.NORTH);
		dialog_list.add(라벨텍스트체인지2,BorderLayout.CENTER);
		
		dialog_list.repaint();
		
	}} ,"내 스페이스", 5, 0, 50, 200, 260, 40, 18.0f, true , 15);
	
	public static Create_Project_Table_Text text 				= new Create_Project_Table_Text(5, 0, 50, 115, 260, 40, 18.0f);
	
	public static Dialog_option_String 라벨텍스트체인지         		= new Dialog_option_String(new Runnable() {@Override public void run() {선택.a = "내 스페이스"; 선택.repaint();}}, "내 스페이스", 5, 5, 125, 45);
	
	public static Dialog_option_String 라벨텍스트체인지2        		= new Dialog_option_String(new Runnable() {@Override public void run() {선택.a = "팀 스페이스"; 선택.repaint();}}, "팀 스페이스", 5, 0, 125, 35);
	
	public static Create_Project_Table_Label_Select_Show 뒤로가기 	= new Create_Project_Table_Label_Select_Show(new Runnable() {@Override public void run() {뒤로가기_기능();}}, "<-", 0, 0, 10, 5, 30, 30, 20.0f, false , 10);
	
	public static Create_Project_Table_Label_Insert 생성하기 		= new Create_Project_Table_Label_Insert(new Runnable() {@Override public void run() {스페이스생성메서드();}}, "생성하기", 5, 0, 50, 260, 260, 40, 18.0f, true, 999);
	
	public static void 스페이스생성메서드() {
	
		뒤로가기_기능();
	
		System.out.println(text.getText());
		System.out.println(선택.a);
		
		text.setText(null);
		선택.a = "내 스페이스";
		
		
	};
	
	public static void create_table() {
		Create_table.add(Create_main);
		Create_table.add(뒤로가기);
		Create_table.add(안내텍스트);
		Create_table.add(선택);
		Create_table.add(안내텍스트2);
		Create_table.add(text);
		Create_table.add(생성하기);
	}
	
	
	public static void 뒤로가기_기능(){
		main_panel_center.remove(Create_table);
		main_panel_center.add(diary_team,BorderLayout.WEST);
		main_panel_center.add(diary_message,BorderLayout.EAST);
		main_panel_center.add(diary_table,BorderLayout.CENTER);
		main_panel_center.validate();
		main_panel_center.repaint();	
		message_hide();
	}
	
	
	public static Window_D_Panel_Message diary_message		= new Window_D_Panel_Message(option.message_panel_x, option.other_panel_margin, option.message_panel_size_fix, size.resize_screen_height-option.other_panel_height);
	
	public static void message_Add(){main_panel_center.add(diary_message,BorderLayout.EAST);}
	
	GridBagLayout GL_list			= new GridBagLayout();
	GridBagConstraints team_GL_list = new GridBagConstraints();

	
	
	

	
	
	
	
	
	

    //Window_interface_D.main_panel.revalidate();
}
