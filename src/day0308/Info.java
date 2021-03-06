package day0308;

public class Info {
	private String name="中软国际";
	private String content="视频处理芯片";
	private boolean flag=false;  // 没有产品了，要开始生产了 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
//生产者生产产品
	public synchronized void set(String name,String content){
		
		if(!flag){
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//等待消费者取走产品
		}
		System.out.print("开始生产产品！");
		this.setName(name);//设置公司名字
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setContent(content);
		flag=false;
		System.out.println(name+","+content);
		super.notify();
	}
	
//	消费者获取产品
	public synchronized void get(){
		if(flag){
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("开始消费！！");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("公司名称："+this.getName()+"\t产品名称："+this.getContent());
		flag=true;
		super.notify();
	}

}
