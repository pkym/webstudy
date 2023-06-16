package Servlet01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex06Practice
 */
@WebServlet("/Practice")
public class ex06Practice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String temp = request.getParameter("num");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int num=Integer.parseInt(temp);
		out.print("<table border=1><tr>");
		for(int i=1;i<=num;i++) {
			out.print("<td>"+i+"</td>");
		}
		out.print("</tr>");
		
		
		
		
		
		
		
		
	}

}
