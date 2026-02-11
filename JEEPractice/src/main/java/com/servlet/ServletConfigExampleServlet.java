package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletConfigExampleServlet
 */

public class ServletConfigExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		
		System.out.println(config.getInitParameter("url"));
		System.out.println(config.getInitParameter("name"));
		System.out.println(config.getInitParameter("password"));
		
		
		ServletContext context = getServletContext();
		
		System.out.println(context.getInitParameter("global_url"));
		System.out.println(context.getInitParameter("global_name"));
		System.out.println(context.getInitParameter("global_password"));
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}