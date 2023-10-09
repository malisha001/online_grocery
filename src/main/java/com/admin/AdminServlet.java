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


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uid");
		String email = request.getParameter("mail");
		String password = request.getParameter("pass");
		boolean isSucess = false;
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		try {
		      isSucess = AdminDBUtil.validate(username, email, password);
		      if(isSucess) {
		    	  response.sendRedirect("AdminDashboard.jsp");
		      } else {
		    	  out.println("<script type='text/javascript'>");
		    	  out.println("alert('Your username and password is incorrect');");
		    	  out.println("location = 'LoginPage.jsp'");
		    	  out.println("</script>");
		      }
		}
		catch(Exception e){
			e.printStackTrace();
		}
				
	}

}
