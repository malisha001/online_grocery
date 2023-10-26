package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import service.*;


/**
 * Servlet implementation class AdminAddProductsServlet
 */
@WebServlet("/AdminAddProductsServlet")
public class AdminAddProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminAddProductsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name = request.getParameter("Name");
		String Category = request.getParameter("Category");
		String Brand = request.getParameter("Brand");
		String UnitPrice = request.getParameter("UnitPrice");
		String Quantity = request.getParameter("Quantity");
		String img = request.getParameter("img");
		String Description = request.getParameter("Description");
		
		double cUnitPrice = Double.parseDouble(UnitPrice);
		int cQuantity = Integer.parseInt(Quantity);
		
		boolean isTrue;
		iAdminService AdminService = new AdminServiceImpl();
		isTrue = AdminService.addproduct(Name,Category,Brand, cUnitPrice,cQuantity,img,Description);

				
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("AdminDashboard.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
