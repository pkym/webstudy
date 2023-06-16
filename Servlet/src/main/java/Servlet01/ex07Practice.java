package Servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Practice1")
public class ex07Practice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF=8");
		PrintWriter out = response.getWriter();

		String temp = request.getParameter("colour");
		String temp1 = request.getParameter("num1");
		String temp2 = request.getParameter("num2");

		int num1 = Integer.parseInt(temp1);
		int num2 = Integer.parseInt(temp2);

		out.printf("<table border=1 bgcolor=%s><tr>",temp);
		for (int i = num1; i <= num2; i++) {
			for (int j = 1; j < 10; j++) {
				out.print("<td>" + i + "*" + j + "=" + i * j + "</td>");
			}out.print("</tr>");
		}

	}

}
