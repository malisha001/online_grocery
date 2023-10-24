package online_grocery;

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

/**
 * Servlet implementation class AddCartServlet
 */
@WebServlet("/AddCartServlet")
public class AddCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCartServlet() {
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
		int itemID = Integer.parseInt(request.getParameter("itemid"));
		int quentity = Integer.parseInt(request.getParameter("quentity"));
		
		HttpSession session = request.getSession();
		String userID = (String) session.getAttribute("username");
				
		System.out.println("userID:"+userID);
		System.out.println(quentity);
		
		boolean istrue;
		
		try {
			istrue = CartDB.getItems(itemID, quentity, userID);
			if(istrue == true) {
				response.sendRedirect("home.jsp");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
