<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<link rel="stylesheet" href="AdminDashboard.css">
<link rel="stylesheet" href="home.css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style type="text/css">
.add-product {
      display: none;
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      width: 300px;
      padding: 20px;
      background-color: #fff;
      border: 1px solid #ccc;
      border-radius: 4px;
      z-index: 1;
      box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}
</style>
</head>
<body>
	<%
	
	if(session.getAttribute("username")==null){
		response.sendRedirect("loginNew.jsp");
	}
	%>
<!-- header section -->
    <header>
        <div class="header-1">
            <a href="#" class="logo"><i class="uil uil-shopping-cart-alt"></i>grocery</a>
            <form action="" class="search-boxx-cont">
                <input type="search" id="search-boxx" placeholder="search hear...">
                <label for="search-boxx"><i class="uil uil-search"></i></label>
            </form>
        </div>

        <div class="header-2">
            <nav class="navbar">
                <a href="#">home</a>
                <div class="dropdown">
                    <a href="#">category</a>
                    <div class="dropdown-content">
                        <a href="#">beverage</a>
                        <a href="#">backery items</a>
                        <a href="#">diary product</a>
                        <a href="#">coffee & tea</a>
                        <a href="#">grocery &stap</a>
                        <a href="#">house hold</a>
                    </div>
                </div>
                <a href="#">product</a>
                <a href="#">contact</a>
            </nav>
            

            <div class="icons">
                <a href="#"><i class="uil uil-shopping-cart-alt"></i></a>
                <a href="#"><i class="uil uil-heart"></i></a>
                <a href="#" class="user-pic" onclick="toggleMenu()"><i class="uil uil-user-circle"></i></a>
                <div class="subb-men-wrapp" id="subMenu">
                    <div class="subb-men">
                        <div class="user-info">
                            <img src="image/user.png" alt="">
                            <h2>${username}</h2>
                        </div>
                        <hr>
                        <a href="#" class="subb-men-linkk">
                            <img src="image/setting.png" alt="">
                            <p>setting</p>
                            <span>></span>
                        </a>
                        <a href="${pageContext.request.contextPath}/LogoutServlet" class="subb-men-linkk">
                            <img src="image/logout.png" alt="">
                            <p>log out</p>
                            <span>></span>
                        </a>
                        <a href="#" class="subb-men-linkk">
                            <img src="image/help.png" alt="">
                            <p>edite profile</p>
                            <span>></span>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <script src="home.js"></script>`
    
    <!-- header section end -->
    
    
    <div class="container-fluid">
    <div class="row">
        <!-- Sidebar -->
        <div class="col-md-2 bg-dark text-light sidebar">
            <h3 class="my-5" style="text-align: center">Admin Panel</h3>
            <div class="profile-pic mt-5">
                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRH-bASq_TMp6SDNjUmz89fWJ4rpWc68W5P9JdzPIxrcg3OKMgYJLZM9q0M22_jxemTE_E&usqp=CAU"
                     alt="Profile Pic" style="border-radius: 50%;">
            </div>
            <div class="fs-3 p-5 fw-bold" style="text-align: center">
                <c:forEach var="admin" items="${adminDetails}">
                    ${admin.name}<br/>
                    ${admin.email}<br/>
                </c:forEach>
            </div>
            <ul class="nav nav-pills flex-column mb-auto fs-4 px-5 d-grid gap-2">
                <li class="nav-item">
                    <a href="#" class="nav-link active"  style="background-color: #27ae60" aria-current="page">
                        
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
                    <a href="#" class="nav-link text-white">
                        <svg class="bi me-2" width="16" height="16">
                            <use xlink:href="#grid"></use>
                        </svg>
                        Products
                    </a>
                </li>
                <li>
                    <a href="policy-form.jsp" class="nav-link text-white">
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
        
        <div class="col-md-10 py-4" style="background-color: #f5f5f5">
            <div class="container-fluid">

                <div class="border-0 rounded-3 shadow-sm bg-body rounded p-4" style="background-color: #f9f9f9">

                    <div class="d-grid gap-2 d-md-flex justify-content-between">
                     <div id="add-product" class="add-product">
	    <form action = "AdminAddProductsServlet" method = "post">
	           <fieldset>
	                     <legend>Add New Product</legend>
	                             
                         <table style="width:100%">
                            <tr style="height:60px">
                            <td><label for ="name">Product Name</label></td>
                            <td><input type ="text" name = "Name" required></td>
                            </tr>
                            <tr style="height:60px">
                            <td><label for ="cat">Category </label></td>
                            <td><select id ="cat" name = "Category">
                                                        <option value= "dairy">Dairy</option>
                                                        <option value= "Fruits">Fruits</option>
                                                        <option value= "Vegetables">Vegetables</option>
                                                        <option value= "Bakery">Bakery</option>
                                                        <option value= "Rice">Rice</option>                               
                                                 </select></td>
                            </tr>
                            <tr style="height:60px">
                            <td><label for ="brand">Brand Name </label></td>
                            <td><input type ="text" name = "Brand" required></td>
                            </tr>
                            <tr style="height:60px">
                            <td> <label for ="price">Unit Price </label></td>
                            <td><input type ="text" name = "UnitPrice" required></td><br><br>
                            </tr>
                            <tr style="height:60px">
                            <td><label for ="qty">Quantity </label></td>
                            <td><input type ="text" name = "Quantity" required></td>
                            </tr>
                            <tr style="height:60px">
                            <td><label for ="description">Description</label></td>
                            <td><textarea rows= "2" cols="20" name = "Description"></textarea></td>
                            </tr>
                            
                            
                            
                        </table>
	                             <input type ="submit" value ="Add Product">
	                             <button type="button" id="hide-form" onclick="hide()">Cancel</button>
	          </fieldset>
	      </form>
    </div>
   
                        <div>
                            <button type="button" class="btn btn-success me-md-2 btn-lg" onclick="show()"
                                    style="height: 5rem; font-size: 1.7rem; background-color: #27ae60">Add Item
                            </button>
                            <a href="item">
                            <button type="button" class="btn btn-warning me-md-2 btn-lg"
                                    style="height: 5rem; font-size: 1.7rem; color: white;  background-color: #e67e22">Item List
                            </button>
                            </a>
                        </div>
                        <form action="" class="search-boxx-cont">
                            <input type="search" id="search-boxx" placeholder="search hear...">
                            <label for="search-boxx"><i class="uil uil-search"></i></label>
                        </form>

                    </div>
                </div>
                <div class="row justify-content-center border-0 rounded-3 shadow-sm bg-body rounded p-4 mt-5 bg-green" style="font-weight: bolder !important;">


                    <div class="row mx-2 p-2 my-2 card-background"
                         style="background-color: #A8DF8E; width: 305px; height: 125px; border-radius: 15px">
                        <div class="col-sm-5 d-flex justify-content-center align-items-center">
                            <img src="./image/product.png" width="80px" height="auto"
                            >
                        </div>
                        <div class="col-sm-7 d-grid align-items-center align-content-center fs-4 fw-bold">
                            <div class="row p-2 align-items-center justify-content-center">
                                Total Products
                            </div>
                            <div class="row p-2 align-items-center justify-content-center">
                                100
                            </div>
                        </div>
                    </div>

                    <div class="row mx-2 p-2 my-2  card-background"
                         style="background-color: #A8DF8E; width: 305px; height: 125px; border-radius: 15px">
                        <div class="col-sm-5 d-flex justify-content-center align-items-center">
                            <img src="./image/cart.png" width="80px" height="auto"
                            >
                        </div>
                        <div class="col-sm-7 d-grid align-items-center align-content-center fs-4 fw-bold">
                            <div class="row p-2 align-items-center justify-content-center">
                                Total Orders
                            </div>
                            <div class="row p-2 align-items-center justify-content-center">
                                1000
                            </div>
                        </div>
                    </div>

                    <div class="row mx-2 p-2 my-2 card-background"
                         style="background-color: #A8DF8E; width: 305px; height: 125px; border-radius: 15px">
                        <div class="col-sm-5 d-flex justify-content-center align-items-center">
                            <img src="./image/users.png" width="80px" height="auto"
                            >
                        </div>
                        <div class="col-sm-7 d-grid align-items-center align-content-center fs-4 fw-bold">
                            <div class="row p-2 align-items-center justify-content-center">
                                Total Users
                            </div>
                            <div class="row p-2 align-items-center justify-content-center">
                                100
                            </div>
                        </div>
                    </div>

                </div>

                <div class="row justify-content-center border-0 rounded-3 shadow-sm bg-body rounded p-4 mt-5 bg-green">
                    <canvas id="monthlyIncome" style="width:100%;max-width:500px"></canvas>
                    <canvas id="myChart" style="width:100%;max-width:500px"></canvas>
                    <canvas id="myCharts" style="width:100%;max-width:500px"></canvas>
                </div>
            </div>
        </div>
    </div>
</div>
<%-- <footer>
    <p style="margin-bottom: 0px;">&copy; 2023 Grocery</p>
</footer> --%>
<script
        src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js">
</script>
<script>

    const xForIncome = ["Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov"];
    const yForIncome = [7, 8, 8, 9, 9, 9, 10, 11, 14, 14, 15];

    new Chart("monthlyIncome", {
        type: "line",
        data: {
            labels: xForIncome,
            datasets: [{
                // backgroundColor:"rgba(0,0,255,1.0)",
                borderColor: "rgba(39,174,96,0.9)",
                data: yForIncome
            }]
        },
        options: {
            title: {
                display: true,
                text: "Monthly Income"
            }
        }
    });

    var x = ["Dhal", "Dairy", "Bakery", "Vegetable", "Fruits"];
    var y = [55, 49, 44, 24, 15];
    var barColors = [
        "#b91d47",
        "#00aba9",
        "#2b5797",
        "#e8c3b9",
        "#1e7145"
    ];

    new Chart("myChart", {
        type: "doughnut",
        data: {
            labels: x,
            datasets: [{
                backgroundColor: barColors,
                data: y
            }]
        },
        options: {
            title: {
                display: true,
                text: "Total Reviews 2023"
            }
        }
    });

    var x = ["Dhal", "Dairy", "Bakery", "Vegetable", "Fruits"];
    var y = [55, 49, 44, 24, 15];
    var barColorss = ["red", "green", "blue", "orange", "brown"];

    new Chart("myCharts", {
        type: "bar",
        data: {
            labels: x,
            datasets: [{
                backgroundColor: barColorss,
                data: y
            }]
        },
        options: {
            title: {
                display: true,
                text: "Monthly Sales Report"
            }
        }
    });

</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        
        
        
        
   
      <!-- footer start -->
      
    <section class="footer">
    <hr>
        <div class="boxx-cont">
            <div class="boxx">
                <a href="#" class="logo"><i class="uil uil-shopping-cart-alt"></i>grocery</a>
                <p>this is description of web site</p>
                <div class="share">
                    <a href="#" class="buttn fab fa-facebook-f"></a>
                    <a href="#" class="buttn fab fa-twitter"></a>
                    <a href="#" class="buttn fab fa-instagram"></a>
                </div>
            </div>
            <div class="boxx">
                <h3>our location</h3>
                <div class="links">
                    <a href="#">home</a>
                    <a href="#">user</a>
                    <a href="#">category</a>    
                </div>
            </div>
            <div class="boxx">
                <h3>our location</h3>
                <div class="links">
                    <a href="#">home</a>
                    <a href="#">usa</a>
                    <a href="#">catergary</a>    
                </div>
            </div>
        </div>
        <h1 class="credit">created by <span>CMBU</span>|all right reserve</h1>
    </section>
    <!-- footer end -->


</body>
<script type="text/javascript">
function show() {
	document.getElementById("add-product").style.display = "block";
}

// Function to hide the popup
function hide() {
    document.getElementById("add-product").style.display = "none";
}

</script>
</html>