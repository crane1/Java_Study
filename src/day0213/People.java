package day0213;

//��1������һ������People���ࣺ
//
//���ԣ����������䡢�Ա����
//
//��Ϊ��˵��������ӷ�������
//
//��д��Ϊ�������Ը�ֵ�Ĺ��췽����

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
		System.out.println("��ã�");
	}
	
	public int add(int a, int b){
		return a + b;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void printPeopleInfo(){
		System.out.println("\n������" + name + "\n����:" + age + "\n�Ա�:" + sex + "\n���:" + height);
	}
	
}
