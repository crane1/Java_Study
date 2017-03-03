package day0301;

public class MMPerson {
	private String name;
	private String type;
	
	public MMPerson(){
		setType("MM");
	}
	
	public MMPerson(String name){
		this.setName(name);
		setType("MM");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MMPerson [name=" + name + ", type=" + type + "]";
	}
	
	
}
