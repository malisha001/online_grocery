package servlet;

import java.io.IOException;
import java.io.PrintWriter;
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


@WebServlet("/AdminUpdatePServlet")
public class AdminUpdatePServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AdminUpdatePServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Create a PrintWriter to send response back to the client
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String cat = request.getParameter("cat");
		String brand = request.getParameter("brand");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");
		String dis = request.getParameter("dis");
		
		
		boolean isTrue;
		
		iAdminService AdminService = new AdminServiceImpl();
		
		// Call a method to add a product to the items database
		isTrue = AdminService.updateProducts(id, name, cat, brand, price, qty, dis);
		System.out.println("admin updatess:"+isTrue);
		
		//Redirect to the AdminDashboard.jsp when successfully added
		if(isTrue == true) {
			response.sendRedirect("AdminRetrievePServlet");
		}
		else{
			// If update is unsuccessful, display an error message and redirect back to ItemsServlet
			out.println("<script type='text/javascript'>");
			out.println("alert('Item Update Unsucessful! Try Again.');");
			out.println("location = 'AdminRetrievePServlet'");
	    	out.println("</script>");
		}
	}

}
