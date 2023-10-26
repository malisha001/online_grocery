<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Management Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: teal">
			<div>
				<a href="#" class="navbar-brand">Policy
					Management Page</a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list" class="nav-link">Policies</a></li>
			</ul>
		</nav>
	</header>
	<br>

	<div class="row">
		

		<div class="container">
			<h3 class="text-center">List of Policies</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add New Policy</a>
			</div>
			<br>
						
<!-- newly added -->
		<% String successMessage = (String) request.getSession().getAttribute("successMessage");
			if (successMessage != null) {%>
			<div class="alert alert-success">
    			<%= successMessage %>
			</div>
		<% } %>	
		<% String errorMessage = (String) request.getSession().getAttribute("errorMessage");
			if (errorMessage != null) {%>
			<div class="alert alert-success">
    			<%= errorMessage %>
			</div>
		<% } %>	
		
<!--  -->
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Policy Type</th>
						<th>Description</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="policy" items="${listPolicy}">

						<tr>
							<td><c:out value="${policy.id}" /></td>
							<td><c:out value="${policy.policyType}" /></td>
							<td><c:out value="${policy.description}" /></td>
							<td><a href="edit?id=<c:out value='${policy.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; 
								<a href="delete?id=<c:out value='${policy.id}' />">Delete</a></td>
						
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>