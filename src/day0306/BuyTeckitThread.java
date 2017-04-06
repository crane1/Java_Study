package day0306;

public class BuyTeckitThread extends Thread{
	private Teckit teckit;
	private Passager pas;
	
	public BuyTeckitThread(Teckit teckit, Passager pas) {
		this.teckit = teckit;
		this.pas = pas;
	}
	
	public  void run(){
		System.out.println(pas.getName() + "准备买票" + teckit);
		synchronized(teckit){
			Teckit t = SaleSystem.buyTeckit(pas, teckit);
			if (t != null){
				System.out.println(pas.getName() + "成功购票" + teckit);
			}
			while(t == null){
				System.out.println(pas.getName() + ",对不起，票已卖出，请耐心等待");
				try {
					teckit.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
