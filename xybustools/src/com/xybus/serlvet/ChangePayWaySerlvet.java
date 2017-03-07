package com.xybus.serlvet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangePayWaySerlvet
 */
@WebServlet("/ChangePayWay")
public class ChangePayWaySerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final String USERNAME = "Rongbo_J";
    private final String PASSWORD = "1234567";  



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
		System.out.println(1);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String job_number = request.getParameter("job_number");
		String pay_way = request.getParameter("pay_way");
		System.out.println("get post  ChangePayWay");
		PrintWriter pw = response.getWriter();
		pw.write("ChangePayWay:"+job_number+"Ö§¸¶·½Ê½£º"+pay_way);
	}

}
