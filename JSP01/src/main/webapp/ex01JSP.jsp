<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello!</h1>
	<!--jSP구성요소
		1) 지시자(directive)
		2) 선언문(Declaration)
		3) 스크립트릿(Scriptlet): <%%>
		>> jsp 내부에 자바코드를 삽입하고 싶을 때
		4) 표현식(Expresstion) <%=%>
		>> java코드에서 작성한 변수,객체, 메소드 결과를 웹페이지에 출력하고 싶을 때 사용
		>> .java변환시 out.print()메소드가 실행
	 -->

	<%
	//주석도 자바주석으로
	//1~10까지 h1 태그 사용해서 출력해보기!	
	//표현식 안에서는 세미콜론 금지
	for (int i = 0; i < 10; i++) {
	%>
	<h1><%=i + 1%></h1>
	<%
	}
	%>


</body>
</html>