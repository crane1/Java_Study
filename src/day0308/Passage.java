package day0308;

public class Passage {
	private String name;

	public Passage(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Ticket buyTicket(Ticket ticket){
		BuyThread b = new BuyThread(this, ticket);
		b.start();
		return ticket;
		
	}
	
	public Ticket returnTicket(Ticket ticket){
		ReturnThread r = new ReturnThread(this, ticket);
		r.start();
		return ticket;
		
	}
}
