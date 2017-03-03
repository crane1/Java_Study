package day0224;

public abstract class Stationery {
	private String name;
	private double price;
	private boolean saled;
	
	
	public Stationery(){}
	public Stationery(String name, double price){
		this.name = name;
		this.price = price;
		this.saled = false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isSaled() {
		return saled;
	}
	public void setSaled(boolean saled) {
		this.saled = saled;
	}
	
	public String toString(){
		return this.getName();
	}
	
}
