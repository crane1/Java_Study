package day0308;

public class Test {
	public static void main(String[] args) {
		Info in=new Info();
		Producter p=new Producter(in);
		Customer c=new Customer(in);
		new Thread(c).start();
		new Thread(p).start();
		
	}
}
