package day0216;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("请输入三个数：");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			int max = a;  // a>b a>c
			if(max < b){
				max = b;
			}
			if (max < c){
				max = c;
			}
			
				
			System.out.println("这三个数的最大值为：" + max);
		}
	}

}
