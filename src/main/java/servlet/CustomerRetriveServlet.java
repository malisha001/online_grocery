package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Customer;
import service.*;

/**
 * Servlet implementation class CustomerRetriveServlet
 */
@WebServlet("/CustomerRetriveServlet")
public class CustomerRetriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerRetriveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
	    
		iCustomerService CustomerService = new CustomerServiceImpl();
		
        List<Customer> cusDisplay = CustomerService.getcustomerprofile(username);
        
        request.setAttribute("cusDisplay", cusDisplay);
        request.getRequestDispatcher("useraccount.jsp").forward(request, response);
        
        System.out.println("User Details:");
        for (Customer cus : cusDisplay) {
            System.out.println("ID: " + cus.getId());
            System.out.println("First Name: " + cus.getFirstname());
            System.out.println("Last Name: " + cus.getLastname());
            // Add similar lines for other details
        }
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
