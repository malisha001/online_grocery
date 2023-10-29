package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.*;

@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddToCartServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int itemID = Integer.parseInt(request.getParameter("itemid"));
		int quentity = Integer.parseInt(request.getParameter("quentity"));
		
		HttpSession session = request.getSession();
		String userID = (String) session.getAttribute("username");
				
		System.out.println("userID:"+itemID);
		System.out.println(quentity);
		// Create an instance of the CartServiceImpl
		iCartService cartService = new CartServiceImpl();
		
		boolean istrue = false;
		boolean available = false;
		
		available = cartService.getItems(itemID, quentity, userID);
		try {
			istrue = cartService.getItems(itemID, quentity, userID);
			System.out.println(istrue);
			if(istrue == true) {
				response.sendRedirect("home.jsp");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
