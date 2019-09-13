package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class UserDAO {
	public void insert(UserDTO dto) throws Exception {
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector설정 성공");

		String url = "jdbc:mysql://localhost:3306/firstpj";
		String user = "root";
		String password = "1234";
		// 2. DB연결
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");
		// 3.SQL문 결정
		String sql = "insert into user values (?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql); // 스트링을 sql문으로 바꿔주는부품
		System.out.println(dto);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		ps.setString(5, dto.getEmail());
		ps.setString(6, dto.getAddr());
		System.out.println("3. SQL문 결정 성공");
		// 4. SQL문 전송 요청
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 요청 성공");

		ps.close();
		con.close();
	}

	public UserDTO select(String sid) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/firstpj";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		String sql = "select * from user where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sid);
		ResultSet rs = ps.executeQuery();
		UserDTO dto = new UserDTO();
		if (rs.next()) {
			// 테이블에서 하나의 항목씩 꺼내옴.
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			String email = rs.getString(5);
			String addr = rs.getString(6);
			// 각 항목의 값을 dto에 넣어줌.
			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setTel(tel);
			dto.setEmail(email);
			dto.setAddr(addr);
		}
		return dto;
	}

	public int overlap(String sid) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");

		String url = "jdbc:mysql://localhost:3306/firstpj";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		String sql = "select id from user where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sid);

		System.out.println("3. sql문 객체화 ok...");

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			return 0; // 중복되면 0
		} else {
			return 1; // 아니면 1
		}
	}

	public void update(String id, String pw) throws Exception {
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector설정 성공");

		String url = "jdbc:mysql://localhost:3306/firstpj";
		String user = "root";
		String password = "1234";

		// 2. DB연결
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");

		// 3.SQL문 결정

		String sql = "update user set pw = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql); // 스트링을 sql문으로 바꿔주는부품
		ps.setString(1, pw);
		ps.setString(2, id);

		System.out.println("3. SQL문 결정 성공");

		// 4. SQL문 전송 요청
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 요청 성공");
		ps.close();
		con.close();
	}

	public void delete(String id) throws Exception {
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector설정 성공");

		String url = "jdbc:mysql://localhost:3306/firstpj";
		String user = "root";
		String password = "1234";

		// 2. DB연결
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");

		// 3.SQL문 결정

		String sql = "delete from user where id = ?";
		PreparedStatement ps = con.prepareStatement(sql); // 스트링을 sql문으로 바꿔주는부품
		ps.setString(1, id);

		System.out.println("3. SQL문 결정 성공");

		// 4. SQL문 전송 요청
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 요청 성공");
		ps.close();
		con.close();

	}
}