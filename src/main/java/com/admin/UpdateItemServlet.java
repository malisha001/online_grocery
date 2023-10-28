package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
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
		
		// Create a PrintWriter to send response back to the client
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
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
			// If update is unsuccessful, display an error message and redirect back to ItemsServlet
			out.println("<script type='text/javascript'>");
			out.println("alert('Item Update Unsucessful! Try Again.');");
			out.println("location = 'ItemsServlet'");
			out.println("</script>");
		}

	}

}
