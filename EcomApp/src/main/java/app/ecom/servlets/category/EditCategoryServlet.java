package app.ecom.servlets.category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Category;

@WebServlet("/admin/edit-category")
public class EditCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		List<Category> categories = (List<Category>)request.getServletContext().getAttribute("categories");
		
		for(Category category : categories) {
			if(category.getId() == id) {
				request.setAttribute("category", category);
				break;
			}
		}
		
		request.getRequestDispatcher("/jsp/admin/edit-category.jsp").forward(request, response);
	}
}
