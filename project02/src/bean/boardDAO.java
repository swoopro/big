package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class boardDAO {
	public void insert(boardDTO dto) throws Exception {
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("2.DB 연결 ok..");
		// 3)SQL문 객체화
		String sql = "insert into board (mid, id, date, score, writing) values (?,?,now(),?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, dto.getMid());
		ps.setString(2, dto.getId());
		ps.setInt(3, dto.getScore());
		ps.setString(4, dto.getWriting());
		
		
		System.out.println("3. sql문 객체화 ok..");
		// 4)SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("4. sql문 실행 요청 ok..");
		
		ps.close();
		con.close();


	}
	public ArrayList<boardDTO> selectAll(int mid) throws Exception {
		ArrayList<boardDTO> list = new ArrayList<boardDTO>();
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("2.DB 연결 ok.. 날 찾아라");
		String sql = "select * from board where mid =? order by date desc";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, mid);

		System.out.println("3. sql문 객체화 ok.."); // 4)SQL문 실행 요청 ResultSet rs =
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok..");
		boardDTO dto2 = null;
		while (rs.next()) {
			dto2 = new boardDTO();
			dto2.setBid(rs.getInt(1));
			dto2.setMid(rs.getInt(2));
			dto2.setId(rs.getString(3));
			dto2.setDate(rs.getTimestamp(4));
			dto2.setScore(rs.getInt(5));
			dto2.setWriting(rs.getString(6));
		
			list.add(dto2);
			System.out.println(list);

		}
		ps.close();
		con.close();
		return list;
	}
	public void delete(int bid) throws Exception {
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("2.DB 연결 ok..");
		// 3)SQL문 객체화
		String sql = "delete from board where bid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bid);
		
		System.out.println(bid + "--------------------");
		System.out.println("3. sql문 객체화 ok..");
		// 4)SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("4. sql문 실행 요청 ok..");
		
		
		
		
		
		ps.close();
		con.close();
	}
	
	
	public boardDTO select(String id, int mid) throws Exception {
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("2.DB 연결 ok.. 날 찾아라");
		String sql = "select * from board where id=? && mid =?";

		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, id);		
		ps.setInt(2, mid);		

		System.out.println("3. sql문 객체화 ok.."); 
		
		// 4)SQL문 실행 요청		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok..");
		boardDTO dto2 = new boardDTO(); 
		//boardDTO dto2 = null; 
		if (rs.next()) {
			//dto2 = new boardDTO(); 
			dto2.setBid(rs.getInt(1));
			dto2.setMid(rs.getInt(2));
			dto2.setId(rs.getString(3));
			dto2.setDate(rs.getTimestamp(4));
			dto2.setScore(rs.getInt(5));
			dto2.setWriting(rs.getString(6));

		}
		System.out.println(dto2.getId()+"====================1124214=============");
		ps.close();
		con.close();
		rs.close(); 
		return dto2;
	}
}
	

		

	

