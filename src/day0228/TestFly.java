package day0228;

public class TestFly {
	
//	1、 定义一个接口CanFly，描述会飞的方法;　
//	2、 分别定义类飞机和鸟，实现CanFly接口。　
//	3、定义一个测试类，测试飞机和鸟。测试类中定义一个makeFly()方法，让会飞的事物飞起来。　
//	4、然后在main方法中创建飞机对象和鸟对象，并在main方法中调用makeFly()方法，让飞机和鸟起飞。
//	接口继承接口 

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
