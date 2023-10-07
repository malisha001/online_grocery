package online_grocery;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginS
 */
@WebServlet("/LoginS")
public class LoginS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		
		
		try {
			boolean l = login.validate(username, pwd);
			if(l){
				HttpSession session = request.getSession();
				session.setAttribute("username",username);
				
				//send request to home servlet
				//RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
				//rd.forward(request, response);
				response.sendRedirect("home.jsp");
				
			}
			else {
				response.sendRedirect("LoginPage.jsp");
			}
		}
		catch(Exception e) {
			
		}
	}

}
