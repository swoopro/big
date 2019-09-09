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

public class ChatTestB extends JFrame {
	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress ip;
	int port = 6000;
	JTextArea list;
	JTextField input;

	public ChatTestB() {
		setTitle("채팅프로그램B");
		setSize(500, 500);
		getContentPane().setLayout(null);

		list = new JTextArea();
		list.setEditable(false);
		list.setFont(new Font("Monospaced", Font.PLAIN, 15));
		list.setForeground(Color.WHITE);
		list.setBackground(Color.black);
		list.setBounds(0, 0, 484, 405);
		getContentPane().add(list);
		list.setColumns(10);

		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = input.getText();
				list.append("친구: " + data1 + "\n");
				input.setText("");
				
				// send
				try {
					byte[] data = data1.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					int port = 5000;
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);

					socket.send(packet);
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
			socket = new DatagramSocket(port);
			while (true) {
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				list.append("길동: " + new String (data) + "\n");
			}
	}
	public static void main(String[] args) throws Exception {
		ChatTestB chat = new ChatTestB();
		chat.process();

	}
}

