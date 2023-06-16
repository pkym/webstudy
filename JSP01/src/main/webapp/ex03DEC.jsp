<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Declaration -->
	<%=// 표현식
		// 세미콜론X, 선언문 위에 있어도 가능
		// out.print(addNum(4,7))과 같은 모양
		addNum(4, 7)%>

	<%!// 선언문
	// JAVA코드를 작성할 수 있는 공간
	// 변수, 메소드 선언하고 싶을 떄 사용
	// ---> 선언하게 될 변수, 메소드는 전역변수, 전역메소드가 됨

	private int addNum(int num1, int num2) {
		return num1 + num2;
	}%>
</body>
</html>