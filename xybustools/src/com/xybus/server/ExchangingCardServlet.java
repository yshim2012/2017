package com.xybus.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExchangingCardServlet
 */
@WebServlet("/ExchangingCard")
public class ExchangingCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String old_jobnumber = request.getParameter("old_jobnumber");
		String new_jobnumber = request.getParameter("new_jobnumber");
		PrintWriter printWriter = response.getWriter();
		System.out.println("ExchangingCard:"+"old_jobnumber:"+old_jobnumber+";new_jobnumber:"+new_jobnumber);
		printWriter.write("old_jobnumber:"+old_jobnumber+";new_jobnumber:"+new_jobnumber);
	}

}
