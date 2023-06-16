package com.smhrd.Frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.joinService;
import com.smhrd.controller.loginService;
import com.smhrd.model.memberDAO;
import com.smhrd.model.memberDTO;

@WebServlet("*.do")
// *.do >> 전체파일을 .do 라는 확장자로 mapping 하여,
// .do가 붙어있는 경우 어떤 요청이라도 Frontcontroller로 연결하겠다!!
public class Frontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청된 uri 주소가 어디인지 확인!	
		String uri = request.getRequestURI();
		System.out.println(uri);		
		// 2. 프로젝트의 이름 확인!
		String path = request.getContextPath();
		System.out.println(path);		
		// 3. 1~2번을 활용하여 필요한 요청 이름 확인!
		String name= uri.substring(path.length()+1);
		System.out.println("요청이름>> "+name);
		
		// 실행 이후 이동 url 저장을 위한 변수
		String moveURL = null;
		// 요청된 내용에 따라 기능 연결!
		
		if(name.equals("login.do")) {
			// Command가 가지고 있는 execute() 사용하여
			// 각각의 클래스 실행
			loginService login = new loginService();
			moveURL=login.execute(request, response);	
			System.out.println("로그인에 성공하셨습니다.");
			
		}else if(name.equals("join.do")) {
			
			joinService join = new joinService();
			moveURL=join.execute(request, response);
			System.out.println("회원가입에 성공하셨습니다.");
			
			
		}else if(name.equals("update.do")) {
			
		}else if(name.equals("logout.do")) {
			
		}else if(name.equals("selectAll.do")) {
			
		}else {
			System.out.println("잘못된 요청값");
		}
			
		
		// 조건문에 따라 판단된 moveURL 페이지 이동 진행하기
		// 각각의 기능에 따라 sendRedirect 방식인 경우도 있고 forward 방식인 경우도 있기 때문에 
		// 포괄적으로 어느 때나 쓸 수 있는 forward 방식 채택
		RequestDispatcher rd = request.getRequestDispatcher(moveURL);
		rd.forward(request, response);
	
	}
	

}
