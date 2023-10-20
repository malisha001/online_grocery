package com.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String ID = request.getParameter("id");
		int iId = Integer.parseInt(ID);
		
		
		
		boolean isTrue;
		
		isTrue = ProductDBUtil.deleteProducts(iId);
		
		if(isTrue == true){
			//List<> ItemsList = ProductDBUtil.get
		} else {
			
		}
		
	}

}
