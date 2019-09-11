package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	public void insert(MemberDTO dto) throws Exception {
		//2. DB처리
				DBConnectionMgr mgr = DBConnectionMgr.getInstance();
				Connection con = mgr.getConnection();
				//connection은 자바밑에있는거사용
				System.out.println("2. db연결 ok!!");
				
				//2-3)sql문 객체화
				String sql = "insert into member2 values (?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				ps.setString(3, dto.getName());
				ps.setString(4, dto.getTel());
				System.out.println("3. sql문 객체화 ok!!");

				//2-4)sql문 실행 요청
				ps.executeUpdate(); //crud중 select빼고사용
				//ps.executeQuery(); 이거는 select만 사용!
				System.out.println("4. sql문 실행 요청 ok!!");
				ps.close();
				con.close();
	}
}	
