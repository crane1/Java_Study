package day0209;
import java.util.Scanner;


public class PersonalInfo {
	String name = "";
	String sex = "";
	int age = 0;
	String address = "";
	String birthday = "";
	
	void setName(String newName){
		name = newName;
	}
	
	String getName(){
		return name;
	}
	
	void setSex(String newSex){
		sex = newSex;
	}
	
	String getSex(){
		return sex;
	}
	
	void setAge(int newAge){
		age = newAge;
	}
	
	int getAge(){
		return age;
	}
	
	void setAddress(String newAddress){
		address = newAddress;
	}
	
	String getAddress(){
		return address;
	}
	
	void setBirthday(String newBirthday){
		birthday = newBirthday;
	}
	
	String getBirthday(){
		return birthday;
	}
	
	// 打印个人信息
	void printPersonalInfo(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的姓名：");
		name = input.next();
		System.out.println("请输入你的性别：");
		sex = input.next();
		System.out.println("请输入你的年龄：");
		age = input.nextInt();
		System.out.println("请输入你的地址：");
		address = input.next();
		System.out.println("请输入你的生日：");
		birthday = input.next();
		input.close();
		
		System.out.println("\n你的个人信息：" +
				"\n姓名：" + name + 
				"\n性别：" + sex +
				"\n年龄：" + age +
				"\n地址：" + address +
				"\n生日：" + birthday);
	}
	
	
	public static void main(String[] args){
		PersonalInfo pi = new PersonalInfo();
		pi.printPersonalInfo();
	}
			
}
