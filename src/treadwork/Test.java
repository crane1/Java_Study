package treadwork;

public class Test {
	public static void main(String[] args) {
		// 1.Thread
		ThreadExtends te = new ThreadExtends();
		
		
		// 2.Runable
		ThreadRunnable tr = new ThreadRunnable();
		Thread tr1 = new Thread(tr);
		tr1.start();
		te.start();
		
		int i = 0;
		while(i < 50){
			System.out.println(Thread.currentThread().getName());
			if (i > 20){
				try {
					te.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			i++;
		}
		
	}
}
