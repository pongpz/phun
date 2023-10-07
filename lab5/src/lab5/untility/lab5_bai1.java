/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.untility;

import java.sql.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author j
 */
public class lab5_bai1 {
    public static void main(String[] args) {
        try {
            String USER = "sa";
            String PASSWORD = "123";
            String URL = "jdbc:sqlserver://DESKTOP-LA0O6GV\\SQLEXPRESS03:1433;databaseName=LAB5";
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "select * from STUDENT";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {                
                System.out.print(rs.getString("MASV")+",");
                System.out.print(rs.getString("HOTEN")+",");
                
                System.out.print(rs.getString("EMAIL")+",");
                System.out.print(rs.getString("SODT")+",");
                System.out.println(rs.getString("GIOITINH"));
            }
        } catch (Exception e) {
        }
    }
    
//      public static String USER = "sa";
//    public static String PASSWORD = "123";
//    public static String URL = "jdbc:sqlserver://DESKTOP-LA0O6GV\\SQLEXPRESS03:1433;databaseName=LAB5";
//
//    static {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        } catch (ClassNotFoundException ex) {
//            System.out.println(ex);
//        }
//    }
//    
//    
//    
//    public static Connection getConnection() {
//        Connection cn = null;
//        try {
//            cn = DriverManager.getConnection(URL, USER, PASSWORD);
//        } catch (SQLException ex) {
//           System.out.println(ex);
//        }
//        return cn;
//    }
//
//    public static void main(String[] args) {
//        Connection  cn = getConnection();
//        String sql="select * from STUDENT";
//        Statement st = cn.createStatement();
//    }
}
