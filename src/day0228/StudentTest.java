package day0228;

public class StudentTest {
	Student[] stuArray = new Student[10];
	int listLength = 0;
	
	public static void main(String[] args) {
		
		StudentTest t = new StudentTest();
		Student s = new Student("贾宝玉", "java7");
		t.addStudent(s);
		Student s2 = new Student("林黛玉", "java7");
		t.addStudent(s2);
		Student s3 = new Student("薛宝钗", "java7");
		t.addStudent(s3);
		Student s4 = new Student("王熙凤", "java7");
		t.addStudent(s4);
		Student s5 = new Student("秦可卿", "java7");
		t.addStudent(s5);
		t.addStudent(s5);
		t.printStuList();
		
	}
	
	public void addStudent(Student s){
		boolean flag = false;
		for (Student s1 : stuArray){
			if (s1 == null){
				break;
			}
			if (s1.equals(s)){
				flag = true;
				System.out.println(s + "已在列表中");
			}
		}
		
		if (!flag){
			stuArray[listLength] = s;
			listLength++;
			System.out.println("成功添加学生" + s);
		}
	}
	
	public void printStuList(){
		System.out.println("学生列表");
		for (Student s : stuArray){
			if (s == null){
				break;
			}
			System.out.println(s);
		}
	}

}
