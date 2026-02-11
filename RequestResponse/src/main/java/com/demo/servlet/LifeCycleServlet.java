package com.demo.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet("/servlet_lifecycle")
public class LifeCycleServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	
	ServletConfig config;

	@Override
	public void destroy() {
		System.out.println("connection destroyed.....");
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("connection established.....");
	}

	@Override
	public void service(ServletRequest requset, ServletResponse response) throws ServletException, IOException {
		System.out.println("sevice method called.....");
	}
	
}
