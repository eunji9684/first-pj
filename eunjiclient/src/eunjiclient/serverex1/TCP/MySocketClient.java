package eunjiclient.serverex1.TCP;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

//2023-07-14
//클라이언트 TCP방법
public class MySocketClient {

	public static void main(String[] args) {
		
		
		try {
			Socket socket = new Socket("ipv4주소",1234);//소켓 서버에 접속
			System.out.println("socket 서버에 접속 성공!");
			
			
			//OutputStream - 클라이언트에서 Server로 메세지 전소
			OutputStream out = socket.getOutputStream();
			//socket의 OutputStream 정보를 OutputStream out에 넣은 뒤
			PrintWriter writer = new PrintWriter(out,true);
			//PrintWriter에 위 OutputStream을 담아 사용
			
			writer.println("ClIENT TO SERER");
			//클라이언트에서 서버로 메세지 보내기
			
			//InputStream - Server 에서 보낸 메세지 클라이언트로 가져옴
			InputStream input = socket.getInputStream();
			//socket의 inputStream 정보를 inputStream in에 넣은 뒤
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			//BuffereReader에 위 InputStream을 담아 사용
			
			System.out.println(reader.readLine());
			//서버에서 온 메세지 확인
			System.out.println("CLIENT SOCKET CLOSE");
			socket.close();//소켓 종료
	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
