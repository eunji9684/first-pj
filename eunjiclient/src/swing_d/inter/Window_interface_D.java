package swing_d.inter;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;

import icon.Load_Icon;
import logic.Password_Encryption;
import run.Client_Run;
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
import swing_d.main.Window_D_Frame;
import swing_d.main.Window_D_Panel_Main;
import swing_d.main.Window_D_Panel_Resizer;
import swing_d.message.Window_D_Panel_Message;
import swing_d.size.Window_D_GraphicsEnvironment;
import swing_d.table.Window_D_Panel_Table;
import swing_d.table.Window_D_Table_Head;
import swing_d.table.Window_D_Table_Label_img;
import swing_d.table.Window_D_Table_Label_text;
import swing_d.table.Window_D_Table_Label_textfiled;
import swing_d.table.one.Window_D_Table_Center_One;
import swing_d.table.one.Window_D_Table_Center_One_Head_Textfiled;
import swing_d.team.Window_D_Label_List;
import swing_d.team.Window_D_Label_String;
import swing_d.team.Window_D_Panel_Team;
import swing_d.user.Window_D_UserAdd_Circle_btn;
import swing_d.user.Window_D_UserAdd_Label;
import swing_d.user.Window_D_UserAdd_Label2;
import swing_d.user.Window_D_UserAdd_Name;
import swing_d.user.Window_D_UserAdd_Pass;
import swing_d.user.Window_D_UserAdd_Pass1;
import swing_d.user.Window_D_UserAdd_Text;
import swing_d.user.Window_D_UserAdd_button;
import swing_d.user.Window_D_User_move_panel;



public interface Window_interface_D {

	Window_Init option = new Window_Init();
	Load_Icon iconlist = new Load_Icon();
	Client_Run 통신 = new Client_Run();
	
	public static Window_D_GraphicsEnvironment size  			= new Window_D_GraphicsEnvironment();

	public static Window_D_Frame diary_frame 					= new Window_D_Frame();

	Window_D_Panel_Main main_User_add = new Window_D_Panel_Main(null, 0,0,0,0,300,500);
	
	//Window_D_Panel_Main main_User_add = new Window_D_Panel_Main(null,	(size.resize_screen_width/2) - (option.main_size_width/2), (size.resize_screen_height / 2) - (option.main_size_height / 2),option.main_login_x,option.main_login_y, option.main_size_width, option.main_size_height);
	
	public static Window_D_User_move_panel move_user			= new Window_D_User_move_panel(null, 0, 5, 300, 40);
	
	public static Window_D_UserAdd_Circle_btn 	User_btn_x     	= new Window_D_UserAdd_Circle_btn(new Runnable() {@Override public void run() {exit();}}, "X", 20 ,265, 5, 30, 30);
	
	public static Window_D_UserAdd_Label2		User_Pass_lable_head  	= new Window_D_UserAdd_Label2("Comunico Diary", 0, 0, 13, 20, 230, 70, 25.0f);
	public static Window_D_UserAdd_Label2		User_Pass_lable_head1  	= new Window_D_UserAdd_Label2("Function 회원가입", 0, 0, 84, 35, 240, 70, 25.0f);

	public static Window_D_UserAdd_button		User_Pass_login_btn  	= new Window_D_UserAdd_button(new Runnable() {@Override public void run() {
	
		if (User_Pass_login_btn.a =="회원가입하기") {user_Add();}
		else if(User_Pass_login_btn.a == "회원가입"){ 회원가입(); };
		
	}}, "회원가입", 0, 0, 40, 450, 100 , 30, 15.0f);

	public static Window_D_UserAdd_button		User_Pass_login_btn2  	= new Window_D_UserAdd_button(new Runnable() {@Override public void run() {
		
		if (User_Pass_login_btn2.a =="로그인하러가기") {login_Add();}
		else if(User_Pass_login_btn2.a == "로그인하기"){로그인(); };
	
	}},"로그인하러가기", 0, 0, 160, 450, 100, 30, 15.0f);;
	
