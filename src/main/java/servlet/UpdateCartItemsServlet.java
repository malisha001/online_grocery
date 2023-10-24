package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.CartDB;
import service.CartServiceImpl;
import service.iCartService;

/**
 * Servlet implementation class UpdateCartItemsServlet
 */
@WebServlet("/UpdateCartItemsServlet")
public class UpdateCartItemsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCartItemsServlet() {
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
		int id = Integer.parseInt(request.getParameter("uitemId"));
		int qnt = Integer.parseInt(request.getParameter("quantity"));
		double total = Double.parseDouble(request.getParameter("quantity"));
		
		System.out.println("new:"+id);
		System.out.println(qnt);
		
		iCartService cartService = new CartServiceImpl();
		cartService.updateItems(id,qnt,total);
		response.sendRedirect("cart.jsp");
	}

}
