<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

<c:if test="${not empty cusDisplay}">
    <c:forEach var="cus" items="${cusDisplay}"> 
    
        <c:set var="id" value="${cus.id}"/>
        <c:set var="fname" value="${cus.firstname}"/>
        <c:set var="lname" value="${cus.lastname}"/>
        <c:set var="email" value="${cus.email}"/>
        <c:set var="phone" value="${cus.phonenumber}"/>
        <c:set var="password" value="${cus.password}"/>
    
        <h2>User Profile</h2>
        
        <div class="main-card">
            <ul>
                <li><a href="#form-card">Profile Edit</a></li>
                <li><a href="customerReport.jsp">Report Issues</a></li>
                <li><a href="#delete-account">Account Delete</a></li>
            </ul>
            
            <div class="form-card section" id="form-card">
                <form action="#" method="post">
                    <input type="hidden" name="id" value="${id}">
                    
                    <label for="first_name">First Name:</label>
                    <span class="details-box" id="first_name_details">${fname}</span>
                   
                    <br/><br/>

                    <label for="last_name">Last Name:</label>
                    <span class="details-box" id="first_name_details">${lname}</span>
                    <br/><br/>
                    
                    <label for="address">Email:</label> 
                    <span class="details-box" id="first_name_details">${email}</span>
                    <br/><br/>

                    <label for="phone_number">Phone Number:</label>
                    <span class="details-box" id="first_name_details">${phone}</span>
                    <br/><br/>
                    
                    <label for="password">Password:</label>
                    <span class="details-box" id="first_name_details">${password}</span>
                    <br/><br/>
                
                
                <!-- Update button moved inside form-card -->
                <div class="update-button">
                    <c:url value="Updatecustomer.jsp" var="cusupdate">
                        <c:param name="id" value="${id}"/>
                        <c:param name="fname" value="${fname}"/>
                        <c:param name="lname" value="${lname}"/>
                        <c:param name="email" value="${email}"/>
                        <c:param name="phone" value="${phone}"/>
                        <c:param name="password" value="${password}"/>
                        <c:param name="username" value="${username}"/>
                    </c:url>
                    
                    <a href="${cusupdate}">
                        <input class="submit-label-form" type="button" name="update" value="Update">  
                    </a>
                </div>
              </form>
            </div>
            
            <!-- Move delete-account section inside form-card -->
           <!-- ... Your existing code ... -->

             <div class="delete-account section" id="delete-account">
                 <form action="deletecustomer.jsp" method="post">
                    <label for="first_name">Account Delete!!:</label>
                        <h4>Dear Sir/ Madam You are going to delete your Online Grocery ?
                            If your going to Delete your account press Delete button.</h4>
                      
                        <input type="hidden" name="email" value="${email}">
                        <input class="submit-label-form" type="submit" value="Delete" />
                  </form>
             </div>

<!-- ... Your existing code ... -->

        
    </c:forEach>
</c:if>



</body>
</html>