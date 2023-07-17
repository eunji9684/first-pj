package eunjiclient.serverex1.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//2023-07-17
//UDP 서버
public class UDPEchoServer {
	
	
	//생성자 메서드
	public UDPEchoServer(int port) {
		try {
			 	//입력받은 포트 번호를 기반으로 DatagramSocket 객체 생성
				DatagramSocket ds = new DatagramSocket(port);
				
				//무한 루프를 돌며 클라이언트로부터 데이터를 수신, 처리하고 응답
				while(true) {
					//512 바이트 크기의 버퍼를 생성하여 클라이언트로부터 받은 데이터를 담음
					byte buffer[] = new byte[512];
					
					//DatagramPacket 객체 생성하여 클라이언트로부터 데이터 수신 대기
					DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
					System.out.println("ready");
					ds.receive(dp);
					
					//수신된 데이터를 문자열로 변환하여 출력
					String str = new String(dp.getData());
					System.out.println("수신된 데이터 : " + str);
					
					//클라이언트의 IP 주소와 포트 번호를 얻어와서 출력
					InetAddress ia = dp.getAddress();
					port = dp.getPort();
					System.out.println("client ip : " + ia + ", client port : " + port);
					
					//클라이언트로부터 받은 데이터를 다시 클라이언트에게 송신
					//받은 데이터 그대로를 다시 보내므로 dp.getData()를 그대로 사용
					dp = new DatagramPacket(dp.getData(), dp.getData().length,ia,port);
					ds.send(dp);
				}
			
		} catch (IOException e) {
			//입출력 예외 처리
			e.printStackTrace();
		}
		
	}
	
		//메인 메서드
	public static void main(String[] args) {
		//UDPEchoServer 객체 생성 및 실행, 포트 번호 3001을 사용
		new UDPEchoServer(3001);
	}
}
