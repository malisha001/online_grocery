<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item List</title>
</head>
<body>
	<table>
		<tr>
			<th>Item ID</th>
			<th>Item Name</th>
			<th>Category</th>
			<th>Brand</th>
			<th>Unit Price</th>
			<th>Quantity</th>
			<th>Description</th>
			<th>Action</th>
		</tr>
	<c:forEach var = "item" items = "${items}">
	
	<c:set var = "id" value = "${item.id}"/>
	<c:set var = "name" value = "${item.name}"/>
	<c:set var = "category" value = "${item.category}"/>
	<c:set var = "brand" value = "${item.brand}"/>
	<c:set var = "price" value = "${item.unitPrice}"/>
	<c:set var = "qty" value = "${item.quantity}"/>
	<c:set var = "description" value = "${item.description}"/>
	
	<c:url value = "UpdateItems.jsp" var ="itemUpdate">
		<c:param name ="id" value ="${id }"/>
		<c:param name ="name" value ="${name }"/>
		<c:param name ="category" value ="${category }"/>
		<c:param name ="brand" value ="${brand }"/>
		<c:param name ="price" value ="${price }"/>
		<c:param name ="qty" value ="${qty }"/>
		<c:param name ="description" value ="${description }"/>
	</c:url>
	
		<tr>
			<td>${item.id}</td>
			<td>${item.name}</td>
			<td>${item.category}</td>
			<td>${item.brand}</td>
			<td>${item.unitPrice}</td>
			<td>${item.quantity}</td>
			<td>${item.description}</td>
			<td>
			<div style="display: flex; margin:auto;">
				<form
					action="${itemUpdate}"
					method="post"
				>
					<input type = "submit" name ="update" value ="Update Items">
				</form>
				<form action="DeleteItemServlet" method = "post">
					<input type = "hidden" name="delete" value="${item.id}">
					<input type = "submit" name="submit" value ="Delete Items">
				</form>
			</div>

			</td>
		</tr>	
	
	</c:forEach>
	</table>
	

	

	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>