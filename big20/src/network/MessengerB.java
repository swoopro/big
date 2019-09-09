package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MessengerB {

	public static void main(String[] args) throws Exception {
		//1. UDP Socket이 필요.
		DatagramSocket socket = new DatagramSocket(8000);
		System.out.println("1. 8000번 port 소켓 생성됨.");
		//2. Packet을 받아줌.
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		
		while(true) {
		socket.receive(packet);
		System.out.println("2. 데이터 받음.");
		
		//3. byte[]로 들어온 것 화면에 print.
		System.out.println("3. A로부터 받은 데이터: " + new String(data));
		}
		
	}

}
