package no2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Hello");
		
		String id = request.getRequestedSessionId();
		response.getWriter().println("Your session id is  "+ id);
		
		Integer param = null;
		request.getSession().setAttribute("param", param); 
		
		response.getWriter().println("Session attribute is " + param);
	
	}


}
