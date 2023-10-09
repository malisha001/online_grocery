<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="home.css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
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
                    <a href="#">catergary</a>
                    <div class="dropdown-content">
                        <a href="#">beverage</a>
                        <a href="#">backery items</a>
                        <a href="#">diary broduct</a>
                        <a href="#">cofee & tea</a>
                        <a href="#">drocery &stap</a>
                        <a href="#">houce hold</a>
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
                            <h2>malisha</h2>
                        </div>
                        <hr>
                        <a href="#" class="subb-men-linkk">
                            <img src="image/setting.png" alt="">
                            <p>setting</p>
                            <span>></span>
                        </a>
                        <a href="#" class="subb-men-linkk">
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
    
    <div id="add-product" class="add-product">
	    <form action = "insert" method = "post">
	           <fieldset>
	                     <legend>Add New Product</legend>
	                             
	                              <label for ="name">Product Name</label><input type ="text" name = "Name"><br>
	                              <label for ="cat">Category </label>
	                                         <select id ="cat" name = "Category">
	                                                <option value= "dairy">Dairy</option>
	                                                <option value= "Fruits">Fruits</option>
	                                                <option value= "Vegetables">Vegetables</option>
	                                                <option value= "Bakery">Bakery</option>
	                                                <option value= "Rice">Rice</option>                               
	                                         </select><br>
	                             <label for ="brand">Brand Name </label><input type ="text" name = "Brand"><br>
	                             <label for ="price">Unit Price </label><input type ="text" name = "UnitPrice"><br>
	                             <label for ="qty">Quantity </label><input type ="text" name = "Quantity"><br>
	                             <label for ="description">Description</label> <br><textarea rows= "5" cols="20" name = "Description"></textarea><br><br>
	                             <input type ="submit" value ="Add Product">
	                             <button type="button" id="hide-form" onclick="hide()">Cancle</button>
	          </fieldset>
	      </form>
    </div>
	<button onclick="show()">Hello</button>
      <c:forEach var ="admin" items ="${adminDetails}">
      
      ${admin.id}
      ${admin.name}
      ${admin.email}
      ${admin.password}
      
      
      </c:forEach>
      
      <!-- footer start -->
    <section class="footer">
    <hr>
        <div class="boxx-cont">
            <div class="boxx">
                <a href="#" class="logo"><i class="uil uil-shopping-cart-alt"></i>grocery</a>
                <p>this is discription of web site</p>
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
                    <a href="#">usa</a>
                    <a href="#">catergary</a>    
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