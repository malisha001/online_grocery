<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
          </fieldset>
      </form>

</body>
</html>