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
	//0. 한글인코딩 잡아주기
	request.setCharacterEncoding("UTF-8");
	//1. 요청받은 데이터 꺼내오기
	String name = request.getParameter("name");
	String temp1 = request.getParameter("java");
	String temp2 = request.getParameter("web");
	String temp3 = request.getParameter("iot");
	String temp4 = request.getParameter("android");
	//2. 점수 데이터들을 전부 숫자로 변환하기
	int java = Integer.parseInt(temp1);
	int web = Integer.parseInt(temp2);
	int iot = Integer.parseInt(temp3);
	int android = Integer.parseInt(temp4);
	//3. 평균 구하기
	int avg = (web + iot + android + java) / 4;
	String grade = "F";
	//4. 평균에 따른 학점을 구해주기
	if (avg >= 95 && avg <= 100) {
		grade = "A+";
	} else if (avg >= 90) {
		grade = "A";
	} else if (avg >= 85) {
		grade = "B+";
	} else if (avg >= 80) {
		grade = "B";
	}
	%>
	<!-- 5. 결과들을 전부 형식에 맞게 출력해주기 -->
	<fieldset>
	<legend> 학점확인 프로그램 </legend>
	<p align="left">이름: <%=name%></p>
	<p align="left">JAVA 점수: <%=java%></p>
	<p align="left">WEB 점수: <%=web%></p>
	<p align="left">IoT점수: <%=iot%></p>
	<p align="left">ANDROID점수:	<%=android%></p>	
	<p align="left">평균: <%=avg %></p>
	<p align="left">학점: <strong><%=grade %></strong></p>
	</fieldset>
	
</body>
</html>