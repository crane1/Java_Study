package day0214;

public class Book {
	private String bookName;
	private String bookId;
	private String bookAuthor;
	private double bookPrice;
	
	public Book(){}
	
	public Book(String name, String id){
		this.bookName = name;
		this.bookId = id;
	}
	
	public Book(String name, String id, String author, double price){
		this.bookName = name;
		this.bookId = id;
		this.bookAuthor = author;
		this.bookPrice = price;
		
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public String toString(){
		return "Book@name:" + bookName + " id:" + bookId + " author:" + bookAuthor + " price:" + bookPrice;
	}
}
