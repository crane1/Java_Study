package day0308;

public class BuyThread extends Thread{
	private Passage pas;
	private Ticket ticket;
	
	public BuyThread(Passage pas, Ticket ticket){
		this.pas = pas;
		this.ticket = ticket;
	}
	
	@Override
	public void run() {
		System.out.println(pas.getName() + "׼����Ʊ��" + ticket.getName());
		synchronized(ticket){
			while(true){
				Ticket t = SaleTicket.buyTicket(pas, ticket);
				if(t == null){
					System.out.println(pas.getName() +",Ʊ������," + ticket.getName() + ",�����ĵȴ�.....");
					try {
						ticket.wait(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					return;
				}
			}
		}
	}
}
