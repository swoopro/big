package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieDAO {
	public ArrayList<MovieDTO> selectAll() throws Exception {
				DBConnectionMgr mgr = DBConnectionMgr.getInstance();
				Connection con = mgr.getConnection();
				
				System.out.println("2. db연결 ok!!");
				
				String sql = "select * from movie;";
				PreparedStatement ps = con.prepareStatement(sql);
				
				System.out.println("3. sql문 객체화 ok!!");

				//2-4)sql문 실행 요청
				ResultSet rs = ps.executeQuery();
				System.out.println("4. sql문 실행 요청 ok!!");
				MovieDTO dto2 = null;
				ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
				while(rs.next()) {
					dto2 = new MovieDTO();
					//ORM (object:자바 rdb:table항목 mapping)
					dto2.setMid(rs.getInt(1));
					dto2.setTitle(rs.getString(2));
					dto2.setStory(rs.getString(3));
					dto2.setMd(rs.getString(4));
					dto2.setJanre(rs.getString(5));
					dto2.setAge(rs.getString(6));
					dto2.setScore(rs.getInt(7));
					dto2.setImg(rs.getString(8));
					dto2.setCount(rs.getInt(9));
					list.add(dto2);
				}
				
				ps.close();
				con.close();
				return list;
	}
	
	
	public ArrayList<MovieDTO> selectJanre(String janre) throws Exception {//장르별로 검색
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		System.out.println("2. db연결 ok!!" + janre);
		
		String sql = "select * from movie where janre = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, janre);
		
		
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok!!");
		MovieDTO dto2 = null;
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		while(rs.next()) {
			dto2 = new MovieDTO();
			//ORM (object:자바 rdb:table항목 mapping)
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			list.add(dto2);
		}		
		System.out.println("--------------" + list.size());
	
	 ps.close();
	 con.close();
	 return list; 
	 }
	
	public ArrayList<MovieDTO> allsearch(String all) throws Exception {//검색어 조건 == db항목전체
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		System.out.println("2. db연결 ok!!" + all);
		
		String sql = "select * from movie where mid like '%" + all +
				"%' || title like '%" + all + "%' ||  story like '%" + all +
				"%' || md like '%" + all + "%' || janre like '%" + all +
				"%' || age like '%" + all + "%'";
//		String sql = "select * from movie where title like concat('%',?,'%')";
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok!!");
		MovieDTO dto2 = null;
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		while(rs.next()) {
			dto2 = new MovieDTO();
			//ORM (object:자바 rdb:table항목 mapping)
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			list.add(dto2);
		}		
	
	 ps.close();
	 con.close();
	 return list; }
	
	
	
	public ArrayList<MovieDTO> tssearch(String ts) throws Exception {// 제목+줄거리로 검색
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		System.out.println("2. db연결 ok!!" + ts);
		
		String sql = "select * from movie where (title like '%" + ts + "%') or (story like '% " + ts + "%')";
//		String sql = "select * from movie where title like concat('%',?,'%')";
		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, s);
//		ps.setString(2, s);
		
		
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok!!");
		MovieDTO dto2 = null;
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		while(rs.next()) {
			dto2 = new MovieDTO();
			//ORM (object:자바 rdb:table항목 mapping)
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			list.add(dto2);
		}		
	
	 ps.close();
	 con.close();
	 return list; }
	
	
	public ArrayList<MovieDTO> titlesearch(String t) throws Exception {//제목으로검색
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		System.out.println("2. db연결 ok!!" + t);
		
		String sql = "select * from movie where title like '%" + t + "%'";
//		String sql = "select * from movie where title like concat('%',?,'%')";
		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, s);
//		ps.setString(2, s);
		
		
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok!!");
		MovieDTO dto2 = null;
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		while(rs.next()) {
			dto2 = new MovieDTO();
			//ORM (object:자바 rdb:table항목 mapping)
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			list.add(dto2);
		}		
	
	 ps.close();
	 con.close();
	 return list; }
	 
	
	
	public ArrayList<MovieDTO> storysearch(String s) throws Exception {//줄거리로검색
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		System.out.println("2. db연결 ok!!" + s);
		
		String sql = "select * from movie where story like '%" + s + "%'";
//		String sql = "select * from movie where title like concat('%',?,'%')";
		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, s);
//		ps.setString(2, s);
		
		
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok!!");
		MovieDTO dto2 = null;
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		while(rs.next()) {
			dto2 = new MovieDTO();
			//ORM (object:자바 rdb:table항목 mapping)
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			list.add(dto2);
		}		
	
	 ps.close();
	 con.close();
	 return list; }
	
	
	
	public ArrayList<MovieDTO> mdsearch(String md) throws Exception {// 감독이름으로 검색
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		System.out.println("2. db연결 ok!!" + md);
		
		String sql = "select * from movie where md like '%" + md + "%'";
//		String sql = "select * from movie where title like concat('%',?,'%')";
		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, s);
