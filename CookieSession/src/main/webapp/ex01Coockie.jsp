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
	// 쿠키>>브라우저(client)에 저장
	// 요청이 들어올 때, 쿠키 데이터를 요청데이터에 담아같이 보내준다
	Cookie[] cookies = request.getCookies();		
	// 쿠키는 한번에 모든 데이터를 전부 받아와야한다
	// >> 필요한 데이터를 별도로 지정해서 따로 꺼내오는 작업이 필요하다
	%>
	<%=cookies[4].getName() %>
	<%=cookies[4].getValue() %>
	
	
	
</body>
</html>