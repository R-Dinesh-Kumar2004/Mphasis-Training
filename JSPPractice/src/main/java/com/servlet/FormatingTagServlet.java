package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

@WebServlet("/formating_tags_jstl")
public class FormatingTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = "Welcome to fomatting tags learning";
		int endrolledCount = 15216;
		double fees = 1499.00;
		Date dateOfExam = new Date();

		request.setAttribute("message", message);
		request.setAttribute("endrolledCount", endrolledCount);
		request.setAttribute("fees", fees);
		request.setAttribute("dateOfExam", dateOfExam);

		request.getRequestDispatcher("formating_tags.jsp").forward(request, response);
	}

}
