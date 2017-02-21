package day0215;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 练习1  用switch语句在控制台输入1-7之间的一个数字，输出相应的课程信息（键盘输入法）
		System.out.println("****************练习1*****************");
		
		System.out.println("请输入一个1~7之间的数字：");
		switch(sc.nextInt()){
		case 1:
			System.out.println("数学分析");
			break;
		case 2:
			System.out.println("高等代数");
			break;
		case 3:
			System.out.println("解析几何");
			break;
		case 4:
			System.out.println("C语言");
			break;
		case 5:
			System.out.println("java语言");
			break;
		case 6:
			System.out.println("操作系统");
			break;
		case 7:
			System.out.println("数据结构");
			break;
		default:
			System.out.println("图像处理");
			break;
		}
//		
//		// 练习2 作为一个销售人员，如果超过目标则给出基本薪水30%的奖励，如果没有达到目标则扣除基本薪水的30%
		System.out.println("\n****************练习2*****************");
		System.out.println("请输入你的销售量：");
		int target = 3000000;
		int baseSalary = 10000;
		double salary = 0;
		if(sc.nextInt() >= target){
			salary = baseSalary + baseSalary * 0.3;
		}else{
			salary = baseSalary - baseSalary * 0.3;
		}
		System.out.println("\n本月销售目标为：" + target + 
				"\n基本薪资为：" + baseSalary + 
				"\n本月薪水为：" + salary);
		
		
		// 练习3 输入季节，然后输出该季节出产的主要水果
		System.out.println("\n****************练习3*****************");
		System.out.println("请输入本季节编号或名称：1.春季   2.夏季   3.秋季   4.冬季");
		String str = sc.next();
		if(str.equals("1") || str.equals("春季")){
			System.out.println("春天的水果：番石榴、青枣、枇杷、桑葚、樱桃、莲雾（春末）");
		}else if(str.equals("2") || str.equals("夏季")){
			System.out.println("夏天的水果：草莓、莲雾、桃、李、西瓜、菠萝、芒果、柠檬、百香果、火龙果、杏、荔枝、" +
				"猕猴桃、香蕉、椰子、樱桃");
		}else if(str.equals("3") || str.equals("秋季")){
			System.out.println("秋天的水果：柚子、梨、柿子、木瓜、苹果、莲子、甘蔗、葡萄、火龙果、杨桃、番石榴、" +
				 "杏、橘子、红枣、山楂、核桃");
		}else if(str.equals("4") || str.equals("冬季")){
			System.out.println("冬天的水果：橙、橘子、柚子、青枣、甘蔗、释迦");
		}else {
			System.out.println("请按要求输入");
		}

		
		// 练习4 反复输出学生成绩，输出成绩等级
		System.out.println("\n****************练习4*****************");
		int score = 0;
		int scoreGrade = 0;
		
		while(true){
			System.out.println("请输入学生成绩");
			score = sc.nextInt();
			if  (score >= 0 && score <= 100){
				scoreGrade = score / 10;
				switch (scoreGrade){
				case 10:
					System.out.println("哇！满分，我对你充满了信心，加油!");
					break;
				case 9:
					System.out.println("优秀，在老师心中你是最优秀的学生!");
					break;
				case 8:
				case 7:
					System.out.println("良好， 记住：聪明是你最大的优点，懒惰是你最强的敌人。");
					break;
				case 6:
					System.out.println("及格， 聪明的你成绩会很快提高的!");
					break;
				case 5:
				case 4:
				case 3:
				case 2:
				case 1:
					System.out.println("不及格， 不要浪费你的时间，那是你的财产。");
					break;
				default:
					System.out.println("零分，我都不好意思说你。");
				}
			}else{
				System.out.println("输入不符合要求，结束");
				break;
			}
		}
		
		// 练习5 产生一个随机数表示汽车的速度，如果超过120，则给出超速信息，并记录超速的汽车数量
		System.out.println("\n****************练习5*****************");
		int speedingNum = 0;
		int carNum = 100;
		for(int i = 0; i < carNum; i++){
			double randNum = Math.random();
			int speed = (int)(randNum * 320);
			
			if (speed > 120){
				System.out.println("当前车速：" + speed);
				speedingNum++;
			} 
		}
		System.out.println("共通过" + carNum + "辆车" + "其中超速车辆" + speedingNum + "辆");
			
		// 练习6 用*输出一个三角形的
		System.out.println("\n****************练习6*****************");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
//		// 练习7 声明一个变量int a=95283求每个位上的数字之和
		System.out.println("\n****************练习7*****************");
		int a = 95283;
		int temp = a;
		int sum = 0;
		while(temp > 0){
			sum = sum + temp % 10;
			temp /=10;
		}
		System.out.println(a + "的各个位上的数字之和为：" + sum);
		
		
//		for(int x = 0; x < 10; x++){
//			int b = (int)(Math.sqrt(Math.pow(5, 2) - Math.pow(x-5, 2)) + 5);
////			System.out.println(b);
//			for(int y = 1; y < 11; y++){
//				if(y == b || y == b - (b - 5)*2){
//					System.out.print("*");
//				}else{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();	
//		}
		
	}

}
