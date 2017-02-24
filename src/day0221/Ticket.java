package day0221;

import java.util.Date;

public class Ticket {
	private String startingStation;  // 起始站
	private String endingStation;  // 终止站
	private Date departureTime;
	private double price;
	private static int totalNum;  // 总票数
	
	static {
		totalNum = 100;
	}
	
	public Ticket(){}
	public Ticket(String start, String end, double price){
		startingStation = start;
		endingStation = start;
		this.price = price;
	}
	
	public static int getTotalNum() {
		return totalNum;
	}
	public static void setTotalNum(int totalNum) {
		Ticket.totalNum = totalNum;
	}
	public void saleTicket(){
		totalNum--;
	}
	
	public void returnTicket(){
		totalNum++;
	}
	
	public static void main(String[] args) {
		Ticket t = new Ticket();
		t.saleTicket();
		System.out.println(Ticket.getTotalNum());
		Ticket t2 = new Ticket();
		t2.saleTicket();
		System.out.println(Ticket.getTotalNum());
		Ticket t3 = new Ticket();
		t3.returnTicket();
		System.out.println(Ticket.getTotalNum());
	}
}
