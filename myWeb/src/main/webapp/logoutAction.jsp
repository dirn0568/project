<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.invalidate();
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('로그아웃되었습니다.')");
		script.println("location.href = 'login.jsp'");
		script.println("</script>");
	%>
</body>
</html>