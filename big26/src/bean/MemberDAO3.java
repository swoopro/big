package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO3 {
	public ArrayList<MemberDTO> selectAll() throws Exception {
		//2. DB처리
				DBConnectionMgr mgr = DBConnectionMgr.getInstance();
				Connection con = mgr.getConnection();
				//connection은 자바밑에있는거사용
				System.out.println("2. db연결 ok!!");
				
				//2-3)sql문 객체화
				String sql = "select * from member2;";
				PreparedStatement ps = con.prepareStatement(sql);
				
				System.out.println("3. sql문 객체화 ok!!");

				//2-4)sql문 실행 요청
				ResultSet rs = ps.executeQuery();
				//ps.executeUpdate(); //crud중 select빼고사용
				//ps.executeQuery(); 이거는 select만 사용!
				System.out.println("4. sql문 실행 요청 ok!!");
				MemberDTO dto2 = null;
				ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
				while(rs.next()) {
					dto2 = new MemberDTO();
					//ORM (object:자바 rdb:table항목 mapping)
					dto2.setId(rs.getString(1));
					dto2.setPw(rs.getString(2));
					dto2.setName(rs.getString(3));
					dto2.setTel(rs.getString(4));
					list.add(dto2);
				}
				
				ps.close();
				con.close();
				return list;
	}
}	
