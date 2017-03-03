package day0227;

public class Circle extends Shape{
	double radius;
	
	public Circle(){}
	public Circle(double radius){
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("»­Ô²");
	}
	
	public void calArea(){
		double area = Math.PI * radius * radius;
		this.setArea(area);
	}

}
