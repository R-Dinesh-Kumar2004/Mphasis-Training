package app.management.book.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import app.management.book.model.Book;
import app.management.book.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;

//	@PostMapping("/add")
//	public ModelAndView addBook(@RequestParam("book_name") String bookName,
//			@RequestParam("book_price") String bookprice, @RequestParam("no_of_copies") String noOfCopies,
//			@RequestParam("date_of_publication") String dateOfPublication, ModelAndView mView) {
//
//		double price = Double.parseDouble(bookprice);
//		int copies = Integer.parseInt(noOfCopies);
//
//		Book book = new Book(bookName, price, copies, copies > 0, Date.valueOf(dateOfPublication));
//		int res = bookService.addBook(book);
//
//		if (res > 0) {
//			List<Book> books = bookService.getAllBooks();
//			
//			mView.addObject("books",books);
//			mView.addObject("message", "Book is added successfully.");
//			mView.setViewName("book_dashboard");
//		} else {
//			mView.addObject("message", "Book is not added.");
//			mView.setViewName("book_add");
//		}
//		return mView;
//	}

	@PostMapping("/add")
	public ModelAndView addBook(@RequestParam("book_name") String bookName,
			@RequestParam("book_price") double bookprice, @RequestParam("no_of_copies") int noOfCopies,
			@RequestParam("date_of_publication") Date dateOfPublication, ModelAndView mView) {

		Book book = new Book(bookName, bookprice, noOfCopies, noOfCopies > 0, dateOfPublication);
		int res = bookService.addBook(book);

		if (res > 0) {
			List<Book> books = bookService.getAllBooks();

			mView.addObject("books", books);
			mView.addObject("message", "Book is added successfully.");
			mView.setViewName("book_dashboard");
		} else {
			mView.addObject("message", "Book is not added.");
			mView.setViewName("book_add");
		}
		return mView;
	}

	@GetMapping("/delete/{bookId}")
	public ModelAndView deleteBook(@PathVariable("bookId") int bookId, ModelAndView mView) {

		int res = bookService.deleteOneBook(bookId);
		mView.setViewName("book_dashboard");

		if (res > 0) {
			mView.addObject("message", "Book is deleted successfully.");
		} else {
			mView.addObject("message", "Book is not deleted.");
		}

		List<Book> books = bookService.getAllBooks();
		mView.addObject("books", books);

		return mView;
	}

	// we can use modelAttribute also to get hole book object but the variable name
	// and the parameter are same.
	@PostMapping("/update/{bookId}")
	public ModelAndView updateBook(@PathVariable("bookId") int bookId, @RequestParam("book_name") String bookName,
			@RequestParam("book_price") double bookPrice, @RequestParam("no_of_copies") int noOfCopies,
			@RequestParam("date_of_publication") Date dateOfPublication, ModelAndView mView) {

		Book book = bookService.getBook(bookId); // if we use modelAttribute this method is not necessary because the id
													// included in jsp page.
		book.setBookName(bookName);
		book.setBookPrice(bookPrice);
		book.setNoOfCopies(noOfCopies);
		book.setDateOfPublication(dateOfPublication);

		if (bookService.updateBook(book)) {

			List<Book> books = bookService.getAllBooks();
			mView.addObject("books", books);

			mView.setViewName("book_dashboard");
			mView.addObject("message", "Book is updated successfully.");
		} else {
			mView.setViewName("book_update");
			mView.addObject("message", "Book is not updated.");
		}

		return mView;
	}
}