/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2022-01-06 20:05:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.Common;
import infra.TeamDAO;
import infra.PostDAO;
import java.util.*;
import infra.Team;
import infra.Post;

public final class team_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("infra.Team");
    _jspx_imports_classes.add("infra.PostDAO");
    _jspx_imports_classes.add("infra.Post");
    _jspx_imports_classes.add("common.Common");
    _jspx_imports_classes.add("infra.TeamDAO");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script\r\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.6.0.js\"\r\n");
      out.write("  integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script>\r\n");
      out.write(" <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.min.js\" integrity=\"sha256-VazP97ZCwtekAsvgPBSUwPFKdrwD3unUfSGVYrahUqU=\" crossorigin=\"anonymous\"></script> \r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./externalLib/jqgrid/css/ui.jqgrid.css\" /> \r\n");
      out.write("<script src=\"./externalLib/jqgrid/js/i18n/grid.locale-kr.js\" type=\"text/javascript\"></script> \r\n");
      out.write("<script src=\"./externalLib/jqgrid/js/minified/jquery.jqGrid.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"./script/map.js\"></script>  \r\n");
      out.write("<script src=\"./script/script.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./style/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	<div class=\"wrap teamWrap\">\r\n");
      out.write("	");

		if(session.getAttribute("ifmbId") == null) {
			out.print("<script>alert('로그인 후 이용 가능합니다.'); location.replace('index.jsp'); </script>");
			return;
		} 
	
		TeamDAO teamDAO = new TeamDAO();
		int iftmSeq = teamDAO.getTeamSeq((String) session.getAttribute("ifmbId"));
		
		if(iftmSeq < 1) { 
		
      out.write("\r\n");
      out.write("			<h2>소속된 팀이 없습니다.</h2>\r\n");
      out.write("			<a href=\"joinTeam.jsp\">초대코드 입력</a>\r\n");
      out.write("			<a href=\"createTeam.jsp\">팀 생성하기</a>\r\n");
      out.write("		");

			return;
		}
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");

		
		Team team = teamDAO.getTeamData(iftmSeq);
		
		if(team == null) {
			out.print("<script>alert('팀 정보를 불러오지 못했습니다.'); history.back(); </script>");
			return;
		}
	
		if(Integer.parseInt(String.valueOf(session.getAttribute("iftmAdminNy")))==1) {
	
      out.write("\r\n");
      out.write("	<a href=\"teamSetting.jsp\" style=\"float:right;\">팀 설정</a>\r\n");
      out.write("	");
 } else { 
      out.write("\r\n");
      out.write("	<a href=\"execute.jsp?process=leaveTeam\" style=\"float:right;\">팀 탈퇴</a>\r\n");
      out.write("	");
 } 
      out.write("\r\n");
      out.write("	<div id=\"imageBox\">\r\n");
      out.write("		<div class=\"teamInfo\">\r\n");
      out.write("			<p class=\"an\">");
      out.print(team.getIftmAnniversary() );
      out.write("</p>\r\n");
      out.write("			<p class=\"startDay\">D+");
      out.print(Common.calcDate(team.getIftmStartDay()) );
      out.write("</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "map.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<table id=\"t\" border=1 align=\"center\" width=100% style=\"border-collapse : collapse;\"></table>\r\n");
      out.write("	<div id=\"gridPager\"></div>\r\n");
      out.write("	<button onclick=\"location.href='postForm.jsp'\" style=\"float:right; margin-right:100px; padding:5px 30px\">글쓰기</button>\r\n");
      out.write("	<br><br>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		let postDatas = JSON.parse(getList(");
      out.print(iftmSeq);
      out.write("));\r\n");
      out.write("		let imageDatas = JSON.parse(getImageList(");
      out.print(iftmSeq);
      out.write("));\r\n");
      out.write("		let regionDatas = JSON.parse(getRegionList(");
      out.print(iftmSeq);
      out.write("));\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		if(imageDatas) {\r\n");
      out.write("			let imgBox = document.querySelector(\"#imageBox\");\r\n");
      out.write("			let br = document.createElement(\"br\");\r\n");
      out.write("			for(idx in imageDatas) {\r\n");
      out.write("				if(idx == 4) imgBox.appendChild(br);\r\n");
      out.write("				let image = document.createElement(\"img\");\r\n");
      out.write("				image.setAttribute(\"src\", (imageDatas[idx]['ifimPath']+imageDatas[idx]['ifimName']));\r\n");
      out.write("				image.setAttribute(\"width\", 135);\r\n");
      out.write("				image.setAttribute(\"height\", 135);\r\n");
      out.write("				image.setAttribute(\"data-ifptSeq\", imageDatas[idx]['ifptSeq']);\r\n");
      out.write("				image.style.border = \"1px solid #000\";\r\n");
      out.write("				imgBox.appendChild(image);\r\n");
      out.write("			} 			\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		window.onload = function() {\r\n");
      out.write("			for(idx in regionDatas) {\r\n");
      out.write("				fill(regionDatas[idx]['ifrgSido'], regionDatas[idx]['ifrgSigungu'],0,0);\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			$(\"tr\").on(\"click\", function() {\r\n");
      out.write("				console.log(1);\r\n");
      out.write("				location.href=\"./postView.jsp?ifptSeq=\"+$(this).children().eq(0).text();\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			$(\"img\").on(\"click\", function() {\r\n");
      out.write("				location.href = \"./postView.jsp?ifptSeq=\"+$(this).data(\"ifptseq\");\r\n");
      out.write("			});\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		$(\"#t\").jqGrid({\r\n");
      out.write("			datatype: \"local\",\r\n");
      out.write("			data: postDatas,\r\n");
      out.write("			width: 1000,\r\n");
      out.write("			colNames: ['번호','시/도','제목','작성자','조회','작성일'],\r\n");
      out.write("			colModel:[ \r\n");
      out.write("				{\r\n");
      out.write("					name:\"ifptSeq\", \r\n");
      out.write("					index:\"ifptSeq\",  \r\n");
      out.write("					align:'center',\r\n");
      out.write("					resizable : true,\r\n");
      out.write("					formatter: \"numberStr\",\r\n");
      out.write("					sorttype: \"number\",\r\n");
      out.write("				},\r\n");
      out.write("				{\r\n");
      out.write("					name:\"ifrgSido\", \r\n");
      out.write("					index:\"ifrgSido\",  \r\n");
      out.write("					align:'center',\r\n");
      out.write("					resizable : true\r\n");
      out.write("				},\r\n");
      out.write("				{\r\n");
      out.write("					name:\"ifptTitle\", \r\n");
      out.write("					index:\"ifptTitle\",  \r\n");
      out.write("					align:'center',\r\n");
      out.write("					resizable : true\r\n");
      out.write("				},\r\n");
      out.write("				{\r\n");
      out.write("					name:\"ifmbId\", \r\n");
      out.write("					index:\"ifmbId\",  \r\n");
      out.write("					align:'center',\r\n");
      out.write("					resizable : true\r\n");
      out.write("				},\r\n");
      out.write("				{\r\n");
      out.write("					name:\"ifptViewer\", \r\n");
      out.write("					index:\"ifptViewer\",  \r\n");
      out.write("					align:'center',\r\n");
      out.write("					resizable : true,\r\n");
      out.write("					formatter: \"numberStr\",\r\n");
      out.write("					sorttype: \"number\",\r\n");
      out.write("				},\r\n");
      out.write("				{\r\n");
      out.write("					name:\"ifptRegDatetime\", \r\n");
      out.write("					index:\"ifptRegDatetime\",  \r\n");
      out.write("					align:'center',\r\n");
      out.write("					resizable : true\r\n");
      out.write("				}\r\n");
      out.write("				],\r\n");
      out.write("			loadtext: \"로딩중일때 표시되는 텍스트\", \r\n");
      out.write("			caption: \"팀 내 게시글 목록\",\r\n");
      out.write("			pager:\"#gridPager\",\r\n");
      out.write("			rowNum:5,\r\n");
      out.write("			sortable: true,\r\n");
      out.write("			pgbuttons:true,\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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