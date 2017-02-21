package day0215;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ��ϰ1  ��switch����ڿ���̨����1-7֮���һ�����֣������Ӧ�Ŀγ���Ϣ���������뷨��
		System.out.println("****************��ϰ1*****************");
		
		System.out.println("������һ��1~7֮������֣�");
		switch(sc.nextInt()){
		case 1:
			System.out.println("��ѧ����");
			break;
		case 2:
			System.out.println("�ߵȴ���");
			break;
		case 3:
			System.out.println("��������");
			break;
		case 4:
			System.out.println("C����");
			break;
		case 5:
			System.out.println("java����");
			break;
		case 6:
			System.out.println("����ϵͳ");
			break;
		case 7:
			System.out.println("���ݽṹ");
			break;
		default:
			System.out.println("ͼ����");
			break;
		}
//		
//		// ��ϰ2 ��Ϊһ��������Ա���������Ŀ�����������нˮ30%�Ľ��������û�дﵽĿ����۳�����нˮ��30%
		System.out.println("\n****************��ϰ2*****************");
		System.out.println("�����������������");
		int target = 3000000;
		int baseSalary = 10000;
		double salary = 0;
		if(sc.nextInt() >= target){
			salary = baseSalary + baseSalary * 0.3;
		}else{
			salary = baseSalary - baseSalary * 0.3;
		}
		System.out.println("\n��������Ŀ��Ϊ��" + target + 
				"\n����н��Ϊ��" + baseSalary + 
				"\n����нˮΪ��" + salary);
		
		
		// ��ϰ3 ���뼾�ڣ�Ȼ������ü��ڳ�������Ҫˮ��
		System.out.println("\n****************��ϰ3*****************");
		System.out.println("�����뱾���ڱ�Ż����ƣ�1.����   2.�ļ�   3.�＾   4.����");
		String str = sc.next();
		if(str.equals("1") || str.equals("����")){
			System.out.println("�����ˮ������ʯ�����桢���ˡ�ɣ�ء�ӣ�ҡ�������ĩ��");
		}else if(str.equals("2") || str.equals("�ļ�")){
			System.out.println("�����ˮ������ݮ�������ҡ�����ϡ����ܡ�â�������ʡ�����������������ӡ���֦��" +
				"⨺��ҡ��㽶��Ҭ�ӡ�ӣ��");
		}else if(str.equals("3") || str.equals("�＾")){
			System.out.println("�����ˮ�������ӡ��桢���ӡ�ľ�ϡ�ƻ�������ӡ����ᡢ���ѡ������������ҡ���ʯ��" +
				 "�ӡ����ӡ����桢ɽ髡�����");
		}else if(str.equals("4") || str.equals("����")){
			System.out.println("�����ˮ�����ȡ����ӡ����ӡ����桢���ᡢ����");
		}else {
			System.out.println("�밴Ҫ������");
		}

		
		// ��ϰ4 �������ѧ���ɼ�������ɼ��ȼ�
		System.out.println("\n****************��ϰ4*****************");
		int score = 0;
		int scoreGrade = 0;
		
		while(true){
			System.out.println("������ѧ���ɼ�");
			score = sc.nextInt();
			if  (score >= 0 && score <= 100){
				scoreGrade = score / 10;
				switch (scoreGrade){
				case 10:
					System.out.println("�ۣ����֣��Ҷ�����������ģ�����!");
					break;
				case 9:
					System.out.println("���㣬����ʦ���������������ѧ��!");
					break;
				case 8:
				case 7:
					System.out.println("���ã� ��ס���������������ŵ㣬����������ǿ�ĵ��ˡ�");
					break;
				case 6:
					System.out.println("���� ��������ɼ���ܿ���ߵ�!");
					break;
				case 5:
				case 4:
				case 3:
				case 2:
				case 1:
					System.out.println("������ ��Ҫ�˷����ʱ�䣬������ĲƲ���");
					break;
				default:
					System.out.println("��֣��Ҷ�������˼˵�㡣");
				}
			}else{
				System.out.println("���벻����Ҫ�󣬽���");
				break;
			}
		}
		
		// ��ϰ5 ����һ���������ʾ�������ٶȣ��������120�������������Ϣ������¼���ٵ���������
		System.out.println("\n****************��ϰ5*****************");
		int speedingNum = 0;
		int carNum = 100;
		for(int i = 0; i < carNum; i++){
			double randNum = Math.random();
			int speed = (int)(randNum * 320);
			
			if (speed > 120){
				System.out.println("��ǰ���٣�" + speed);
				speedingNum++;
			} 
		}
		System.out.println("��ͨ��" + carNum + "����" + "���г��ٳ���" + speedingNum + "��");
			
		// ��ϰ6 ��*���һ�������ε�
		System.out.println("\n****************��ϰ6*****************");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
//		// ��ϰ7 ����һ������int a=95283��ÿ��λ�ϵ�����֮��
		System.out.println("\n****************��ϰ7*****************");
		int a = 95283;
		int temp = a;
		int sum = 0;
		while(temp > 0){
			sum = sum + temp % 10;
			temp /=10;
		}
		System.out.println(a + "�ĸ���λ�ϵ�����֮��Ϊ��" + sum);
		
		
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
