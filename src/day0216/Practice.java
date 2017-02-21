package day0216;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	static int titleNum = 1;  // 标题数
	public static void main(String[] args) {
		
		// 练习1、定义整形数组，从键盘输入5个元素，并求其最大值
		printTitle();
		Scanner sc = new Scanner(System.in);
//		int[] a = new int[5];
//		for(int i = 0; i < a.length; i++){
//			System.out.println("请输入第" + (i+1) + "个数：");
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
		
		// 练习2、定义一个字符串数组，元素分别是：小熊，小宝，朵朵，果果。
//		printTitle();
//		String[] s = {"小熊", "小宝", "朵朵", "果果"};
//		for(String str : s){
//			
//			System.out.print(str + " ");
//		}
		
		/* 练习6、把一个数组的元素逆序交换， 
				int[] a = { 5, 11, 15, 24, 36, 47, 59, 66 };
				交换元素后
				int[] a = { 66 ,59 ,47 ,36 ,24,15 ,11 ,5 };
		*/
//		printTitle();
//		int[] a6 = { 5, 11, 15, 24, 36, 47, 59, 66 };
//		int num = a6.length - 1;
//		for(int i = 0; i < a6.length / 2; i++){
//			exchange(a6,i);
//		}
//		System.out.println(Arrays.toString(a6));
		
		
		/* 练习7、有一个数列：8，4，2，1，23，344，12
			1）猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
			2）求数列中所有数值的和
			3）循环输出数列的值
		 */
		printTitle();
		int[] a7 = {8, 4, 2, 1, 23, 344, 12};
		Arrays.sort(a7);
		System.out.println("这里有一个数列，来猜猜里面有什么东西？输入一个数吧：");
		int str = sc.nextInt();
		if(Arrays.binarySearch(a7, str) >= 0){
			System.out.println("小伙走运啊！，猜对了");
		}else{
			System.out.println("很遗憾没猜对！");
		}
		
		int sum = 0;
		for(int x : a7){
			System.out.print(x + " ");
			sum += x;
		}
		System.out.println("\n数列的和为：" + sum);
		
		
		/* 练习9、定义两个String类型的数组，a,b，
			   将a中的第一个元素复制到b数组中，
			   从第二个数组的第二个位置中开始，复制两个元素

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
		System.out.println("*****************练习" + titleNum + "*******************");
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
