package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.model.Student;

@WebServlet("/register")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String skills[] = request.getParameterValues("skills");
		String city = request.getParameter("city");

		Student student = new Student(name, age, gender, skills, city);

		if (student.getAge() < 18) {
			response.sendRedirect("error.jsp?message=Registration is open to 18%2B students");
		} else {
			request.setAttribute("studentData", student);
			request.getRequestDispatcher("result.jsp").forward(request, response);
		}
	}

}
