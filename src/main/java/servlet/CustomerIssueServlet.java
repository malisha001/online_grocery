package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CustomerServiceImpl;
import service.iCustomerService;

/**
 * Servlet implementation class CustomerIssueServlet
 */
@WebServlet("/CustomerIssueServlet")
public class CustomerIssueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CustomerIssueServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerName = request.getParameter("customer-name");
		String customerEmail = request.getParameter("report-email");
		String phonenumber = request.getParameter("phonenumber");
		String about = request.getParameter("about");
		
		iCustomerService CustomerService = new CustomerServiceImpl();
		boolean IsTrue;
		IsTrue = CustomerService.customerReport(customerName, customerEmail, phonenumber, about);
		System.out.println("issure servlettttttt");
		
		if(IsTrue == true) {
			response.sendRedirect("home.jsp");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("LoginNew.jsp");
			dis2.forward(request, response);
		}
	}

}
