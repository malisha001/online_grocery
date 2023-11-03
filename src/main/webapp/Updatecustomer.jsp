<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/styleprofile.css" >
    <script src="js/customerJavaScript.js"></script>
     <script>
      document.addEventListener('DOMContentLoaded', function() {
        var defaultTab = document.querySelector('a[href="#form-card"]');
        defaultTab.click();
      });
    </script>
</head>
<body>
    <h2>User Profile</h2>

    <div class="main-card">
        <ul>
            <li><a href="#form-card">Profile Edit</a></li>
        </ul>
        
        <%
             String id = request.getParameter("id");
             String fname = request.getParameter("fname");
             String lname = request.getParameter("lname");
             String email = request.getParameter("email");
             String phone = request.getParameter("phone");
             String password = request.getParameter("password");
             String userName = request.getParameter("username");
         %>

        <div class="form-card section" id="form-card">
            <form action="CustomerUpdateServlet" method="post">
            
                <input type="hidden" name="cusid" value="<%= id%>">
                
                <label for="first_name">First Name:</label>
                <input class="input-label-form" type="text" id="first_name" name="first_name" value="<%= fname%>" required /><br /><br />

                <label for="last_name">Last Name:</label>
                <input class="input-label-form" type="text" id="last_name" name="last_name" value="<%= lname%>" required /><br /><br />

                <label for="address">Email:</label>
                <input class="input-label-form" type="text" id="email" name="email" value="<%= email%>" onblur="validateEmail(event)" required /><br /><br />

                <label for="phone_number">Phone Number:</label>
                <input class="input-label-form" type="tel" id="phone_number" name="phone_number" pattern="[0-9]{10}" value="<%= phone%>" oninput="validatePhoneNumber(event)" required /><br /><br />
                
                <label for="password">Password:</label>
                <input class="input-label-form" type="text" id="password" name="password" value="<%= password%>" onblur="validatePassword(event)"><br /><br />
                
                <label for="password">Username:</label>
                <input class="input-label-form" type="text" id="username" name="username" value="<%= userName%>" required /><br /><br />

                <input class="submit-label-form" type="submit" onclick="confirmUpdate()"  value="Update" />
            </form>
       
        </div>
        
        
    </div>
        
</body>
</html>
