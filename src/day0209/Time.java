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
	
	// ��ӡʱ����Ϣ
	void printTimeInfo(){
		Scanner input = new Scanner(System.in);
		System.out.println("�����뵱ǰ���(����)��");
		year = input.nextInt();
		System.out.println("�����뵱ǰ�·�(����)��");
		month = input.nextInt();
		System.out.println("�����뵱ǰ����(����)��");
		day = input.nextInt();
		input.close();
		
		System.out.println("��ǰʱ���ǣ�" + year + "��" + month + "��" + day + "��");
		
	}
	public static void main(String[] args){
		Time time = new Time();
		time.printTimeInfo();
	}
}
