package day0209;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
//		Alipay pay = new Alipay();
//		
//		System.out.println("�ҵ���" + pay.viewBalance());
//		
//		System.out.println("�Ҵ��Ǯ��100��");
//		pay.depositMoney(1000000);
//		System.out.println("�ҵ���" + pay.viewBalance());
//		
//		System.out.println("��Ҫ�򷿣�ȡ��Ǯ,60��");
//		pay.withdrawCash(600000);
//		System.out.println("ûǮ�ˣ��ҵ���" +pay.viewBalance() );
		
//		Test pay = new Test();
//		
////		int sum = pay.add(10,29);
////		sum = pay.add(sum, 10);
////		System.out.println(sum);
//		pay.printAddResult(10, 29);
		
		Student s = new Student();
		System.out.println("������ѧ�������֣�");
		s.setName(input.next());
		System.out.println("������ѧ�����䣺");
		s.setAge(input.nextInt());
		System.out.println("������ѧ��ѧ��");
		s.setId(input.next());
		
		System.out.println("\nѧ��������Ϣ��\n������" + s.getName() + 
				"\n���䣺" + s.getAge() +
				"\nѧ�ţ�" + s.getId());
		
		
		System.out.println("������ѧ�������֣�");
		String name = input.next();
		System.out.println("������ѧ�����䣺");
		int age = input.nextInt();
		System.out.println("������ѧ��ѧ��");
		String id = input.next();
		Student s2 = new Student(name, id);
		s2.setAge(age);
		
		System.out.println("\nѧ��������Ϣ��\n������" + s2.getName() + 
				"\n���䣺" + s2.getAge() +
				"\nѧ�ţ�" + s2.getId());
	}
	
	int add(int a, int b ){
		return a + b;
	}
	
	void printAddResult(int a, int b){
		int sum = a + b;
		System.out.println(sum);
	}
	
}
