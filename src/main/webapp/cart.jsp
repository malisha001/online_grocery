<%@page import="home.cart"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
<link rel="stylesheet" href="cart.css">
<link rel="stylesheet" href="home.css">
<title>Insert title here</title>
</head>
<body>
    <!-- navigation start -->
    <header>
        <div class="header-1">
            <a href="${pageContext.request.contextPath}RetrieveCartServlet" class="logo"><i class="uil uil-shopping-cart-alt"></i>grocery</a>
            <form action="" class="search-boxx-cont">
                <input type="search" id="search-boxx" placeholder="search hear...">
                <label for="search-boxx"><i class="uil uil-search"></i></label>
            </form>
        </div>

        <div class="header-2">
            <nav class="navbar">
                <a href="home.jsp">home</a>
                <div class="dropdown">
                    <a href="home.jsp">catergary</a>
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
                <a href="cart.jsp"><i class="uil uil-shopping-cart-alt"></i></a>
                <a href="#"><i class="uil uil-heart"></i></a>
                <a href="#" class="user-pic" onclick="toggleMenu()"><i class="uil uil-user-circle"></i></a>
                <div class="subb-men-wrapp" id="subMenu">
                    <div class="subb-men">
                        <div class="user-info">
                            <img src="image/user.png" alt="">
                            <h2>${username}</h2>
                        </div>
                        <hr>
                        <a href="loginNew.jsp" class="subb-men-linkk">
                            <img src="image/setting.png" alt="">
                            <p>login</p>
                            <span>></span>
                        </a>
                        <a href="${pageContext.request.contextPath}/LogoutServlet" class="subb-men-linkk">
                            <img src="image/logout.png" alt="">
                            <p>log out</p>
                            <span>></span>
                        </a>
                        <a href="${pageContext.request.contextPath}/CustomerRetriveServlet" class="subb-men-linkk">
                            <img src="image/help.png" alt="">
                            <p>view profile</p>
                            <span>></span>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <script src="home.js"></script>
    <!-- navigation end -->
	<jsp:include page="/cart"></jsp:include>
	<%
	if(session.getAttribute("username")==null){
		response.sendRedirect("LoginPage.jsp");
	}	
	List<cart>cartDetails = (List<cart>)request.getAttribute("cartDetails");
	System.out.println(cartDetails);
	%>
	<div class="section-p1" id="cart">
        <table width="100%">
            <thead>
                <tr>
                    <td>items</td>
                    <th></th>
                    <td>price</td>
                    <td>quantity</td>
                    <td>total</td>
                    
                </tr>
            </thead>
            <tbody>
            <c:forEach var = "cart" items = "${cartDetails}">

                   
                    <input type="hidden" name="book_id" value="">
                    <tr>
                        <td><p>${cart.itemName}</p></td>
                        <td><p></p></td>
                           	<td class="price"><p>${cart.price}</p></td>
                           	 <form action="UpdateCartItemsServlet" method="post">
                            <td><input type="number" name="quantity" value="${cart.quentity}" min="1" class="quantity-input" onchange="calculate(this)"></td>

                            <td class="total" onload="updateCartTotal()">$.${cart.tprice}</td>
                            <input type="hidden" name="total" value="${cart.tprice}">
                           
                                <input type="hidden" name="price" value="${cart.price}">
                               	<input type="hidden" name="uitemId" value="${cart.id}">
          						<td><input type="submit" value="update" ><td>
                            </form>
                            <form action="CartItemsDeleteServlet" method="post">
                                <td><input type=submit value="delete"><td>
                                <input type="hidden" name="itemId" value="${cart.id}">
                            </form>
                                
                        </tr>
               
             </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="subtotal">
        <h3>cart totals</h3>
        <div>
            <form>
                <table>
                    <tr>
                        <td>cart sub total</td>
                        <td id="cart-subtotal">$.</td>
                    </tr>
                    <tr>
                        <td>shipping</td>
                        <td>free</td>
                    </tr>
                    <tr>
                        <td><strong>total</strong></td>
                        <td><strong id="cart-total">$.</strong></td>
                        <input type="hidden" name="ftotal" value="">
                    </tr>
                </table>
            </form>
            <button class="normal" onclick="checkout()">Checkout</button>
        </div>
    </div>
</body>
<script>

function checkout(){
	console.log('df')
	var total = document.getElementById('cart-subtotal').innerHTML;
	window.location.replace('/online_grocery/paymentInsert.jsp?total='+total);
}

function calculate(input) {
    var row = input.parentNode.parentNode;
    var price = parseFloat(row.querySelector(".price p").textContent); // Properly extract the price
    var quantity = parseInt(input.value);
    var total = price * quantity;

    row.querySelector(".total").innerHTML = '$.' + total.toFixed(2);
}

    function updateCartTotal() {
        var cartSubtotal = 0;
        var cartItems = document.querySelectorAll("#cart tbody tr");

        cartItems.forEach(function(item) {
            var total = parseFloat(item.querySelector(".total").innerHTML.replace('$.', ''));
            console.log(item.querySelector(".total").innerHTML.replace('$.', ''))
            cartSubtotal += total;
        });

        document.getElementById("cart-subtotal").innerHTML = '$.' + cartSubtotal.toFixed(2);
        document.getElementById("cart-total").innerHTML = '$.' + cartSubtotal.toFixed(2);
    }
    updateCartTotal();
</script>
</html>