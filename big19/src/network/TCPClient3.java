package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient3 {

	public static void main(String[] args) throws Exception {
		//1.서버 소켓에 연결 요청		
		//2.승인되면 전송용 소켓을 확보
		//  => 연결이 됨.
		Socket socket = new Socket("localhost", 9100);
		System.out.println("1. 9100서버로 연결됨.");
		//3. 2번에서만들어진 연결을 가지고 데이터전송
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String data = input.readLine();
		System.out.println("서버로부터 전송된 데이터 입니다");
		System.out.println("----------------------");
		System.out.println(data);
	}

}
