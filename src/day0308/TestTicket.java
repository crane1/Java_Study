package day0308;

public class TestTicket {

	public static void main(String[] args) {
		Passage p1 = new Passage("一");
		Passage p2 = new Passage("二");
		Passage p3 = new Passage("三");
		Passage p4 = new Passage("四");
		
		Ticket t1 = new Ticket("西安");
		Ticket t2 = new Ticket("宝鸡");
		
		p1.buyTicket(t1);
		p2.buyTicket(t2);
		p3.buyTicket(t1);
		p4.buyTicket(t1);
		
//		p1.returnTicket(t1);
//		p2.returnTicket(t1);
		
	}

}
