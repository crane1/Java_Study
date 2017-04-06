package day0309;

import java.io.PrintStream;
import java.util.Scanner;

public class OutputThread extends Thread{
	private String name;
	private PrintStream pw;
	
	public OutputThread(String name, PrintStream pw){
		this.name = name;
		this.pw = pw;
	}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = null;
			str = sc.next();
			pw.println(str);
			System.out.println(this.name + str);
		}
	}
}
