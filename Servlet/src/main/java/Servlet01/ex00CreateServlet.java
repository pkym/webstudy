package Servlet01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Create")
//	1. url mapping 값 지정하는 방법
//	- url mapping이란?
//	: web browser에서 Servlet을 동작시켰을 때, 실제 클래스 이름 대신 
//  지정한 문자열을 url mapping(연결)하는 기법
//	>>사용하는 이유
//  (1) 경로가 길어진다 >> 불편함, 짧게 쓰기 위해
//	(2) 경로가 그대로 드러남 >> 부안상 문제 해결
//	annotation("urlmapping")
public class ex00CreateServlet extends HttpServlet {
	// 모든 Servlet은 HttpServlet을 상속받는다
	// >> HttpServlet이 가지고 있는 메소드, 필드를 재사용 혹은 재정의 하는 것이 필요
	// >> HttpServlet은 apache tomcat servlet contatiner에서 제공해준다

//	2. 객체 직렬화 ID
//	>> 해당하는 파일이 Servlet임을 알려주는 고유의 값
//	: 지워도 상관 없지만 문제 발생가능성 O 그대로 두자
	private static final long serialVersionUID = 1L;

//	3. 생성자 메소드: 객체생성하는 순간에 호출되는 메소드         
	public ex00CreateServlet() {
		super(); // 부모클래스 생성자 호출
		System.out.println("생성자 호출");
	}

//	4. init(initialize)
//	Sevletness 시키는 메소드: 초기화(Servlet class이 Servlet임을 인식하게 하는 메소드) 
//	>>초기값을 설정하는 역할
//	객체를 생성하고 초기값을 설정하는 기능은 메모리(자원)를 많이 사용한다
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet 초기화 메소드 호출");
	}

//	5. destroy
//	: Servlet을 삭제하는 기능!(server를 종료하면 호출되는 메소드)
	public void destroy() {
		System.out.println("Destroy 메소드 호출");
	}

//	6. service
//	:main method와 같은 역할
//	:Client 요청을 처리해주는 메소드(어떻게 동작할 지 코드흐름을 정리)
//  :html 코드출력, 조건문, 반복문 등의 로직을 작성하는 구간
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Service 메소드 호출");
	}

//	7. doGet, doPost
//	Client로 부터 요청을 받는 방식은 여러개
//	요청방식(get, post)에 따라서 다른 기능을 수행하고 싶을 때 사용하는 메소드	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
