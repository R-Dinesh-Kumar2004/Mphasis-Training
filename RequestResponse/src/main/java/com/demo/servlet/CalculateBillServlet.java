package com.demo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/calculate_bill")
public class CalculateBillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prev = Integer.parseInt(request.getParameter("prev"));
		int curr = Integer.parseInt(request.getParameter("curr"));
		
		double billAmount = (Double)request.getAttribute("billAmount");
		
		double ans = (curr-prev)*billAmount;
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<p>Previous month units : "+prev+"</p>");
		printWriter.println("<p>Current month units : "+curr+"</p>");
		printWriter.println("<p>unit rate : "+billAmount+"</p>");
		printWriter.println("<p>Billing Amount : "+ans+"</p>");
	}

}
