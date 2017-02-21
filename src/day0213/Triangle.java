package day0213;

//创建一个三角形类，成员变量三边，方法求周长，创建类主类A来测试它。

public class Triangle {
	
	private double sideA = 0.0;
	private double sideB = 0.0;
	private double sideC = 0.0;
	
	public Triangle(double a, double b, double c){
		sideA = a;
		sideB = b;
		sideC = c;
	}
	
	// 计算周长  circumference
	public double calCircum(){
		return sideA + sideB + sideC;
	}

}