	public static Window_D_UserAdd_Text			User_Text 			= new Window_D_UserAdd_Text(0, 0, 50, 110, 200, 35, 20.0f);
	public static Window_D_UserAdd_Label		User_Text_labeL    	= new Window_D_UserAdd_Label("이메일을 입력해 주세요", 0, 0, 52, 128, 230, 50, 12.0f);
	public static Window_D_UserAdd_Pass			User_Pass 			= new Window_D_UserAdd_Pass(0, 0, 50, 170, 200, 35);
	public static Window_D_UserAdd_Label		User_Pass_labeL  	= new Window_D_UserAdd_Label("패스워드를 입력해 주세요", 0, 0, 52, 188, 230, 50, 12.0f);
	public static Window_D_UserAdd_Pass1		User_Pass1			= new Window_D_UserAdd_Pass1(0, 0, 50, 230, 200, 35);
	public static Window_D_UserAdd_Label		User_Pass_labeL1  	= new Window_D_UserAdd_Label("패스워드를 입력해 주세요", 0, 0, 52, 248, 230, 50, 12.0f);
	public static Window_D_UserAdd_Name			User_name 			= new Window_D_UserAdd_Name(0, 0, 50, 290, 200, 35, 20.0f);
	public static Window_D_UserAdd_Label		User_name_labeL    	= new Window_D_UserAdd_Label("호칭을 입력해 주세요", 0, 0, 52, 308, 230, 50, 12.0f);
	
	public static Window_D_UserAdd_Label		labeL_로그인결과통보    = new Window_D_UserAdd_Label("", 0, 0, 30, 350, 320, 50, 14.0f);
	
	public static void user_Add() {
		main_User_add.removeAll();
		diary_frame.setSize(300,500);
		diary_frame.getContentPane().setLayout(null);
		diary_frame.getContentPane().add(main_User_add);
		main_User_add.add(User_Pass_login_btn2);
	    main_User_add.add(User_Pass_login_btn);
		main_User_add.add(move_user);
		
		labeL_로그인결과통보.a = "";
		labeL_로그인결과통보.repaint();
		User_Text.setText(null);
		User_Pass.setText(null);
		User_Pass1.setText(null);
		User_name.setText(null);
		
		User_Text.pass = false;
		User_Pass.pass = false;
		User_Pass1.pass = false;
		User_name.pass = false;
		
		User_Pass_login_btn2.a = "로그인하러가기";
		User_Pass_login_btn2.repaint();
		
		User_Pass_login_btn.a = "회원가입";
		User_Pass_login_btn.repaint();
		
		User_Pass_lable_head1.a = "Function 회원가입";
		User_Pass_lable_head1.repaint();
		
		main_User_add.add(User_Pass_lable_head);
		main_User_add.add(User_Pass_lable_head1);
		main_User_add.add(User_Pass_lable_head);
		move_user.add(User_btn_x);
		main_User_add.add(User_Text);
		main_User_add.add(User_Text_labeL);
		main_User_add.add(User_name);
		main_User_add.add(User_name_labeL);
		main_User_add.add(User_Pass);
		main_User_add.add(User_Pass_labeL);
		main_User_add.add(User_Pass1);
		main_User_add.add(User_Pass_labeL1);
		main_User_add.add(labeL_로그인결과통보);
		main_User_add.repaint();
	}
	
	
	public static void login_Add() {
		main_User_add.removeAll();		
		diary_frame.setSize(300,500);
		diary_frame.getContentPane().setLayout(null);
		diary_frame.getContentPane().add(main_User_add);

		labeL_로그인결과통보.a = "";
		labeL_로그인결과통보.repaint();
		User_Text.setText(null);
		User_Pass.setText(null);
		User_Pass1.setText(null);
		User_name.setText(null);
		
		User_Text.pass = false;
		User_Pass.pass = false;
		User_Pass1.pass = false;
		User_name.pass = false;
		
		User_Text_labeL.a = "로그인 할 이메일을 입력해 주세요";
		User_Pass_labeL.a = "로그인 할 계정의 패스워드를 입력해 주세요";
		
		User_Pass_login_btn2.a = "로그인하기";
		User_Pass_login_btn2.repaint();
		
		User_Pass_login_btn.a = "회원가입하기";
		User_Pass_login_btn.repaint();
		
		User_Pass_lable_head1.a = "Function 로그인";
		User_Pass_lable_head1.repaint();
		
		move_user.add(User_btn_x);
		main_User_add.add(User_Pass_login_btn2);
	    main_User_add.add(User_Pass_login_btn);
		main_User_add.add(move_user);
		main_User_add.add(User_Pass_lable_head);
		main_User_add.add(User_Pass_lable_head1);
		main_User_add.add(User_Text);
		main_User_add.add(User_Text_labeL);
		main_User_add.add(User_Pass);
		main_User_add.add(User_Pass_labeL);
		main_User_add.add(labeL_로그인결과통보);
		main_User_add.repaint();

	}
	
