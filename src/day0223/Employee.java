package day0223;

public class Employee {
	private String name;
	private String address;
	private double baseSalary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, String address, double baseSalary) {
		super();
		this.name = name;
		this.address = address;
		this.baseSalary = baseSalary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void show(){
		System.out.println("\n����һ��Ա��");
		System.out.println("���֣�" + name + "\n��ַ��" + address + "\n����н��" + baseSalary);
	}
	
	
}
