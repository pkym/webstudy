package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.memberDAO;
import com.smhrd.model.memberDTO;


@WebServlet("/logoutService")
public class logoutService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		// 로그아웃 요청시 Session에 저장딘 데이터 삭제
		// 1. Session 영역 불러오기		
		HttpSession session = request.getSession();
				
		// 2. session 에 들어있는 user 정보 삭제
		// remove(): 어떤 session의 정보를 삭제할 것인지 "name" 값을 입력해야 한다
		// invalidate():
		session.invalidate();
		session.removeAttribute("user");
		
		// 3. redirect 로 main.jsp 이동
		response.sendRedirect("main.jsp");
		
		
	}

}
