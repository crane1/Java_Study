package day0223;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee("������", "����", 120000);
		e.show();
		
		Director d = new Director("��־Զ", "Сկ", 600000, 20000);
		d.show();
		
		Manager m = new Manager("����", "ͼ���", 200000, "�󻮲�");
		m.show();
		
	}

}
