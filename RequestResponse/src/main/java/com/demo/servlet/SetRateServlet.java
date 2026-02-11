package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet("/set_rate")
public class SetRateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<p><u>Here are your bill details: </u></p>");

		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();

		System.out.println("Today : " + today);
		System.out.println("Today date : " + day);

		double billAmount = 10;

		if (day > 10) {
			billAmount = 20;
		}

		request.setAttribute("billAmount", billAmount);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculate_bill");
		requestDispatcher.forward(request, response);

		String message = "";
		message = billAmount > 10 ? "Pay the bill on time" : "Thankyou for on time payment";

		printWriter.println("<p>" + message + "</p>");
		
		
		printWriter.close();
	}

}
