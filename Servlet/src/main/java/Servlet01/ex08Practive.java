package Servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Practice2")
public class ex08Practive extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String color = request.getParameter("color");
		String temp = request.getParameter("num");
		int num = Integer.parseInt(temp);
		
		for(int j=1;j<=num;j++) {
			if(j%2==1) {
				out.printf("<table border =1 bgcolor=%s><tr>",color);		
				
			}else {				
				out.print("<table border =1>"+"<tr>");			
			}
			for(int i=1;i<=j;i++) {
				out.print("<td>"+"*"+"</td>");
			}
		}
		
		
		
		
		
	}

}
