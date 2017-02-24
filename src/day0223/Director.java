package day0223;

public class Director extends Employee{
	private double transportationAllowance;

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(String name, String address, double baseSalary, double transportationAllowance) {
		super(name, address, baseSalary);
		this.transportationAllowance = transportationAllowance;
	}

	public double getTransportationAllowance() {
		return transportationAllowance;
	}

	public void setTransportationAllowance(double transportationAllowance) {
		this.transportationAllowance = transportationAllowance;
	}
	
	public void show(){
		System.out.println("\n����һ������");
		super.show();
		System.out.println("��ͨ������" + transportationAllowance);
	}
}
