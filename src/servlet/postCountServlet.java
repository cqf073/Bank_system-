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
 * Servlet implementation class postCountServlet
 */
@WebServlet("/postCountServlet")
public class postCountServlet extends HttpServlet {
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
		String cardid1 = request.getParameter("id_num1");
		String cardid2 = request.getParameter("id_num2");
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
			String sql1  = "UPDATE b_order_detail SET money = money-"+money+" WHERE id_num= " +cardid1;
			String sql2  = "UPDATE b_order_detail SET money = money+"+money+" WHERE id_num= " +cardid2;
			
			System.out.println(sql1);
			System.out.println(sql2);
			int i=st.executeUpdate(sql1);
			int ii=st.executeUpdate(sql2);
			if(i==1&&ii==1){
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
