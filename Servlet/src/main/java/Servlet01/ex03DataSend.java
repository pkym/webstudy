package Servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataSend")
public class ex03DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// html로 부터 요청을 받는 공간!!(데이터 가져오는 공간)
		
		// 1. 요청받은 데이터 꺼내오기
		String data=request.getParameter("data");
		System.out.println("요청받은 데이터 >>>" + data);
		// ex) 요청받은 데이터 --> 김운비
		// 김운비님 환영합니다! 웹페이지에 출력하기
		// 2. 응답 형식 지정하기(html 문서형식, 한글 인코딩)
		response.setContentType("text/html;charset=UTF-8");
		// 3. 출력 스트림 꺼내오기
		PrintWriter out = response.getWriter();
		// 4. 요청받은 데이터를 웹페이지에 출력하기
		out.print("<h2>");
		out.print("<marquee direction=right>"+data+"님 환영합니다"+"</marquee>");
		out.print("</h2>");
		
		
		
		
		
		
	}

}
