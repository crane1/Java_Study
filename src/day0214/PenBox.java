package day0214;

public class PenBox {
	private String color;
	private int capacity;
	
	public PenBox(){
		color = "白色";
		capacity = 10;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String toString(){
		return "笔筒信息：\n颜色：" + color + "可放置笔：" + capacity + "支";
	}
	
	public static void main(String[] args) {
		PenBox p1 = new PenBox();
		PenBox p2 = new PenBox();
		
		System.out.println(p1 == p2);  // 虚地址不同
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.getCapacity() == p2.getCapacity());
		System.out.println(p1.getColor().equals(p2.getColor()));
		System.out.println(p1.getColor() == p2.getColor());
		System.out.println(p1.getColor().compareTo(p2.getColor()));
		
	}
}
