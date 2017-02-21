package day0210;

public class Number {
	
	int addInt(int a, int b){
		return a + b;
	}
	
	double addDouble(double a, double b){
		return a + b;
	}
	
	public static void main(String[] args){
		Number num = new Number();
		int a = 23;
		int b = 34;
		
		System.out.println(a + "+" + b + "=" + num.addInt(a,b));
		
		double c = 3.1415926;
		double d = 0.618;
		
		System.out.println(c + "+" + d + "=" + num.addDouble(c, d));
	}

}
