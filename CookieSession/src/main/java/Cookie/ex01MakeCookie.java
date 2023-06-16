package Cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeCookie")
public class ex01MakeCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Server(쿠키 생성하는 곳)
		// 1. 쿠키 생성하기 (값에 문자만 저장 가능)
		Cookie cookie = new Cookie("data", "coockieData");
		// 쿠키의 만료기간
		// >> 별도로 설정하지 않는다면 만료기한은 Session으로 표기
		// >> 브라우저가 종료되기 전까지만 보관하겠다는 의미
		// 쿠키의 만료기한 설정하는 방법(초단위)
		cookie.setMaxAge(31536000);
		// 쿠키 지우는 방법
		// cookie.setMaxAge(0);

		// 2. 쿠키를 http 헤더에 포함시켜서 응답에 담아주기
		// >> 응답에 담아주기 전에 쿠키에 대한 모든 설정을 끝내야한다
		response.addCookie(cookie);

		// 3. ex01Cookkie.jsp 이동
		response.sendRedirect("ex01Coockie.jsp");

	}

}
