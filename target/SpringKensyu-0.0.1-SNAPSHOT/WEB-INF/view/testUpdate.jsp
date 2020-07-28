 <!DOCTYPE html>
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<h1>${message}</h1>
	Nameを更新してください。
	<form:form modelAttribute="testForm">
		<p>ID : ${test.id}</p>
		<p>NAME : <form:input path="name"/></p>
		<input type="submit">
	</form:form>
</body>
</html>