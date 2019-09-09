package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BbsDAO {
	public void insert(BbsDTO dto) throws Exception {
		//2. DB처리
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		//connection은 자바밑에있는거사용
		System.out.println("2. db연결 ok!!");
		
		//2-3)sql문 객체화
		String sql = "insert into bbs2 values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getWriter());
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ps.executeUpdate(); //crud중 select빼고사용
		//ps.executeQuery(); 이거는 select만 사용!
		System.out.println("4. sql문 실행 요청 ok!!");
		ps.close();
		con.close();
		
	}
}
