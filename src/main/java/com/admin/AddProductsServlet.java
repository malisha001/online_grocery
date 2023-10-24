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
		
		double cUnitPrice = Double.parseDouble(UnitPrice);
		int cQuantity = Integer.parseInt(Quantity);
		
		boolean isTrue;
		
		isTrue = ProductDBUtil.addproduct(Name,Category,Brand, cUnitPrice,cQuantity,Description);

				
		if(isTrue == true) {
			response.sendRedirect("AdminDashboard.jsp");
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}