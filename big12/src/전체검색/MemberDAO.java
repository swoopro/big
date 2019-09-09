package 전체검색;

import java.sql.*; //sql밑에있는거 다설정해준거
import java.util.ArrayList;


public class MemberDAO {

	public  ArrayList<MemberDTO> selectAll() throws Exception {
		ArrayList<MemberDTO> list = new ArrayList();
		//dto를 묶어줄 class
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
		String sql = "select * from member2";
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3. sql문 객체화 ok...");
		//4. SQL문 실행요청
//		ps.executeUpdate();  => c, u, d만 사용!
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			MemberDTO dto = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);

			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setTel(tel);
			
			list.add(dto); //next돌때마다 dto를 list에 추가
			
			System.out.println("4. sql문 실행요청 ok...");
			
		}
		//return id, pw, name, tel  <-자바에선불가능
		return list; //그 리스트 통째로 리턴
	}

}
