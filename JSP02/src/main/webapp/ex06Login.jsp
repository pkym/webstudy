<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// client 데이터를 가지고 페이지 이동 흐름 제어
	// 출력해줄 필요 전혀 없음!!
	// logic 중심 servlet으로 보낸다		
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	// 요청은 응답이 되돌아올 때 까지만 유효
	// 다회성으로 id를 기억하고자 할 때는 다른 방법을 해야함
	// 현재는 쿼리스트링 이용해서 보낼 수 있음
if(id.equals("smart")&&pw.equals("123")){
	response.sendRedirect("ex06LoginSuccess.jsp?id="+id);
}else{
	response.sendRedirect("ex06LoginFail.jsp");	
}

%>





</body>
</html>