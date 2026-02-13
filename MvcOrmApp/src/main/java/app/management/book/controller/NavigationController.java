package app.management.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import app.management.book.dao.BookDao;
import app.management.book.model.Book;

@Controller
public class NavigationController { 
	
	@Autowired
	BookDao bookDao;
	
	@GetMapping("/")
	public String openBookDashboard(Model model) {
		
		List<Book> books = bookDao.getAllBooks();
		System.out.println(books);
		
		model.addAttribute("books",books);
		
		return "book_dashboard";
	}
	
	@GetMapping("/openAddBookPage")
	public String openAddBookPage() {
		return "book_add";
	}
	
	@GetMapping("/openUpdateBookPage")
	public ModelAndView openUpdateBookPage(@RequestParam("bookId") int bookId, ModelAndView mView) {
		
		Book book = bookDao.getOneBook(bookId);
		
		mView.setViewName("book_update");
		mView.addObject("book", book);
		
		return mView;
	}
}