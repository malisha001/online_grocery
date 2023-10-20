<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Items</title>
</head>
<body>
<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");	
		String category = request.getParameter("category");
		String brand = request.getParameter("brand");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");
		String description = request.getParameter("description");
	
	%>
	
	<h1>Delete Items</h1>
	<form action = "delete" method = "post">
	
		Item ID <input type = "text" name= "id" value = "<%= id %>" readonly><br>
		Item Name <input type = "text" name= "name" value = "<%= name%>"readonly><br>
		Category <input type = "text" name= "cat" value = "<%= category%>"readonly><br>
		Brand <input type = "text" name= "brand" value = "<%= brand%>"readonly><br>
		Unit Price <input type = "text" name= "price" value = "<%= price%>"readonly><br>
		Quantity <input type = "text" name= "qty" value = "<%= qty%>"readonly><br>
	    Description <input type = "text" name= "dis" value = "<%= description%>"readonly><br>
		
		<input type = "submit" name = "submit" value = "Delete Items"><br>
	
	</form>


</body>
</html>