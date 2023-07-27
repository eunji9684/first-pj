package eunjiclient.serverex1.TCP;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//2023-07-14
//서버 TCP방법
public class MySocketServer {

	public static void main(String[] args) {
		try {
			int socketport = 4212;
			ServerSocket serverSocket = new ServerSocket(socketport);//소켓
			
			IpBlocker ipBlocker = new IpBlocker();
            ipBlocker.addBlockedIp("차단할_IP_주소"); // 차단할 IP 주소 추가
			
			Socket socketUser = null;//클라이언트 접속시 사용할 Socket
			System.out.println("socket :" + socketport + "으로 서버가 열렸습니다.");
			
			//소켓 서버가 종료될 때까지 반복
			while(true) {
				socketUser = serverSocket.accept();
				  String clientIp = socketUser.getInetAddress().getHostAddress();

	                if (ipBlocker.isIpBlocked(clientIp)) {
	                    System.out.println("차단된 IP가 접속하려 했습니다: " + clientIp);
	                    socketUser.close(); // 차단된 IP 접속을 바로 종료
	                    continue;
	                }
				
				//소켓 서버로 접속 시 socketUser에 접속자 정보 할당
				System.out.println("Client가 접속함 : " +  clientIp);
				//접속자의 getLocalAddress 가져오기
				
				//InputStream - 클라이언트에서 서버로
				InputStream input = socketUser.getInputStream();
				//socket의 inputStream 정보를 inputStream in에 넣은뒤
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				//BufferedReader에 위 inpuStream을 담아사용
				
				System.out.println(reader.readLine());
				//클라이언트에서 온 메세지 확인
				
				//OutputStream - 서버에서 클라이언트로
				OutputStream out = socketUser.getOutputStream();
				//socket의 OutputStream 정보를 OutputStream out에 넣은뒤
				PrintWriter writer = new PrintWriter(out,true);
				//BufferedReader에 위 InputStream을 담아 사용
				
				writer.println("난서버야");
				
				
				//서버에서 클라이언트로 메세지 보내기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
