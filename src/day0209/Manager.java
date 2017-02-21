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
		return "密码你都想知道，保密懂吗？";
	}
	
	// 打印管理员信息
	static void printManagerInfo(Manager man){
		System.out.print("\n管理员名字：" + man.getName() + "\n密码："+ man.getPwd());
	}
	
	public static void main(String[] args){
		Manager man = new Manager();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入管理员的名字：");
		man.setName(input.next());
		System.out.print("请输入管理员密码：");
		man.setPwd(input.next());
		input.close();
		
		printManagerInfo(man);
	}
}
