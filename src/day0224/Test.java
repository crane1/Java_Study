package day0224;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Pen pen1 = new Pen("�ֱ�", 100);
		Pen pen2 = new Pen("���Ա�", 4);
		
		Eraser eraser1 = new Eraser("����Ƥ", 2);
		Eraser eraser2 = new Eraser("��Ƥ��", 10);
		
		Student stu = new Student("������");
		Painter pai = new Painter("�Ͽ���");
		
		StationeryStore ss = new StationeryStore();
		
		System.out.println("*********�ľߵ�r(�s_�t)�q��ҵ��*********");
		System.out.println("��ѡ���ľ�: 1.�ֱ�\t2.���Ա�\t3.����Ƥ\t4.��Ƥ��");
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		switch(str){
		case 1:
			stu.setPen(pen1);
			ss.sale(pen1);
			break;
		case 2:
			stu.setPen(pen2);
			ss.sale(pen2);
			break;
		case 3:
			pai.setEraser(eraser1);
			ss.sale(eraser1);
			break;
		case 4:
			pai.setEraser(eraser2);
			ss.sale(eraser2);
			break;
		}
		
		System.out.println(stu);
		System.out.println(pai);
		
	}
}
