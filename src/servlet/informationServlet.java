package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

import pojo.User;
/**
 * Servlet implementation class informationServlet
 */
@WebServlet("/informationServlet")
public class informationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html,charset=utf-8");
    	
    	String i=request.getParameter("o");
    	
    	try {
			request.setAttribute("IM",getin(i));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	request.getRequestDispatcher("tip.jsp").forward(request, response);	
	}

	private Object getin(String i) throws SQLException {
		
		DriverManager.registerDriver(new Driver());
		String url="jdbc:mysql://localhost:3306/em?characterEncoding=utf-8";
		String user ="root";
		String password ="123456";
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement st = conn.createStatement();
		String sql="select * from b_order_detail where name="+i;
		ResultSet rs = st.executeQuery(sql);
		User o= new User();
		while(rs.next()){
			Timestamp time=rs.getTimestamp(11);
			String cardid=rs.getString(6);
			String name = rs.getString(4);
			double money =rs.getDouble(9);
			o.setMoney(money);
			o.setName1(name);
			o.setId_num(cardid);
			o.setTime(time);	
			
		}
		rs.close();
		st.close();
		conn.close();
		return o;
	}

}
