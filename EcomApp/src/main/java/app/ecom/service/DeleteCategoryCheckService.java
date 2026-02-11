package app.ecom.service;

import java.util.List;

import app.ecom.modals.Category;
import app.ecom.modals.Product;

public class DeleteCategoryCheckService {
	
	public static boolean itCanBeDelete(List<Product> products, Category category) {
		
		for(Product product : products) {
			if(product.getCategory().equals(category.getName())) {
				return false;
			}
		}
		
		return true;
	}
}
