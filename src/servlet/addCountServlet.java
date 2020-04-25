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
 * Servlet implementation class addCountServlet
 */
@WebServlet("/addCountServlet")
public class addCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//用户信息写入数据库
		
		response.setContentType("text/html,charset=utf-8");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
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
			String sql  = "insert into  b_order_detail(uname,pwd)  values("+uname+","+pwd+")";
			int i=st.executeUpdate(sql);
			
			if(i==1){
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else{
				request.getRequestDispatcher("add.jsp").forward(request, response);
			}
//			System.out.println(sql);
//			System.out.println( "name:"+uname+"pwd:"+pwd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
}