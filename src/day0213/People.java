package day0213;

//（1）创建一个叫做People的类：
//
//属性：姓名、年龄、性别、身高
//
//行为：说话、计算加法、改名
//
//编写能为所有属性赋值的构造方法；

public class People {
	private String name = "";
	private int age = 0;
	private String sex = "";
	private double height = 0;
	
	public People(){}
	
	public People(String name, int age, String sex, double height){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}
	
	public void say(){
		System.out.println("你好！");
	}
	
	public int add(int a, int b){
		return a + b;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void printPeopleInfo(){
		System.out.println("\n姓名：" + name + "\n年龄:" + age + "\n性别:" + sex + "\n身高:" + height);
	}
	
}
