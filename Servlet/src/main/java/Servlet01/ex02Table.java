package Servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex02Table
 */
@WebServlet("/Table")
public class ex02Table extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// 1. 응답 형식 지정하기
		response.setContentType("text/html;charset=UTF-8");
// 2. 출력 스트림 꺼내오기
		PrintWriter out = response.getWriter();
//3. table 태그를 출력하기(1행 6열)
		out.print("<table border =1>"
				+ "<tr>");
		
		for(int i=1;i<7;i++) {
			out.print("<td><marquee onmouseover=stop() onmouseout=start() scrollamount=1 border=3 direction=right>"+i+"</marquee></td>");
		}
		out.print("</tr>");
		

	}

}