//		ps.setString(2, s);
		
		
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok!!");
		MovieDTO dto2 = null;
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		while(rs.next()) {
			dto2 = new MovieDTO();
			//ORM (object:자바 rdb:table항목 mapping)
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			list.add(dto2);
		}		
	
	 ps.close();
	 con.close();
	 return list; }
	
	
//	public ArrayList<MovieDTO> sort(String janre, String sort) throws Exception {
//		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
//		Connection con = mgr.getConnection();
//		
//		System.out.println("2. db연결 ok!!");
//		
//		String sql = "select * from movie where janre = ? order by ? desc;";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, janre);
//		ps.setString(2, sort);
//		System.out.println("3. sql문 객체화 ok!!");
//
//		//2-4)sql문 실행 요청
//		ResultSet rs = ps.executeQuery();
//		System.out.println("4. sql문 실행 요청 ok!!");
//		MovieDTO dto2 = null;
//		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
//		while(rs.next()) {
//			dto2 = new MovieDTO();
//			//ORM (object:자바 rdb:table항목 mapping)
//			dto2.setMid(rs.getInt(1));
//			dto2.setTitle(rs.getString(2));
//			dto2.setStory(rs.getString(3));
//			dto2.setMd(rs.getString(4));
//			dto2.setJanre(rs.getString(5));
//			dto2.setAge(rs.getString(6));
//			dto2.setScore(rs.getInt(7));
//			dto2.setImg(rs.getString(8));
//			dto2.setVod(rs.getString(9));
//			dto2.setCount(rs.getInt(10));
//			list.add(dto2);
//		}
//		
//		ps.close();
//		con.close();
//		return list;
//}
	
	public ArrayList<MovieDTO> count(String janre) throws Exception {//선택된장르에서 조회순으로검색
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		System.out.println("2. db연결 ok!!");
			
		String sql = "select * from movie where janre = ? order by count desc;";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, janre);
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok!!");
		MovieDTO dto2 = null;
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		while(rs.next()) {
			dto2 = new MovieDTO();
			//ORM (object:자바 rdb:table항목 mapping)
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			list.add(dto2);
		}
		
		ps.close();
		con.close();
		return list;
}
	public ArrayList<MovieDTO> allcount() throws Exception {//모든영화를 조회수높은순으로 검색
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		System.out.println("2. db연결 ok!!");
		
		String sql = "select * from movie order by count desc;";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok!!");
		MovieDTO dto2 = null;
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		while(rs.next()) {
			dto2 = new MovieDTO();
			//ORM (object:자바 rdb:table항목 mapping)
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			list.add(dto2);
		}
		
		ps.close();
		con.close();
		return list;
}
	
	public ArrayList<MovieDTO> score(String janre) throws Exception {//선택된장르에서 평점높은순으로검색
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		System.out.println("2. db연결 ok!!");
		
		String sql = "select * from movie where janre = ? order by score desc;";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, janre);
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok!!");
		MovieDTO dto2 = null;
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		while(rs.next()) {
			dto2 = new MovieDTO();
			//ORM (object:자바 rdb:table항목 mapping)
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			list.add(dto2);
		}
		
		ps.close();
		con.close();
		return list;
}
	
	public ArrayList<MovieDTO> allscore() throws Exception {//모든영화 평점높은순으로 검색
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		System.out.println("2. db연결 ok!!");
		
		String sql = "select * from movie order by score desc;";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 객체화 ok!!");

		//2-4)sql문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok!!");
		MovieDTO dto2 = null;
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		while(rs.next()) {
			dto2 = new MovieDTO();
			//ORM (object:자바 rdb:table항목 mapping)
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			list.add(dto2);
		}
		
		ps.close();
		con.close();
		return list;
}
	
	
	public MovieDTO select(String img, int mid) throws Exception {
		// category.jsp에서 하이퍼링크눌러서 movie.jsp로 넘어가면
		// 입력한img로 영화검색하고, 조회수 +1 

		System.out.println(img + "---------------------------");
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();

		String check = "update movie set count=count+1 where img = ?";
		PreparedStatement ps2 = con.prepareStatement(check);
		ps2.setString(1, img);
		ps2.execute();

		String sql = "select * from movie where img = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, img);

		System.out.println("3. sql문 객체화 ok..");

		// 4)SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 실행 요청 ok..");
		MovieDTO dto2 = null;
		while (rs.next()) {
			dto2 = new MovieDTO();
			dto2.setMid(rs.getInt(1));
			dto2.setTitle(rs.getString(2));
			dto2.setStory(rs.getString(3));
			dto2.setMd(rs.getString(4));
			dto2.setJanre(rs.getString(5));
			dto2.setAge(rs.getString(6));
			dto2.setScore(rs.getInt(7));
			dto2.setImg(rs.getString(8));
			dto2.setCount(rs.getInt(9));
			System.out.println(dto2.getImg() + "==============");

		}
		ps.close();
		con.close();
		return dto2;
	}
	
	
}


