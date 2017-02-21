package day0210;

import java.util.Scanner;

public class Car {
	String name;
	double speed = 40;  // 速度
	String color;
	int gear;  //挡位
	double price;  // 价格
	
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
	
	// 挂挡
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
	
	// 汽车移动
	void move(){
		if (speed > 40){
			System.out.println("汽车以" + speed + "码的速度在疾驰");
		} else {
			System.out.println("汽车以" + speed + "码的速度在爬行");
		}
		
	}
	
	void move(int speed){
		setSpeed(speed);
		move();
	}
	
	void printCarInfo(){
		System.out.println(this.getColor() + "的" + this.getName());
	}
	
	void runCarSystem(){
		Poet poet = new Poet("李白");
		System.out.println("欢迎你，" + poet.getAuthorName());
		poet.card.runSystem();
		
		Car carArray[] = new Car[3];  // 定义三个Car
		
		String name[] = {"雪佛兰", "奥迪", "大众"};
		String color[] = {"红色", "黑色", "银色"};
		double price[] = {100, 200, 300};
		
		for(int i = 0; i < 3; i++){
			carArray[i] = new Car();
			carArray[i].setName(name[i]);
			carArray[i].setColor(color[i]);
			carArray[i].setPrice(price[i]);
		}
		
		System.out.println("欢迎 " + poet.getAuthorName() +  " 来到哒哒车行\n请选择你要购买的车:\n");
		for(int i = 0; i < 3; i++ ){
			System.out.println((i + 1) + "." + carArray[i].name + " " + carArray[i].color );
		}
		System.out.println("请输入要购买的车辆");
		
		Scanner input = new Scanner(System.in);
		int str = input.nextInt();
		if (str > 0 && str < 4){
			System.out.println(carArray[str-1].getColor() + "的" + carArray[str-1].getName() + "就卖给你了！");
			poet.card.withdraw(carArray[str-1].getPrice());
			poet.card.printBalance();
			poet.car = carArray[str-1];
		}
		
		System.out.println("挂挡吧，1~4档：");
		
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
