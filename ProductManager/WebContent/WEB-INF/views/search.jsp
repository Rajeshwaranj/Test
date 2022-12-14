<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
</head>
<body>
<div align="center">
	<h2>Search Result</h2>
	<table border="1" cellpadding="5">
		<tr>
			<th>PID</th>
			<th>PName</th>
			<th>DESC</th>
			<th>PRICE</th>
		</tr>
		<c:forEach items="${result}" var="product">
		<tr>
			<td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.description}</td>
			<td>${product.price}</td>
		</tr>
		</c:forEach>
	</table>
</div>	
</body>
</html>