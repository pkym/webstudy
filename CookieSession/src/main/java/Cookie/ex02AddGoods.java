package Cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddGoods")
public class ex02AddGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 요청받은 데이터 꺼내오기
		String[] goods = request.getParameterValues("product");
		// 2. 요청받은 데이터들의 갯수 만큼 쿠키를 생성
		// 3. 생성된 쿠키를 응답 객체에 답아주기
		for (int i = 0; i < goods.length; i++) {
			Cookie cookie = new Cookie("cook" + i, goods[i]);
			cookie.setMaxAge(3);
			response.addCookie(cookie);
		}
		// 4. Shop.jsp로 이동
		response.sendRedirect("Shop.jsp");
	}

}
