package day0224;

public class Student extends Person{
	private Pen pen;
	
	public Student(){}
	public Student(String name){
		super(name);
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}
	
	public String toString(){
		return this.getName() + "ÓĞÒ»Ö§" + this.pen;
	}
}
