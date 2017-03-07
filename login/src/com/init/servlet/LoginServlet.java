package com.init.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    private final String USERNAME = "Rongbo_J";
    private final String PASSWORD = "1234567";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("get request");
		doPost(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		System.out.println("get post");
		   String uname = request.getParameter("uname");
	        String pword = request.getParameter("pword");
	        PrintWriter pw = response.getWriter();
	        if(USERNAME.equals(uname) && PASSWORD.equals(pword))
	        {
	            pw.write("username and password is right!");
	        }else
	        {
	            pw.write("username or password is wrong!");
	        }
	        pw.close();
	}
}
