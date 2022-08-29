<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Product</title>
</head>
<body>
	<div align="center">
		<h2>New Product</h2>
		<form:form action="save" method="post" modelAttribute="product">
			<table border="0" cellpadding="5">
				<tr>
					<td>ProductName: </td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Desc: </td>
					<td><form:input path="description" /></td>
				</tr>
				<tr>
					<td>Price: </td>
					<td><form:input path="price" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>						
			</table>
		</form:form>
	</div>
</body>
</html>