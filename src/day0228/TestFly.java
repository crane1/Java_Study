package day0228;

public class TestFly {
	
//	1�� ����һ���ӿ�CanFly��������ɵķ���;��
//	2�� �ֱ�����ɻ�����ʵ��CanFly�ӿڡ���
//	3������һ�������࣬���Էɻ����񡣲������ж���һ��makeFly()�������û�ɵ��������������
//	4��Ȼ����main�����д����ɻ����������󣬲���main�����е���makeFly()�������÷ɻ�������ɡ�
//	�ӿڼ̳нӿ� 

	public void makeFly(CanFly canfly){
		canfly.fly();
	}
	
	public static void main(String[] args) {
		Plane p = new Plane();
		Bird b = new Bird();
		
		TestFly t = new TestFly();
		t.makeFly(p);
		t.makeFly(b);
	}
}
