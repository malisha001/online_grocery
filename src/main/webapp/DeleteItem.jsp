<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Delete Items</title>
 	<link rel="stylesheet" href="AdminDashboard.css">
    <link rel="stylesheet" href="home.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid fs-4">
    <div class="row">
        <!-- Sidebar -->
        <div class="col-md-2 bg-dark text-light sidebar">
            <h3 class="my-5" style="text-align: center">Admin Panel</h3>
            <div class="profile-pic mt-5">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRH-bASq_TMp6SDNjUmz89fWJ4rpWc68W5P9JdzPIxrcg3OKMgYJLZM9q0M22_jxemTE_E&usqp=CAU"
                     alt="Profile Pic">
            </div>
            <div class="fs-3 p-5 fw-bold" style="text-align: center">
                <c:forEach var="admin" items="${adminDetails}">
                    ${admin.name}<br/>
                    ${admin.email}<br/>
                </c:forEach>
            </div>
            <ul class="nav nav-pills flex-column mb-auto fs-4 px-5 d-grid gap-2">
                <li class="nav-item">
                    <a href="#" class="nav-link text-white " >
                        <svg class="bi me-2" width="16" height="16">
                            <use xlink:href="#speedometer2"></use>
                        </svg>
                        Dashboard
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link text-white">
                        <svg class="bi me-2" width="16" height="16">
                            <use xlink:href="#table"></use>
                        </svg>
                        Orders
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link active" style="background-color: #27ae60" aria-current="page">
                        <svg class="bi me-2" width="16" height="16">
                            <use xlink:href="#grid"></use>
                        </svg>
                        Products
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link text-white">
                        <svg class="bi me-2" width="16" height="16">
                            <use xlink:href="#people-circle"></use>
                        </svg>
                        Policies
                    </a>
                </li>
                <div class="sidebar-footer">
                    <a href="#" class="logo"><i class="uil uil-shopping-cart-alt"></i>grocery</a>
                </div>
            </ul>
        </div>
        
         <!-- Right-side Section -->
	<%
			String id = request.getParameter("id");
			String name = request.getParameter("name");	
			String category = request.getParameter("category");
			String brand = request.getParameter("brand");
			String price = request.getParameter("price");
			String qty = request.getParameter("qty");
			String description = request.getParameter("description");
		
		%>
		
		<div class="col-md-10 py-4" style="background-color: #f5f5f5">
            <div class="row justify-content-center border-0 rounded-3 shadow-sm bg-body rounded p-4 mt-5 bg-green">
		
				
				<form action = "delete" method = "post">
					<table style="width:50%">
							<tr style="height:60px">
							<td>Item ID</td>
							<td><input type = "text" name= "id" value = "<%= id %>" readonly></td>
							</tr>
							<tr style="height:60px">
							<td>Item Name</td>
							<td><input type = "text" name= "name" value = "<%= name%>"readonly></td>
							</tr>
							<tr style="height:60px">
							<td>Category</td>
							<td><input type = "text" name= "cat" value = "<%= category%>"readonly></td>
							</tr>
							<tr style="height:60px">
							<td>Brand</td>
							<td><input type = "text" name= "brand" value = "<%= brand%>"readonly></td><br><br>
							</tr>
							<tr style="height:60px">
							<td>Unit Price</td>
							<td><input type = "text" name= "price" value = "<%= price%>"readonly></td>
							</tr>
							<tr style="height:60px">
							<td>Quantity</td>
							<td><input type = "text" name= "qty" value = "<%= qty%>"readonly></td>
							</tr>
							<tr style="height:60px">
							<td>Description</td>
							<td><input type = "text" name= "dis" value = "<%= description%>"readonly></td>
							</tr>
							
							
						</table>
				
					
					
					<input type = "submit" name = "submit" style="height: 3rem; font-size: 1.5rem;color: white; background-color: #e67e22"; value = "Delete Items"><br>
				
				</form>
			</div>
		</div>


</body>
</html>