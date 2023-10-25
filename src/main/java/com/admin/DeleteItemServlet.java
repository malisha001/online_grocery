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


@WebServlet("/DeleteItemServlet")
public class DeleteItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("delete");
		System.out.print(id);
		boolean isTrue;
		
		isTrue = ProductDBUtil.deleteProducts(id);
		
		if(isTrue == true) {
			response.sendRedirect("ItemsServlet");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Item Delete Unsucessful! Try Again.');");
			out.println("location = 'ItemsServlet'");
			out.println("</script>");
		}
	
	}

}
