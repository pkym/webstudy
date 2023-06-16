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
	// 1. session  안에 잇는 데이터 거내오기
	// JSP > .java (내장객체)
	// 🖤🖤🖤🖤.JSP에서는 session 이 내장객체이다🖤🖤🖤🖤🖤
	String name = (String)session.getAttribute("name");
	// String name = (String)object; >> 다운캐스팅
	// 업 캐스팅 된 객체를 본래 자료형으로 강제로 되돌리는 기술
	// Object를 String으로 다시 강제형변환
	
	%>
	
	세션영역에 저장되거 있는 데이터: <%=name %>

</body>
</html>