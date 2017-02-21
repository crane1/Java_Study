package day0209;
import java.util.Scanner;


public class Time {
	int year;
	int month;
	int day;
	
	void setYear(int newYear){
		year = newYear;
	}
	
	int getYear(){
		return year;
	}
	
	void setMonth(int newMonth){
		month = newMonth;
	}
	
	int getMonth(){
		return month;
	}
	
	void setDay(int newDay){
		day = newDay;
	}
	
	int getDay(){
		return day;
	}
	
	// 打印时间信息
	void printTimeInfo(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入当前年份(整数)：");
		year = input.nextInt();
		System.out.println("请输入当前月份(整数)：");
		month = input.nextInt();
		System.out.println("请输入当前日期(整数)：");
		day = input.nextInt();
		input.close();
		
		System.out.println("当前时间是：" + year + "年" + month + "月" + day + "日");
		
	}
	public static void main(String[] args){
		Time time = new Time();
		time.printTimeInfo();
	}
}
