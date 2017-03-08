package com.xybus.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/JudgeRide")
public class JudgeRideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String job_number = request.getParameter("job_number");
		String card_pin = request.getParameter("card_pin");
		System.out.println("get post  JudgeRide");
		PrintWriter pw = response.getWriter();
		pw.write("JudgeRide:"+"job_number:"+job_number+"card_pin:"+card_pin);
		System.out.println("JudgeRide:"+"job_number:"+job_number+"card_pin:"+card_pin);
	}
}
