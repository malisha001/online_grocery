
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
<link rel="stylesheet" href="cart.css">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/cart"></jsp:include>
	<%
	if(session.getAttribute("username")==null){
		response.sendRedirect("LoginPage.jsp");
	}	

	%>
	<div class="section-p1" id="cart">
        <table width="100%">
            <thead>
                <tr>
                    <td>books</td>
                    <th>product</th>
                    <td>price</td>
                    <td>quantity</td>
                    <td>total</td>
                    
                </tr>
            </thead>
            <tbody>
            <c:forEach var = "cartItems" items = "${cartDetails}">
                    <form method="post" action="#">
                    <input type="hidden" name="book_id" value="">
                    <tr>
                        <td><p>${cartItems.itemName}</p></td>
                        <td><p>tt</p></td>
                            <td class="price"><p>${cartItems.price}</p></td>
                            <td><input type="number" name="quantity" value="${cartItems.quentity}" min="1" class="quantity-input" onchange="calculate(this)"></td>

                            <td class="total">Rs.</td>
                            <input type="hidden" name="total" value="">

                            <td><input type="submit" value="update" ><td>
                            <td><a href="#">tt</i></a></td>
                                
                        </tr>
                    </form>
             </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="subtotal">
        <h3>cart totals</h3>
        <div>
            <form action="final_cart.php" method="post" >
                <table>
                    <tr>
                        <td>cart sub total</td>
                        <td id="cart-subtotal">Rs.</td>
                    </tr>
                    <tr>
                        <td>shipping</td>
                        <td>free</td>
                    </tr>
                    <tr>
                        <td><strong>total</strong></td>
                        <td><strong id="cart-total">Rs.</strong></td>
                        <input type="hidden" name="ftotal" value="">
                    </tr>
                </table>
                <button class="normal">Checkout</button>
            </form>
        </div>
    </div>
</body>
<script>
    function calculate(input) {
        var row = input.parentNode.parentNode;
        var price = parseFloat(row.querySelector(".price").innerHTML);
        var quantity = parseInt(input.value);
        var total = price * quantity;

        row.querySelector(".total").innerHTML = 'Rs.' + total.toFixed(2);
        updateCartTotal();
    }

    function updateCartTotal() {
        var cartSubtotal = 0;
        var cartItems = document.querySelectorAll("#cart tbody tr");

        cartItems.forEach(function(item) {
            var total = parseFloat(item.querySelector(".total").innerHTML.replace('Rs.', ''));
            cartSubtotal += total;
        });

        document.getElementById("cart-subtotal").innerHTML = 'Rs.' + cartSubtotal.toFixed(2);
        document.getElementById("cart-total").innerHTML = 'Rs.' + cartSubtotal.toFixed(2);
    }
</script>
</html>