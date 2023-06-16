package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.memberDAO;
import com.smhrd.model.memberDTO;



public class loginService implements Command{
	
	String moveURL=null;


	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
			String email = request.getParameter("email");
			String pw = request.getParameter("pw");
			
			memberDTO dto = new memberDTO();
			dto.setEmail(email);
			dto.setPw(pw);		
		
			memberDAO dao = new memberDAO();	
			memberDTO result = dao.login(dto);
		
			if (result != null) {
			
				HttpSession session = request.getSession();			
				session.setAttribute("user", result);
			}
			
//			response.sendRedirect("main.jsp");
			moveURL="main.jsp";
			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}

		
		return moveURL;
	}

}
