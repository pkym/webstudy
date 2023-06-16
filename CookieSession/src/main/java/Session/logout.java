package Session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. session 꺼내오기
		HttpSession session = request.getSession();
		// 2. 세션안에 있는 데이터 삭제하기
		// 데이터 한 개 삭제
		session.removeAttribute("ID");
		// 세션이 갖고 있는 것을 다 무효화
//		session.invalidate();
		
		// 세션무효화 확인-main.jsp로 이동
		response.sendRedirect("main.jsp");
		
		
		
		
	}

}
