package day0215;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		int day = 0;
		System.out.println("���������ڴ���");
		Scanner sc = new Scanner(System.in);
		day = sc.nextInt();
		switch(day){
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		default:
			System.out.println("��������ȷ���0~6");
			break;
		}
	}

}
