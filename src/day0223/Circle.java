package day0223;

public class Circle extends Point{
	private double radius;
	
	public Circle(){
		
	}
	
	public Circle(double x, double y, double radius){
		super(x,y);
		this.radius = radius;
	}
	
	public void drawCircle(){
		System.out.println("���һ�һ��Բ\n��");
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(12, 32, 10);
		c.drawCircle();
	}
}
