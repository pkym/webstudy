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
String name=request.getParameter("name");
String[] fruits=request.getParameterValues("fruit");
%>

<table border="1">
<tr>
<td align="center">이름</td>
<td align="center"><%= name%></td>
</tr>
<tr>
<td align="center">좋아하는 과일</td>
<td align="center"><%for(String s:fruits){%><%=s %><%} %></td>
</tr>
</table>

</body>
</html>