package day0209;

public class Number {
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int f = 0;
		printInfo(a, b, c, d, e, "����ǰ");
		// ���� a �� e ��ֵ
		f = a; 
		a = e;
		e = f;
		
		// ���� b ��  d ��ֵ
		f = b;
		b = d;
		d = f;
		printInfo(a, b, c, d, e, "\n������");
		
	}
	
	// ��ӡ �������ֵ�ֵ
	static void printInfo(int a, int b, int c, int d, int e, String time){
		System.out.println(time+"\na=" + a +
				" b=" + b +
				" c=" + c +
				" d=" + d +
				" e=" + e);
	}
}
