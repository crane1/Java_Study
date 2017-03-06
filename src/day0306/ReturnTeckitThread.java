package day0306;

public class ReturnTeckitThread extends Thread{
	private Teckit teckit;
	private Passager pas;
	
	public ReturnTeckitThread(Passager pas) {
		this.teckit = pas.getTeckit();
		this.pas = pas;
	}
	
	public void run(){
		synchronized (teckit) {
			System.out.println(pas.getName() + "ÍËÆ±" + teckit);
			teckit.notifyAll();
		}
	}
}
