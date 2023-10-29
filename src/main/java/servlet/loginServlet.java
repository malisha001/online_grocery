package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import service.*;
import model.*;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		iCustomerService CustomerService = new CustomerServiceImpl();
		try {
			char l = CustomerService.validate(username, pwd);
			if(l == 'c'){
				HttpSession session = request.getSession();
				session.setAttribute("username",username);
				
				response.sendRedirect("home.jsp");
				
			}
			else if(l == 'a'){
				HttpSession session = request.getSession();
				session.setAttribute("username",username);
				response.sendRedirect("AdminDashboard.jsp");
				
			}
			else {
				out.println("<script type='text/javascript'>");
		    	out.println("alert('Your username and password is incorrect');");
		    	out.println("location = 'loginNew.jsp'");
		    	out.println("</script>");
			}
		}
		catch(Exception e) {
			
		}
	}

}
