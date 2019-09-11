<%@page import="java.sql.PreparedStatement"%>
    <%@page import="java.sql.DriverManager"%>
        <%@page import="java.sql.Connection"%>
            <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
                <!DOCTYPE html>
                <html>

                <head>
                    <meta charset="UTF-8">
                    <title>Insert title here</title>
                </head>

                <body>
                    <%
	 	//1. 클라이언트가 입력한 map형태의 파라메터를 받는다.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		/* 이미 만들어져있는 객체 = 빌트인객체 */ 
		//입력한값을 request객체를통해 받는다.
		
				

		//2. DB처리
		//2-1)드라이버설정
		Class.forName("com.mysql.jdbc.Driver");
		out.println("<h5>1. 드라이버 설정 ok!!</h5>");
		//2-2)db연결
		String url = "jdbc:mysql://localhost:3306/phone";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		//connection은 자바밑에있는거사용
		out.println("<h5>2. db연결 ok!!</h5>");
		
		//2-3)sql문 객체화
		String sql = "insert into member2 values ('"+id+"', '"+pw+"', '"+name+"', '"+tel+"')";
		PreparedStatement ps = con.prepareStatement(sql);
		out.println("<h5>3. sql문 객체화 ok!!</h5>");

		//2-4)sql문 실행 요청
		ps.executeUpdate(); //crud중 select빼고사용
		//ps.executeQuery(); 이거는 select만 사용! 

		//3. 처리결과를 클라이언트에게 다시알려준다.
		// => 클라이언트가 볼 수 있는 형태로 만들어서 알려준다.
		// => HTML로 만들어서 클라이언트에게 전송.
		out.println("<hr>");
		out.println("<h3>입력한 정보 확인</h3>");
		out.println("<hr>");

		out.print("<h3>당신이 입력한 id는 " + id + "</h3>");
		out.print("<h3>당신이 입력한 pw는 " + pw + "</h3>");
		out.print("<h3>당신이 입력한 name는 " + name + "</h3>");
		out.print("<h3>당신이 입력한 tel는 " + tel + "</h3>");
		
	%>
                </body>

                </html>