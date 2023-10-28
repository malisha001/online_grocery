<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="loginNew.css">
    <script src="customerJavaScript.js"></script>
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>

 <div class="login-text"> <h1><i>Grocery Store</i></h1></div> 
<div class="image-cart"><img src="https://media.istockphoto.com/id/1389111152/vector/shopping-cart-with-a-leaf-inside-circle-organic-shop-icon.jpg?s=612x612&w=0&k=20&c=TjNiLnPB7eUEni6mlvyTWd80LJdO8zig5DmKiHz8Lkk=" alt="cart-image" ></div>

  <div class="frame">
    <div class="frame-login">
        <form action="log" method="post">
            <h1>Login</h1>
            <div class="input-frame-login">
                <input type="text" placeholder="Username" name="uid" onblur="validateEmail(event)" required>
                <i class='bx bxs-user'></i>
            </div>
            <div class="input-frame-login">
                <input type="password" placeholder="Password" name="pass" onblur="validatePassword(event)" required>
                <i class='bx bxs-lock-alt'></i>
            </div>
            <button type="submit" name="submit" class="btn-login">Login</button>
            <div class="create-account-login">
                <p>Dont have an account? <a href="create-account.jsp">Create a Account</a></p>
            </div>
        </form>
    </div>
    </div>
</body>  
</html>
