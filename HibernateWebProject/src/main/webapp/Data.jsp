<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.app.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="StudData" method="get">
	<h1>Welcome to Student Data</h1>
	<table>
		<tr>
			<th>STUDENT-ID</th>
			<th>STUDENT-NAME</th>
			<th>STUDENT-FEE</th>
			<th>AGE</th>
			<th>MOBILE</th>
		</tr>
		<c:forEach items="${list }" var="s">
		<tr>
			<td><c:out value="${s.stdId }" /></td>
			<td><c:out value="${s.stdName }" /></td>
			<td><c:out value="${s.stdFee }" /></td>
			<td><c:out value="${s.stdAge }" /></td>
			<td><c:out value="${s.mob }" /></td>
		</tr>
		</c:forEach>
	</table>
	<br/>
	<c:forEach begin="1" end="${np }" var="i">
		<a href="StudData?pn=${i }">
		<c:out value="${i }" />
		</a>&nbsp;&nbsp;
	</c:forEach>
</form>	
</body>
</html>