package day0213;

//����һ���������࣬��Ա�������ߣ��������ܳ�������������A����������

public class Triangle {
	
	private double sideA = 0.0;
	private double sideB = 0.0;
	private double sideC = 0.0;
	
	public Triangle(double a, double b, double c){
		sideA = a;
		sideB = b;
		sideC = c;
	}
	
	// �����ܳ�  circumference
	public double calCircum(){
		return sideA + sideB + sideC;
	}

}
