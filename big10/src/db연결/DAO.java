package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	public Bbs2DTO select(String sid) throws Exception {
		// 1. 드라이버 설정
		// db연결할때는 throws Exception 해주고
		// 프로젝트파일위에 오른쪽마우스->빌드패스->컨피겨빌드패스->라이브러리->add external jars->드라이버선택
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");
		// 2. DB연결
		// url, user, password
		String url = "jdbc:mysql://localhost:3306/phone";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		// 3. SQL문 결정
		String sql = "select * from bbs2 where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sid);

		System.out.println("3. sql문 객체화 ok...");
		// 4. SQL문 실행요청
//			ps.executeUpdate();  => c, u, d만 사용!
		// select의 결과가 테이블이므로 그것을 ResultSet class로 받아옴.
		ResultSet rs = ps.executeQuery();
		Bbs2DTO dto = new Bbs2DTO();
		if (rs.next()) {
			// 테이블에서 하나의 항목씩 꺼내옴.
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String writer = rs.getString(4);

			// 각 항목의 값을 dto에 넣어줌.
			dto.setId(id);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setWriter(writer);
			System.out.println("4. sql문 실행요청 ok...");

		}
		// return id, pw, name, tel <-자바에선불가능
		return dto;
	}

		public void insert(Bbs2DTO dto) throws Exception {
		
		
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
//			String id = JOptionPane.showInputDialog("ID입력");
//			String pw = JOptionPane.showInputDialog("PW입력");
//			String name = JOptionPane.showInputDialog("NAME입력");
//			String  tel = JOptionPane.showInputDialog("TEL력");
//			String sql = "insert into member2 values ('"+ id +"', '"+ pw +"', '"+ name +"', '"+ tel +"')";
			String sql = "insert into bbs2 values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql); //스트링을 sql문으로 바꿔주는부품
			System.out.println(dto);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getWriter());
			System.out.println("3. SQL문 결정 성공");
			
		//4. SQL문 전송 요청
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 요청 성공");
			
			ps.close();
			con.close();
		}
}
