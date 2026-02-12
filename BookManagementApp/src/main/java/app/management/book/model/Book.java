package app.management.book.model;

import java.sql.Date;

public class Book {
	private int bookId;
	private String bookName;
	private double bookPrice;
	private int noOfCopies;
	private boolean isStock;
	private Date dateOfPublication;

	public Book() {
		super();
	}

	public Book(String bookName, double bookPrice, int noOfCopies, boolean isStock, Date dateOfPublication) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.noOfCopies = noOfCopies;
		this.isStock = isStock;
		this.dateOfPublication = dateOfPublication;
	}

	public Book(int bookId, String bookName, double bookPrice, int noOfCopies, boolean isStock,
			Date dateOfPublication) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.noOfCopies = noOfCopies;
		this.isStock = isStock;
		this.dateOfPublication = dateOfPublication;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public boolean isStock() {
		return isStock;
	}

	public void setStock(boolean isStock) {
		this.isStock = isStock;
	}

	public Date getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	@Override
	public String toString() {
		return "\nBook [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", noOfCopies="
				+ noOfCopies + ", isStock=" + isStock + ", dateOfPublication=" + dateOfPublication + "]";
	}

}
