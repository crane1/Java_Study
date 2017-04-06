package treadwork;

public class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		
		int i = 0;
		while(i < 10){
//			if (i > 4){
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			
			System.out.println("我是Runnable 实现");
			i++;
		}
		
	}

}
