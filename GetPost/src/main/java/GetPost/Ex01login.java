package GetPost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Ex01login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0. post 방식일 때 요청받은 데이터 한글 인코딩해주기
		request.setCharacterEncoding("UTF-8");
		//1. 요청받은 데이터 꺼내오기
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		//2. 응답 형식 지정하기
		response.setContentType("text/html;charset=UTF-8");
		//3. 출력스트림 꺼내오기
		PrintWriter out = response.getWriter();
		//4. 로그인 성공실패시 결과보여주기
		if(id.equals("smart")&&pw.equals("123")) {
			out.print(id+"님 환영합니다");
		}else {
			out.print("로그인 정보를 확인하세요");
			
			out.print("입력한 ID: "+id);
		}
		
		
		
		
		
	}

}