	public static void 회원가입() {
		
		String email = null;
		String name  = null; 
		String pass  = null;
		String message = "를 입력해 주세요";
		
 		
		if (User_Text.pass == true) {
			email = User_Text.getText(); 
		}
		else {
			message = "아이디 " + message; 
		}
		;
		if (User_name.pass == true) {
			name = User_name.getText(); 
		}
		else {
			message = "호칭 " + message;
			
		}
		;
		if (User_Pass.pass == true && User_Pass1.pass == true) {
			pass = User_Pass.getText(); 
		}
		else {
			message = "패스워드 " + message;
		}
		;
		
		if(email != null && name != null && pass != null) {
			
			try {
				통신.send("useradd"+","+email+","+ Password_Encryption.hashPassword(pass, Password_Encryption.salt)+","+ name);
				System.out.println("클라이언트가 서버에 회원가입을 시도합니다. 소켓생성, 데이터입력");
			} 
			
			catch (NoSuchAlgorithmException e) {
				System.out.println(e.getMessage());
				System.out.println("암호화에 에러가 발생했습니다.");
			}
			
		}
		else {
			labeL_로그인결과통보.a = message;
			labeL_로그인결과통보.repaint();
			
			return;
		}
	}
	

	
public static void 로그인() {
		
		String email = null;
		String pass  = null;
		String message = "이 비어있거나 정확하지 않습니다.";
		
 		
		if (User_Text.pass == true) {
			email = User_Text.getText(); 
		}
		else {
			message = "이메일 " + message; 
		};
	
		if (User_Pass.pass == true) {
			pass = User_Pass.getText(); 
		}
		
		else {
			message = "패스워드 " + message; 
		};
		
		if(email != null && pass != null) {
			
			try {
				통신.send("check"+","+email+","+ Password_Encryption.hashPassword(pass, Password_Encryption.salt));
				labeL_로그인결과통보.a = "로그인 시도중입니다.";
				labeL_로그인결과통보.repaint();
				System.out.println("클라이언트가 서버에 로그인을 시도합니다. 소켓생성, 데이터입력");
			} 
			
			catch (NoSuchAlgorithmException e) {
				System.out.println(e.getMessage());
				System.out.println("암호화에 에러가 발생했습니다.");
			}
			
		}
		else {
			labeL_로그인결과통보.a = message;
			labeL_로그인결과통보.repaint();
			
			return;
		}
	}

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
		목록테이블.setPreferredSize(new Dimension(main_panel.getSize().width - option.table_panel_size - (option.table_panel_x_margin)  ,main_panel.getHeight()-option.other_panel_height));
		
