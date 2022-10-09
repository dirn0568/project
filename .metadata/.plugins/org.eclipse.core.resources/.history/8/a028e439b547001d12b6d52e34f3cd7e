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
<%@ include file="base_head.jsp" %>
</head>
<body>
	<%@ include file="base_body.jsp" %>
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