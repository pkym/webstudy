<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- JSTL library load
	: java Standard tag Library
	: core library? >> tool for variable declaration , if, for -->
<%@ page isELIgnored="false" %>
<!-- Expression Language: 표현언어 있어야 var=i쓸 수 있음
						: jstl 사용해서 변수,객체,메소드 값을 화면에 풀력할 때 사용
	ex>member.getName() >> member.name 으로 편해짐-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach begin="1" end="10" step="2" var="i">
	<h1>${i}</h1>	
	</c:forEach>
</body>
</html>