package day0227;

public class Test {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		c.calArea();
		System.out.printf("��������" + c.getArea());
		c.draw();
		
		Triangle t = new Triangle();
		t.draw();
		
	}
}
