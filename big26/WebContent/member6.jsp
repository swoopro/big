<%@page import="bean.MemberDAO3"%>
    <%@page import="java.util.ArrayList"%>
        <%@page import="bean.MemberDAO2"%>
            <%@page import="bean.MemberDTO"%>
                <%@page import="com.sun.org.apache.bcel.internal.generic.Select"%>
                    <%@page import="bean.MemberDAO"%>
                        <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
                            <!DOCTYPE html>
                            <html>

                            <head>
                                <meta charset="UTF-8">
                                <title>Insert title here</title>
                                <script src="js/jquery-3.4.1.js"></script>
                                <script>
                                    $(function() {
                                        $("#button").click(function() {
                                            //id reply에 쓴 글을 가지고 온다.
                                            var reply = $("#reply").val();
                                            //div에 계속 자식으로 붙인다.
                                            $("div").append("<img src=img/1.gif width=100 heigth=100>" +
                                                reply + "<br>");
                                        });
                                    });
                                </script>
                            </head>

                            <body>

                                <%//스크립트릿

		//2. DAO사용하여 db처리
		MemberDAO3 dao = new MemberDAO3();
		ArrayList<MemberDTO> list = dao.selectAll();
		out.println("<hr>");
		out.println("<h3>검색한 정보 확인</h3>");
		out.println("<hr>");
	%>
                                    <table border="1" bordercolor="red">
                                        <tr>
                                            <th>아이디</th>
                                            <!-- 테이블헤더 td랑똑같은데 글씨진하게-->
                                            <th>패스워드</th>
                                            <th>이름</th>
                                            <th>연락처</th>
                                        </tr>
                                        <%
		for(int i=0; i < list.size(); i++){
			%>
                                            <tr>
                                                <%
			MemberDTO dto2 = list.get(i);		
		%>
                                                    <!-- %= 표현식, 출력용 -->
                                                    <td>
                                                        <a href="member4.jsp?id=<%=dto2.getId() %>">
                                                            <%= dto2.getId() %>
                                                        </a>
                                                    </td>
                                                    <td>
                                                        <%= dto2.getPw() %>
                                                    </td>
                                                    <td>
                                                        <%= dto2.getName() %>
                                                    </td>
                                                    <td>
                                                        <%= dto2.getTel() %>
                                                    </td>
                                            </tr>
                                            <%
		}
		%>
                                    </table>
                                    <input type="text" id="reply">
                                    <input type="button" value="댓글달기" id="button">
                                    <div></div>
                            </body>

                            </html>