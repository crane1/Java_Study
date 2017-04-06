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
			System.out.println(pas.getName() + "׼����Ʊ" + teckit);
			SaleSystem.returnTeckit(teckit, pas);
			System.out.println(pas.getName() + "��Ʊ" + teckit + "�ɹ�");
			teckit.notifyAll();
		}
		
		
	}
}
