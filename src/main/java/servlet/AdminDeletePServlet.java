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
 * Servlet implementation class AdminDeletePServlet
 */
@WebServlet("/AdminDeletePServlet")
public class AdminDeletePServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDeletePServlet() {
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
		String id = request.getParameter("delete");
		
		boolean isTrue;
		
		iAdminService AdminService = new AdminServiceImpl();
		isTrue = AdminService.deleteProducts(id);
		
		if(isTrue == true) {
			response.sendRedirect("AdminRetrievePServlet");
		}
		else {
//			List<Items> iDetails = AdminService.getItemDetails(id);
//			request.setAttribute("iDetails", iDetails);
//			
//			RequestDispatcher dispatcher = request.getRequestDispatcher("Items.jsp");
//			dispatcher.forward(request, response);
		}
	}

}
