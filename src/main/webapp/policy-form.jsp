<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Management Form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class= "navbar navbar-expand-md navbar-dark" style="background-color: teal">
			<div>
				<a href="https://www.javaguides.net" class="navbar-brand"> Policy Management Page</a>
			</div>
	
			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list" class="nav-link">Policies</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${policy != null}">
			<form action="update" method="post">
				</c:if>
				<c:if test="${policy == null}">
			<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${policy != null}"> Edit Policy  </c:if>
						<c:if test="${policy == null}"> Add New Policy </c:if>
					</h2>
				</caption>

				<c:if test="${policy != null}">
					<input type="hidden" name="id" value="<c:out value='${policy.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Policy Type</label> <input type="text"
						value="<c:out value='${policy.policyType}' />" class="form-control"
						name="policytype" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Description</label> <input type="text"
						value="<c:out value='${policy.description}' />" class="form-control"
						name="description" required="required">
				</fieldset>

		
				<button type="submit" class="btn btn-success">Save</button>
			</form>
			
			</div>
		</div>
	</div>

</body>
</html>