package day0406;

import java.io.Serializable;

public class City implements Serializable{
	private String name;
	private double avg;
	private double max;
	private String date;
	
	
	public City(String name, double avg, double max, String date) {
		super();
		this.name = name;
		this.avg = avg;
		this.max = max;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", avg=" + avg + ", max=" + max
				+ ", date=" + date + "]";
	}
	
}
