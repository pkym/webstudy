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
	// 1. 요청받은 데이터 꺼내오기
	String url = request.getParameter("url");
	// 2. 요청받은 데이터가 어떤 건지 조건비교
	// 3. 조건에 따라서 다른 페이지로 이동하게 만들기
	if(url.equals("네이버")){
	// https://www.naver.com/
		response.sendRedirect("https://www.naver.com/");	
	}else if(url.equals("구글")){
	// https://www.google.co.kr/
		response.sendRedirect("https://www.google.co.kr/");	
	}else{
	// https://www.daum.net/
		response.sendRedirect("https://www.daum.net/");	
	}	
	// response.sendRedirect("url경로")
	// >> 요청 2번, 응담 2번 
	// >> client의 요청이 들어왔을 때, client에게 또 다른 서버로
	// 요청을 보내라고 알려주는 것!
	// >> 페이지 이동처럼 보임
	
	
	
	%>
</body>
</html>