package day0301;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalender {
	Scanner sc = new Scanner(System.in);
	private final static int INIT_YEAR = 1990;  // ��
	private final static int INIT_MONTH = 1;	// ��
	private final static int INIT_DAY = 1;		// ��
	private final static int INIT_WEEK = 1;		// ����
	private int year = 2017;
	private int month = 3;
	private int day = 1;
	private int week = 3;
	
	public MyCalender(){
		Calendar a=Calendar.getInstance();
		this.year = a.get(Calendar.YEAR);
		this.month = a.get(Calendar.MONTH)+1;
		this.day = a.get(Calendar.DATE);
	}
	public MyCalender(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	// ȡĳһ�������
	public  int getYearDays(int myear){
		int days = 365;
		boolean isa = myear % 4 == 0 && myear % 100 != 0;
		boolean isb = myear % 400 == 0;
		
		if (isa || isb){
			days = 366;
		}
		return days;
	}
	
	public int getMonthDays(int mmonth){
		int days = 31;
		if (mmonth == 2){
			if ( getYearDays(year) == 366){
				days = 29;
			} else {
				days = 28;
			}
		} else if (mmonth == 4 || mmonth == 6 || mmonth == 9 || mmonth == 11){
			days = 30;
		}
		return days;
	}
	
	public int getWeekFirstDayOfMonth(){
		int week = 0;
		int allDays = 0;
		if(this.year >= 1990){
			for(int i = INIT_YEAR; i < this.year; i++){
				allDays += getYearDays(i);
			}
			
			for(int i = INIT_MONTH; i < this.month; i++){
				allDays += getMonthDays(i);
			}
			
			allDays += 1;  // ��1������ʾ��ǰ�µĵ�һ��
			week = allDays % 7;	// ��7ȡģ��ʾ��ǰ�µĵ�һ�������ڼ�
		} else {
			for(int i = this.year + 1; i < INIT_YEAR; i++){
				allDays += getYearDays(i);
			}
			
			for(int i = this.month + 1; i < 13; i++){
				allDays += getMonthDays(i);
			}
			
			allDays += getMonthDays(this.month);  // ��һ���µ�ֵ������ʾ��ǰ�µĵ�һ��
			System.out.println("allDays="+allDays);
			week = allDays % 7;	// 
			week = 7 - week + 1;
		}
		return week;
	}
	
	public void printCalender(){
		int week = getWeekFirstDayOfMonth();
		int days = getMonthDays(month);
		int temp_day = 1;
		System.out.println(week);
		System.out.println("\t\t    "+year + " �� " + month + " ������");
		System.out.println("һ\t��\t��\t��\t��\t��\t��\t");
		for(int i = 1; i <= 6; i++){
			for (int j = 1; j <= 7; j++){
				
				if (i == 1){
					if (j >= week){
						printCurrenDay(temp_day);
						temp_day++;
					}else{
						System.out.print("\t");
					}
				}
				if(i > 1){
					printCurrenDay(temp_day);
					temp_day++;
				}
				
				if(temp_day > days){
					break;
				}
				
			}
			System.out.println();
		}
	}
	
	public void printCurrenDay(int temp_day){
		if(temp_day == this.day){
			System.out.print(temp_day + "*\t");
		}else{
			System.out.print(temp_day + "\t");
		}
	}
	
	public String getConstellation(){
		String cons = "";
		switch(this.month){
		case 1:
			if(this.day >= 20){
				cons = "ˮƿ��";
			}else{
				cons = "Ħ����";
			}
			break;
		case 2:
			if(this.day >= 19){
				cons = "˫����";
			}else{
				cons = "ˮƿ��";
			}
			break;
		case 3:
			if(this.day >= 21){
				cons = "������";
			}else{
				cons = "˫����";
			}
			break;
		case 4:
			if(this.day >= 20){
				cons = "��ţ��";
			}else{
				cons = "������";
			}
			break;
		case 5:
			if(this.day >= 21){
				cons = "˫����";
			}else{
				cons = "��ţ��";
			}
			break;
		case 6:
			if(this.day >= 22){
				cons = "��з��";
			}else{
				cons = "˫����";
			}
			break;
		case 7:
			if(this.day >= 23){
				cons = "ʨ����";
			}else{
				cons = "��з��";
			}
			break;
		case 8:
			if(this.day >= 23){
				cons = "��Ů��";
			}else{
				cons = "ʨ����";
			}
			break;
		case 9:
			if(this.day >= 23){
				cons = "�����";
			}else{
				cons = "��Ů��";
			}
			break;
		case 10:
			if(this.day >= 24){
				cons = "��Ы��";
			}else{
				cons = "�����";
			}
			break;
		case 11:
			if(this.day >= 23){
				cons = "������";
			}else{
				cons = "��Ы��";
			}
			break;
		case 12:
			if(this.day >= 22){
				cons = "Ħ����";
			}else{
				cons = "������";
			}
			break;
		}
		return cons;
	}
	
	public void setCurrentDays(){
		System.out.println("�������꣺");
		int year = getInputIntNum();
		System.out.println("�������£�");
		int month = getInputIntNum();
		System.out.println("�������գ�");
		int day = getInputIntNum();
		
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public void Menu(){
		System.out.print("��ӭ��������\n");
		while(true){
			System.out.println("\n1.��ӡ��ǰ����\n2.��ת��ĳһ��\n3.��ѯ����");
			int str = getInputIntNum();
			System.out.println();
			if (str == 1){
				printCalender();
			} else if(str == 2){
				setCurrentDays();
				printCalender();
			} else if (str == 3){
				setCurrentDays();
//				printCalender();
				System.out.println(getConstellation());
			}
		}
	}
	
	public int getInputIntNum(){
		System.out.print("#");
		int str;
		while(true){
			str = 0;
			try{
				str = sc.nextInt();
				break;
			} catch (InputMismatchException e){
				sc.nextLine();
				System.out.println("��������");
			}
		}
		return str;
	}
	public static void main(String[] args) {
		MyCalender mc = new MyCalender();
		mc.Menu();
	}
}
