package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.DBConnectionMgr;

public class MemberDAO {
	
//insert 메소드(회원가입시 필요)
	//id, pw, name, birth, tel, email, fJenre1, fJenre2, fJenre3
	public void insert(MemberDTO dto) throws Exception {
		//1. 커넥터 설정 및 DB연결(DBCP)
		//new로 객체생성한 것(주소값을 가져오는 것)과 동일함
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("1. connector설정 및 db연결 ok.." );
		
		//2. SQL문 객체 생성
		//객체화하려는 객체의 주소값만 있으면 됨
		String sql = "insert into member values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		//? 값을 넣는 위치 선언은 ps변수 선언과 ps실행 사이에
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setInt(4, dto.getBirth());
		ps.setString(5, dto.getTel());
		ps.setString(6, dto.getEmail());
		ps.setString(7, dto.getfJenre1());
		ps.setString(8, dto.getfJenre2());
		ps.setString(9, dto.getfJenre3());
		System.out.println("2. SQL문 객체화 ok..");
		
		//3. SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("3. SQL문 실행 요청 ok..");

		con.close();
		ps.close();
	}
	
//select(회원정보 확인시 필요)
	//id, pw, name, birth, tel, email, fJenre1, fJenre2, fJenre3
	public MemberDTO select(MemberDTO dto) throws Exception {
		//1. 커넥터 설정 및 DB연결(DBCP)
		//new로 객체생성한 것(주소값을 가져오는 것)과 동일함
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("1. connector설정 및 db연결 ok.." );
		//2. SQL문 객체 생성
		//객체화하려는 객체의 주소값만 있으면 됨
		String sql = "select * from member where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		System.out.println("2. SQL문 객체화 ok..");
		
		//3. SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		
		MemberDTO dto2 = new MemberDTO();
		if (rs.next()) {
			dto2.setId(rs.getString(1));
			dto2.setPw(rs.getString(2));
			dto2.setName(rs.getString(3));
			dto2.setBirth(rs.getInt(4));
			dto2.setTel(rs.getString(5));
			dto2.setEmail(rs.getString(6));
			dto2.setfJenre1(rs.getString(7));
			dto2.setfJenre2(rs.getString(8));
			dto2.setfJenre3(rs.getString(9));
							
		}
		System.out.println("3. SQL문 실행 요청 ok..");
		
		con.close();
		ps.close();
		rs.close();
		
		return dto2;
		
	}
	
//selectLogin(로그인시 가입여부 확인시 필요)
	//id, pw, name, birth, tel, email, fJenre1, fJenre2, fJenre3
	public int selectLogin(MemberDTO dto) throws Exception {
		//1. 커넥터 설정 및 DB연결(DBCP)
		//new로 객체생성한 것(주소값을 가져오는 것)과 동일함
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("1. connector설정 및 db연결 ok.." );
		//2. SQL문 객체 생성
		//객체화하려는 객체의 주소값만 있으면 됨
		String sql = "select * from member where id=? and pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		
		//3. SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		//boolean 타입 변수 result의 초기값을 false로 할당
		
		int check = 0;
		if (rs.next()) {
			//db안에 있는 dto중에 해당값(id, pw)이 있으면 변수 result에 true를 할당
			check = 0;
		}else { 
			check = 1;
		}
		return check;
	}
	
//update 메소드(회원정보 수정시 필요)	
	//pw, name, birth, tel, email, fJenre1, fJenre2, fJenre3
	public void update(MemberDTO dto) throws Exception {
		//1. 커넥터 설정 및 DB연결(DBCP)
		//new로 객체생성한 것(주소값을 가져오는 것)과 동일함
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		System.out.println("1. connector설정 및 db연결 ok.." );
		
		//2. SQL문 객체 생성
		//객체화하려는 객체의 주소값만 있으면 됨
		String sql = "update member set pw=?, name=?, birth=?, tel=?, email=?, fJenre1=?, fJenre2=?, fJenre3=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getPw());
		ps.setString(2, dto.getName());
		ps.setInt(3, dto.getBirth());
		ps.setString(4, dto.getTel());
		ps.setString(5, dto.getEmail());
		ps.setString(6, dto.getfJenre1());
		ps.setString(7, dto.getfJenre2());
		ps.setString(8, dto.getfJenre3());
		ps.setString(9, dto.getId());
		System.out.println("2. SQL문 객체화 ok..");
		
		//3. SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("3. SQL문 실행 요청 ok..");
		
		con.close();
		ps.close();
	}

//delete 메소드(회원 탈퇴시 필요)
	//id, pw, name, birth, tel, email, fJenre1, fJenre2, fJenre3
	public void delete(MemberDTO dto) throws Exception {
		
	//1. 커넥터 설정 및 DB연결(DBCP)
	//new로 객체생성한 것(주소값을 가져오는 것)과 동일함
	DBConnectionMgr mgr = DBConnectionMgr.getInstance();
	Connection con = mgr.getConnection();
	System.out.println("1. connector설정 및 db연결 ok.." );
	
	//2. SQL문 객체 생성
	//객체화하려는 객체의 주소값만 있으면 됨
	String sql = "delete from member where id = ?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, dto.getId());
	System.out.println("2. SQL문 객체화 ok..");
	
	//3. SQL문 실행 요청
	ps.executeUpdate();
	System.out.println("3. SQL문 실행 요청 ok..");
	
	con.close();
	ps.close();
	
	}
}
