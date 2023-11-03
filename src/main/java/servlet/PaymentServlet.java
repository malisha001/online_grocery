package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CustomerServiceImpl;
import service.iCustomerService;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PaymentServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
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
	
		boolean IsTrue;
		iCustomerService CustomerService = new CustomerServiceImpl();
		
		IsTrue = CustomerService.insertpayment(fname, email, address, city, zip, cardName, cardNo, expM, expY, cvv);
		
		if(IsTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('item add succes fully.');");
			out.println("location = 'home.jsp'");
	    	out.println("</script>");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
