package app.ecom.servlets.category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Category;
import app.ecom.modals.Product;
import app.ecom.service.DeleteCategoryCheckService;

@WebServlet("/admin/delete-category")
public class DeleteCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		List<Category> categories = (List<Category>)getServletContext().getAttribute("categories");
		
		Category category = null;
		
		for(Category c : categories) {
			if(c.getId() == id) {
				category = c;
				break;
			}
		}
		
		List<Product> products = (List<Product>) getServletContext().getAttribute("products");
		
		if(DeleteCategoryCheckService.itCanBeDelete(products,category)) {
			categories.remove(category);
			response.sendRedirect("categories");
		}
		else {
			response.sendRedirect("categories?message=Category cannot be deleted because products are associated with it.");
		}
		
	}

}
