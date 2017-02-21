package day0214;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 练习1
		int contryPeopleNum1 = 1370536875; // 中国总人口数为
		int contryPeopleNum2 = 1339724852; // 省、直辖市和自治区的人口
		int hongkongNum = 23162123;  // 香港行政区人口
		int aomenNum = 552300;  // 澳门行政区人口
		
		System.out.println("中国总人口数为：" + contryPeopleNum1
				+ "\n省、直辖市和自治区的人口：" + contryPeopleNum2
				+ "\n香港行政区人口：" + hongkongNum
				+ "\n澳门行政区人口：" + aomenNum);
		
		// 练习2
		double wasteFood = 248752567000L;  // 每年浪费粮食的量
		double perNeedFood = 366 * 0.5; // 每人每年吃的量
		int personNum = (int)(wasteFood / perNeedFood); // 可养活的人
		System.out.println("\n每年浪费粮食：" + wasteFood + "\n每人每年吃的量：" 
				+ perNeedFood + "\n可养活的人：" + personNum);
		System.out.println("结论是：每年浪费的粮食基本可以把中国人再养一年");
		
		// 练习3
		Scanner sc = new Scanner(System.in);
		System.out.println("\n请输入中国的森林覆盖面积：");
		double area = sc.nextDouble();
		System.out.println("请输入中国人数：");
		int personNum1 = sc.nextInt();
		
		double avgArea = area / personNum1;
		System.out.println("中国人均森林覆盖面积：" + avgArea);
	}

}
