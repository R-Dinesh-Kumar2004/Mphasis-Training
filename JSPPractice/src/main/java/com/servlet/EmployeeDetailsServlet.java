package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import com.model.Employee;

@WebServlet("/employee_details")
public class EmployeeDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String dept = request.getParameter("dept");
		LocalDate dateOfJoining = LocalDate.parse(request.getParameter("doj"));
		int monthlySalary = Integer.parseInt(request.getParameter("salary"));
		int totalWorkingDays = Integer.parseInt(request.getParameter("totWorkDays"));
		int presentDays = Integer.parseInt(request.getParameter("presentDays"));
		
		Employee employee = new Employee(id, name, dept, dateOfJoining, monthlySalary, totalWorkingDays, presentDays);
		request.setAttribute("employee", employee);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee_details_receiver.jsp");
		requestDispatcher.forward(request, response);
	}

}
