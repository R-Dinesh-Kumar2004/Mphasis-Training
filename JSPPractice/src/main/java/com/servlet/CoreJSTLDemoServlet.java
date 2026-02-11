package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.model.Student;

@WebServlet("/core_jstl_demo")
public class CoreJSTLDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student s1 = new Student("raj", 6575465454L, LocalDate.of(2020, 11, 22), new String[] { "IT", "CSE" });
		Student s2 = new Student("arjun", 657757414L, LocalDate.of(2040, 11, 22), new String[] { "CSE" });
		Student s3 = new Student("ramu", 6455765454L, LocalDate.of(2720, 11, 22), new String[] { "AIDS", "CSE" });
		Student s4 = new Student("babu", 4175465454L, LocalDate.of(2026, 11, 01), new String[] { "Mech" });

		List<Student> studentList = Arrays.asList(s1, s2, s3, s4);
		request.setAttribute("studentList", studentList);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("jstl_core.jsp");
		requestDispatcher.forward(request, response);
	}
}
