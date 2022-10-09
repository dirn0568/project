<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="chat.chatDAO" %>
<!DOCTYPE html>
<html>
<head>
<%@ include file="base_head.jsp" %>
</head>
<body>
	<%@ include file="base_body.jsp" %>
	
	<%
		int chat_room = 1;
		if (request.getParameter("chat_room") != null) {
			chat_room = Integer.parseInt(request.getParameter("chat_room"));
		}
	%>
	들어왔냐?? 근데 여기 몇번방임?
	
	<form method="post" action="chatAction.jsp?chat_room=<%=chat_room%>">
		<h3 style="text-align:center;">메세지</h3>
		<div class="form-group">
			<textarea rows="5" cols="10" class="form-control" placeholder="내용" name="message"></textarea>
		</div>
		<input type="submit" class="btn btn-trimary form-control" value="작성완료">
	</form>
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>