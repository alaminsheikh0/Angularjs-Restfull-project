/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.log;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Al-Amin
 */
public class LoginDAO extends HttpServlet{
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/rdb";
        String user = "root";
        String password = "apcl123456";
        String driver = "com.mysql.jdbc.Driver";
        

        try {
            int id = Integer.parseInt(request.getParameter("s1"));
            String name = request.getParameter("s2");
            String email = request.getParameter("s3");
            String pass = request.getParameter("s4");
            String mobno = request.getParameter("s5");

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm = con.prepareStatement("insert into user values(?,?,?,?,?)");

            pstm.setInt(1, id);
            pstm.setString(2, name);
            pstm.setString(3, email);
            pstm.setString(4, pass);
            pstm.setString(5, mobno);

            int i = pstm.executeUpdate();

        } catch (Exception e) {

        }
        RequestDispatcher rd=request.getRequestDispatcher("homePage.jsp");
        rd.forward(request, response);
}
}
