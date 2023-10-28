package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddProductsServlet")
public class AddProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Name = request.getParameter("Name");
		String Category = request.getParameter("Category");
		String Brand = request.getParameter("Brand");
		String UnitPrice = request.getParameter("UnitPrice");
		String Quantity = request.getParameter("Quantity");
		String Description = request.getParameter("Description");
		
		// Parse UnitPrice and Quantity to their respective data types
		double cUnitPrice = Double.parseDouble(UnitPrice);
		int cQuantity = Integer.parseInt(Quantity);
		
		boolean isTrue;
		
		// Call a method to add a product to the items database
		isTrue = ProductDBUtil.addproduct(Name,Category,Brand, cUnitPrice,cQuantity,Description);

				
		//Redirect to the AdminDashboard.jsp when successfully added
		if(isTrue == true) {
			response.sendRedirect("AdminDashboard.jsp");
		}else {
			
			// Forward the request to unsuccess.jsp when product addition is not successful
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}