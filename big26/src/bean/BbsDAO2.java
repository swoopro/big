package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO2 {
	public BbsDTO select(BbsDTO dto) throws Exception {
		//2. DB처리
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		//connection은 자바밑에있는거사용
		System.out.println("2. db연결 ok!!");
		
		//2-3)sql문 객체화
		String sql = "select * from Bbs2 where id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		//ps.executeUpdate(); //crud중 select빼고사용
		//ps.executeQuery(); 이거는 select만 사용!
		System.out.println("4. sql문 실행 요청 ok!!");
		BbsDTO dto2 = null;
		while(rs.next()) {
			dto2 = new BbsDTO();
			dto2.setId(rs.getString(1));
			dto2.setTitle(rs.getString(2));
			dto2.setContent(rs.getString(3));
			dto2.setWriter(rs.getString(4));
		}
		ps.close();
		con.close();
		return dto2;
		
	}
}
