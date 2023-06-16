package com.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import com.smhrd.model.memberDAO;
import com.smhrd.model.memberDTO;

@WebServlet("/selectAllprogram")
public class selectAllprogram extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. DAO 생성
		memberDAO dao = new memberDAO();
		
		// 2. DAO 실행할 메소드 호출! >> selectAll
		ArrayList<memberDTO> result = dao.selectAll();
		
		// 3. 성공시 사용자의 정보 request 객체에 전달 
		if(result !=null) {
			request.setAttribute("list", result);			
		}
		// 3. 해당 request를 가지고 페이지 이동>> forward 방식 사용
		RequestDispatcher rd = request.getRequestDispatcher("select.jsp");
		rd.forward(request, response);
		// 넘어갈 때 request 가지고 넘어가겠다
		
		for(memberDTO s : result) {
			System.out.print(s.getEmail()+"\t");
			System.out.println(s.getPw());
		}System.out.println();
		
	}

}
