package treadwork;

public class ThreadExtends extends Thread{
	
	public void run(){
		int i = 0;
		while(i < 100){
			System.out.println("ÎÒÊÇThread ¼Ì³Ð");
			i++;
		}
		
	}

}
