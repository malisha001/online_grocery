<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/styleprofile.css" >
    <script src="js/customerJavaScript.js">
      document.addEventListener('DOMContentLoaded', function() {
        var defaultTab = document.querySelector('a[href="#report-card"]');
        defaultTab.click();
      });
     </script>
      
</head>
<body>
    <h2><i><b>USER PROFILE</b></i></h2>

    <div class="main-card">
        <ul>
            <li><a href="#report-card">Report Issues</a></li>
        </ul>

        <div class="form-card section" id="report-card">
            <form action="CustomerIssueServlet" method="post">
                
                <label for="customer-name">Customer Name :</label>
                <input class="input-label-form" type="text" id="customer-name" name="customer-name" required /><br /><br />

                <label for="report-email">Email :</label>
                <input class="input-label-form" type="text" id="report-email" name="report-email" onblur="validateEmail(event)" required /><br /><br />

                <label for="phonenumber">Phone Number :</label>
                <input class="input-label-form" type="tel" id="phonenumber" name="phonenumber" pattern="[0-9]{10}" oninput="validatePhoneNumber(event)" required /><br /><br />
                
                <label for="about">About Report :</label>
                <textarea class="input-label-form" id="about" name="about" rows="10" cols="48"></textarea>

                <input class="submit-label-form" type="submit" value="Submit"/>
            </form>
       
        </div>
        
        
    </div>
        
</body>
</html>
