<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="chat.chatDAO" %>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<%@ include file="base_head.jsp" %>
</head>
<body>
	아니 이거 되고있는거야??
	<%
		String register = null;
		if (session.getAttribute("userID") != null) {
			register = (String) session.getAttribute("userID");
		}
		
		chatDAO chat = new chatDAO();
		String result = chat.room_join(register);
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert()");
		script.println("</script>");
		if (result.equals("")) {
			script.println("<script>");
			script.println("alert('데이터베이스 오류')");
			script.println("history.back()");
			script.println("</script>");
		} else if (result.equals("1")) {
			script.println("<script>");
			script.println("alert('채팅방 1입장')");
			script.println("location.href = 'chat_room.jsp?chat_room=1'");
			script.println("</script>");
		} else if (result.equals("2")){
			script.println("<script>");
			script.println("alert('채팅방 2입장')");
			script.println("location.href = 'chat_room.jsp?chat_room=2'");
			script.println("</script>");
		}
	%>
</body>
</html>