		diary_frame.repaint();
};
	
	public static Window_D_Panel_Center main_panel_center	= new Window_D_Panel_Center(new BorderLayout(option.main_panel_center_border_layout_x,option.main_panel_center_border_layout_y),	option.main_panel_center_x, option.main_panel_center_y, size.resize_screen_width, size.resize_screen_height);

	
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
	
	public static void exit() {
		diary_frame.removeAll();
		list_clear(); System.exit(0);};
	
	public static Window_D_Label_Circle btn_ㅁ	 			= new Window_D_Label_Circle(new Runnable() {@Override public void run() {max_min();}},"ㅁ",  0, 0, option.btn_size, option.btn_size);
	
	public static void max_min() {
		
		if(	diary_frame.getWidth() == (int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[1]))) {
			option.main_panel_border_rownd = true;
			
			diary_frame.setSize((int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[1])/ 1.2f),(int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[2])/ 1.2f - size.작업표시줄_사이즈));
			main_panel.setSize((int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[1])/ 1.2f),(int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[2])/ 1.2f- size.작업표시줄_사이즈));
			main_panel.revalidate();
			
			diary_team.setPreferredSize(new Dimension(option.team_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			diary_message.setPreferredSize(new Dimension(option.message_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			목록테이블.setPreferredSize(new Dimension(main_panel.getSize().width - option.table_panel_size - (option.table_panel_x_margin)  ,main_panel.getHeight()-option.other_panel_height));
			
			/*diary_frame.setExtendedState(diary_frame.NORMAL);*/

			diary_frame.repaint();
		}
		else {

			/*diary_frame.setExtendedState(diary_frame.MAXIMIZED_BOTH);*/
			option.main_panel_border_rownd = false;
			diary_frame.setSize((int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[1])),(int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[2]) - size.작업표시줄_사이즈));
			main_panel.setSize((int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[1])),(int)(Double.parseDouble(size.size.get(size.화면사이즈_업데이트())[2]) - size.작업표시줄_사이즈));
			main_panel.revalidate();
			
			diary_team.setPreferredSize(new Dimension(option.team_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			diary_message.setPreferredSize(new Dimension(option.message_panel_size_fix,main_panel.getHeight()-option.other_panel_height));
			목록테이블.setPreferredSize(new Dimension(main_panel.getSize().width - option.table_panel_size - (option.table_panel_x_margin)  ,main_panel.getHeight()-option.other_panel_height));
			
			diary_frame.repaint();
		}
	}
	
	public static Window_D_Label_Circle btn_ㅡ	 			= new Window_D_Label_Circle(new Runnable() {@Override public void run() {hide();}},"ㅡ", 0, 0, option.btn_size, option.btn_size);
	
	public static void hide() {/*diary_frame.setExtendedState(diary_frame.ICONIFIED);*/}
	
	GridBagConstraints head_GL_Label1 = new GridBagConstraints();
	GridBagConstraints head_GL_Label2 = new GridBagConstraints();
	GridBagConstraints head_GL_Label3 = new GridBagConstraints();

	public static void head_Add(){
	
		main_panel_center.add(diary_head,BorderLayout.NORTH);
		diary_head.add(btn_x, option.GL_label(head_GL_Label1, 8, 0, 0, 0, 0, 0));  //TOP, LEFT , DOWN ,RIGHT
		diary_head.add(btn_ㅁ, option.GL_label(head_GL_Label2, 7, 0, 0, 0, 0, 0));
		diary_head.add(btn_ㅡ, option.GL_label(head_GL_Label3, 6, 0, 0, 0, 0, 0));
				
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
		main_panel_center.remove(목록테이블);
		main_panel_center.add(Create_table,BorderLayout.CENTER);
		main_panel_center.validate();
		main_panel_center.repaint();
		
	}

	public static Window_D_Panel_Table 목록테이블	 		 	    = new Window_D_Panel_Table(new BorderLayout(),option.table_panel_x, option.other_panel_margin,main_panel.getPreferredSize().width - option.table_panel_size - (option.table_panel_x_margin *2-3)  ,  size.resize_screen_height-option.other_panel_height);	
	public static Window_D_Table_Head table_head 				= new Window_D_Table_Head(0, 0, 5, 0, 1000, 150, 15);
	public static Window_D_Table_Center_One table_center 		= new Window_D_Table_Center_One	(null,0, 0, 5, 0, 1000, 150, 15);
	public static Window_D_Table_Label_img table_icon 			= new Window_D_Table_Label_img(iconlist.iconsList.get(0), 0, 0, 30, 24, 66, 66, 20);
	public static Window_D_Table_Label_textfiled table_filed	= new Window_D_Table_Label_textfiled("Diary_Project", 0, 0, 115, 35, 200, 50, 20f);
	
	public static Window_D_Table_Label_text 개요 					= new Window_D_Table_Label_text("개요"		, 0, 0,  10, 105, 80, 35, 17.0f,true);
	public static Window_D_Table_Label_text 목록 					= new Window_D_Table_Label_text("목록"		, 0, 0, 90, 105, 80, 35, 17.0f,false);
	public static Window_D_Table_Label_text 보드 					= new Window_D_Table_Label_text("보드"		, 0, 0, 170, 105, 80, 35, 17.0f,false);
	public static Window_D_Table_Label_text 타임라인 				= new Window_D_Table_Label_text("타임라인"		, 0, 0, 250, 105, 80, 35, 17.0f,false);
	public static Window_D_Table_Label_text 캘린더 				= new Window_D_Table_Label_text("캘린더"		, 0, 0, 330, 105, 80, 35, 17.0f,false);
	public static Window_D_Table_Label_text 가계부 				= new Window_D_Table_Label_text("가계부"		, 0, 0, 410, 105, 80, 35, 17.0f,false);
	
	public static void focuse(String a) {
		
		switch (a) {
			case "개요":
				개요.line = true;
				목록.line = false;
				보드.line = false;
				타임라인.line = false;
				캘린더.line = false;
				가계부.line = false;
				개요.repaint();
				목록.repaint();
				보드.repaint();
				타임라인.repaint();
				캘린더.repaint();
				가계부.repaint();
				
				break;
			case "목록":
				개요.line = false;
				목록.line = true;
				보드.line = false;
				타임라인.line = false;
				캘린더.line = false;
				가계부.line = false;
				개요.repaint();
				목록.repaint();
				보드.repaint();
				타임라인.repaint();
				캘린더.repaint();
				가계부.repaint();
				break;
			case "보드":
				개요.line = false;
				목록.line = false;
				보드.line = true;
				타임라인.line = false;
				캘린더.line = false;
				가계부.line = false;
				개요.repaint();
				목록.repaint();
				보드.repaint();
				타임라인.repaint();
				캘린더.repaint();
				가계부.repaint();
				break;
			case "타임라인":
				개요.line = false;
				목록.line = false;
				보드.line = false;
				타임라인.line = true;
				캘린더.line = false;
				가계부.line = false;
				개요.repaint();
				목록.repaint();
				보드.repaint();
				타임라인.repaint();
				캘린더.repaint();
				가계부.repaint();
				break;
			case "캘린더":
				개요.line = false;
				목록.line = false;
				보드.line = false;
				타임라인.line = false;
				캘린더.line = true;
				가계부.line = false;
				개요.repaint();
				목록.repaint();
				보드.repaint();
				타임라인.repaint();
				캘린더.repaint();
				가계부.repaint();
				break;
			case "가계부":
				개요.line = false;
				목록.line = false;
				보드.line = false;
				타임라인.line = false;
				캘린더.line = false;
				가계부.line = true;
				개요.repaint();
				목록.repaint();
				보드.repaint();
				타임라인.repaint();
				캘린더.repaint();
				가계부.repaint();
				break;

		default:
			break;
		}
	}
	
	public static ArrayList<ArrayList<Window_D_Table_Center_One_Head_Textfiled>> 최종리스트 = new ArrayList<>();
	public static ArrayList<Integer> row = new ArrayList();
	public static ArrayList<Integer> colum = new ArrayList();
	public static ArrayList<String> 이름리스트 = new ArrayList();
	
	public static void list_clear() {
		row.clear();
		colum.clear();
		이름리스트.clear();
		최종리스트.clear();
		목록테이블.removeAll();
	};
	
	public static Create_Project_Table_Label_Select_Show 행열추가선택 = new Create_Project_Table_Label_Select_Show(new Runnable() {
		
		@Override
		public void run() {
	
			dialog_select.setSize(125,125);
			dialog_list.removeAll();
			dialog_list.add(행추가하기,BorderLayout.NORTH);
			dialog_list.add(열추가하기,BorderLayout.CENTER);
			dialog_list.add(잠깐쓰는옵션,BorderLayout.SOUTH);
			
			dialog_list.repaint();
			
		}
	}, "행추가", 0, 0, 15, 15, 40, 40, 18.0f, true, 999);
	
	public static Dialog_option_String 행추가하기         		= new Dialog_option_String(new Runnable() {@Override public void run() {row_add(); 행열추가선택.repaint(); row_colum_list_create(); }}, "행 추가하기", 5, 5, 125, 45);
	
	public static Dialog_option_String 열추가하기        		= new Dialog_option_String(new Runnable() {@Override public void run() {colum_add(); 행열추가선택.repaint(); row_colum_list_create();}}, "열 추가하기", 5, 0, 125, 35);
	
	public static Dialog_option_String 잠깐쓰는옵션       		= new Dialog_option_String(new Runnable() {@Override public void run() {list_print(); 행열추가선택.repaint();}}, "콘솔에리스트출력", 5, 5, 125, 35);
	

	public static void list_print() {
		
		
		for (int i = 0; i < row.size(); i++) {
			for(int j = 0; j < colum.size(); j++) {				
				
			
			}
		}
		
	}
	
	public static void list_Add(){
			
			row.add(100);
			
			colum.add(30);
			
			row_colum_list_create();
	}
	
	public static void row_colum_list_create() {
		table_center.removeAll();
		table_center.add(행열추가선택);
		최종리스트.clear();
		
		for (int i = 0; i < row.size(); i++) {
			
			ArrayList<Window_D_Table_Center_One_Head_Textfiled> 행리스트= new ArrayList<>();
			
			int 최초_x = 30;
			int 최초_y = 60 + (30*(i+1));
			
			for(int j = 0; j < colum.size(); j++) {
	
				if(i == 0) {
				
					if (j == 0) {
						행리스트.add(new Window_D_Table_Center_One_Head_Textfiled("test", i, j, 0, 2, 최초_x , 최초_y, row.get(i), 30, 20.0f,1));
					}
			
					else {
						최초_x += row.get(i);	
						행리스트.add(new Window_D_Table_Center_One_Head_Textfiled("test", i, j, 0, 2, 최초_x , 최초_y, row.get(i), 30, 20.0f,1));
					}
				}
				else {
					
					if (j == 0) {
						행리스트.add(new Window_D_Table_Center_One_Head_Textfiled("test", i, j, 0, 0, 최초_x , 최초_y, row.get(i), 30, 15.0f,1));
					}
			
					else {
						최초_x += row.get(i);	
						행리스트.add(new Window_D_Table_Center_One_Head_Textfiled("test", i, j, 0, 0, 최초_x , 최초_y, row.get(i), 30, 15.0f,1));
					}
					
				}
				
					

			
			}
			최종리스트.add(행리스트);
		}
		

		for (int i = 0; i < row.size(); i++) {
			for(int j = 0; j < colum.size(); j++) {
				table_center.add(최종리스트.get(i).get(j));				
			}
		}
	}
	
	public static void row_add() {row.add(100);	table_center.repaint();};
	
	public static void colum_add() {colum.add(30); table_center.repaint();};
	
	public static void table_Add(){
	
		main_panel_center.add(목록테이블,BorderLayout.CENTER);	
		목록테이블.add(table_head,BorderLayout.NORTH);
		목록테이블.add(table_center,BorderLayout.CENTER);
		table_head.add(table_icon);
		table_head.add(table_filed);
		table_head.add(개요);
		table_head.add(목록);
		table_head.add(보드);
		table_head.add(타임라인);
		table_head.add(캘린더);
		table_head.add(가계부);
		table_center.add(행열추가선택);
		list_Add();
		table_center.repaint();

	
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
		main_panel_center.add(목록테이블,BorderLayout.CENTER);
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
