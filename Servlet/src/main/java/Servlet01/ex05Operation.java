package Servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Op")
public class ex05Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String temp1 = request.getParameter("num1");
		String temp2 = request.getParameter("num2");
		String op = request.getParameter("op");
		
		int num1 = Integer.parseInt(temp1);
		int num2 = Integer.parseInt(temp2);		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int result=cal(num1,num2,op);
		out.printf(num1+op+num2+"="+result);
		
	}
	
	public int cal(int num1, int num2, String op) {
		int result=0;
		if (op.equals("+") ) {
			result = num1+num2;
		}else if (op.equals("-")) {
			result =num1-num2;
		}else if (op.equals("*")) {
			result = num1*num2;
		}else if (op.equals("/")) {
			result = num1/num2;
		}
		return result;
	}

}
