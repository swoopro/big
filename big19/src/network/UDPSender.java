package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//1. UDP용 Socket 필요
		DatagramSocket socket = new DatagramSocket();
		System.out.println("1. 소켓 생성");
		
		//2. packet으로 만들어라.(data+ip주소)
		String data = "i am a server!! welcome!!";
		byte[] bData = data.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(bData, bData.length, ip, 9200);
		System.out.println("2. 패킷 생성");
		
		//3. packet을 Socket으로 보낸다.
		socket.send(packet);
		System.out.println("3. 데이터 전송 완료!");
	}

}
