package app.ecom.servlets.category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Category;


@WebServlet("/admin/categories")
public class ViewCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Category> categories = (List<Category>)getServletContext().getAttribute("categories");	
		
		String message = request.getParameter("message");
		
		request.setAttribute("message", message);
		request.setAttribute("categories", categories);
		
		request.getRequestDispatcher("/jsp/admin/categories.jsp").forward(request, response);
	}

}
