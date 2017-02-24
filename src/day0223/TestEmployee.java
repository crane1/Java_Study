package day0223;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee("颜晓晨", "高新", 120000);
		e.show();
		
		Director d = new Director("程志远", "小寨", 600000, 20000);
		d.show();
		
		Manager m = new Manager("李徵", "图书馆", 200000, "企划部");
		m.show();
		
	}

}
