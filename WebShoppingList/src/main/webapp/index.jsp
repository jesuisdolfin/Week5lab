<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "addItemServlet" method = "post">
Store: <input type = "text" name = "store">
Item: <input type = "text" name = "item">
<input type = "submit" value = "Add Item">
</form><br/>
<a href = "viewAllItemsServlet">View the complete list</a>

</body>
</html>