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
 * Servlet implementation class updateService
 */
@WebServlet("/updateService")
public class updateService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 인코딩
		request.setCharacterEncoding("UTF-8");
		// 2. 수정하고자 넘겨준 데이터 꺼내오기
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		// 수정하고자 하는 회원의 email이 필요
		HttpSession session = request.getSession();
		// getAttribute는 Object 타입이므로 다운캐스팅 필요
		// user는 memberDTO 타입
		memberDTO dto = (memberDTO) session.getAttribute("user");
		String email = dto.getEmail();
		// 3. memberDTO 형태로 묶어주기
		dto = new memberDTO(email, pw, tel, address);
		// 4. DAO로 접근할 수 있는 메소드 사용!
		memberDAO dao = new memberDAO();
		int cnt = dao.update(dto);
		// 5. main.jsp로 이동
		if (cnt > 0) {
			// 회원정보 수정 성공!
			// 바뀐 내용을 기억하면서 main으로 넘어갈 수 있도록 설계
			session.setAttribute("user", dto);
		} else {
			// 회원정보 수정 실패!
		}
		response.sendRedirect("main.jsp");

	}

}
