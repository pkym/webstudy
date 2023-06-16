package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.memberDAO;
import com.smhrd.model.memberDTO;

/**
 * Servlet implementation class loginService
 */
@WebServlet("/loginService")
public class loginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 한글인코딩 잡아오기
		request.setCharacterEncoding("UTF-8");
		// 2. 요청받은 데이터 꺼내오기
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		// 3. 데이터를 하나로 묶어주기
		memberDTO dto = new memberDTO();
		dto.setEmail(email);
		dto.setPw(pw);		
		// 4. DAO 생성하기
		memberDAO dao = new memberDAO();	
		memberDTO result = dao.login(dto);
		// 5. 로그인 기능 수행하기	
		// select * from web member where email=? and pw=?
		if (result != null) {
		// 6. 로그인 헝공시 session 로그인 정보 user라는 이름으로 저장
			HttpSession session = request.getSession();
			//user는 memberDTO 타입
			session.setAttribute("user", result);
		}
		// 7. main.jsp로 redirect 방식으로 이동
		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
		rd.forward(request, response);

	}

}
