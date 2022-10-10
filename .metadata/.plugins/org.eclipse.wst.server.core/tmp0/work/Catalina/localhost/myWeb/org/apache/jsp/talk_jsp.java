/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-10-10 13:25:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class talk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("<!-- Noto-Sans 폰트-->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<!-- JUA 폰트-->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Jua&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/talk.css\">\r\n");
      out.write("<audio id='audio_play' src='resources/pop.mp3'></audio>\r\n");
      out.write("<script type=\"text/javascript\"> \r\n");
      out.write("function play() { \r\n");
      out.write("    var audio = document.getElementById('audio_play'); \r\n");
      out.write("    if (audio.paused) { \r\n");
      out.write("        audio.play(); \r\n");
      out.write("    }else{ \r\n");
      out.write("        audio.pause(); \r\n");
      out.write("        audio.currentTime = 0 \r\n");
      out.write("    } \r\n");
      out.write("} \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- 채팅 아이콘 -->\r\n");
      out.write("    <div class=\"chatIcon font_jua\">\r\n");
      out.write("        <img src=\"resources/img/chat-icon.png\" class=\"iconImg\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 채팅 리스트 / 채팅 방 OPEN / CLOSE -->\r\n");
      out.write("    <script>\r\n");
      out.write("         $(document).on(\"click\", \".chatIcon\", function(){                // 채팅 Icon 클릭 시,\r\n");
      out.write("            if($('.chatContainer').hasClass(\"display-none\")){           // if ) 채팅방이 열려있지 않을 때,\r\n");
      out.write("                $('.chatListContainer').toggleClass('display-none');    // 리스트를 연다.\r\n");
      out.write("            }else{                                                      // else ) 채팅방이 열려있다면,\r\n");
      out.write("                $('.chatContainer').toggleClass('display-none');        // 채팅방을 닫는다.\r\n");
      out.write("                websocket.close();\r\n");
      out.write("            }\r\n");
      out.write("             \r\n");
      out.write("             if(!$('.chatListContainer').hasClass('display-none')){         // 채팅 리스트가 닫혀 있을 때\r\n");
      out.write("                getRoomList();                                            // 채팅 방 목록을 불러온다.\r\n");
      out.write("             }\r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("         $(document).on(\"click\", \"img.close\", function(){                // X 버튼 클릭 시,\r\n");
      out.write("             $('.chatContainer').toggleClass('display-none');           // 채팅방을 닫는다.\r\n");
      out.write("             websocket.close();                                            // socket 연결 종료\r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("         $(document).on(\"click\", \"img.down\", function(){                 // - 버튼 클릭 시,\r\n");
      out.write("             $('.chatContainer').toggleClass('display-none');           // 채팅방을 닫고,\r\n");
      out.write("             $('.chatListContainer').toggleClass('display-none');       // 리스트를 연다.\r\n");
      out.write("             websocket.close();                                            // socket 연결 종료\r\n");
      out.write("         });\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- 채팅 창 -->\r\n");
      out.write("    <div class=\"chatContainer display-none\">\r\n");
      out.write("        <div class=\"chatTop\">\r\n");
      out.write("            <div class=\"floatLeft\" id=\"loginOn\">\r\n");
      out.write("                <img class=\"profile_img\" id=\"setPic\"><!-- src 사진 경로 동적 생성 -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"name_container font_noto\" id=\"setName\"><!-- 이름 동적 생성 --></div>\r\n");
      out.write("            <div class=\"floatRight\">\r\n");
      out.write("                <img src=\"resources/img/chat-close.png\" class=\"btnImg close\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"floatRight\">\r\n");
      out.write("                <img src=\"resources/img/chat-minus.png\" class=\"btnImg down\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"chatMiddle\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <!-- 동적 생성 -->\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"chatBottom\">\r\n");
      out.write("            <textarea placeholder=\"메세지를 입력해 주세요.\"></textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- format -->\r\n");
      out.write("    <div class=\"chatMiddle format\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("                <div class=\"sender\">\r\n");
      out.write("                    <span></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"message\">\r\n");
      out.write("                    <span></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("    <!-- 채팅 리스트 -->\r\n");
      out.write("    <div class=\"chatListContainer font_jua display-none\">\r\n");
      out.write("        <div class=\"chatTop\">\r\n");
      out.write("            <div style=\"padding: 10px; margin-left: 4px;\">니즈톡 리스트</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"chatList\">\r\n");
      out.write("            <!-- 동적 생성 -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- 채팅 목록 관련 -->\r\n");
      out.write("    <script>\r\n");
      out.write("        // 총 읽지 않은 갯수\r\n");
      out.write("        let countAll = 0;\r\n");
      out.write("        \r\n");
      out.write("        function getRoomList(){\r\n");
      out.write("            // 채팅 방 목록 가져오기\r\n");
      out.write("             $.ajax({\r\n");
      out.write("                url:\"chatRoomList.do\",\r\n");
      out.write("                data:{\r\n");
      out.write("                    userEmail:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                },\r\n");
      out.write("                dataType:\"json\",\r\n");
      out.write("                async:false, // async : false를 줌으로써 비동기를 동기로 처리 할 수 있다.\r\n");
      out.write("                success:function(data){\r\n");
      out.write("                    \r\n");
      out.write("                    // 현재 로그인 된 User들\r\n");
      out.write("                    let loginList = \"\";\r\n");
      out.write("                      \r\n");
      out.write("                    // 로그인 된 User들을 가져온다.\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        url:\"chatSession.do\",\r\n");
      out.write("                        data:{\r\n");
      out.write("                        },\r\n");
      out.write("                        async:false,\r\n");
      out.write("                        dataType:\"json\",\r\n");
      out.write("                        success:function(data){\r\n");
      out.write("                            for(var i = 0; i < data.length; i++){\r\n");
      out.write("                                loginList += data[i];\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                      \r\n");
      out.write("                     $chatWrap = $(\".chatList\");\r\n");
      out.write("                    $chatWrap.html(\"\");\r\n");
      out.write("                    \r\n");
      out.write("                    var $div;     // 1단계\r\n");
      out.write("                    var $img;     // 2단계\r\n");
      out.write("                    var $divs;     // 2단계\r\n");
      out.write("                    var $span;    // 2단계\r\n");
      out.write("                    \r\n");
      out.write("                    if(data.length > 0){\r\n");
      out.write("                        // 읽지 않은 메세지 초기화\r\n");
      out.write("                        countAll = 0;\r\n");
      out.write("                        \r\n");
      out.write("                        // 태그 동적 추가\r\n");
      out.write("                        for(var i in data){\r\n");
      out.write("                        \r\n");
      out.write("                            // 자신이 구매자 입장일 때\r\n");
      out.write("                            if(data[i].userEmail == \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"){\r\n");
      out.write("                                // 현재 판매자가 로그인 상태 일 때\r\n");
      out.write("                                if(loginList.indexOf(data[i].masterEmail) != -1){\r\n");
      out.write("                                    $div = $(\"<div class='chatList_box enterRoomList' onclick='enterRoom(this);'>\").attr(\"id\",data[i].roomId).attr(\"email\",data[i].masterEmail);\r\n");
      out.write("                                }\r\n");
      out.write("                                // 현재 판매자가 로그아웃 상태 일 때\r\n");
      out.write("                                else{\r\n");
      out.write("                                    $div = $(\"<div class='chatList_box2 enterRoomList' onclick='enterRoom(this);'>\").attr(\"id\",data[i].roomId).attr(\"email\",data[i].masterEmail);\r\n");
      out.write("                                }\r\n");
      out.write("                                $img = $(\"<img class='profile_img'>\").attr(\"src\", \"resources/masterImg/\" + data[i].masterPic);\r\n");
      out.write("                                $divs = $(\"<div class='userNameId'>\").text(data[i].masterName);\r\n");
      out.write("                            }\r\n");
      out.write("                            // 자신이 판매자 입장일 때\r\n");
      out.write("                            else{                        \r\n");
      out.write("                                // 현재 구매자가 로그인 상태 일 때\r\n");
      out.write("                                if(loginList.indexOf(data[i].userEmail) != -1){\r\n");
      out.write("                                    $div = $(\"<div class='chatList_box enterRoomList' onclick='enterRoom(this);'>\").attr(\"id\",data[i].roomId).attr(\"email\",data[i].userEmail);\r\n");
      out.write("                                }\r\n");
      out.write("                                // 현재 구매자가 로그아웃 상태 일 때\r\n");
      out.write("                                else{\r\n");
      out.write("                                    $div = $(\"<div class='chatList_box2 enterRoomList' onclick='enterRoom(this);'>\").attr(\"id\",data[i].roomId).attr(\"email\",data[i].userEmail);\r\n");
      out.write("                                }                                \r\n");
      out.write("                                $img = $(\"<img class='profile_img'>\").attr(\"src\", \"resources/img/\" + data[i].userPic);\r\n");
      out.write("                                $divs = $(\"<div class='userNameId'>\").text(data[i].userName);\r\n");
      out.write("                            }\r\n");
      out.write("                            \r\n");
      out.write("                            // 읽지 않은 메세지가 0이 아닐 때\r\n");
      out.write("                            if(data[i].unReadCount != 0){\r\n");
      out.write("                                $span = $(\"<span class='notRead'>\").text(data[i].unReadCount);\r\n");
      out.write("                            }else{\r\n");
      out.write("                                $span = $(\"<span>\");\r\n");
      out.write("                            }\r\n");
      out.write("                            \r\n");
      out.write("                            $div.append($img);\r\n");
      out.write("                            $div.append($divs);\r\n");
      out.write("                            $div.append($span);\r\n");
      out.write("                            \r\n");
      out.write("                            $chatWrap.append($div);\r\n");
      out.write("                            \r\n");
      out.write("                            // String을 int로 바꿔주고 더해준다.\r\n");
      out.write("                            countAll += parseInt(data[i].unReadCount);\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        // 화면 로딩 된 후\r\n");
      out.write("        $(window).on('load', function(){\r\n");
      out.write("            \r\n");
      out.write("            // 2초에 한번씩 채팅 목록 불러오기(실시간 알림 전용)\r\n");
      out.write("            setInterval(function(){\r\n");
      out.write("                // 방 목록 불러오기\r\n");
      out.write("                getRoomList();\r\n");
      out.write("                \r\n");
      out.write("                // 읽지 않은 메세지 총 갯수가 0개가 아니면\r\n");
      out.write("                if(countAll != 0){\r\n");
      out.write("                    // 채팅 icon 깜빡거리기\r\n");
      out.write("                    $('.chatIcon').addClass('iconBlink');\r\n");
      out.write("                    play();\r\n");
      out.write("                }else{\r\n");
      out.write("                    // 깜빡거림 없애기\r\n");
      out.write("                    $('.chatIcon').removeClass('iconBlink');\r\n");
      out.write("                }\r\n");
      out.write("            },2000);\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- 채팅 방 관련 -->\r\n");
      out.write("    <script>\r\n");
      out.write("        let roomId;\r\n");
      out.write("        // enter 키 이벤트\r\n");
      out.write("        $(document).on('keydown', 'div.chatBottom textarea', function(e){\r\n");
      out.write("             if(e.keyCode == 13 && !e.shiftKey) {\r\n");
      out.write("                 e.preventDefault(); // 엔터키가 입력되는 것을 막아준다.\r\n");
      out.write("                 const message = $(this).val();  // 현재 입력된 메세지를 담는다.\r\n");
      out.write("                   \r\n");
      out.write("                 let search3 = $('div.chatBottom textarea').val();\r\n");
      out.write("                  \r\n");
      out.write("                 if(search3.replace(/\\s|  /gi, \"\").length == 0){\r\n");
      out.write("                       return false;\r\n");
      out.write("                       $('div.chatBottom textarea').focus();\r\n");
      out.write("                    }\r\n");
      out.write("                 \r\n");
      out.write("                 sendMessage(message);\r\n");
      out.write("                 // textarea 비우기\r\n");
      out.write("                 clearTextarea();\r\n");
      out.write("             }\r\n");
      out.write("        });\r\n");
      out.write(" \r\n");
      out.write("        // 채팅 방 클릭 시 방번호 배정 후 웹소켓 연결\r\n");
      out.write("        function enterRoom(obj){\r\n");
      out.write("            // 현재 html에 추가되었던 동적 태그 전부 지우기\r\n");
      out.write("            $('div.chatMiddle:not(.format) ul').html(\"\");\r\n");
      out.write("            // obj(this)로 들어온 태그에서 id에 담긴 방번호 추출\r\n");
      out.write("            roomId = obj.getAttribute(\"id\");\r\n");
      out.write("             // 해당 채팅 방의 메세지 목록 불러오기\r\n");
      out.write("              $.ajax({\r\n");
      out.write("                url:roomId + \".do\",\r\n");
      out.write("                data:{\r\n");
      out.write("                    userEmail:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                },\r\n");
      out.write("                async:false,\r\n");
      out.write("                dataType:\"json\",\r\n");
      out.write("                success:function(data){\r\n");
      out.write("                    for(var i = 0; i < data.length; i++){\r\n");
      out.write("                        // 채팅 목록 동적 추가\r\n");
      out.write("                        CheckLR(data[i]);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("             // 웹소켓 연결\r\n");
      out.write("             connect();\r\n");
      out.write("             console.log(\"enterRoom\");\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        // 채팅 방 열어주기\r\n");
      out.write("        $(document).on(\"click\", \".enterRoomList\",function(){\r\n");
      out.write("             $(\".chatContainer\").toggleClass(\"display-none\");\r\n");
      out.write("             $(this).parent().parent().toggleClass(\"display-none\");\r\n");
      out.write("             // 이름 추가\r\n");
      out.write("             $(\"#setName\").html($(this).children('div').html());\r\n");
      out.write("             // 사진 추가\r\n");
      out.write("             $(\"#setPic\").attr(\"src\",$(this).children('img').attr('src'));\r\n");
      out.write("             // 스크롤바 아래 고정\r\n");
      out.write("            $('div.chatMiddle').scrollTop($('div.chatMiddle').prop('scrollHeight'));\r\n");
      out.write("             // 로그인 상태 일 때 \r\n");
      out.write("             if($(this).hasClass('chatList_box')){\r\n");
      out.write("                 // 점 표시\r\n");
      out.write("                $('#loginOn').addClass('profile_img_Container');\r\n");
      out.write("             }\r\n");
      out.write("             // 로그아웃 상태 일 때\r\n");
      out.write("             else{\r\n");
      out.write("                 // 점 빼기\r\n");
      out.write("                 $('#loginOn').removeClass('profile_img_Container');\r\n");
      out.write("             }\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        // 웹소켓\r\n");
      out.write("         let websocket;\r\n");
      out.write("     \r\n");
      out.write("         //입장 버튼을 눌렀을 때 호출되는 함수\r\n");
      out.write("         function connect() {\r\n");
      out.write("             // 웹소켓 주소\r\n");
      out.write("             var wsUri = \"ws://");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(':');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverPort}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/websocket/echo.do\";\r\n");
      out.write("             // 소켓 객체 생성\r\n");
      out.write("             websocket = new WebSocket(wsUri);\r\n");
      out.write("             //웹 소켓에 이벤트가 발생했을 때 호출될 함수 등록\r\n");
      out.write("             websocket.onopen = onOpen;\r\n");
      out.write("             websocket.onmessage = onMessage;\r\n");
      out.write("             console.log(websocket.send);\r\n");
      out.write("         }\r\n");
      out.write("         \r\n");
      out.write("         //웹 소켓에 연결되었을 때 호출될 함수\r\n");
      out.write("         function onOpen() {\r\n");
      out.write("             // ENTER-CHAT 이라는 메세지를 보내어, Java Map에 session 추가\r\n");
      out.write("             const data = {\r\n");
      out.write("                    \"roomId\" : roomId,\r\n");
      out.write("                    \"name\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\",\r\n");
      out.write("                    \"email\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\",\r\n");
      out.write("                 \"message\" : \"ENTER-CHAT\"\r\n");
      out.write("            };\r\n");
      out.write("            let jsonData = JSON.stringify(data);\r\n");
      out.write("             websocket.send(jsonData);\r\n");
      out.write("             console.log(websocket);\r\n");
      out.write("         }\r\n");
      out.write("         \r\n");
      out.write("        // * 1 메시지 전송\r\n");
      out.write("        function sendMessage(message){\r\n");
      out.write("            \r\n");
      out.write("            const data = {\r\n");
      out.write("                \"roomId\" : roomId,\r\n");
      out.write("                \"name\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\",\r\n");
      out.write("                \"email\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\",\r\n");
      out.write("                \"message\"   : message \r\n");
      out.write("            };\r\n");
      out.write("              \r\n");
      out.write("            CheckLR(data);\r\n");
      out.write("             \r\n");
      out.write("            let jsonData = JSON.stringify(data);\r\n");
      out.write("             \r\n");
      out.write("             websocket.send(jsonData);\r\n");
      out.write("         }\r\n");
      out.write("        \r\n");
      out.write("         // * 2 메세지 수신\r\n");
      out.write("         function onMessage(evt) {\r\n");
      out.write("             \r\n");
      out.write("            let receive = evt.data.split(\",\");\r\n");
      out.write("             \r\n");
      out.write("            const data = {\r\n");
      out.write("                    \"name\" : receive[0],\r\n");
      out.write("                    \"email\" : receive[1],\r\n");
      out.write("                 \"message\" : receive[2]\r\n");
      out.write("            };\r\n");
      out.write("             \r\n");
      out.write("             if(data.email != \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"){\r\n");
      out.write("                CheckLR(data);\r\n");
      out.write("             }\r\n");
      out.write("        }\r\n");
      out.write("         \r\n");
      out.write("        // * 2-1 추가 된 것이 내가 보낸 것인지, 상대방이 보낸 것인지 확인하기\r\n");
      out.write("        function CheckLR(data) {\r\n");
      out.write("            // email이 loginSession의 email과 다르면 왼쪽, 같으면 오른쪽\r\n");
      out.write("            const LR = (data.email != \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\") ? \"left\" : \"right\";\r\n");
      out.write("             // 메세지 추가\r\n");
      out.write("            appendMessageTag(LR, data.email, data.message, data.name);\r\n");
      out.write("        }\r\n");
      out.write("         \r\n");
      out.write("        // * 3 메세지 태그 append\r\n");
      out.write("        function appendMessageTag(LR_className, email, message, name) {\r\n");
      out.write("             \r\n");
      out.write("            const chatLi = createMessageTag(LR_className, email, message, name);\r\n");
      out.write("         \r\n");
      out.write("            $('div.chatMiddle:not(.format) ul').append(chatLi);\r\n");
      out.write("         \r\n");
      out.write("            // 스크롤바 아래 고정\r\n");
      out.write("            $('div.chatMiddle').scrollTop($('div.chatMiddle').prop('scrollHeight'));\r\n");
      out.write("        }\r\n");
      out.write("         \r\n");
      out.write("        // * 4 메세지 태그 생성\r\n");
      out.write("        function createMessageTag(LR_className, email, message, name) {\r\n");
      out.write("         \r\n");
      out.write("             // 형식 가져오기\r\n");
      out.write("             let chatLi = $('div.chatMiddle.format ul li').clone();\r\n");
      out.write("         \r\n");
      out.write("             chatLi.addClass(LR_className);              // left : right 클래스 추가\r\n");
      out.write("             // find() : chatLi의 하위 요소 찾기\r\n");
      out.write("             chatLi.find('.sender span').text(name);      // 이름 추가\r\n");
      out.write("             chatLi.find('.message span').text(message); // 메세지 추가\r\n");
      out.write("         \r\n");
      out.write("             return chatLi;\r\n");
      out.write("        };\r\n");
      out.write("         \r\n");
      out.write("        // * 5 - 채팅창 비우기\r\n");
      out.write("        function clearTextarea() {\r\n");
      out.write("             $('div.chatBottom textarea').val('');\r\n");
      out.write("             return false;\r\n");
      out.write("        };\r\n");
      out.write("    </script>\r\n");
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