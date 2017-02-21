package Test;

import day0214.*;

public class BookPersonTest {

	public static void main(String[] args) {
		Person p = new Person("ÕÅÈı", "125485621457", "61032618547624");
		Book b = new Book("ºìÂ¥ÃÎ", "442576843241", "²ÜÑ©ÇÛ", 128.35);
		
		p.setBook(b);
		System.out.println(p);
		System.out.println(p.getBook());
	}

}
