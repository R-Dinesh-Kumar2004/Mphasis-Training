package app.management.book.dao;

import java.util.List;

import app.management.book.model.Book;


public interface BookDao {
	
	void createSchema();

	void createTable();

	int insertBook(Book book);

	boolean modifyBook(Book book);

	Book getOneBook(int bookId);

	Book getOneBook(String bookName);

	List<Book> getAllBooks();
	
	boolean deleteBook(int bookId);
}
