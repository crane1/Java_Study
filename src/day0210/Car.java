package day0210;

import java.util.Scanner;

public class Car {
	String name;
	double speed = 40;  // �ٶ�
	String color;
	int gear;  //��λ
	double price;  // �۸�
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	void setSpeed(double speed){
		this.speed = speed;
	}
	
	double getSpeed(){
		return speed;
	}
	
	void setColor(String color){
		this.color = color;
	}
	
	String getColor(){
		return color;
	}
	
	int getGear(){
		return gear;
	}
	
	// �ҵ�
	void putIntoGear(int gear){
		this.gear = gear;
		if (gear == 1){
			this.speed = 20;
		} else if(gear == 2){
			this.speed = 40;
		} else if(gear == 3){
			this.speed = 60;
		} else if(gear == 4){
			this.speed = 80;
		} else{
			this.speed = 100;
		}
	}
	
	void setPrice(double price){
		this.price = price;
	}
	
	double getPrice(){
		return price;
	}
	
	// �����ƶ�
	void move(){
		if (speed > 40){
			System.out.println("������" + speed + "����ٶ��ڼ���");
		} else {
			System.out.println("������" + speed + "����ٶ�������");
		}
		
	}
	
	void move(int speed){
		setSpeed(speed);
		move();
	}
	
	void printCarInfo(){
		System.out.println(this.getColor() + "��" + this.getName());
	}
	
	void runCarSystem(){
		Poet poet = new Poet("���");
		System.out.println("��ӭ�㣬" + poet.getAuthorName());
		poet.card.runSystem();
		
		Car carArray[] = new Car[3];  // ��������Car
		
		String name[] = {"ѩ����", "�µ�", "����"};
		String color[] = {"��ɫ", "��ɫ", "��ɫ"};
		double price[] = {100, 200, 300};
		
		for(int i = 0; i < 3; i++){
			carArray[i] = new Car();
			carArray[i].setName(name[i]);
			carArray[i].setColor(color[i]);
			carArray[i].setPrice(price[i]);
		}
		
		System.out.println("��ӭ " + poet.getAuthorName() +  " �������ճ���\n��ѡ����Ҫ����ĳ�:\n");
		for(int i = 0; i < 3; i++ ){
			System.out.println((i + 1) + "." + carArray[i].name + " " + carArray[i].color );
		}
		System.out.println("������Ҫ����ĳ���");
		
		Scanner input = new Scanner(System.in);
		int str = input.nextInt();
		if (str > 0 && str < 4){
			System.out.println(carArray[str-1].getColor() + "��" + carArray[str-1].getName() + "���������ˣ�");
			poet.card.withdraw(carArray[str-1].getPrice());
			poet.card.printBalance();
			poet.car = carArray[str-1];
		}
		
		System.out.println("�ҵ��ɣ�1~4����");
		
		int str1 = input.nextInt();
		if (str1 > 0 && str1 < 5){
			poet.car.putIntoGear(str1);
		}
		
		poet.printPoetInfo();
		poet.driveCar();
			
	}
	
	public static void main(String[] args) {
		Car car = new Car();
//		car.move();
//		car.move(100);
		car.runCarSystem();
	}
}
