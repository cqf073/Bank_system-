package dao;

import com.mysql.jdbc.Connection;
import pojo.User;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/4/2421:45
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class daoimpl implements dao {
    public User check(String uname, String pwd) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/em?characterEncoding=utf-8", "root", "123456");
                String sql = "select * from b_order_detail where uname=? and pwd=?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, uname);
                ps.setString(2, pwd);
                rs = ps.executeQuery();
                while (rs.next()) {
                    u = new User();
                    u.setPwd(rs.getString("pwd"));
                    u.setUname(rs.getString("uname"));
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                ps.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return u;
    }
}
