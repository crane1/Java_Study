package day0215;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		int day = 0;
		System.out.println("请输入星期代号");
		Scanner sc = new Scanner(System.in);
		day = sc.nextInt();
		switch(day){
		case 0:
			System.out.println("星期日");
			break;
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		default:
			System.out.println("请输入正确编号0~6");
			break;
		}
	}

}
