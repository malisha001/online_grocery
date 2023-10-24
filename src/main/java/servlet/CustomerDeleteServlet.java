package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerServiceImpl;
import service.iCustomerService;

/**
 * Servlet implementation class CustomerDeleteServlet
 */
@WebServlet("/CustomerDeleteServlet")
public class CustomerDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		System.out.println("email is on "+ email);
		
		iCustomerService CustomerService = new CustomerServiceImpl();
		boolean isTrue;
		
		isTrue = CustomerService.deleteCustomer(email);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("loginNew.jsp");
			dispatcher.forward(request, response);
		}
		else {
			List<Customer> cusDetails = CustomerService.getcustomerprofile(email);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
			dispatcher.forward(request, response);
		}
	}

}
