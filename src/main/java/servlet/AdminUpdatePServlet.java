package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Items;

import service.AdminServiceImpl;
import service.iAdminService;

/**
 * Servlet implementation class AdminUpdatePServlet
 */
@WebServlet("/AdminUpdatePServlet")
public class AdminUpdatePServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpdatePServlet() {
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
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String cat = request.getParameter("cat");
		String brand = request.getParameter("brand");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");
		String dis = request.getParameter("dis");
		
		
		boolean isTrue;
		
		iAdminService AdminService = new AdminServiceImpl();
		isTrue = AdminService.updateProducts(id, name, cat, brand, price, qty, dis);
		System.out.println("admin update:"+isTrue);
		
		if(isTrue == true) {
			response.sendRedirect("AdminRetrievePServlet");
		}
		else {
		
//			List<Items> itemDetails = AdminService.getItemDetails(id);
//			request.setAttribute("itemDetails", itemDetails);
			
			RequestDispatcher req = request.getRequestDispatcher("Items.jsp");
			req.forward(request, response);
		}
	}

}
