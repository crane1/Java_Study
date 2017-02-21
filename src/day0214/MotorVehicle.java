package day0214;

//����һ���������������ࣺ
//
//���ԣ����ƺ�(String)������(int)��������(double)
//
//���ܣ�����(��������)������(�����Լ�)���޸ĳ��ƺţ���ѯ������������
//
//��д�������췽����һ��û���βΣ��ڷ����н����ƺ����á�XX1234������
//
//������Ϊ100������������Ϊ100����һ����Ϊ������������Ը�ֵ��


public class MotorVehicle {
	private String carNumber;  //���ƺ�
	private int speed;	// ����
	private double loadCapacity;  //  ������
	
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


