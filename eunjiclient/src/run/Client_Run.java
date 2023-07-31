package run;

import java.awt.Window;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

import javax.annotation.processing.SupportedSourceVersion;

import swing_d.inter.Window_interface_D;

public class Client_Run {
	
    static SocketChannel socketChannel = null;
    static InetSocketAddress 연결  = new InetSocketAddress("localhost", 9999);
    
	public Client_Run() {}
		
	public static void connect() throws Exception {
	    // 클라이언트 소켓 생성 및 서버와 연결
	    socketChannel = SocketChannel.open();
	    socketChannel.connect(연결);
	}
	
	
	public static void send(String message) {
	
		try {
	            
	        if (socketChannel == null || !socketChannel.isConnected()) {connect();}
  
	            ByteBuffer 발신 = ByteBuffer.wrap(message.getBytes());
	            ByteBuffer 수신 = ByteBuffer.allocate(2048);
	            while (발신.hasRemaining()) {
	                socketChannel.write(발신);
	            }

	            발신.clear();
	            
	            int bytesRead = socketChannel.read(수신);

	          
	            
	            if (bytesRead > 0) {
	            	수신.flip();
	                byte[] data = new byte[수신.limit()];
	                수신.get(data);
	                System.out.println(new String(data, "UTF-8"));
	                
	                if(new String(data, "UTF-8").equals("아이디중복")) {
	                	
	                	Window_interface_D.labeL_로그인결과통보.a = "회원으로 가입되어 있는 이메일입니다.";
	                	Window_interface_D.labeL_로그인결과통보.repaint();
	                	
	                }
	                
	                else if(new String(data, "UTF-8").equals("가입완료")) {
	                	
	                	Window_interface_D.labeL_로그인결과통보.a = "가입완료. 2초 뒤 로그인으로 이동합니다.";
	                	Window_interface_D.labeL_로그인결과통보.repaint();	                	
	                	
	                	new Thread() {
	                		@Override
	                		public void run() {
	                			
	                			try {
									Thread.sleep(2000);
									
									Window_interface_D.diary_frame.getContentPane().removeAll();
									Window_interface_D.diary_frame.getContentPane().repaint();
									
									Window_interface_D.login_Add();
									Window_interface_D.diary_frame.getContentPane().repaint();
									Window_interface_D.main_User_add.repaint();
									
								} catch (InterruptedException e) {
							
									//System.out.println(e.getMessage()); 
								}
	                		}
	                	}.start();;
	                	
	                }
	                else if(new String(data, "UTF-8").equals("1,1")) {
	                	Window_interface_D.labeL_로그인결과통보.a = "로그인 성공!";
	                	Window_interface_D.labeL_로그인결과통보.repaint();
	                	
	                	
	                	
	                	
	                	
	                	Window_interface_D.로그인_처리();
	                		
	                }
	                else if(new String(data, "UTF-8").equals("0,0")) {
	                	
	                	Window_interface_D.labeL_로그인결과통보.a = "회원가입되지 않은 이메일입니다.";
	                	Window_interface_D.labeL_로그인결과통보.repaint();
	                	
	                }
	                else if(new String(data, "UTF-8").equals("1,0")) {

	                	Window_interface_D.labeL_로그인결과통보.a = "패스워드가 틀렸습니다.";
	                	Window_interface_D.labeL_로그인결과통보.repaint();
	                	
	   	                	             
	                }
	                else {System.out.println(new String(data, "UTF-8"));}
	                
	            }
	
	            socketChannel.close();
	        
	        }
	        
	        catch (Exception e) {

	        	Window_interface_D.labeL_로그인결과통보.a =  "서버와 연결이 제한됩니다. 개발자에게 연락주세요";
	        	Window_interface_D.labeL_로그인결과통보.repaint();
	        	System.out.println( "서버좀 키고 누르세요.");
	     
	       }
	};
}

























