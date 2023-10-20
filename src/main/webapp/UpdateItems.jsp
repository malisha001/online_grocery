<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Items</title>
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
	<form action = "update" method = "post">
	
		Item ID <input type = "text" name= "id" value = "<%= id %>" readonly><br>
		Item Name <input type = "text" name= "name" value = "<%= name%>"><br>
		Category <input type = "text" name= "cat" value = "<%= category%>"><br>
		Brand <input type = "text" name= "brand" value = "<%= brand%>"><br>
		Unit Price <input type = "text" name= "price" value = "<%= price%>"><br>
		Quantity <input type = "text" name= "qty" value = "<%= qty%>"><br>
	    Description <input type = "text" name= "dis" value = "<%= description%>"><br>
		
		<input type = "submit" name = "submit" value = "Update Items"><br>
	
	</form>

</body>
</html>