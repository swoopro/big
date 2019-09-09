package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiver3 {

	public static void main(String[] args) throws Exception {
		//1. UDP용 Socket필요
		DatagramSocket socket = new DatagramSocket(9400);
		System.out.println("1. 소켓 생성");
		
		//2. 받는 패킷 따로 만들어 줘야함.
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("2. 패킷 받음");
		
		socket.receive(packet);
		//3. 받은 내용 화면 출력.
		System.out.println("3. 받은 데이터: " + new String(data));
	}

}
