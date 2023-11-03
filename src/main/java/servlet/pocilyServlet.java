package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Policy;
import service.PolicyDAO;

/**
 * Servlet implementation class pocilyServlet
 */
@WebServlet("/pocilyServlet")
public class pocilyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PolicyDAO policyDAO;
       

    public pocilyServlet() {
    	this.policyDAO = new PolicyDAO();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getServletPath();
		
		try{
			//Servlet URL path
			switch(action) {
		
				case "/new":
					showNewForm(request,response);
					break;
				case "/insert":
					insertPolicy(request,response);
					break;
				case "/delete":			
					deletePolicy(request,response);
					break;
				case "/edit":
					showEditForm(request,response);
					break;
				case "/update":			
					updatePolicy(request,response);			
					break;
				default:
			//handle list			
				listPolicy(request,response);			
				break;
			}
		}catch(ServletException e) {
				e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	private void listPolicy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Policy> listPolicy = policyDAO.selectAllPolicy();
		request.setAttribute("listPolicy", listPolicy);
		RequestDispatcher dispatcher = request.getRequestDispatcher("policy-list.jsp");
		dispatcher.forward(request, response);
		
	}


	private void updatePolicy(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String policytype = request.getParameter("policytype");
		String description = request.getParameter("description");
//need to add validation	
	    Policy book = new Policy (id,policytype,description);
	    policyDAO.updatePolicy(book);
//newly added have some error	    
	    // Set a success message in the session
	    request.getSession().setAttribute("successMessage", "Policy successfully edited");  
	    
	    response.sendRedirect("list");
		// TODO Auto-generated method stub
		
	}


	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Policy existingPolicy = policyDAO.selectPolicy(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("policy-form.jsp");
		request.setAttribute("policy", existingPolicy);
		dispatcher.forward(request, response);
		
	}


	private void deletePolicy(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		String idParam = request.getParameter("id");
	    if (idParam != null && !idParam.isEmpty()) {
	        try {
	            int id = Integer.parseInt(idParam);
	    		policyDAO.deletePolicy(id);
	    		// Set a success message in the session
	            request.getSession().setAttribute("successMessage", "Policy successfully deleted");
	  
	    		response.sendRedirect("list");
	    		
	        } catch (NumberFormatException e) {
	        	e.printStackTrace();
	        }
	   } else {
	        // 'id' parameter is missing or empty
	        displayErrorPage("Missing policy ID", request, response);
	    }
		// TODO Auto-generated method stub
		
	}


	private void displayErrorPage(String errorMessage, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
	    request.setAttribute("errorMessage", errorMessage);
	    RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp"); // Create an error JSP page
	    dispatcher.forward(request, response);
		
	}


	private void insertPolicy(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String policytype = request.getParameter("policytype");
		String description = request.getParameter("description");
//need to add validation
//newly added
				Policy newPolicy = new Policy(policytype,description);
				policyDAO.insertPolicy(newPolicy);
			 
				// Set a success message in the session
				request.getSession().setAttribute("successMessage", "Policy successfully added");
	       
				response.sendRedirect("list");
		
	}


	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("policy-form.jsp");
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
