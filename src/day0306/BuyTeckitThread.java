package day0306;

public class BuyTeckitThread extends Thread{
	private Teckit teckit;
	private Passager pas;
	
	public BuyTeckitThread(Teckit teckit, Passager pas) {
		this.teckit = teckit;
		this.pas = pas;
	}
	
	public  void run(){
		System.out.println(pas.getName() + "׼����Ʊ" + teckit);
		synchronized(teckit){
			Teckit t = SaleSystem.buyTeckit(pas, teckit);
			if (t != null){
				System.out.println(pas.getName() + "�ɹ���Ʊ" + teckit);
			}
			while(t == null){
				System.out.println(pas.getName() + ",�Բ���Ʊ�������������ĵȴ�");
				try {
					teckit.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
