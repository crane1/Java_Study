package Test;

import day0214.MotorVehicle;

//创建主类：
//
//在主类中创建两个机动车对象。
//
//创建第一个时调用无参数的构造方法，调用成员方法使其车牌为“辽
//
//A9752”，并让其加速。
//
//创建第二个时调用有参数的构造方法，使其车牌为“辽B5086”,车速为150,
//
//载重为200，并让其减速。
//
//输出两辆车的所有信息
public class MotorVehicleTest {
	

	public static void main(String[] args) {
		MotorVehicle m1 = new MotorVehicle();
		m1.setCarNumber("辽A9752");
		m1.accelerate();
		
		MotorVehicle m2 = new MotorVehicle("辽B5086", 150, 200);
		m2.decelerate();
		
		m1.printMotorInfo();
		m2.printMotorInfo();
	}

}
