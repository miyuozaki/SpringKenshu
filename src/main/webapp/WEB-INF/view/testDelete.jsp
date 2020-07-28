<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
  <h1>${message}</h1>
  <form:form modelAttribute="testForm">
    ID:<form:input path="id" />
       <input type="submit">
  </form:form>
</body>
</html>