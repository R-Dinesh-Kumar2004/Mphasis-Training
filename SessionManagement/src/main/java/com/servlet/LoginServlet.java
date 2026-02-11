package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("dinesh") && password.equals("123")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			response.sendRedirect("welcome.jsp");
		}
		else {
			response.sendRedirect("login.jsp?message=username or password is incorrect.");
		}
	}

}
