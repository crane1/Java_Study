package day0308;

import java.util.ArrayList;

public class SaleTicket {
	static ArrayList<Ticket> list = new ArrayList<Ticket>();
	
	static {
		list.add(new Ticket("宝鸡"));
		list.add(new Ticket("西安"));
	}
	
	public static Ticket buyTicket(Passage pas, Ticket ticket){
		boolean flag = false;
		for(Ticket t: list){
			if(ticket.equals(t)){
				flag = true;
				System.out.println("正在出票......");
				list.remove(t);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(pas.getName() + "购票成功，" + ticket.getName());
				break;
			}
		}
		if(flag){
			return ticket;
		}else{
			return null;
		}
	}
	
	public static void returnTicket(Passage pas, Ticket ticket){
		list.add(ticket);
		System.out.println(pas.getName() + "退票成功" + ticket.getName());
	}
}
