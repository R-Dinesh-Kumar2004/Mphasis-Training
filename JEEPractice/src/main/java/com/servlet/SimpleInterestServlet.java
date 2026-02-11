package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SimpleInterestServlet
 */
@WebServlet("/calculateInterest")
public class SimpleInterestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int amount = Integer.parseInt(request.getParameter("amount"));
		double interest = Double.parseDouble(request.getParameter("interest"));
		int years = Integer.parseInt(request.getParameter("years"));
		
		double interestAmount = (amount/interest)*years;
		
		PrintWriter pWriter = response.getWriter();
		pWriter.println("<table border=\"1\">\r\n"
				+ "        <tr>\r\n"
				+ "            <th>Label</th>\r\n"
				+ "            <th>Value</th>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>Principle</td>\r\n"
				+ "            <td>"+amount+"</td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>Rate of Interest</td>\r\n"
				+ "            <td>"+interest+"</td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>Number of Years</td>\r\n"
				+ "            <td>"+years+"</td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>Simple Interest</td>\r\n"
				+ "            <td>"+interestAmount+"</td>\r\n"
				+ "        </tr>\r\n"
				+ "    </table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
