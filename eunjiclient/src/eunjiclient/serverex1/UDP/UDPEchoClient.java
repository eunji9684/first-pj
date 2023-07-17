package eunjiclient.serverex1.UDP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.InetAddress;

//2023-07-17 UDP 방식

public class UDPEchoClient {
	
	private String str;
	private BufferedReader file;
	private static int SERVERPORT = 3000;
	
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
				
				
				
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
