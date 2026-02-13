package app.management.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.management.book.dao.BookDao;
import app.management.book.model.Book;

@Component
public class BookService {
	
	@Autowired
	BookDao bookDao;
	
	public int addBook(Book book) {
		return bookDao.insertBook(book);
	}
	
	public List<Book> getAllBooks(){
		return bookDao.getAllBooks();
	}
	
	public int deleteOneBook(int id) {
		return bookDao.deleteBook(id);
	}
	
	public boolean updateBook(Book book) {
		return bookDao.updateBook(book);
	}
	
	public Book getBook(int bookId) {
		return bookDao.getOneBook(bookId);
	}
}
