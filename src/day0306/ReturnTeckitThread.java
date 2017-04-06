package day0306;

public class ReturnTeckitThread extends Thread{
	private Teckit teckit;
	private Passager pas;
	
	public ReturnTeckitThread(Passager pas, Teckit teckit) {
		this.teckit = teckit;
		this.pas = pas;
	}
	
	public void run(){
		synchronized (teckit) {
			System.out.println(pas.getName() + "准备退票" + teckit);
			SaleSystem.returnTeckit(teckit, pas);
			System.out.println(pas.getName() + "退票" + teckit + "成功");
			teckit.notifyAll();
		}
		
		
	}
}
