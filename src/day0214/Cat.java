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
		return "猫的信息：\n种类：" + type + "\n毛色：" +
				color + "\n年龄：" + age + "岁\n体重：" + weight + "斤";
	}
	
	public void say(){
		System.out.println("喵，喵，喵。。。");
	}
	
	public void play(String toy){
		System.out.println("me在玩" + toy + "，很high！");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setAge(2);
		cat.setColor("蓝色");
		cat.setType("波斯猫");
		cat.setWeight(3);
		
		System.out.println(cat);
		
		cat.say();
		cat.play("双杠");
	}
}
