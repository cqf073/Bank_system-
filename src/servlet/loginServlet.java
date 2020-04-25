package servlet;

import pojo.User;
import service.serviceimpl;
import service.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
//		System.out.println("000");
		response.setContentType("text/html,charset=utf-8");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
//		System.out.println("123");
		service rr= new serviceimpl();
		User u = rr.check(uname, pwd);
//		System.out.println("123123");
		if(u!=null){
			//跳转功能选项页面
			request.getRequestDispatcher("function.jsp").forward(request, response);
			
		}else{
			
			request.getRequestDispatcher("add.jsp").forward(request, response);
		}
		
		
		
	}

}
