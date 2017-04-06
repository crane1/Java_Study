package day0308;

import java.util.ArrayList;

public class SaleTicket {
	static ArrayList<Ticket> list = new ArrayList<Ticket>();
	
	static {
		list.add(new Ticket("����"));
		list.add(new Ticket("����"));
	}
	
	public static Ticket buyTicket(Passage pas, Ticket ticket){
		boolean flag = false;
		for(Ticket t: list){
			if(ticket.equals(t)){
				flag = true;
				System.out.println("���ڳ�Ʊ......");
				list.remove(t);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(pas.getName() + "��Ʊ�ɹ���" + ticket.getName());
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
		System.out.println(pas.getName() + "��Ʊ�ɹ�" + ticket.getName());
	}
}
