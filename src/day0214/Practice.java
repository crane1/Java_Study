package day0214;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// ��ϰ1
		int contryPeopleNum1 = 1370536875; // �й����˿���Ϊ
		int contryPeopleNum2 = 1339724852; // ʡ��ֱϽ�к����������˿�
		int hongkongNum = 23162123;  // ����������˿�
		int aomenNum = 552300;  // �����������˿�
		
		System.out.println("�й����˿���Ϊ��" + contryPeopleNum1
				+ "\nʡ��ֱϽ�к����������˿ڣ�" + contryPeopleNum2
				+ "\n����������˿ڣ�" + hongkongNum
				+ "\n�����������˿ڣ�" + aomenNum);
		
		// ��ϰ2
		double wasteFood = 248752567000L;  // ÿ���˷���ʳ����
		double perNeedFood = 366 * 0.5; // ÿ��ÿ��Ե���
		int personNum = (int)(wasteFood / perNeedFood); // ���������
		System.out.println("\nÿ���˷���ʳ��" + wasteFood + "\nÿ��ÿ��Ե�����" 
				+ perNeedFood + "\n��������ˣ�" + personNum);
		System.out.println("�����ǣ�ÿ���˷ѵ���ʳ�������԰��й�������һ��");
		
		// ��ϰ3
		Scanner sc = new Scanner(System.in);
		System.out.println("\n�������й���ɭ�ָ��������");
		double area = sc.nextDouble();
		System.out.println("�������й�������");
		int personNum1 = sc.nextInt();
		
		double avgArea = area / personNum1;
		System.out.println("�й��˾�ɭ�ָ��������" + avgArea);
	}

}
