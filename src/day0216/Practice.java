package day0216;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	static int titleNum = 1;  // ������
	public static void main(String[] args) {
		
		// ��ϰ1�������������飬�Ӽ�������5��Ԫ�أ����������ֵ
		printTitle();
		Scanner sc = new Scanner(System.in);
//		int[] a = new int[5];
//		for(int i = 0; i < a.length; i++){
//			System.out.println("�������" + (i+1) + "������");
//			a[i] = sc.nextInt();
//		}
//		
//		int max = a[0];
//		for(int i = 0; i < a.length; i++){
//			if (max < a[i]){
//				max = a[i];
//			}
//		}
//		System.out.println(max);
		
		// ��ϰ2������һ���ַ������飬Ԫ�طֱ��ǣ�С�ܣ�С������䣬������
//		printTitle();
//		String[] s = {"С��", "С��", "���", "����"};
//		for(String str : s){
//			
//			System.out.print(str + " ");
//		}
		
		/* ��ϰ6����һ�������Ԫ�����򽻻��� 
				int[] a = { 5, 11, 15, 24, 36, 47, 59, 66 };
				����Ԫ�غ�
				int[] a = { 66 ,59 ,47 ,36 ,24,15 ,11 ,5 };
		*/
//		printTitle();
//		int[] a6 = { 5, 11, 15, 24, 36, 47, 59, 66 };
//		int num = a6.length - 1;
//		for(int i = 0; i < a6.length / 2; i++){
//			exchange(a6,i);
//		}
//		System.out.println(Arrays.toString(a6));
		
		
		/* ��ϰ7����һ�����У�8��4��2��1��23��344��12
			1��������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ��������
			2����������������ֵ�ĺ�
			3��ѭ��������е�ֵ
		 */
		printTitle();
		int[] a7 = {8, 4, 2, 1, 23, 344, 12};
		Arrays.sort(a7);
		System.out.println("������һ�����У����²�������ʲô����������һ�����ɣ�");
		int str = sc.nextInt();
		if(Arrays.binarySearch(a7, str) >= 0){
			System.out.println("С�����˰������¶���");
		}else{
			System.out.println("���ź�û�¶ԣ�");
		}
		
		int sum = 0;
		for(int x : a7){
			System.out.print(x + " ");
			sum += x;
		}
		System.out.println("\n���еĺ�Ϊ��" + sum);
		
		
		/* ��ϰ9����������String���͵����飬a,b��
			   ��a�еĵ�һ��Ԫ�ظ��Ƶ�b�����У�
			   �ӵڶ�������ĵڶ���λ���п�ʼ����������Ԫ��

		 */
//		printTitle();
//		String[] a9 = {"I", "Love", "You"};
//		String[] b9= {"You", "is", "an", "angel"};
//		
//		b9[0] = a9[0];
//		String[] c9 = Arrays.copyOfRange(b9, 1, 3);
//		
//		printStringArray(a9, "a");
//		printStringArray(b9, "b");
//		printStringArray(c9, "c");
	}
	
	static void printTitle(){
		System.out.println("*****************��ϰ" + titleNum + "*******************");
		titleNum++;
	}
	
	static void exchange(int[] a, int i){
		int num = a.length-1;
		int c = 0;
		c = a[i];
		a[i] = a[num - i];
		a[num - i] = c;
	}
	
	static void printStringArray(String[] sa, String name){
		System.out.print(name + "= ");
		for(String s : sa){
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
