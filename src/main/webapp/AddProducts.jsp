<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "AdminAddProductsServlet" method = "post">
           
                     
                             
                              <label for ="name">Product Name:</label><input type ="text" name = "Name" required><br>
                              <label for ="cat">Category: </label>
                                         <select id ="cat" name = "Category">
                                                <option value= "dairy">Dairy</option>
                                                <option value= "Fruits">Fruits</option>
                                                <option value= "Vegetables">Vegetables</option>
                                                <option value= "Bakery">Bakery</option>
                                                <option value= "Rice">Rice</option>                               
                                         </select><br>
                             <label for ="brand">Brand Name: </label><input type ="text" name = "Brand" required><br>
                             <label for ="price">Unit Price: </label><input type ="text" name = "UnitPrice" required><br>
                             <label for ="qty">Quantity: </label><input type ="text" name = "Quantity" required><br>
                             
                             <label for ="description">Description:</label> <br><textarea rows= "5" cols="20" name = "Description" required></textarea><br><br>
                             <input type ="submit" value ="Add Product">
          
      </form>

</body>
</html>