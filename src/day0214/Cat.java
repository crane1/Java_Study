package day0214;

public class Cat {
	private String type;
	private String color;
	private int age;
	private int weight;
	
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString(){
		return "è����Ϣ��\n���ࣺ" + type + "\nëɫ��" +
				color + "\n���䣺" + age + "��\n���أ�" + weight + "��";
	}
	
	public void say(){
		System.out.println("����������������");
	}
	
	public void play(String toy){
		System.out.println("me����" + toy + "����high��");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setAge(2);
		cat.setColor("��ɫ");
		cat.setType("��˹è");
		cat.setWeight(3);
		
		System.out.println(cat);
		
		cat.say();
		cat.play("˫��");
	}
}
