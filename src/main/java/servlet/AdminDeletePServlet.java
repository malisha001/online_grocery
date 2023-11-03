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

@WebServlet("/AdminDeletePServlet")
public class AdminDeletePServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AdminDeletePServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("delete");
		
		boolean isTrue;
		
		iAdminService AdminService = new AdminServiceImpl();
		isTrue = AdminService.deleteProducts(id);
		
		//Redirect to the ItemsServlet when successfully deleted
		if(isTrue == true) {
			response.sendRedirect("AdminRetrievePServlet");
		}
		else {
		    // If deletion is unsuccessful, display an error message and redirect back to ItemsServlet
			out.println("<script type='text/javascript'>");
			out.println("alert('Item Delete Unsucessful! Try Again.');");
			out.println("location = 'ItemsServlet'");
		}
	}

}
