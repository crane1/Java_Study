package day0217;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		1.5个数
		Scanner s = new Scanner(System.in);
		
		int [] z = new int[5];
		
		for (int i = 0; i < z.length; i ++){
			int a = s.nextInt();
			z[i] = a;
		}
		
		int max = 0;
		
		for(int i : z){
			System.out.println(i);
		}
			
		
		boolean flag = true;  // 是否找到了最大值
		for(int i = 0; i < z.length; i++){
			flag = true;
			
			// 前半部分
			for(int j = 0; j < i; j++){
				System.out.println(i+"1.z[i] = "+z[i] + "z[j]=" + z[j]);
				if(z[i] < z[j]){
					flag = false;
					break;
				}
			}
			if(!flag){ 
				continue;
			}
			// 后半部分
			for(int j = i + 1; j < z.length; j++){
				System.out.println(i+"2.z[i] = "+z[i] + "z[j]=" + z[j]);
				if(z[i] < z[j]){
					flag = false;
					break;
				}
			}
			
			if(flag){
				max = z[i];
				break;
			}
		}
		System.out.println(max);
	}

}
