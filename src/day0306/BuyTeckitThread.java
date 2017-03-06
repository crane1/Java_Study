package day0306;

public class BuyTeckitThread extends Thread{
	private Teckit teckit;
	private Passager pas;
	
	public BuyTeckitThread(Teckit teckit, Passager pas) {
		this.teckit = teckit;
		this.pas = pas;
	}
	
	public void run(){
		synchronized (teckit) {
			if (teckit == null){
				System.out.println("对不起，票已卖出，请耐心等待");
				try {
					teckit.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else{
				pas.setTeckit(teckit);
				System.out.println(pas.getName() + "成功购得车票" + teckit);
			}
		}
	}
}
