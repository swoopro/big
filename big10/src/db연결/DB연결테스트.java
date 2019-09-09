package db연결;

import java.sql.*; //sql밑에있는거 다설정해준거


public class DB연결테스트 {

	public  MemberDTO select(String sid) throws Exception {
		//1. 드라이버 설정   
		//db연결할때는 throws Exception 해주고
		//프로젝트파일위에 오른쪽마우스->빌드패스->컨피겨빌드패스->라이브러리->add external jars->드라이버선택
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");
		//2. DB연결
		//url, user, password
		String url = "jdbc:mysql://localhost:3306/phone";
		String user = "root"; 
		String password = "1234"; 
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		//3. SQL문 결정
		String sql = "select * from member2 where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sid);
		
		System.out.println("3. sql문 객체화 ok...");
		//4. SQL문 실행요청
//		ps.executeUpdate();  => c, u, d만 사용!
		ResultSet rs = ps.executeQuery();
		MemberDTO dto = new MemberDTO();
		if(rs.next()) {
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
//			System.out.println("검색결과입니다.");
//			System.out.println(id);
//			System.out.println(pw);
//			System.out.println(name);
//			System.out.println(tel);
			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setTel(tel);
			System.out.println("4. sql문 실행요청 ok...");
			
		}
		//return id, pw, name, tel  <-자바에선불가능
		return dto;
	}

}
