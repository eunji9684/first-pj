package swing_d.main;

import java.awt.EventQueue;
import java.awt.Font;

import swing_d.inter.Window_interface_D;

public class Window_D_Main {
	//프로그램이 시작되는 최초의 실행지점이므로 반드시 main으로 표기
	
	public static void main(String[] args) {
		//이벤트 큐에서 실행되는 후입 선출 방식과 스레드로 프레임을 처리함
		EventQueue.invokeLater(new Runnable() {public void run() {
				
			try {
					// 프로그램이 실행되기 전에 디바이스의 화면 사이즈를 가져옴
				Window_interface_D.size.디바이스정보();
					// 인터페이스에 정의된 static fanal 객체를 각 패널에 넣고 사용할 준비를 합니다.
				
				//Window_interface_D.create_table();
				//Window_interface_D.message_Add();
				Window_interface_D.team_Add();
				Window_interface_D.table_Add();
				//Window_interface_D.user_Add();
				//Window_interface_D.login_Add();
				
				Window_interface_D.panel_Add();
				Window_interface_D.head_Add();
				
				//프레임을 보여줍니다.
				Window_interface_D.diary_frame.setVisible(true);
				
				//메시지 창은 숨김 처리합니다.
				//Window_interface_D.message_hide();
				
			} 
			
			catch (Exception e) {e.getMessage();}
		
		}});  //eventqueue end
	}  // static main end
} // class main_D end
