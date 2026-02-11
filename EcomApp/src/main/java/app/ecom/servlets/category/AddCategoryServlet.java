package app.ecom.servlets.category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Category;

@WebServlet("/admin/add-category")
public class AddCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String message = request.getParameter("message");
		request.setAttribute("message", message);
		
		request.getRequestDispatcher("/jsp/admin/add-category.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Category> categories = (List<Category>)getServletContext().getAttribute("categories");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		
		
		for(Category category : categories) {
			if(category.getId() == id) {
				response.sendRedirect("add-category?message=The category with ID already exist.");
				return;
			}
			else if(category.getName().equalsIgnoreCase(name)) {
				response.sendRedirect("add-category?message=The category with name already exist.");
				return;
			}
		}
		
		categories.add(new Category(id,name));
		
		response.sendRedirect("categories");
	}

}
