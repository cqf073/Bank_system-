package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gjt.mm.mysql.Driver;

/**
 * Servlet implementation class takeCountServlet
 */
//@WebServlet("/takeCountServlet")
public class takeCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html,charset=utf-8");
    	String moneystyle = request.getParameter("moneystyle");
		String money = request.getParameter("money");
		String cardid = request.getParameter("cardid");
		try {
			DriverManager.registerDriver(new Driver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/em";
		String user ="root";
		String password ="123456";
		try {
			Connection conn=DriverManager.getConnection(url, user, password);
			Statement st =conn.createStatement();
			//更改数据
			String sql  = "UPDATE b_order_detail SET money = money-"+money+" WHERE id_num= " +cardid;
			System.out.println(sql);
			int i=st.executeUpdate(sql);
			if(i==1){
				request.getRequestDispatcher("success.jsp").forward(request, response);
				
			}
			else{
				request.getRequestDispatcher("failed.jsp").forward(request, response);
			}
			
//			System.out.println(sql);
//			System.out.println( "name:"+uname+"pwd:"+pwd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
