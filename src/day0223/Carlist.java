package day0223;

import java.util.Scanner;

public class Carlist {
	private Automobile[] cars = {new Automobile("ѩ����"), new Automobile("����"), new Automobile("����")} ;
	
	public Carlist(){
		
	}
	
	public void printCarList(){
		for(Automobile c : cars){
			if(c == null){
				break;
			}
			// �Ƿ���ɾ���� false ��ʾ��ɾ����  true��ʾδɾ����
			// ��ɾ������������ӡ�� δɾ����������ӡ
			if (!c.canDelete()){
				continue;
			}
			System.out.println(c);
		}
	}
	
	public void deleteCar(){
		System.out.println("������Ҫɾ���ĳ�����");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for(Automobile c : cars){
			if(c == null){
				break;
			}
			if(c.canDelete() == false){
				continue;
			}
			if(c.getName().equals(name)){
				c.setDelete(false);
			}
		}
	}
	
	public static void main(String[] args) {
		Carlist cars = new Carlist();
		cars.printCarList();
		cars.deleteCar();
		cars.printCarList();
	}
}
