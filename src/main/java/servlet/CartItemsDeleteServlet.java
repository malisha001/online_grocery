package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CartServiceImpl;
import service.iCartService;


@WebServlet("/CartItemsDeleteServlet")
public class CartItemsDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CartItemsDeleteServlet() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("itemId"));
		iCartService cartService = new CartServiceImpl();	
		cartService.deleteItems(id);
		response.sendRedirect("cart.jsp");
		System.out.println("new delete"+id);
	}

}
