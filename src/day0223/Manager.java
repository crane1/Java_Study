package day0223;

public class Manager extends Employee{
	private String department;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Manager(String name, String address, double baseSalary, String department) {
		super(name, address, baseSalary);
		this.department = department;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void show(){
		System.out.println("\n����һ�����ž���");
		super.show();
		System.out.println("���ܲ��ţ�" + department);
	}
	
	
}
