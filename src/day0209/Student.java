package day0209;

public class Student {
	String name;
	int age;
	String id = "000031";
	
	Student(){}
	Student(String name, String id){
		this.name = name;
		this.id = id;
	}
	String getName(){
		return name;
	}
	
	void setName(String newName){
		name = newName;
	}
	
	int getAge(){
		return age;
	}
	
	void setAge(int newAge){
		age = newAge;
	}
	
	String getId(){
		return id;
	}
	
	void setId(String newId){
		id = newId;
	}
	
}
