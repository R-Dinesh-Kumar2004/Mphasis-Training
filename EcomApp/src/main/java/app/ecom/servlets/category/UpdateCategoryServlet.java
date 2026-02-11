package app.ecom.servlets.category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Category;

@WebServlet("/admin/update-category")
public class UpdateCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
List<Category> categories = (List<Category>)getServletContext().getAttribute("categories");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		
		for(Category category : categories) {
			if(category.getId() == id) {
				category.setName(name);
				break;
			}
		}
		
		response.sendRedirect("categories");
	}

}
