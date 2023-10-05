<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <c:forEach var ="admin" items ="${adminDetails}">
      
      ${admin.id}
      ${admin.name}
      ${admin.email}
      ${admin.password}
      
      
      </c:forEach>
      


</body>
</html>