<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<%@ include file="base_head.jsp" %>
</head>
<body>
	<%@ include file="base_body.jsp" %>
	
	<% 
		String a = "홍길동";
		String b = "홍길동";
		
		if (a==b) {
	%>
		a와b가 같음
	<%
		} else {
	%>
		a와b가 같지않음
	<%
		}
	%>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>