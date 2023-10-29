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

@WebServlet("/CustomerRetriveServlet")
public class CustomerRetriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CustomerRetriveServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
	    
		iCustomerService CustomerService = new CustomerServiceImpl();
		
        List<Customer> cusDisplay = CustomerService.getcustomerprofile(username);
        
        request.setAttribute("cusDisplay", cusDisplay);
        request.getRequestDispatcher("useraccount.jsp").forward(request, response);
        
        
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
