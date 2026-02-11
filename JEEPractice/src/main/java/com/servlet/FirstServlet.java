package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Do Get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nameString = request.getParameter("name");
		String passwordString = request.getParameter("password");
		String hobbies[] = request.getParameterValues("hobbies");
		
		response.setContentType("text");
		PrintWriter writer = response.getWriter();
		
		writer.println("Hello : "+nameString);
		writer.println("Your Password is : "+passwordString);
		writer.println("Hobbies are : "+Arrays.toString(hobbies));
		
		
	}

}