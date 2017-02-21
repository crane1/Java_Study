package day0216;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true){
			System.out.println("请输入一个整数：");
			try{
				i = sc.nextInt();
			} catch(InputMismatchException e){
				System.out.println("输入不符合要求，请重新输入");
				sc.nextLine();
				continue;
			}
			if(i % 2 == 0){
				System.out.println( i + "是偶数");
			}else
				System.out.println(i + "是奇数  ");
		}
	}

}
