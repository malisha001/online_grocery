<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/loginNew.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <script src="js/customerJavaScript.js"></script>
</head>
<body>
    <div class="frame-login">
        <form action="CreateAccountServlet" method="post">
        <h1>User Account</h1>
            <div class="input-frame-login">
                <label for="first_name">First Name:</label>
                <input class="input-label-form" type="text" id="first_name" name="first_name" required /><br /><br />
            </div>

            <div class="input-frame-login">
                <label for="last_name">Last Name:</label>
                <input class="input-label-form" type="text" id="last_name" name="last_name" required /><br /><br />
            </div>

            <div class="input-frame-login">
                 <label for="address">Email:</label>
                 <input class="input-label-form" type="text" id="email" name="email" onblur="validateEmail(event)" required /><br /><br />
            </div>

            <div class="input-frame-login">
                <label for="phone_number">Phone Number:</label>
                <input class="input-label-form" type="tel" id="phone_number" name="phone_number" pattern="[0-9]{10}" oninput="validatePhoneNumber(event)" required /><br /><br />
            </div>

            <div class="input-frame-login">
                <label for="password">Password:</label>
                <input class="input-label-form" type="password" id="password" name="password" onblur="validatePassword(event)" required /><br /><br />
            </div>

            <button type="submit" class="btn-login">Create</button>
        </form>
    </div>
</body>  
</html>