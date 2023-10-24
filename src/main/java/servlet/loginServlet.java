package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import online_grocery.login;
import service.*;
import model.*;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		
		iCustomerService CustomerService = new CustomerServiceImpl();
		try {
			boolean l = CustomerService.validate(username, pwd);
			if(l){
				HttpSession session = request.getSession();
				session.setAttribute("username",username);
				
				//send request to home servlet
				//RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
				//rd.forward(request, response);
				response.sendRedirect("home.jsp");
				
			}
			else {
				response.sendRedirect("loginNew.jsp");
			}
		}
		catch(Exception e) {
			
		}
	}

}
