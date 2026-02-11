package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TableServlet
 */
@WebServlet("/calculatetable")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("number"));
		int start = Integer.parseInt(request.getParameter("start"));
		int end = Integer.parseInt(request.getParameter("end"));
		
		PrintWriter printWriter = response.getWriter();
		response.setContentType("text/html");
		
		printWriter.write("<ol type='1'>\n");
		for(int i=start;i<=end;i++) {
			printWriter.write("<li>  "+number+" * "+i+" = "+(number*i)+"</li>\n");
		}
		printWriter.write("</ol>\n");
	}

}
