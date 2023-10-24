package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import home.CartDB;
import home.cart;
import service.*;
import model.*;

/**
 * Servlet implementation class RetrieveCartServlet
 */
@WebServlet("/RetrieveCartServlet")
public class RetrieveCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Create an instance of the CartServiceImpl
		iCartService cartService = new CartServiceImpl();
		
		// Call the getCartDetails method to retrieve the user's cart
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		System.out.println("newswevlet:"+username);
		
		try {
			List<Cart>cartDetails = cartService.getCartDetails(username);
			request.setAttribute("cartDetails",cartDetails);
			System.out.println("cart details:"+cartDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
