package day0209;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
//		Alipay pay = new Alipay();
//		
//		System.out.println("我的余额：" + pay.viewBalance());
//		
//		System.out.println("我存点钱，100万");
//		pay.depositMoney(1000000);
//		System.out.println("我的余额：" + pay.viewBalance());
//		
//		System.out.println("我要买房，取点钱,60万");
//		pay.withdrawCash(600000);
//		System.out.println("没钱了，我的余额：" +pay.viewBalance() );
		
//		Test pay = new Test();
//		
////		int sum = pay.add(10,29);
////		sum = pay.add(sum, 10);
////		System.out.println(sum);
//		pay.printAddResult(10, 29);
		
		Student s = new Student();
		System.out.println("请输入学生的名字：");
		s.setName(input.next());
		System.out.println("请输入学生年龄：");
		s.setAge(input.nextInt());
		System.out.println("请输入学生学号");
		s.setId(input.next());
		
		System.out.println("\n学生个人信息：\n姓名：" + s.getName() + 
				"\n年龄：" + s.getAge() +
				"\n学号：" + s.getId());
		
		
		System.out.println("请输入学生的名字：");
		String name = input.next();
		System.out.println("请输入学生年龄：");
		int age = input.nextInt();
		System.out.println("请输入学生学号");
		String id = input.next();
		Student s2 = new Student(name, id);
		s2.setAge(age);
		
		System.out.println("\n学生个人信息：\n姓名：" + s2.getName() + 
				"\n年龄：" + s2.getAge() +
				"\n学号：" + s2.getId());
	}
	
	int add(int a, int b ){
		return a + b;
	}
	
	void printAddResult(int a, int b){
		int sum = a + b;
		System.out.println(sum);
	}
	
}
