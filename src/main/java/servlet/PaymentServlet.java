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
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String zip = request.getParameter("zip-code");
		String cardName = request.getParameter("name-on-card");
		String cardNo = request.getParameter("credit-card-number");
		String expM = request.getParameter("exp-month");
		String expY = request.getParameter("exp-year");
		String cvv = request.getParameter("cvv");
	
		
		System.out.println("hi" + fname);
		System.out.println("hi" + email);
		System.out.println("hi" + address);
		System.out.println("hi" + city);
		System.out.println("hi" + zip);
		System.out.println("hi" + cardName);
		System.out.println("hi" + cardNo);
		System.out.println("hi" + expM);
		System.out.println("hi" + expY);
		System.out.println("hi" + cvv);
		boolean IsTrue;
		iCustomerService CustomerService = new CustomerServiceImpl();
		
		IsTrue = CustomerService.insertpayment(fname, email, address, city, zip, cardName, cardNo, expM, expY, cvv);
		
		if(IsTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
