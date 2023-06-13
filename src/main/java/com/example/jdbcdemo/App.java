package com.example.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String url = "jdbc:mysql://localhost/test";
        String uname = "root";
        String pwd = "Ramu1234@";
        String query = "select * from books where bookid > 1 and bookid < 5";
        String query1 = "insert into books values(222,'myhibernatejava',44323.43)";
        try {

            Connection con = DriverManager.getConnection(url, uname, pwd);
            System.out.println("After Connection");
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query1);
            // while (rs.next()) {
            // System.out.println("No " + rs.getInt(1) + "Name is " + rs.getString(2) + "
            // Cost " + rs.getFloat(3));
            // }
            // rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println("MyException " + e);
        }
    }

}
