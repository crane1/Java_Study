package day0227;

public abstract class Shape {
	private double area;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public abstract void draw();
	public void calArea(){}
}
