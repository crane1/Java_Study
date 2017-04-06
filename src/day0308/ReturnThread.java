package day0308;

public class ReturnThread extends Thread{
	private Passage pas;
	private Ticket ticket;
	
	public ReturnThread(Passage pas, Ticket ticket){
		this.pas = pas;
		this.ticket = ticket;
	}
	
	@Override
	public void run() {
		System.out.println(pas.getName() + "×¼±¸ÍËÆ±£¬" + ticket.getName());
		synchronized(ticket){
			SaleTicket.returnTicket(pas, ticket);
		}
	}

}
