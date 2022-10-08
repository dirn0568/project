<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="board.boardDAO" %>
<%@ page import="board.Board" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width-device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>JSP 게시판 웹 사이트</title>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="main.jsp">JSP 게시판 웹 사이트</a>
		</div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active"><a href="main.jsp">메인</a></li>
				<li><a href="board.jsp">게시판</a></li>
			</ul>
			<%
				Object register = session.getAttribute("userID");
				if (register == null) {
			%>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="login.jsp">로그인</a></li>
						<li><a href="join.jsp">회원가입</a></li>
					</ul>
				</li>
			</ul>
			<%
				} else {
			%>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">회원관리<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="logoutAction.jsp">로그아웃</a></li>
					</ul>
				</li>
			</ul>
			<%
				}
			%>
		</div>
	</nav>
	<%
		int pageNumber = 1;
		if (request.getParameter("pageNumber") != null) {
			pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		}
	%>
	<div class="container">
		<div class="row">
			<table class="table table-striped" style="text-align:center; border:1px solid #dddddd;">
				<thead>
					<tr>
						<th style="background-color:#eeeeee; text-align:center;">번호</th>
						<th style="background-color:#eeeeee; text-align:center;">제목</th>
						<th style="background-color:#eeeeee; text-align:center;">작성자</th>
						<th style="background-color:#eeeeee; text-align:center;">작성일</th>
					</tr>
				</thead>
				<tbody>
	<%
		try{
			boardDAO board = new boardDAO();
			ArrayList<Board> board_array = board.board_list(pageNumber);
			for(int i = 0; i <= board_array.size(); i++) {
	%>
		<tr>
			<td><%= board_array.get(i).getboardid() %></td>
			<td><a href="writeContent.jsp?boardID=<%= board_array.get(i).getboardid()%>"><%= board_array.get(i).getboardtitle()%></a></td>
			<td><%= board_array.get(i).getuserid() %></td>
			<td><%= board_array.get(i).getboarddate().substring(0, 11) + board_array.get(i).getboarddate().substring(11, 13) + "시" + board_array.get(i).getboarddate().substring(14, 16) + "분" %></td>
		</tr>
		<p></p>
	<%
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
				</tbody>
			</table>
		</div>
	</div>
	<div>
		<a href="write.jsp">글작성</a>
	</div>
	<%
		boardDAO board = new boardDAO();
		int result = board.getpage();
		
		if (result==-1) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('데이터베이스 오류')");
			script.println("history.back()");
			script.println("</script>");
		} else {
			for(int i = 1; i <= result + 1; i++) {
	%>
		<a href="board.jsp?pageNumber=<%=i%>" class="btn btn-success btn-arraw-left"><%=i%></a>
	<%
			}
		}
	%>
	<%
		if (pageNumber == 1) {
	%>
		<a href="board.jsp?pageNumber=1" class="btn btn-success btn-arraw-left">이전</a>
	<%
		} else {
	%>
		<a href="board.jsp?pageNumber=<%=pageNumber - 1%>" class="btn btn-success btn-arraw-left">이전</a>
	<%
		}
	%>
	<% 
		if(pageNumber == result + 1){
	%>
		<a href="board.jsp?pageNumber=<%=result + 1%>" class="btn btn-success btn-arraw-left">다음</a>
	<% 
		} else {
	%>
		<a href="board.jsp?pageNumber=<%=pageNumber + 1%>" class="btn btn-success btn-arraw-left">다음</a>
	<%
		}
	%>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>