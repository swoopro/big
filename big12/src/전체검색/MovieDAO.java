package 전체검색;

import java.sql.*; //sql밑에있는거 다설정해준거


public class MovieDAO {

	public  MovieDTO select(String sid) throws Exception {
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
		String sql = "select * from movie where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sid);
		
		System.out.println("3. sql문 객체화 ok...");
		//4. SQL문 실행요청
//		ps.executeUpdate();  => c, u, d만 사용!
		ResultSet rs = ps.executeQuery();
		MovieDTO dto = new MovieDTO();
		if(rs.next()) {
			String id = rs.getString(1);
			String title = rs.getString(2);
			String company = rs.getString(3);
			String actor = rs.getString(4);

			dto.setId(id);
			dto.setTitle(title);
			dto.setCompany(company);
			dto.setActor(actor);
			System.out.println("4. sql문 실행요청 ok...");
			
		}
		//return id, pw, name, tel  <-자바에선불가능
		return dto;
	}

}
