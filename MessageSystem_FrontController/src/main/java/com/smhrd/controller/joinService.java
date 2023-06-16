package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.memberDAO;
import com.smhrd.model.memberDTO;

public class joinService implements Command {

	String moveURL = null;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			request.setCharacterEncoding("UTF-8");
			
			String email = request.getParameter("email");
			String pw = request.getParameter("pw");
			String tel = request.getParameter("tel");
			String address = request.getParameter("address");
			
			memberDTO dto = new memberDTO(email, pw, tel, address);
			memberDAO dao = new memberDAO();
			
			int cnt = dao.join(dto);			
			if (cnt > 0) {
				request.setAttribute("email", email);
//				RequestDispatcher rd = request.getRequestDispatcher("join_success.jsp");
//				rd.forward(request, response);
				moveURL = "join_success.jsp";
			} else {				
//				response.sendRedirect("main.jsp");
				moveURL = "main.jsp";
			}

		} catch (Exception e) {			
			e.printStackTrace();
		}

		return moveURL;
	}

}
