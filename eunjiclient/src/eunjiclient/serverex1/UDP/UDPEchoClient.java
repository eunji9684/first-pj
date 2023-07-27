package eunjiclient.serverex1.UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//2023-07-17 UDP 방식
//클라이언트
public class UDPEchoClient {
	
	private String str;
	private BufferedReader file;
	private static int SERVERPORT = 3001;
	
	//생성자 메서드
	public UDPEchoClient(String ip, int port) {
		try {
			 	//입력받은 IP 주소를 기반으로 InetAddress 객체 생성
				InetAddress ia = InetAddress.getByName(ip);
				
				//입력받은 포트 번호를 기반으로 DatagramSocket 객체 생성
				DatagramSocket ds = new DatagramSocket(port);
				
				//사용자로부터 메세지 입력받기 위해 BufferedTeader 생성
				System.out.println("message : ");
				file = new BufferedReader(new InputStreamReader(System.in));
				
				//사용자로부터 입력받은 메세지를 문자열 변수에 저장
				str = file.readLine();
				
				//문자열을 바이트 배열로 변환하여 buffer 배열에 저장
				byte buffer[] = str.getBytes();
				
				//서버로 보낼 데이터를 담고 있는 DatagramPacket 객체 생성
				//buffer 배열에 담긴 데이터를 ia IP 주소와 SERVERPORT 포트 번호를 가진 서버로 전송하도록 설정
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length, ia,SERVERPORT);
				ds.send(dp);
				
				//bugger 배열을 512 크기로 초기화하고, 새로운 DatagramPacket 객체 dp 생성
				buffer = new byte[512];
				dp = new DatagramPacket(buffer, buffer.length);
				
				//서버로부터 수신된 데이터를 dp 객체에 저장
				ds.receive(dp);
				
				//서버의 IP 주소와 포트 번호를 출력
				System.out.println("server ip : " + dp.getAddress() + ", server port : " + dp.getPort());
				
				//수신된 데이터를 문자열로 변환하여 출력 (trim() 메서드로 공백 제거)
				System.out.println("수신된 데이터 : " + new String(dp.getData()).trim());
			
		} catch (IOException e) {
			//입출력 예외 처리
			e.printStackTrace();
			
		}
	}
	
	//메인메서드
	public static void main(String[] args) {
		//UDPEchoClient 객체 생성 및 실행
		new UDPEchoClient("localhost", 587);
	}
	
}
