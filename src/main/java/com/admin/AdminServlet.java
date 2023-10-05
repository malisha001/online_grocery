package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uid");
		String email = request.getParameter("mail");
		String password = request.getParameter("pass");
		
		try {
		      List<Admin> adminDetails = AdminDBUtil.validate(username, email, password);
		      request.setAttribute("adminDetails", adminDetails);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		RequestDispatcher dis = request.getRequestDispatcher("AdminDashboard.jsp");
		dis.forward(request, response);
		
		
		
		
		
		
	}

}
