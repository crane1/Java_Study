package day0214;

public class Person {
	private String name;
	private String phoneNumber;
	private String idCard;
	private Book book;
	
	public Person(){}
	
	public Person(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public Person(String name, String phoneNumber, String idCard){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String toString(){
		return "Person@name:" + name + " phonNumber:" + phoneNumber + " idCard:" + idCard;
	}
	
}
