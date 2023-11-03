package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import service.*;


@WebServlet("/AdminAddProductsServlet")
public class AdminAddProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AdminAddProductsServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name = request.getParameter("Name");
		String Category = request.getParameter("Category");
		String Brand = request.getParameter("Brand");
		String UnitPrice = request.getParameter("UnitPrice");
		String Quantity = request.getParameter("Quantity");
		String img = request.getParameter("img");
		String Description = request.getParameter("Description");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean isTrue;
		iAdminService AdminService = new AdminServiceImpl();
		isTrue = AdminService.addproduct(Name,Category,Brand, UnitPrice,Quantity,img,Description);

				
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("AdminDashboard.jsp");
			dis.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Item addd Unsucessful! Try Again.');");
			out.println("location = 'AdminDashboard.jsp'");
	    	out.println("</script>");
		}
	}

}
