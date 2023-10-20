package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateItemServlet")
public class UpdateItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UpdateItemServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String cat = request.getParameter("cat");
		String brand = request.getParameter("brand");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");
		String dis = request.getParameter("dis");
		
		
		boolean isTrue;
		
		isTrue = ProductDBUtil.updateProducts(id, name, cat, brand, price, qty, dis);
		
		if(isTrue == true) {
			response.sendRedirect("ItemsServlet");

		}
		else {

			List<Items> itemDetails = ProductDBUtil.getItemDetails(id);
			request.setAttribute("itemDetails", itemDetails);
			
			RequestDispatcher req = request.getRequestDispatcher("Items.jsp");
			req.forward(request, response);
		}

	}

}
