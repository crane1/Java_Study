package day0227;

/**
 * 
 * 假如我们开发一个系统时需要对员工进行建模，员工包含3个属性：姓名、工号以及工资。
 *	经理也是员工，除了含有员工的属性外，另外还有一个分红的属性。
 *	请设计出员工类和经理类。要求类中提供必要的方法进行属性访问。
 *	员工类: name  id  pay
 *	经理类：继承员工类，并有自己特有的bonus属性
 * 
 *
 */

public class Employee {
	private String name;
	private String id;
	private double pay;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
}
