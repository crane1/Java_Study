package day0209;

public class Number {
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int f = 0;
		printInfo(a, b, c, d, e, "交换前");
		// 交换 a 和 e 的值
		f = a; 
		a = e;
		e = f;
		
		// 交换 b 和  d 的值
		f = b;
		b = d;
		d = f;
		printInfo(a, b, c, d, e, "\n交换后");
		
	}
	
	// 打印 几个数字的值
	static void printInfo(int a, int b, int c, int d, int e, String time){
		System.out.println(time+"\na=" + a +
				" b=" + b +
				" c=" + c +
				" d=" + d +
				" e=" + e);
	}
}
