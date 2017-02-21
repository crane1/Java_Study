package day0214;

//创建一个叫做机动车的类：
//
//属性：车牌号(String)，车速(int)，载重量(double)
//
//功能：加速(车速自增)、减速(车速自减)、修改车牌号，查询车的载重量。
//
//编写两个构造方法：一个没有形参，在方法中将车牌号设置“XX1234”，速
//
//度设置为100，载重量设置为100；另一个能为对象的所有属性赋值；


public class MotorVehicle {
	private String carNumber;  //车牌号
	private int speed;	// 车速
	private double loadCapacity;  //  载重量
	
	public MotorVehicle(){
		this.carNumber = "XX1234";
		this.speed = 100;
		this.loadCapacity = 100;
	}
	
	public MotorVehicle(String carNumber, int speed, double loadCapacity){
		this.carNumber = carNumber;
		this.speed = speed;
		this.loadCapacity = loadCapacity;
	}
	
	public void accelerate(){
		speed = speed + 10;
	}
	
	public void decelerate(){
		speed = speed - 7;
	}
	
	public void setCarNumber(String carNumber){
		this.carNumber = carNumber;
	}
	
	public double getLoadCapacity(){
		return loadCapacity;
	}
	
	public String toString(){
		return "MotorVehicle@carNumber:" + carNumber + "@speed:" + speed + "@loadCapacity" + loadCapacity;
	}
	
	public void printMotorInfo(){
		System.out.println(this);
	}
	
}


