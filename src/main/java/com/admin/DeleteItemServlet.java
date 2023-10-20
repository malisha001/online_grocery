package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteItemServlet")
public class DeleteItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("delete");
		System.out.print(id);
		boolean isTrue;
		
		isTrue = ProductDBUtil.deleteProducts(id);
		
		if(isTrue == true) {
			response.sendRedirect("ItemsServlet");
		}
		else {
			List<Items> iDetails = ProductDBUtil.getItemDetails(id);
			request.setAttribute("iDetails", iDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Items.jsp");
			dispatcher.forward(request, response);
		}
	
	}

}
