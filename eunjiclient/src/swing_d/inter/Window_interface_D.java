package swing_d.inter;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.SwingConstants;

import icon.Load_Icon;
import logic.Password_Encryption;
import movecomu.Comudia;
import movecomu.IconMovement;
import movecomu.QuoteEx;
import run.Client_Run;
import swing_d.accountbook.황은지_Accountbook;
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
import swing_d.table.calender.CalendarMain;
import swing_d.table.calender.Window_D_Table_Center_Calender_Dialog;
import swing_d.table.list.Dialog_list_panel;
import swing_d.table.list.Move_label;
import swing_d.table.list.Move_label2;
import swing_d.table.list.Window_D_Table_Center_One;
import swing_d.table.list.Window_D_Table_Center_Text_Dialog;
import swing_d.table.list.Window_D_Table_Center_Text_Dialog2;
import swing_d.table.list.Window_D_Table_Center_Text_Dialog3;
import swing_d.table.list.Window_D_Table_Center_Text_Dialog4;
import swing_d.table.list.Window_D_Table_Center_Text_Dialog5;
import swing_d.table.list.Window_D_Table_Center_Text_Dialog6;
import swing_d.table.list.Window_D_Table_Lable_Filed;
import swing_d.table.list.Window_D_Table_Lable_Filed2;
import swing_d.table.list.Window_D_Table_Lable_Filed3;
import swing_d.table.list.Window_D_Table_Lable_Filed4;
import swing_d.table.list.Window_D_Table_Lable_Filed5;
import swing_d.table.list.Window_D_Table_Text_Filed;
import swing_d.table.list.Window_D_Table_Text_Filed2;
import swing_d.table.list.Window_D_Table_West_Add;
import swing_d.table.list.Window_D_Table_West_West_Add;
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

	Window_D_Panel_Main main_User_add = new Window_D_Panel_Main(null, 0,0,0,0, 300, 500);

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
		
		diary_frame.setLocation((size.resize_screen_width/2) - (option.main_size_width/2), (size.resize_screen_height / 2) - (option.main_size_height / 2));
		diary_frame.getContentPane().setLayout(new BorderLayout());
		diary_frame.getContentPane().add(main_User_add, BorderLayout.CENTER);
		
		main_User_add.add(User_Pass_login_btn2);
	    main_User_add.add(User_Pass_login_btn);
		main_User_add.add(move_user);
		
		labeL_로그인결과통보.a = "";
		labeL_로그인결과통보.repaint();
		User_Text.setText(null);
		User_Pass.setText(null);
		User_Pass1.setText(null);
		User_name.setText(null);
		
		
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
		
		main_User_add.add(User_name );
		main_User_add.add(User_name_labeL);
		
		main_User_add.add(User_Pass);
		main_User_add.add(User_Pass_labeL);
		main_User_add.add(User_Pass1);
		main_User_add.add(User_Pass_labeL1);
		main_User_add.add(labeL_로그인결과통보);
		main_User_add.repaint();
		
		User_Text.key = true;
		User_Pass.key = true;
		User_Pass1.key = true;
		User_name.key = true;
		
		main_User_add.repaint();
		User_Text.repaint();
		User_Pass.repaint();
		User_Pass.repaint();
		User_name.repaint();
	}
	
	
	public static void login_Add() {
		main_User_add.removeAll();		
		diary_frame.setSize(1200,500);
		diary_frame.getContentPane().setLayout(null);
		diary_frame.getContentPane().add(main_User_add);
		diary_frame.setLocation((size.resize_screen_width/2) - (option.main_size_width/2), (size.resize_screen_height / 2) - (option.main_size_height / 2));
		diary_frame.add(new Comudia());
		QuoteEx  quote = new QuoteEx();
		quote.setFont(new Font("Nanum Pen", Font.BOLD | Font.ITALIC, 40));
		quote.setHorizontalAlignment(SwingConstants.LEFT);

		quote.setBounds(101, 686, 1329, 152);
		diary_frame.add(quote);

		IconMovement imu = new IconMovement();
		  // Start the animation
		//diary_frame.add(imu);
	    //imu.startAnimation();

		diary_frame.setVisible(true);
		
		labeL_로그인결과통보.a = "";
		labeL_로그인결과통보.repaint();
		User_Text.setText(null);
		User_Pass.setText(null);
		User_Pass1.setText(null);
		User_name.setText(null);
		

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
		
		User_Text.key = true;
		User_Pass.key = true;
		User_Pass1.key = true;
		User_name.key = true;
		
		main_User_add.repaint();
		User_Text.repaint();
		User_Pass.repaint();
		User_Pass.repaint();
		User_name.repaint();

	}
	
	public static void 로그인_처리(){
		
		diary_frame.setSize(size.resize_screen_width, size.resize_screen_height);
		diary_frame.getContentPane().removeAll();
		diary_frame.setLocation(0,0);
		
    	Window_interface_D.message_Add();
		Window_interface_D.create_table();
		Window_interface_D.team_Add();
		Window_interface_D.table_Add();
		Window_interface_D.panel_Add();
		Window_interface_D.head_Add();

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
				labeL_로그인결과통보.a = "로그인 시도중입니다.";
				labeL_로그인결과통보.repaint();
				
				통신.send("check"+","+email+","+ Password_Encryption.hashPassword(pass, Password_Encryption.salt));
				
				System.out.println("클라이언트가 서버에 로그인을 시도합니다. 소켓생성, 데이터입력");
			} 
			
			catch (NoSuchAlgorithmException e) {
				//System.out.println(e.getMessage());
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
	
	public static Window_D_Label_Move btn_move_team			= new Window_D_Label_Move(new Runnable() {@Override public void run() {team_hide();}},"T", 19, 19);
	public static Window_D_Label_Move btn_move_message		= new Window_D_Label_Move(new Runnable() {@Override public void run() {message_hide();}},"M", 19, 19);
	
	
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
		System.exit(0);};
	
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
			목록테이블.setPreferredSize(new Dimension(main_panel.getSize().width - option.table_panel_size - (option.table_panel_x_margin)  ,main_panel.getHeight()-option.other_panel_height));
			
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
		diary_head.add(btn_x, option.GL_label(head_GL_Label1, 8, 0, 0, 0, 0, 0));  //TOP, LEFT , DOWN ,RIGHT
		diary_head.add(btn_ㅁ, option.GL_label(head_GL_Label2, 7, 0, 0, 0, 0, 0));
		diary_head.add(btn_ㅡ, option.GL_label(head_GL_Label3, 6, 0, 0, 0, 0, 0));
				
		diary_head.add(btn_move_team, option.GL_label(head_GL_Label1, 1, 0, 0, 0, 0, 0));  //TOP, LEFT , DOWN ,RIGHT
		diary_head.add(btn_move_message, option.GL_label(head_GL_Label3, 2, 0, 0, 0, 0, 0));
	}
	
	
	public static void focuse(String a) {
		
		switch (a) {
			case "목록":
				move.size = "list";
				move1.size = "list";
				목록.line = true;
				목록.repaint();
				타임라인.line = false;
				타임라인.repaint();
				캘린더.line = false;
				캘린더.repaint();
				가계부.line = false;
				가계부.repaint();
				break;
			case "타임라인":
				move.size = "timeline";
				move1.size = "timeline";
				목록.line = false;
				목록.repaint();
				타임라인.line = true;
				타임라인.repaint();
				캘린더.line = false;
				캘린더.repaint();
				가계부.line = false;
				가계부.repaint();
				break;
			case "캘린더":
				move.size = "calender";
				move1.size = "calender";
				
				목록.line = false;
				목록.repaint();				
				타임라인.line = false;
				타임라인.repaint();
				캘린더.line = true;
				캘린더.repaint();
				가계부.line = false;
				가계부.repaint();
				break;
			case "가계부":
				move.size = "accountbook";
				move1.size = "accountbook";
				목록.line = false;
				목록.repaint();
				타임라인.line = false;
				타임라인.repaint();
				캘린더.line = false;
				캘린더.repaint();
				가계부.line = true;
				가계부.repaint();
				break;
		default:
			break;
		}
	}
	
	
	public static Window_D_Panel_Table 목록테이블	 		 	    = new Window_D_Panel_Table(new BorderLayout(),option.table_panel_x, option.other_panel_margin,main_panel.getPreferredSize().width - option.table_panel_size - (option.table_panel_x_margin *2-3)  ,  size.resize_screen_height-option.other_panel_height);	
	public static Window_D_Table_Head table_head 				= new Window_D_Table_Head(0, 0, 5, 0, 1000, 150, 15);
	public static Window_D_Table_Label_img table_icon 			= new Window_D_Table_Label_img(iconlist.iconsList.get(0), 0, 0, 30, 24, 66, 66, 20);
	public static Window_D_Table_Label_textfiled table_filed	= new Window_D_Table_Label_textfiled("Diary_Project", 0, 0, 115, 35, 200, 50, 20f);
	public static Window_D_Table_Label_text 목록 					= new Window_D_Table_Label_text(new Runnable() {@Override public void run() {목록_불러오기();}}, "목록"		, 0, 0,  10, 105, 80, 35, 17.0f,true);
	
	public static  황은지_Accountbook 황은지 = new 황은지_Accountbook();
	public static void 목록_불러오기() {
		
		table_center_center.removeAll();
		table_center_center.setLayout(null);
		리스트_업로드();
		table_center_center.repaint();
		
	}
	
	public static void 가계부_불러오기() {
		
		table_center_center.removeAll();
		
		가계부_업로드();
		table_center_center.repaint();
		
	}
	
	
	public static void 가계부_업로드() {
		
		
		table_center_center.add(황은지);
		
	}
	public static void 캘린더_불러오기() {
		
		table_center_center.removeAll();
		table_center_center.setLayout(null);
		table_center_center.repaint();
		
	}
	
	public static void 타임라인_불러오기() {
		
		table_center_center.removeAll();
		table_center_center.repaint();
		
	}
	
	
	public static Window_D_Table_Center_One table_center 			= new Window_D_Table_Center_One	(true);
	public static Window_D_Table_Center_One table_center_main 		= new Window_D_Table_Center_One	(false);
	public static Move_label move = new Move_label(0,22);
	public static Move_label2 move1 = new Move_label2(22,0);
	
	public static Window_D_Table_West_West_Add table_center_center	= new Window_D_Table_West_West_Add();
	
	public static void table_Add(){
		main_panel_center.add(목록테이블,BorderLayout.CENTER);	
		목록테이블.add(table_head,BorderLayout.NORTH);
		목록테이블.add(table_center,BorderLayout.CENTER);
		table_center.add(table_center_center,BorderLayout.CENTER);
		
		table_center.add(move,BorderLayout.SOUTH);
		table_center.add(move1,BorderLayout.EAST);
		
		table_head.add(table_icon);
		table_head.add(table_filed);
		table_head.add(목록);
		table_head.add(가계부);
		table_head.add(캘린더);
		table_head.add(타임라인);

		리스트_추가하기();
		리스트_업로드();
	}
	

		
	public static Create_Project_Table Create_table	 		 	= new Create_Project_Table(option.table_panel_x, option.other_panel_margin,main_panel.getPreferredSize().width - option.table_panel_size - (option.table_panel_x_margin *2-3)  ,  size.resize_screen_height-option.other_panel_height);	
	
	public static Create_Project_Table_Label Create_main		= new Create_Project_Table_Label("새 스페이스 생성하기", 0, 5, 55, 40, 220, 40, 24.0f);
	
	public static Create_Project_Table_Label 안내텍스트 			= new Create_Project_Table_Label("스페이스이름", 0, 5, 55, 90, 260, 20, 16.0f);
	
	public static Create_Project_Table_Label 안내텍스트2 			= new Create_Project_Table_Label("스페이스위치", 0, 5, 55, 175, 260, 20, 16.0f);
	
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
	
	
	GridBagLayout GL_list			= new GridBagLayout();
	GridBagConstraints team_GL_list = new GridBagConstraints();

	
	/* 하단부터 다이얼로그와 관계된 메서드와 클래스 모음입니다. */
	public static Dialog_option_String 페이지생성    = new Dialog_option_String(new Runnable() {@Override public void run() {team_Link_String_Add();}}, "스페이스생성", 5, 5, 5, 5, 125, 45);
	public static Dialog_list dialog_list = new Dialog_list();
	public static Dialog_Select dialog_select = new Dialog_Select(10, 10, 125, 125);
	public static void team_Link_String_Add(){
		
		main_panel_center.remove(diary_team);
		main_panel_center.remove(diary_message);
		main_panel_center.remove(목록테이블);
		main_panel_center.add(Create_table,BorderLayout.CENTER);
		main_panel_center.validate();
		main_panel_center.repaint();
		
	}
	
	public static Window_D_Table_Text_Filed text_filed =  new Window_D_Table_Text_Filed();
	public static Window_D_Table_Text_Filed2 text_filed2 =  new Window_D_Table_Text_Filed2();
	
	public static Dialog_option_String 행추가하기 = new Dialog_option_String(new Runnable() {@Override public void run() { 행_추가하기(); 리스트_업로드();}}, "행 추가하기", 0, 0, 5, 0, 125, 35);
	public static Dialog_option_String 행삭제하기 = new Dialog_option_String(new Runnable() {@Override public void run() { }}, "행 삭제하기", 0, 0, 5, 0, 125, 35);
	public static Dialog_option_String 열추가하기 = new Dialog_option_String(new Runnable() {@Override public void run() { message_hide(); 열_생성();}}, "열 추가하기", 0, 0, 5, 0, 125, 35);
	public static Dialog_option_String 열삭제하기 = new Dialog_option_String(new Runnable() {@Override public void run() { }}, "열 삭제하기", 0, 0, 5, 0, 125, 35);
	
	public static Dialog_list_panel 행_열_추가하기패널 = new Dialog_list_panel();
	public static Window_D_Table_Center_Text_Dialog2 dialog_행_열_add = new Window_D_Table_Center_Text_Dialog2(0, 0, 125, 165);
	
	public static Window_D_Table_Center_Text_Dialog dialog_text = new Window_D_Table_Center_Text_Dialog(0, 0, 300, 30);
	
	public static Window_D_Table_Center_Text_Dialog3 열_생성_데이터수정 = new Window_D_Table_Center_Text_Dialog3(0, 0, 260, 35);
	
	public static Window_D_Table_Lable_Filed2 제목 = new Window_D_Table_Lable_Filed2(5,10,"생성할 열의 제목을 입력해 주세요");
	
	public static Window_D_Table_Lable_Filed3 텍스트 = new Window_D_Table_Lable_Filed3(5,30,200,30,"String");
	public static Window_D_Table_Lable_Filed3 인트 = new Window_D_Table_Lable_Filed3(5,60,200,30,"int");
	public static Window_D_Table_Lable_Filed3 사용자 = new Window_D_Table_Lable_Filed3(5,90,200,30,"담당자");
	public static Window_D_Table_Lable_Filed3 날짜 = new Window_D_Table_Lable_Filed3(5,120,200,30,"Date");
	public static Window_D_Table_Lable_Filed3 분류 = new Window_D_Table_Lable_Filed3(5,90,200,30,"Select");
	
	/*여기*/
	
	public static ArrayList<String> 분류명칭 = new ArrayList<>();
	public static ArrayList<String> 담당자명칭 = new ArrayList<>();

	public static void 기본명칭추가(){
		
		담당자명칭.add("김한규 아라리");
		담당자명칭.add("조동리 데스티니");
		담당자명칭.add("자수로 슈퍼맨");
		담당자명칭.add("이칠로 나가신다");
		담당자명칭.add("칸칸칸 길비켜라");
		
	}
	
	public static void 기본분류추가(){
		
		분류명칭.add("예금");
		분류명칭.add("적금");
		분류명칭.add("수입");
		분류명칭.add("지출");
		분류명칭.add("위시리스트");
		
	}
	public static Window_D_Table_Center_Text_Dialog6 담당자선택 = new Window_D_Table_Center_Text_Dialog6();
	public static Window_D_Table_Center_Text_Dialog5 분류선택 = new Window_D_Table_Center_Text_Dialog5();
	

	public static void 디스포지(){
		열_생성_타입지정.dispose();
		달력생성.dispose();
		분류선택.dispose();
		dialog_text.dispose();
		dialog_행_열_add.dispose();
		열_생성_데이터수정.dispose();
		담당자선택.dispose();
	}


	public static Window_D_Table_Lable_Filed4 열_생성_타입지정_클릭 = new Window_D_Table_Lable_Filed4(5,50,260,30,"타입을 지정해 주세요");
	public static Window_D_Table_Lable_Filed5 열_생성 = new Window_D_Table_Lable_Filed5(5,50,260,30,"생성");
	
	public static Window_D_Table_Center_Text_Dialog4 열_생성_타입지정 = new Window_D_Table_Center_Text_Dialog4(0, 0, 260, 60);
	
	
	public static CalendarMain 달력패널 = new CalendarMain();
	public static Window_D_Table_Center_Calender_Dialog 달력생성 = new Window_D_Table_Center_Calender_Dialog(0, 0, 300, 300);
	
	public static Window_D_Panel_Center main_panel_center	= new Window_D_Panel_Center(new BorderLayout(option.main_panel_center_border_layout_x,option.main_panel_center_border_layout_y),	option.main_panel_center_x, option.main_panel_center_y, size.resize_screen_width, size.resize_screen_height);
	public static Window_D_Panel_Message diary_message		= new Window_D_Panel_Message(option.message_panel_x, option.other_panel_margin, option.message_panel_size_fix, size.resize_screen_height-option.other_panel_height);
	
	public static Window_D_Table_West_Add message_center = new Window_D_Table_West_Add(1,1);
	
	public static void message_Add(){
		
		main_panel_center.add(diary_message,BorderLayout.EAST);
		diary_message.add(message_center);
		
	}
	
	public static void 열_생성() {
		message_center.removeAll();
		열_고점뽑아내기();
		message_center.add(제목);
		message_center.add(열_생성_타입지정_클릭);
		message_center.add(열_생성);
		message_center.validate();
	}
	
	public static void 열_삭제(int 행, int 열, int x_location, int y_location, int width, int height, String a, float font_size, String type) {
		
		ArrayList<String[]> 배열 = new ArrayList();
		
		//리스트에 있는 특정 열 값을 제외하고 다른 배열에 담습니다.
		for (int i = 0; i < 리스트.size(); i++) {
			
			if (Integer.parseInt(리스트.get(i)[1]) == 열) {}
		
			else {
			
				배열.add(리스트.get(i));	
			}
			
		}
		
		리스트.clear();
		
		//새로운 리스트를 돌면서 값을 변경합니다. 
		for (int i = 0; i < 배열.size(); i++) {
			
			if (Integer.parseInt(배열.get(i)[1]) > 열) {
				
				String[] 배열1 = {
						배열.get(i)[0],
						String.valueOf((Integer.parseInt(배열.get(i)[1]) -1)) ,
						String.valueOf((Integer.parseInt(배열.get(i)[2]) - x_location)),
						배열.get(i)[3],
						String.valueOf((Integer.parseInt(배열.get(i)[4]) - width)),
						배열.get(i)[5],
						배열.get(i)[6],
						배열.get(i)[7]
				};
				
				리스트.add(i,배열1);
				
			}
		
			else {
				
				String[] 배열1 = {
						배열.get(i)[0],
						배열.get(i)[1],
						배열.get(i)[2],
						배열.get(i)[3],
						배열.get(i)[4],
						배열.get(i)[5],
						배열.get(i)[6],
						배열.get(i)[7]
				};
				
				리스트.add(i,배열1);
			
			}
			
		}
	
	}

	
	public static void 행_삭제(int 행, int 열, int x_location, int y_location, int width, int height, String a, float font_size, String type) {
		
		ArrayList<String[]> 배열 = new ArrayList();
		
		//리스트에 있는 특정 열 값을 제외하고 다른 배열에 담습니다.
		for (int i = 0; i < 리스트.size(); i++) {
			
			if (Integer.parseInt(리스트.get(i)[0]) == 행) {}
		
			else {
			
				배열.add(리스트.get(i));	
			}
			
		}
		
		리스트.clear();
		
		//새로운 리스트를 돌면서 값을 변경합니다. 
		for (int i = 0; i < 배열.size(); i++) {
			
			if (Integer.parseInt(배열.get(i)[0]) > 행) {
				
				String[] 배열1 = {
						String.valueOf((Integer.parseInt(배열.get(i)[0]) -1)),
						배열.get(i)[1],
						배열.get(i)[2],
						String.valueOf((Integer.parseInt(배열.get(i)[3]) - y_location)),
						배열.get(i)[4],
						String.valueOf((Integer.parseInt(배열.get(i)[5]) - height)),
						배열.get(i)[6],
						배열.get(i)[7]
				};
				
				리스트.add(i,배열1);
				
			}
		
			else {
				
				String[] 배열1 = {
						배열.get(i)[0],
						배열.get(i)[1],
						배열.get(i)[2],
						배열.get(i)[3],
						배열.get(i)[4],
						배열.get(i)[5],
						배열.get(i)[6],
						배열.get(i)[7]
				};
				
				리스트.add(i,배열1);
			
			}
			
		}
		
		
	}
	
	
	
	public static String 열_고점뽑아내기() {
		
		int [] 배열 = new int[6];
		
		배열[0] = 0;
		배열[1] = 0;
		배열[2] = 0;
		배열[3] = 0;
		배열[4] = 0;
		배열[5] = 0;
		

		for (int i = 0; i < 리스트.size(); i++) {
	
			for (int j = 0; j < 배열.length; j++) {
			
				if(배열[j] < Integer.parseInt(리스트.get(i)[j])) {
					
					배열[j] = Integer.parseInt(리스트.get(i)[j]);
				
				}
				
			}
			
		}
		
		return (배열[0] +","+배열[1] +","+배열[2] +","+배열[3] +","+배열[4] +","+배열[5]);	
		
	}


	public static void 열생성_수정(int 행, int 열, int x , int y, int width, int height, String a , String type) {

		String[] 배열 = {
				Integer.toString(행),
				Integer.toString(열),
				Integer.toString(x),
				Integer.toString(y),
				Integer.toString(width),
				Integer.toString(height),
				a,
				type
		};
		
		for (int i = 0; i < 리스트.size(); i++) {
		
			if(	
				리스트.get(i)[0].equals(Integer.toString(행)) &&
				리스트.get(i)[1].equals(Integer.toString(열)) &&
				리스트.get(i)[2].equals(Integer.toString(x)) &&
				리스트.get(i)[3].equals(Integer.toString(y)) &&
				리스트.get(i)[4].equals(Integer.toString(width)) &&
				리스트.get(i)[5].equals(Integer.toString(height)) &&
				리스트.get(i)[6].equals(""))
			{ 	리스트.set(i,배열);}
			
		}
		리스트_업로드();
	}
	
	public static void 지정수정(int 행, int 열, int x , int y, int width, int height, String a , String type) {

		String[] 배열 = {
				Integer.toString(행),
				Integer.toString(열),
				Integer.toString(x),
				Integer.toString(y),
				Integer.toString(width),
				Integer.toString(height),
				a,
				type,
		};
		
		for (int i = 0; i < 리스트.size(); i++) {
		
			if(	
				리스트.get(i)[0].equals(Integer.toString(행)) &&
				리스트.get(i)[1].equals(Integer.toString(열)) &&
				리스트.get(i)[2].equals(Integer.toString(x)) &&
				리스트.get(i)[3].equals(Integer.toString(y)) &&
				리스트.get(i)[4].equals(Integer.toString(width)) &&
				리스트.get(i)[5].equals(Integer.toString(height))
				)
			{리스트.set(i,배열);}
			
		}
		리스트_업로드();
	}
	
	
	public static void 데이터수정() {

		String[] 배열 = {
				Integer.toString(text_filed.행),
				Integer.toString(text_filed.열),
				Integer.toString(text_filed.x),
				Integer.toString(text_filed.y),
				Integer.toString(text_filed.width),
				Integer.toString(text_filed.height),
				타입분별입력(text_filed.type,text_filed.getText(),
				String.valueOf(16.0f)),
				text_filed.type
	};
		
		for (int i = 0; i < 리스트.size(); i++) {
		
			if(	
				리스트.get(i)[0].equals(Integer.toString(text_filed.행)) &&
				리스트.get(i)[1].equals(Integer.toString(text_filed.열)) &&
				리스트.get(i)[2].equals(Integer.toString(text_filed.x)) &&
				리스트.get(i)[3].equals(Integer.toString(text_filed.y)) &&
				리스트.get(i)[4].equals(Integer.toString(text_filed.width)) &&
				리스트.get(i)[5].equals(Integer.toString(text_filed.height)) &&
				리스트.get(i)[6].equals(text_filed.데이터))
			{ 	리스트.set(i,배열);}
			
		}
		리스트_업로드();
	}
	
	public static String 타입분별입력(String type ,String setText, String 행) {
		
		switch(type) {
			case "String":
				return setText;
			case "int":
				if (행.equals("0")) {
					return setText;
				}
				else {
					try {
			            int Value = Integer.parseInt(setText);
			            return String.valueOf(setText);
			        } 
					catch (NumberFormatException e) {
			            return "";
			        }					
				}      
			case "Date":
				return setText;
			case "담당자":
				return setText;
			case "Select":
				return setText;
			default:
				return "정의되지 않은 타입";
		}
	}
	
	
	public static void 사이즈수정(int 열,int width) {
		
		
		for (int i = 0; i < 리스트.size(); i++) {
		
			String[] 배열 = {
					리스트.get(i)[0],
					리스트.get(i)[1],
					리스트.get(i)[2],
					리스트.get(i)[3],
					Integer.toString(width),
					리스트.get(i)[5],
					리스트.get(i)[6],
					리스트.get(i)[7]
											
			};
			
			if(리스트.get(i)[1].equals(Integer.toString(열))){리스트.set(i,배열);}
		
				
		}
	}

	
	
	
	public static ArrayList<String[]> 리스트 = new ArrayList();
	
	
	//{행,열,데이터}
	
	public static void 리스트_추가하기(){

		String[] 배열1 = {"0","0","0","0","200","30","명칭","String"};
		String[] 배열2 = {"1","0","0","30","200","30","컴퓨터 판매금액","String"};
		String[] 배열3 = {"2","0","0","60","200","30","회식비","String"};
		String[] 배열4 = {"0","1","200","0","200","30","분류","Select"};
		String[] 배열5 = {"1","1","200","30","200","30","수입","Select"};
		String[] 배열6 = {"2","1","200","60","200","30","지출","Select"};
		String[] 배열7 = {"0","2","400","0","200","30","금액","int"};
		String[] 배열8 = {"1","2","400","30","200","30","100","int"};
		String[] 배열9 = {"2","2","400","60","200","30","200","int"};
		String[] 배열10 = {"0","3","600","0","200","30","날짜","Date"};
		String[] 배열11 = {"1","3","600","30","200","30","2020-01-01","Date"};
		String[] 배열12 = {"2","3","600","60","200","30","2020-01-01","Date"};
		
		리스트.add(배열1);
		리스트.add(배열2);
		리스트.add(배열3);
		리스트.add(배열4);
		리스트.add(배열5);
		리스트.add(배열6);
		리스트.add(배열7);
		리스트.add(배열8);
		리스트.add(배열9);
		리스트.add(배열10);
		리스트.add(배열11);
		리스트.add(배열12);
		
		
	};
	
	
	public static void 행_추가하기() {
		
		Map<Integer,Integer> x = new HashMap<>();
		Map<Integer,Integer> width = new HashMap<>();
		Map<Integer,String> type = new HashMap<>();
		
		int count = -1;
		int count1 = -1;
		int count2 = -1;
		
		int all_x = 0;
		int all_width = 0;
		String type_name = "";
		
		int [] 배열 = new int[6];
		배열[0] = 0;
		배열[1] = 0;
		배열[2] = 0;
		배열[3] = 0;
		배열[4] = 0;
		배열[5] = 0;
		
		/*고점 뽑아내기*/
		for (int i = 0; i < 리스트.size(); i++) {
	
			for (int j = 0; j < 배열.length; j++) {
			
				if(배열[j] < Integer.parseInt(리스트.get(i)[j])) {
					
					배열[j] = Integer.parseInt(리스트.get(i)[j]);
				
				}
				
			}
			
		}
		
		// x 좌표 공간 만들기 
		for (int i = 0; i < 리스트.size(); i++) {
			
			if(count < Integer.parseInt(리스트.get(i)[1])) {
				count = Integer.parseInt(리스트.get(i)[1]);

				x.put(Integer.parseInt(리스트.get(i)[1]), all_x);
			
				all_x +=  Integer.parseInt(리스트.get(i)[4]);
			}
			
		}
		
		
		
		// 각 width 값 만들기 
		for (int i = 0; i < 리스트.size(); i++) {
			
			if(count1 < Integer.parseInt(리스트.get(i)[1])) {
				count1 = Integer.parseInt(리스트.get(i)[1]);
				
				all_width =  Integer.parseInt(리스트.get(i)[4]);
				
				width.put(Integer.parseInt(리스트.get(i)[1]), all_width);
			
				}
			
		}
		
		// 각 type 값 만들기 
		for (int i = 0; i < 리스트.size(); i++) {
					
			if(count2 < Integer.parseInt(리스트.get(i)[1])) {
				count2 = Integer.parseInt(리스트.get(i)[1]);
				
				type_name =  리스트.get(i)[7];
				
				type.put(Integer.parseInt(리스트.get(i)[1]), type_name);
				//System.out.println(type.get(i));
			}
		}
		
		for (int i = 0; i < 배열[1] + 1 ; i++) {
			
				String[] add = {
						Integer.toString((배열[0] + 1)),
						Integer.toString(i),
						Integer.toString(x.get(i)),
						Integer.toString((배열[3] + 배열[5])),
						Integer.toString(width.get(i)),
						Integer.toString(배열[5]),
						"",
						type.get(i)
						
				};
				
				리스트.add(add);
		}	
	}
	
	public static void 열_추가하기(String type) {
		
		Map<Integer,Integer> height = new HashMap<>();
		
		String type_name = type;
		
		int [] 배열 = new int[6];
		int count = -1;
		int count1 = -1;
		
		
		int all_width = 0;
		
		배열[0] = 0;
		배열[1] = 0;
		배열[2] = 0;
		배열[3] = 0;
		배열[4] = 0;
		배열[5] = 0;
		

		for (int i = 0; i < 리스트.size(); i++) {
	
			for (int j = 0; j < 배열.length; j++) {
			
				if(배열[j] < Integer.parseInt(리스트.get(i)[j])) {
					
					배열[j] = Integer.parseInt(리스트.get(i)[j]);
				
				}
				
			}
			
		}
		

		for (int i = 0; i < 리스트.size(); i++) {
			
			if(count < Integer.parseInt(리스트.get(i)[1])) {
				
				count = Integer.parseInt(리스트.get(i)[1]);
				all_width += Integer.parseInt(리스트.get(i)[4]);
			}
			
			height.put(Integer.parseInt( 리스트.get(i)[0]), Integer.parseInt(리스트.get(i)[3]));
			
		}
	
		for (int i = 0; i < 배열[0] + 1 ; i++) {
			
				
			String[] add = {
					Integer.toString(i),
					Integer.toString((배열[1] + 1)),
					Integer.toString(all_width),
					Integer.toString(height.get(i)),
					Integer.toString(200),
					Integer.toString(배열[5]),
					"",
					type_name
					
					
			};
		
			리스트.add(add);
			
			move.총라벨좌표 = (배열[2]+ 배열[4] + 400);
			move1.총라벨좌표 = (배열[3]+ 배열[5] + 60);
		}
	}
	

	public static void 좌표조정() {
		Map<Integer, Integer> 좌표  = new HashMap<>();
		
		int count = -1;
		
		int all_width = 0;
		
			for (int i = 0; i < 리스트.size(); i++) {
				
				if(count < Integer.parseInt(리스트.get(i)[1])) {
					
					count = Integer.parseInt(리스트.get(i)[1]);
					
					all_width += Integer.parseInt(리스트.get(i)[4]);
					
					좌표.put(count, all_width);
					
				}
			//System.out.println(리스트.get(i)[0]+","+리스트.get(i)[1]+","+리스트.get(i)[2]+","+리스트.get(i)[3]);	
			}
			
			
			
			for (int i = 0; i < 리스트.size(); i++) {
				
				if(리스트.get(i)[1].equals("0")) {
					
					String[] 배열 = {
							리스트.get(i)[0],
							리스트.get(i)[1],
							"0",
							리스트.get(i)[3],
							리스트.get(i)[4],
							리스트.get(i)[5],
							리스트.get(i)[6],
							리스트.get(i)[7]
									
					};
					
					리스트.set(i,배열);
					
					
				}
				else {
					
					String[] 배열 = {
							리스트.get(i)[0],
							리스트.get(i)[1],
							Integer.toString(좌표.get(Integer.parseInt(리스트.get(i)[1])-1)),
							리스트.get(i)[3],
							리스트.get(i)[4],
							리스트.get(i)[5],
							리스트.get(i)[6],
							리스트.get(i)[7]
					};
					
					리스트.set(i,배열);
					
					//System.out.println(Integer.parseInt(리스트.get(i)[1])-1);
					//System.out.println(배열[0] +","+배열[1] +","+배열[2] +","+배열[3] +","+배열[4] +","+배열[5] +"");	
					
				}
				
			}
			
		
	}
	
	ArrayList<Window_D_Table_Lable_Filed> 테이블라벨 = new ArrayList();
	
	public static void 테이블X이동(int e) {
		
		for (int i = 0; i < 테이블라벨.size(); i++) {
			
			if(테이블라벨.get(i).열 == 0) {}
			else {
				테이블라벨.get(i).x_location += e;
				테이블라벨.get(i).setLocation(테이블라벨.get(i).x_location,테이블라벨.get(i).y_location);
			}
			
		}
	}
	
	public static void 테이블Y이동(int e) {
		
		for (int i = 0; i < 테이블라벨.size(); i++) {
			
			if(테이블라벨.get(i).행 == 0) {}
			else {
				테이블라벨.get(i).y_location += e ;
				테이블라벨.get(i).setLocation(테이블라벨.get(i).x_location,테이블라벨.get(i).y_location);
			}
			
		}
	}
	
	public static void 리스트_업로드(){

		table_center_center.removeAll();
		
		테이블라벨.clear();
		
		for (int i = 0; i < 리스트.size(); i++) {

			테이블라벨.add(new Window_D_Table_Lable_Filed(
						Integer.parseInt(리스트.get(i)[0]),
						Integer.parseInt(리스트.get(i)[1]),
						Integer.parseInt(리스트.get(i)[2]),
						Integer.parseInt(리스트.get(i)[3]),
						Integer.parseInt(리스트.get(i)[4]),
						Integer.parseInt(리스트.get(i)[5]),
						리스트.get(i)[6],
						option.font_size,
						리스트.get(i)[7]			
				)		
			);
			
			
		table_center_center.add(테이블라벨.get(i));	
		
		table_center_center.repaint();
		//System.err.println(리스트.get(i)[0] + "," + 리스트.get(i)[1]+ "," + 리스트.get(i)[2]+ "," + 리스트.get(i)[3]+ "," + 리스트.get(i)[4]+ "," + 리스트.get(i)[5]+ "," + 리스트.get(i)[6]+ "," + 리스트.get(i)[7] );
		
		}
			
	};
	

	public static Window_D_Panel_Team diary_team 			= new Window_D_Panel_Team(new BorderLayout(0,0),option.team_panel_x, option.other_panel_margin, option.team_panel_size_fix, size.resize_screen_height- option.other_panel_height);
	
	public static Window_D_Label_List diary_team_list 		= new Window_D_Label_List(new Runnable() {@Override public void run() {}}, option.user_team_space_x, option.user_team_space_y, option.user_team_space_width, option.user_team_space_height);

	public static void team_Add(){
		main_panel_center.add(diary_team,BorderLayout.WEST);
		diary_team.add(diary_team_list,BorderLayout.CENTER);
			}
	
	public static Window_D_Label_String 팀스페이스    = new Window_D_Label_String(new Runnable() {@Override public void run() {}}, "팀 스페이스", option.user_team_string_x, option.user_team_string_y, option.user_team_string_width, option.user_team_string_height);
	public static Window_D_Label_String 내스페이스      = new Window_D_Label_String(new Runnable() {@Override public void run() {}}, "내 스페이스", option.user_team_string_x, option.user_team_string_y, option.user_team_string_width, option.user_team_string_height);

	
	
	public static Create_Project_Table_Label_Select_Show 선택 	= new Create_Project_Table_Label_Select_Show(new Runnable() {@Override public void run() {}} ,"내 스페이스", 5, 0, 50, 200, 260, 40, 18.0f, true , 15);
	
	public static void 선택옵션추가() {
		
		dialog_select.setSize(125,85);
		dialog_list.removeAll();
		dialog_list.add(내스페이스_체인지,BorderLayout.NORTH);
		dialog_list.add(팀스페이스_체인지,BorderLayout.CENTER);
		
		dialog_list.repaint();
	}
	
	public static Create_Project_Table_Text text 				= new Create_Project_Table_Text(5, 0, 50, 115, 260, 40, 18.0f);
	
	public static Dialog_option_String 내스페이스_체인지         	= new Dialog_option_String(new Runnable() {@Override public void run() {선택.a = "내 스페이스"; 선택.repaint();}}, "내 스페이스", 5, 5,5,5, 125, 45);
	
	public static Dialog_option_String 팀스페이스_체인지        		= new Dialog_option_String(new Runnable() {@Override public void run() {선택.a = "팀 스페이스"; 선택.repaint();}}, "팀 스페이스", 5, 0,5,5, 125, 35);
	
	public static Window_D_Table_Label_text 캘린더 				= new Window_D_Table_Label_text(new Runnable() {@Override public void run() {캘린더_불러오기();}}, "캘린더"		, 0, 0, 170, 105, 80, 35, 17.0f,false);
	
	
	public static Window_D_Table_Label_text 가계부 				= new Window_D_Table_Label_text(new Runnable() {@Override public void run() {가계부_불러오기(); 황은지.repaint(); 황은지.cal.repaint();}}, "가계부"		, 0, 0, 90, 105, 80, 35, 17.0f,false);
	public static Window_D_Table_Label_text 타임라인 				= new Window_D_Table_Label_text(new Runnable() {@Override public void run() {}}, "타임라인"	, 0, 0, 250, 105, 80, 35, 17.0f,false);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
