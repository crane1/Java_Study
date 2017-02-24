package day0223;

import java.util.Scanner;

public class Carlist {
	private Automobile[] cars = {new Automobile("雪佛兰"), new Automobile("大众"), new Automobile("宝马")} ;
	
	public Carlist(){
		
	}
	
	public void printCarList(){
		for(Automobile c : cars){
			if(c == null){
				break;
			}
			// 是否已删除， false 表示已删除，  true表示未删除，
			// 已删除的让它不打印， 未删除的让它打印
			if (!c.canDelete()){
				continue;
			}
			System.out.println(c);
		}
	}
	
	public void deleteCar(){
		System.out.println("输入你要删除的车名：");
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
