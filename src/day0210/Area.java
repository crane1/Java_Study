package day0210;

public class Area {
	
	//����Բ�ε����   Circle
	void calArea(double radius){
		double area = Math.PI * (radius * radius);
		String sArea = String.format("%.2f", area);
				
		System.out.println("��Բ�ε�����ǣ�" + sArea);
		
	}
	
	// ������ε����  Rectangle
	void calArea(double width, double height){
		double area = width * height;
		String sArea = String.format("%.2f", area);
		System.out.println("�˾��ε�����ǣ�" + sArea);
	}
	
	// �������ε����  Trapezoid
	void calArea(double upBottom, double subBottom, double height){
		double area = (upBottom + subBottom) * height * 0.5;
		String sArea = String.format("%.2f", area);
		System.out.println("�����ε�����ǣ�" + sArea);
	}
	
	public static void main(String[] args) {
//		String s = String.format("%.2f", Math.PI);
//		System.out.println(s);
		
		Area area = new Area();
		area.calArea(10);
		area.calArea(10, 34);
		area.calArea(23.09, 34, 10);
	}
}
