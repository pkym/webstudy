package Session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logincheck")
public class logincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("test")&&pw.equals("12345")) {
			// 세션 아이디 가져오기
			HttpSession session = request.getSession();
			// 세션영역에 데이터 저장하기
			session.setAttribute("ID", id);		
			// 저장된 데이터 보내기
			response.sendRedirect("main.jsp");
		}
		
	}

}
