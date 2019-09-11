package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDAO3 {
	public ArrayList<BbsDTO> selectAll() throws Exception {
		//2. DB처리
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		//connection은 자바밑에있는거사용
		System.out.println("2. db연결 ok!!");
		
		//2-3)sql문 객체화
		String sql = "select * from Bbs2";
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		//ps.executeUpdate(); //crud중 select빼고사용
		//ps.executeQuery(); 이거는 select만 사용!
		System.out.println("4. sql문 실행 요청 ok!!");
		BbsDTO dto2 = null;
		ArrayList<BbsDTO> list = new ArrayList<BbsDTO>();
		while(rs.next()) {
			dto2 = new BbsDTO();
			dto2.setId(rs.getString(1));
			dto2.setTitle(rs.getString(2));
			dto2.setContent(rs.getString(3));
			dto2.setWriter(rs.getString(4));
			list.add(dto2);
		}
		ps.close();
		con.close();
		return list;
		
	}
}
