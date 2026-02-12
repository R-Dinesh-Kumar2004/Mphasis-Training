package app.management.book.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.management.book.model.Book;


public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		
		book.setBookId(rs.getInt("book_id"));
		
		book.setBookName(rs.getString("book_name"));
		
		book.setBookPrice(rs.getDouble("book_price"));
		
		book.setNoOfCopies(rs.getInt("no_of_copies"));
		
		book.setStock(rs.getBoolean("in_stock"));
		
		book.setDateOfPublication(rs.getDate("date_of_publication"));

		return book;
	}

}
