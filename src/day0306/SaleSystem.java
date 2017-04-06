package day0306;

import java.util.ArrayList;
import java.util.List;

public class SaleSystem {
	private static List<Teckit> list = new ArrayList<Teckit>();
	static {
		list.add(new Teckit("1","1","1"));
		list.add(new Teckit("2","2","2"));
	}
	
	public  static Teckit buyTeckit(Passager pas,Teckit teckit){
		Teckit t1 = null;
			for(Teckit t : list){
				if(t.equals(teckit)){
					t1 = t;
					System.out.println("正在出票");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					list.remove(t);
					break;
				}
			}
		return t1;
	}

	public static Teckit returnTeckit(Teckit teckit, Passager pas){
		list.add(teckit);
		return teckit;
	}

	public static void main(String[] args) {
		SaleSystem ss = new SaleSystem();
		Passager pas1 = new Passager("张三1");
		Passager pas2 = new Passager("李四2");
		Passager pas3 = new Passager("王五1");
		Passager pas4 = new Passager("赵六2");
		Teckit teckit1 = new Teckit("1","1","1");
		Teckit teckit2 = new Teckit("2","2","2");
		pas1.buyTeckit(teckit1);
		pas2.buyTeckit(teckit2);
		pas3.buyTeckit(teckit1);
		pas4.buyTeckit(teckit2);
		
		pas1.returnTeckit(teckit1);
		pas2.returnTeckit(teckit2);
		pas2.buyTeckit(teckit1);
	}

}
