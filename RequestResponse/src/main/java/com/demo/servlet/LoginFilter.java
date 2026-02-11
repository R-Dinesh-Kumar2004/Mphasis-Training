package com.demo.servlet;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginFilter extends HttpFilter implements Filter {

	@Override
	public void init(FilterConfig config) throws ServletException{
		System.out.println("init is called");
	}
	
	@Override
	public void destroy() {
		
	}
	
	@Override
	public void doFilter(ServletRequest request,ServletResponse response, FilterChain filter) throws IOException, ServletException{
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		
		if(username == null || username.isEmpty() || password == null || password.isEmpty()){
			res.sendRedirect("error.jsp");
		}
		else {
			System.out.println("During request");
			filter.doFilter(request, response);
			System.out.println("During response");
		}
	}
}