package 채팅프로그램;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame {
	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress ip;
	int port = 6000;
	private JTextField input;
	JTextArea list;

	public ChatB() throws Exception {
		socket = new DatagramSocket();//보내는소켓생성
		setTitle("채팅프로그램B");
		setSize(500, 500);
		getContentPane().setLayout(null);

		list = new JTextArea();
		list.setEditable(false);// list부분은 수정불가하게 막아둠
		list.setFont(new Font("Monospaced", Font.BOLD, 30));
		list.setBackground(Color.PINK);
		list.setBounds(12, 10, 460, 336);
		getContentPane().add(list);

		input = new JTextField();
		input.addActionListener(new ActionListener() {//enter쳤을때 실행!
			public void actionPerformed(ActionEvent e) {
				//list up!!
				String data1 = input.getText();
//				list.setText(data1);//인풋에 썻을때 list에 data1을 넣는것 한번만넣어짐
				list.append("B: " + data1 + "\n");// 계속 누적해서 들어감 "\n"은 칸띄워주는거
				input.setText("");// 치고나서 input지워주기
				
				//send!!
				try {
					byte[] data = data1.getBytes();//data1을 바이트로쪼개서 전송하려고 바꿔줌(data)
					InetAddress ip = InetAddress.getByName("127.0.0.1");//localhost ip
					int port = 5000;//받는쪽(ChatA) port
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);
					System.out.println("2. 송신할 패킷 생섬함.");
					//보낼 패킷 생성!! (바이트배열, 배열길이, 아이피, 포트)
					socket.send(packet);//소켓에서 패킷 전송
					System.out.println("3. 패킷 송신 완료.");
				} catch (Exception e1) {
				}
			}
		});
		input.setBackground(new Color(135, 206, 250));
		input.setFont(new Font("굴림", Font.BOLD, 30));
		input.setBounds(12, 356, 460, 95);
		getContentPane().add(input);
		input.setColumns(10);

		setVisible(true);
	}

	public void process() {
		try {
			// 1. UDP Socket이 필요.                              //위에 전송용소켓이랑 다른거임
			DatagramSocket socket = new DatagramSocket(port); //받는소켓생성 받는쪽포트(A)포트적기
			System.out.println("1. 6000번 port 소켓 생성됨.");

			// 2. Packet을 받아줌.
			while (true) {//계속받아올라고
				byte[] data = new byte[256];//바이트받아올공간 생성
				DatagramPacket packet = new DatagramPacket(data, data.length);
				//패킷 만들어서 받아올준비
				socket.receive(packet);//소켓이용하여 패킷받아옴
				System.out.println("2. 데이터 받음.");

				// 3. byte[]로 들어온 것 화면에 print.
				list.append("A :" + new String(data) + "\n");//받은데이터를 스트링으로바꿔 리스트에추가
				System.out.println("3. A로부터 받은 데이터: " + new String(data));
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) throws Exception {
		ChatB chat = new ChatB();
		chat.process();

	}
}
