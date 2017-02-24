package day0224;

public class Painter extends Person{
	private Eraser eraser;
	
	public Painter(){}
	public Painter(String name){
		super(name);
	}

	public Eraser getEraser() {
		return eraser;
	}

	public void setEraser(Eraser eraser) {
		this.eraser = eraser;
	}
	
	public String toString(){
		return this.getName() + "��һ��" + this.eraser;
	}
}
