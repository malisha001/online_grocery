<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
<link rel="stylesheet" href="new/log.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
	<meta charset="ISO-8859-1">
</head>
<body>

	<div class="frame-login">
        <form action="loginServlet" method="post">
            <h1>Login</h1>
            <div class="input-frame-login">
                <input type="text" placeholder="Username" name="email" required>
                <i class='bx bxs-user'></i>
            </div>
            <div class="input-frame-login">
                <input type="password" placeholder="Password" name="pwd" required>
                <i class='bx bxs-lock-alt'></i>
            </div>
            <button type="submit" name="submit" class="btn-login">Login</button>
            <div class="create-account-login">
                <p>Dont have an account? <a href="create-account.jsp">Create a Account</a></p>
            </div>
        </form>
    </div>
    
</body>
</html>