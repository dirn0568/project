<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="board.boardDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="board" class="board.Board" scope="page" /> 
<jsp:setProperty name="board" property="boardtitle" /> 
<jsp:setProperty name="board" property="boardcontent" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int boardID = -1;
		if (request.getParameter("boardID") != null) {
			boardID = Integer.parseInt(request.getParameter("boardID"));
		}
	
		Object register = session.getAttribute("userID");
		if (register == null) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('로그인되어있지 않습니다.')");
			script.println("history.back()");
			script.println("</script>");
		} else {
			String userID = (String) session.getAttribute("userID");
			boardDAO Board = new boardDAO();
			int result = Board.board_delete(boardID);
			if ( result == -1) {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('데이터베이스 오류')");
				script.println("history.back()");
				script.println("</script>");
			} else {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('성공적으로 삭제되었습니다.')");
				script.println("location.href = 'board.jsp'");
				script.println("</script>");
			}
		}

	%>
</body>
</html>