package day0209;
import java.util.Scanner;


public class Manager {
	String name;
	String pwd;
	
	void setName(String newName){
		name = newName;
	}
	
	String getName(){
		return name;
	}
	
	void setPwd(String newPwd){
		pwd = newPwd;
	}
	
	String getPwd(){
		return "�����㶼��֪�������ܶ���";
	}
	
	// ��ӡ����Ա��Ϣ
	static void printManagerInfo(Manager man){
		System.out.print("\n����Ա���֣�" + man.getName() + "\n���룺"+ man.getPwd());
	}
	
	public static void main(String[] args){
		Manager man = new Manager();
		Scanner input = new Scanner(System.in);
		System.out.print("���������Ա�����֣�");
		man.setName(input.next());
		System.out.print("���������Ա���룺");
		man.setPwd(input.next());
		input.close();
		
		printManagerInfo(man);
	}
}
