package day0308;

public class TestTicket {

	public static void main(String[] args) {
		Passage p1 = new Passage("һ");
		Passage p2 = new Passage("��");
		Passage p3 = new Passage("��");
		Passage p4 = new Passage("��");
		
		Ticket t1 = new Ticket("����");
		Ticket t2 = new Ticket("����");
		
		p1.buyTicket(t1);
		p2.buyTicket(t2);
		p3.buyTicket(t1);
		p4.buyTicket(t1);
		
//		p1.returnTicket(t1);
//		p2.returnTicket(t1);
		
	}

}
