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
		// JSP에서 스코프는 모두 내장객체라 생성할 필요없음
		
		// 요청데이터 꺼내오기
		String r = (String)request.getAttribute("data");
		// 세션데이터 꺼내오기
		String s = (String)session.getAttribute("data2");
		// application 데이터 꺼내오기
		String a = (String)application.getAttribute("data3");
	%>
	
	<%= r %>
	<%= s %>
	<%= a %>

</body>
</html>