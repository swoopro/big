package db연결;

import java.net.ConnectException;
import java.sql.Connection;

import javax.swing.JOptionPane;

import java.sql.*;

public class DB연결테스트2 {

	public static void main(String[] args) throws Exception {
		//class를 가져다 사용하는 방법
		//1. new를 복사해서 사용하는 방법
		//2. 너무 많이쓰는 class들은 복사하지않아도
		//   원본에 접근해서 바로쓸수있는 방법이있다
		
		//1. connector 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector설정 성공");
			
			String url = "jdbc:mysql://localhost:3306/phone";
			String user = "root";
			String password = "1234";
			
		//2. DB연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공");
			
		//3.SQL문 결정
			String id = JOptionPane.showInputDialog("탈퇴할 ID입력");
			
			String sql = "delete from member2 where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); //스트링을 sql문으로 바꿔주는부품
			ps.setString(1, id);
			
			System.out.println("3. SQL문 결정 성공");
			
		//4. SQL문 전송 요청
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 요청 성공");
			
	}

}
