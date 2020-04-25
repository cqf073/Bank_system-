package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mainServlet
 */
@WebServlet("/main")
public class mainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html,charset=utf-8");
    	String s=request.getParameter("T");
    	switch (s){
    	case "1":	request.getRequestDispatcher("addCount.jsp").forward(request, response);
    	break;
    	case "2":	request.getRequestDispatcher("takeCount.jsp").forward(request, response);
    	break;
    	case "3":	request.getRequestDispatcher("postCount.jsp").forward(request, response);
    	break;
    	case "4":	request.getRequestDispatcher("tip.jsp").forward(request, response);
    	break;
    	case "5":	request.getRequestDispatcher("exit.jsp").forward(request, response);
    	break;
    	
		
		
    		
    	}
    	
		
		
		
		
	}

}
