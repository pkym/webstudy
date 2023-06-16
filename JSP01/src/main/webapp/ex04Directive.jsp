<%@ page errorPage="ex05Error.jsp" %>
<!--  errorPage: 해당하는 파일에 문제가 발생했을 때 띄어줄 페이지를 지정 -->
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- page 지시자: JSP 페이지 내부의 전체적인 환결설정을 담당 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=2/0%>
	<%
	//JSP에서 객체를 생성할 때는 자동완성 하기>> import구문 자동생성
	ArrayList<String> list = new ArrayList<>();
	%>

</body>
</html>