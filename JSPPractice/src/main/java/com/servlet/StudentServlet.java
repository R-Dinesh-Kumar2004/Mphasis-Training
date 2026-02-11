package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.model.Student;

@WebServlet("/student_servlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		long phoneNo = Long.parseLong(request.getParameter("phoneNo"));
		LocalDate addmissionDate = LocalDate.parse(request.getParameter("admissionDate"));
		String stream[] = request.getParameterValues("stream");
		
		Student student = new Student(name, phoneNo, addmissionDate, stream);
		System.out.println(student);
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("student_data_receiver.jsp");
		request.setAttribute("student", student);
		
		requestDispatcher.forward(request, response);
	}

}
