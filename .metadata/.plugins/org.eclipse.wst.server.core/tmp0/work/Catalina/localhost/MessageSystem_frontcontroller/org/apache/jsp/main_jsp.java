/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.72
 * Generated at: 2023-03-21 05:39:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/smhrd/Desktop/WebStudy/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MessageSystem_frontcontroller/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1678417748320L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Forty by HTML5 UP</title>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Wrapper -->\r\n");
      out.write("	<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Header -->\r\n");
      out.write("		<header id=\"header\" class=\"alt\"> <a href=\"index.html\"\r\n");
      out.write("			class=\"logo\"><strong>Forty</strong> <span>by HTML5 UP</span></a> \r\n");
      out.write("			<nav>\r\n");
      out.write("		<!-- 로그인 후 Logout.jsp로 이동할 수 있는'로그아웃'링크와 '개인정보수정'링크를 출력하시오. --> \r\n");
      out.write("		<!-- jstl 문법을 이용해서 적용하기 -->\r\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write(" </nav> </header>\r\n");
      out.write("\r\n");
      out.write("		<!-- Menu -->\r\n");
      out.write("		<nav id=\"menu\">\r\n");
      out.write("		<ul class=\"links\">\r\n");
      out.write("			<li><h5>로그인</h5></li>\r\n");
      out.write("			<form action=\"login.do\" method=\"post\">\r\n");
      out.write("				<li><input type=\"text\" name=\"email\" placeholder=\"Email을 입력하세요\"></li>\r\n");
      out.write("				<li><input type=\"password\" name=\"pw\" placeholder=\"PW를 입력하세요\"></li>\r\n");
      out.write("				<li><input type=\"submit\" value=\"LogIn\" class=\"button fit\"></li>\r\n");
      out.write("			</form>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<ul class=\"actions vertical\">\r\n");
      out.write("			<li><h5>회원가입</h5></li>\r\n");
      out.write("			<form action=\"join.do\" method=\"post\">\r\n");
      out.write("				<!-- DB컬럼명과 name태그 맞추기 -->\r\n");
      out.write("				<li><input type=\"text\" name=\"email\" placeholder=\"Email을 입력하세요\"></li>\r\n");
      out.write("				<li><input type=\"password\" name=\"pw\" placeholder=\"PW를 입력하세요\"></li>\r\n");
      out.write("				<li><input type=\"text\" name=\"tel\" placeholder=\"전화번호를 입력하세요\"></li>\r\n");
      out.write("				<li><input type=\"text\" name=\"address\" placeholder=\"집주소를 입력하세요\"></li>\r\n");
      out.write("				<li><input type=\"submit\" value=\"JoinUs\" class=\"button fit\"></li>\r\n");
      out.write("			</form>\r\n");
      out.write("		</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<!-- Banner -->\r\n");
      out.write("		<section id=\"banner\" class=\"major\">\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<header class=\"major\">\r\n");
      out.write("			<h1>\r\n");
      out.write("				<!-- el방식에서는 get안쓰고 바로 꺼내올 수 있다 -->\r\n");
      out.write("				");
						
			if(session.getAttribute("user") != null){
				
      out.write("\r\n");
      out.write("				");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님 환영합니다\r\n");
      out.write("				");
}else{ 
      out.write("\r\n");
      out.write("				<h1>로그인 해주세요</h1>\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</h1>\r\n");
      out.write("			<!-- 로그인 후 로그인 한 사용자의 세션아이디로 바꾸시오.\r\n");
      out.write("									 ex)smart님 환영합니다 --> </header>\r\n");
      out.write("			<div class=\"content\">\r\n");
      out.write("				<p>\r\n");
      out.write("					아래는 지금까지 배운 웹 기술들입니다.<br>\r\n");
      out.write("				</p>\r\n");
      out.write("				<ul class=\"actions\">\r\n");
      out.write("					<li><a href=\"#one\" class=\"button next scrolly\">확인하기</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("		<!-- Main -->\r\n");
      out.write("		<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("			<!-- One -->\r\n");
      out.write("			<section id=\"one\" class=\"tiles\"> <article> <span\r\n");
      out.write("				class=\"image\"> <img src=\"images/pic01.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">HTML</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>홈페이지를 만드는 기초 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic02.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">CSS</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>HTML을 디자인해주는 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic03.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">Servlet/JSP</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>Java를 기본으로 한 웹 프로그래밍 언어/스크립트 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic04.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">JavaScript</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>HTML에 기본적인 로직을 정의할 수 있는 언어</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic05.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">MVC</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>웹 프로젝트 중 가장 많이 사용하는 디자인패턴</p>\r\n");
      out.write("			</header> </article> <article> <span class=\"image\"> <img\r\n");
      out.write("				src=\"images/pic06.jpg\" alt=\"\" />\r\n");
      out.write("			</span> <header class=\"major\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<a href=\"#\" class=\"link\">Web Project</a>\r\n");
      out.write("			</h3>\r\n");
      out.write("			<p>여러분의 최종프로젝트에 웹 기술을 활용하세요!</p>\r\n");
      out.write("			</header> </article> </section>\r\n");
      out.write("			<!-- Two -->\r\n");
      out.write("			<section id=\"two\">\r\n");
      out.write("			<div class=\"inner\">\r\n");
      out.write("				<header class=\"major\">\r\n");
      out.write("				<h2>나에게 온 메세지 확인하기</h2>\r\n");
      out.write("				</header>\r\n");
      out.write("				<p></p>\r\n");
      out.write("				<ul class=\"actions\">\r\n");
      out.write("					<li>로그인을 하세요.</li>\r\n");
      out.write("					<li><a href=\"#\" class=\"button next scrolly\">전체삭제하기</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			</section>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- Contact -->\r\n");
      out.write("		<section id=\"contact\">\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<section>\r\n");
      out.write("			<form>\r\n");
      out.write("				<div class=\"field half first\">\r\n");
      out.write("					<label for=\"name\">Name</label> <input type=\"text\" id=\"name\"\r\n");
      out.write("						placeholder=\"보내는 사람 이름\" />\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"field half\">\r\n");
      out.write("					<label for=\"email\">Email</label> <input type=\"text\" id=\"email\"\r\n");
      out.write("						placeholder=\"보낼 사람 이메일\" />\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"field\">\r\n");
      out.write("					<label for=\"message\">Message</label>\r\n");
      out.write("					<textarea id=\"message\" rows=\"6\"></textarea>\r\n");
      out.write("				</div>\r\n");
      out.write("				<ul class=\"actions\">\r\n");
      out.write("					<li><input type=\"submit\" value=\"Send Message\" class=\"special\" /></li>\r\n");
      out.write("					<li><input type=\"reset\" value=\"Clear\" /></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</form>\r\n");
      out.write("			</section>\r\n");
      out.write("\r\n");
      out.write("			<section class=\"split\"> <section>\r\n");
      out.write("			<div class=\"contact-method\">\r\n");
      out.write("				<span class=\"icon alt fa-envelope\"></span>\r\n");
      out.write("				<h3>Email</h3>\r\n");
      out.write("				<a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("				<!-- 로그인 한 사용자의 이메일을 출력하시오 -->\r\n");
      out.write("			</div>\r\n");
      out.write("			</section> <section>\r\n");
      out.write("			<div class=\"contact-method\">\r\n");
      out.write("				<span class=\"icon alt fa-phone\"></span>\r\n");
      out.write("				<h3>Phone</h3>\r\n");
      out.write("				<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("				<!-- 로그인 한 사용자의 전화번호를 출력하시오 -->\r\n");
      out.write("			</div>\r\n");
      out.write("			</section> <section>\r\n");
      out.write("			<div class=\"contact-method\">\r\n");
      out.write("				<span class=\"icon alt fa-home\"></span>\r\n");
      out.write("				<h3>Address</h3>\r\n");
      out.write("				<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("				<!-- 로그인 한 사용자의 집주소를 출력하시오 -->\r\n");
      out.write("			</div>\r\n");
      out.write("			</section> </section>\r\n");
      out.write("		</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("		<!-- Footer -->\r\n");
      out.write("		<footer id=\"footer\">\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<ul class=\"icons\">\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-twitter\"><span\r\n");
      out.write("						class=\"label\">Twitter</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-facebook\"><span\r\n");
      out.write("						class=\"label\">Facebook</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-instagram\"><span\r\n");
      out.write("						class=\"label\">Instagram</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-github\"><span\r\n");
      out.write("						class=\"label\">GitHub</span></a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"icon alt fa-linkedin\"><span\r\n");
      out.write("						class=\"label\">LinkedIn</span></a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul class=\"copyright\">\r\n");
      out.write("				<li>&copy; Untitled</li>\r\n");
      out.write("				<li>Design: <a href=\"https://html5up.net\">HTML5 UP</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		</footer>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Scripts -->\r\n");
      out.write("	<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/jquery.scrolly.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/skel.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("	<!--[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->\r\n");
      out.write("	<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /main.jsp(22,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty user}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<a href=\"#menu\">로그인</a>\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /main.jsp(24,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty user}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<!-- 로그인 된 회원이 관리자 인지 일반회원인지에 다라 메뉴 수정하기 -->\r\n");
          out.write("			");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("			");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("			<a href=\"logout.do\">로그아웃</a>\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /main.jsp(26,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email eq 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				<a href=\"selectAll.do\">회원정보관리</a>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /main.jsp(29,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email ne 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				<a href=\"update.jsp\">개인정보수정</a>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }
}
