package Test;

import day0214.MotorVehicle;

//�������ࣺ
//
//�������д�����������������
//
//������һ��ʱ�����޲����Ĺ��췽�������ó�Ա����ʹ�䳵��Ϊ����
//
//A9752������������١�
//
//�����ڶ���ʱ�����в����Ĺ��췽����ʹ�䳵��Ϊ����B5086��,����Ϊ150,
//
//����Ϊ200����������١�
//
//�����������������Ϣ
public class MotorVehicleTest {
	

	public static void main(String[] args) {
		MotorVehicle m1 = new MotorVehicle();
		m1.setCarNumber("��A9752");
		m1.accelerate();
		
		MotorVehicle m2 = new MotorVehicle("��B5086", 150, 200);
		m2.decelerate();
		
		m1.printMotorInfo();
		m2.printMotorInfo();
	}

}
