package day0216;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true){
			System.out.println("������һ��������");
			try{
				i = sc.nextInt();
			} catch(InputMismatchException e){
				System.out.println("���벻����Ҫ������������");
				sc.nextLine();
				continue;
			}
			if(i % 2 == 0){
				System.out.println( i + "��ż��");
			}else
				System.out.println(i + "������  ");
		}
	}

}
