package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;



@WebServlet("/userlogin")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		System.out.println("Inside servlet");
		
		if(name.equals("dinesh") && password.equals("123")) {
			
			request.setAttribute("name", name);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
			requestDispatcher.forward(request, response);
			
		}
		else {
			response.sendRedirect("fail.jsp");
		}
	}

}
