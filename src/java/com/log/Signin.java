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
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.log.Login;
import javax.servlet.http.HttpServlet;


public class Signin extends HttpServlet {
     protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        ArrayList<Login> list=new ArrayList<>();
        String email=req.getParameter("d1");
        String pass=req.getParameter("d2");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rdb","root","apcl123456");
            PreparedStatement pstm=con.prepareStatement("select * from user where email=? and password=?");
            pstm.setString(1, email);
            pstm.setString(2, pass);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                Login s=new Login(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5));
                list.add(s); 
            }
        
        }catch(Exception e){
        
        }
        req.setAttribute("st", list);
        RequestDispatcher rd=req.getRequestDispatcher("homePage.jsp");
        rd.forward(req, res);
    }
}
