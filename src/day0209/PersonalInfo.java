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
	
	// ��ӡ������Ϣ
	void printPersonalInfo(){
		Scanner input = new Scanner(System.in);
		System.out.println("���������������");
		name = input.next();
		System.out.println("����������Ա�");
		sex = input.next();
		System.out.println("������������䣺");
		age = input.nextInt();
		System.out.println("��������ĵ�ַ��");
		address = input.next();
		System.out.println("������������գ�");
		birthday = input.next();
		input.close();
		
		System.out.println("\n��ĸ�����Ϣ��" +
				"\n������" + name + 
				"\n�Ա�" + sex +
				"\n���䣺" + age +
				"\n��ַ��" + address +
				"\n���գ�" + birthday);
	}
	
	
	public static void main(String[] args){
		PersonalInfo pi = new PersonalInfo();
		pi.printPersonalInfo();
	}
			
}
