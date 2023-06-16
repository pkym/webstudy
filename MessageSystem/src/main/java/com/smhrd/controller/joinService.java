package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.memberDAO;
import com.smhrd.model.memberDTO;

@WebServlet("/joinService")
public class joinService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 한글 인코딩
		request.setCharacterEncoding("UTF-8");
		// 2. 요청받은 데이터 가져오기
		String email = request.getParameter("email");		
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");

		// joinservice가 DAO한테 DB한테 뭔가 해줘라고 일을 시킴
		// DAO에게 정보를 보낼 때 >> 클래스(우리만의 자료형)을 생성
		
		// 3. 요청받은 데이터들을 하나의 자료형으로 묶어주기
		memberDTO dto = new memberDTO(email, pw, tel, address);
		
		// 4. 회원가입 기능 수행하기
		// 데이터베이스 연결과 관련 기능 쓰겠다
		memberDAO dao = new memberDAO();
		// dto를 매개변수로 넘겨주는 것
		int cnt = dao.join(dto);
		
		// 5. 회원가입 성공 시 join_success.jsp로 forward방식 이동
		// >> request scope 영역에 회원가입한 emaill을 저장해서 이동
		if (cnt > 0) {
			request.setAttribute("email", email);
			RequestDispatcher rd= request.getRequestDispatcher("join_success.jsp");
			rd.forward(request, response);
		} else {
			// 6. 회원가입 실패 시 main.jsp로 redirect 방식 이동
			response.sendRedirect("main.jsp");
		}
		

	}

}
