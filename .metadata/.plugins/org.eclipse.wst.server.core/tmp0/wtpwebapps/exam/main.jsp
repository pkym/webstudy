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
String id = (String)session.getAttribute("ID");
%>

<table border="1">
<tr><td align="center"><%=id %>님 환영합니다!</td></tr>
<tr><td align="center"><button><a href="logout">로그아웃</a></button></td></tr>
</table>
<script>

</script>
</body>
</html>