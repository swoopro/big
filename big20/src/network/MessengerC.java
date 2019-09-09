package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MessengerC {

	public static void main(String[] args) throws Exception {
		//1.UDP용 socket이 필요
		DatagramSocket socket = new DatagramSocket();
		System.out.println("1. 송신용 소켓 생성됨.");
		//2.UDP용 packet이 필요
		//  -데이터(byte[]) + 주소(ip+port)
		//  -ip는 객체화(InetAddress)
		String input = "i am a MessengerC!!";
		byte[] data = input.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		int port = 8000;
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);	
		
		System.out.println("2. 송신할 패킷 생섬함.");
		
		socket.send(packet);
		System.out.println("3. 패킷 송신 완료.");
		socket.close();
		System.out.println("4. socket close.");
		//3. socket을 이용해서 packet을 전송
	}

}
