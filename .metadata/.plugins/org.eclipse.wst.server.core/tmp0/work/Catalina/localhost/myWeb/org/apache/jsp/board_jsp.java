/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-10-09 10:15:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import board.boardDAO;
import board.Board;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.io.PrintWriter;

public final class board_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/base_head.jsp", Long.valueOf(1665307010557L));
    _jspx_dependants.put("/base_body.jsp", Long.valueOf(1665310491509L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("board.Board");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("board.boardDAO");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width-device-width\", initial-scale=\"1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("<title>JSP 게시판 웹 사이트</title>\r\n");
      out.write("</head>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav class=\"navbar navbar-default\">\r\n");
      out.write("		<div class=\"navbar-header\">\r\n");
      out.write("			<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("				data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"\r\n");
      out.write("				aria-expanded=\"false\">\r\n");
      out.write("				<span class=\"icon-bar\"></span>\r\n");
      out.write("				<span class=\"icon-bar\"></span>\r\n");
      out.write("				<span class=\"icon-bar\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"main.jsp\">JSP 게시판 웹 사이트</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("			<ul class=\"nav navbar-nav\">\r\n");
      out.write("				<li class=\"active\"><a href=\"main.jsp\">메인</a></li>\r\n");
      out.write("				<li><a href=\"board.jsp\">게시판</a></li>\r\n");
      out.write("				<li><a href=\"chat.jsp\">채팅</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			");

				String register = null;
				if (session.getAttribute("userID") != null) {
					register = (String) session.getAttribute("userID");
			
      out.write("\r\n");
      out.write("			<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("				<li class=\"dropdown\">\r\n");
      out.write("					<a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("						data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("						aria-expanded=\"false\">회원관리<span class=\"caret\"></span></a>\r\n");
      out.write("					<ul class=\"dropdown-menu\">\r\n");
      out.write("						<li><a href=\"logoutAction.jsp\">로그아웃</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			");

				} else {
			
      out.write("\r\n");
      out.write("			<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("				<li class=\"dropdown\">\r\n");
      out.write("					<a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("						data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("						aria-expanded=\"false\">접속하기<span class=\"caret\"></span></a>\r\n");
      out.write("					<ul class=\"dropdown-menu\">\r\n");
      out.write("						<li><a href=\"login.jsp\">로그인</a></li>\r\n");
      out.write("						<li><a href=\"join.jsp\">회원가입</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			");

				}
			
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write('	');

		int pageNumber = 1;
		if (request.getParameter("pageNumber") != null) {
			pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		}
	
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<table class=\"table table-striped\" style=\"text-align:center; border:1px solid #dddddd;\">\r\n");
      out.write("				<thead>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th style=\"background-color:#eeeeee; text-align:center;\">번호</th>\r\n");
      out.write("						<th style=\"background-color:#eeeeee; text-align:center;\">제목</th>\r\n");
      out.write("						<th style=\"background-color:#eeeeee; text-align:center;\">작성자</th>\r\n");
      out.write("						<th style=\"background-color:#eeeeee; text-align:center;\">작성일</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</thead>\r\n");
      out.write("				<tbody>\r\n");
      out.write("	");

		try{
			boardDAO board = new boardDAO();
			ArrayList<Board> board_array = board.board_list(pageNumber);
			for(int i = 0; i <= board_array.size(); i++) {
	
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>");
      out.print( board_array.get(i).getboardid() );
      out.write("</td>\r\n");
      out.write("			<td><a href=\"writeContent.jsp?boardID=");
      out.print( board_array.get(i).getboardid());
      out.write('"');
      out.write('>');
      out.print( board_array.get(i).getboardtitle());
      out.write("</a></td>\r\n");
      out.write("			<td>");
      out.print( board_array.get(i).getuserid() );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print( board_array.get(i).getboarddate().substring(0, 11) + board_array.get(i).getboarddate().substring(11, 13) + "시" + board_array.get(i).getboarddate().substring(14, 16) + "분" );
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<p></p>\r\n");
      out.write("	");

			}
		}catch(Exception e){
			e.printStackTrace();
		}
	
      out.write("\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div>\r\n");
      out.write("		<a href=\"write.jsp\">글작성</a>\r\n");
      out.write("	</div>\r\n");
      out.write("	");

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
	
      out.write("\r\n");
      out.write("		<a href=\"board.jsp?pageNumber=");
      out.print(i);
      out.write("\" class=\"btn btn-success btn-arraw-left\">");
      out.print(i);
      out.write("</a>\r\n");
      out.write("	");

			}
		}
	
      out.write('\r');
      out.write('\n');
      out.write('	');

		if (pageNumber == 1) {
	
      out.write("\r\n");
      out.write("		<a href=\"board.jsp?pageNumber=1\" class=\"btn btn-success btn-arraw-left\">이전</a>\r\n");
      out.write("	");

		} else {
	
      out.write("\r\n");
      out.write("		<a href=\"board.jsp?pageNumber=");
      out.print(pageNumber - 1);
      out.write("\" class=\"btn btn-success btn-arraw-left\">이전</a>\r\n");
      out.write("	");

		}
	
      out.write('\r');
      out.write('\n');
      out.write('	');
 
		if(pageNumber == result + 1){
	
      out.write("\r\n");
      out.write("		<a href=\"board.jsp?pageNumber=");
      out.print(result + 1);
      out.write("\" class=\"btn btn-success btn-arraw-left\">다음</a>\r\n");
      out.write("	");
 
		} else {
	
      out.write("\r\n");
      out.write("		<a href=\"board.jsp?pageNumber=");
      out.print(pageNumber + 1);
      out.write("\" class=\"btn btn-success btn-arraw-left\">다음</a>\r\n");
      out.write("	");

		}
	
      out.write("\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("	<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
