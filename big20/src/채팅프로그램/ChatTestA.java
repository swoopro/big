package 채팅프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatTestA extends JFrame {

	DatagramSocket socket;
	// Socket 전역변수로 생성
	DatagramPacket packet;
	// Packet 전역변수로 생성
	InetAddress ip;
	// IP 주소값
	int port = 5000;
	// 5000번 port
	JTextArea list;
	// 채팅창(list)
	JTextField input;
	// 입력창(input)
	
	public ChatTestA() {
		setTitle("채팅프로그램A");
		setSize(500, 500);
		getContentPane().setLayout(null);

		list = new JTextArea();
		list.setEditable(false);
		list.setFont(new Font("Monospaced", Font.PLAIN, 15));
		list.setForeground(Color.WHITE);
		list.setBackground(new Color(112, 128, 144));
		list.setBounds(0, 0, 484, 405);
		getContentPane().add(list);
		list.setColumns(10);

		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = input.getText();
				//data1에 input textfield에 입력받은 정보를 저장
				list.append("길동: " + data1 + "\n");
				//list textarea에 입력받은 정보를 순서대로 나열
				input.setText("");

				try {
					byte[] data = data1.getBytes();
					//data에 data1에 받은 정보를 byte배열에 byte 형태로 저장
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					//ip 주소 입력
					int port = 6000;
					//6000번 포트의 정보를 가져옴
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);
					//packet에 입력받은 정보와 ip, 송신할 6000번 포트 저장
					socket.send(packet);
					//socket을 통해 packet을 보냄
				} catch (Exception e1) {
					e1.printStackTrace();

				}

			}
		});
		input.setFont(new Font("굴림", Font.PLAIN, 20));
		input.setBackground(Color.LIGHT_GRAY);
		input.setBounds(10, 415, 462, 36);
		getContentPane().add(input);
		input.setColumns(10);

		setVisible(true);
	}
	public void process() throws Exception {
		//process메소드 생성
		socket = new DatagramSocket(port);
		//5000번 포트의 socket 생성
		while (true) {
			byte[] data = new byte[256];
			//data라는 byte배열 생성
			DatagramPacket packet = new DatagramPacket(data, data.length);
			//패킷에 data의 정보 저장
			socket.receive(packet);
			//소켓에 받은 packet 저장
			list.append("친구: " + new String(data) + "\n");
		}
	}

	public static void main(String[] args) throws Exception {
		ChatTestA chat = new ChatTestA();
		chat.process();
		//process메소드 실행
	}

}
