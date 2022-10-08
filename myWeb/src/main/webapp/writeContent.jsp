<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="board.boardDAO" %>
<%@ page import="board.Board" %>
<%@ page import="java.util.ArrayList" %>
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
				String register = null;
				if (session.getAttribute("userID") != null) {
					register = (String) session.getAttribute("userID");
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
		int boardID = -1;
		if (request.getParameter("boardID") != null) {
			boardID = Integer.parseInt(request.getParameter("boardID"));
		}
	%>
	<%
		try{
			Board board = new boardDAO().board_content(boardID);
	%>
		<div class="container">
			<div class="row">
				<table class="table table-striped" style="text-align:center; border:1px solid #dddddd;">
					<thead>
						<tr>
							<th colspan="3" style="background-color:#eeeeee; text-align:center;">게시판 글 보기</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td style="width: 20%;">글 제목</td>
							<td colspan="2"><%= board.getboardtitle() %></td>
						</tr>
						<tr>
							<td style="width: 20%;">작성자</td>
							<td colspan="2"><%= board.getuserid() %></td>
						</tr>
						<tr>
							<td>작성일자</td>
							<td colspan="2"><%= board.getboarddate().substring(0, 11) + board.getboarddate().substring(11, 13) + "시" + board.getboarddate().substring(14, 16) + "분" %></td>
						</tr>
						<tr>
							<td>내용</td>
							<td colspan="2" style="min-height: 200px; text-align: center;"><%= board.getboardcontent().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;") %></td>
						</tr>
					</tbody>
				</table>
	<%
		if ( register.equals(board.getuserid())) {
	%>
		<a href="writeUpdate.jsp?boardID=<%= boardID %>">글수정</a>
		<a href="writeDelete.jsp?boardID=<%= boardID %>">글삭제</a>
	<% 
		}
	%>
			</div>
		</div>
	<%
		} catch(Exception e){
			e.printStackTrace();
		}
	%>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>