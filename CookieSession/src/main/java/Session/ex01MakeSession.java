package Session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MakeSession")
public class ex01MakeSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 세션 요청이 들어오면 서버에서 자동으로 세션 발급
		
		
		// 1. session 가져오기(우리는 꺼내만 오면 됨)
		// 세션 서버에서 자동으로 세션 발급
		// 발금한 세션 키를 브라우저에 자동으로 보내는 것 까지 함
		HttpSession session = request.getSession();
		// >> 요청이 들어온 클라이언트가 갖고 있는 세션 Id를 받아오기
		// >> 세션 ID는 브라우져에 저장되어 있음

		// 2. session 영역에 데이터 저장하기
		session.setAttribute("name", "김운비");
		// Object value = "김운비"; >> 업캐스팅
		// session 영역에는 모든 자료형태를 저장할 수 있다
		// Object는 최상위 객체, 객체끼리 자동형변환 된 것
		// 객체끼리 바뀌려면 상속이 전재되어 있기 때문에 가능
		
		// 3. ex02Session.jsp로 이동
		response.sendRedirect("ex02Session.jsp");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
