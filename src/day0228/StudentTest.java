package day0228;

public class StudentTest {
	Student[] stuArray = new Student[10];
	int listLength = 0;
	
	public static void main(String[] args) {
		
		StudentTest t = new StudentTest();
		Student s = new Student("�ֱ���", "java7");
		t.addStudent(s);
		Student s2 = new Student("������", "java7");
		t.addStudent(s2);
		Student s3 = new Student("Ѧ����", "java7");
		t.addStudent(s3);
		Student s4 = new Student("������", "java7");
		t.addStudent(s4);
		Student s5 = new Student("�ؿ���", "java7");
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
				System.out.println(s + "�����б���");
			}
		}
		
		if (!flag){
			stuArray[listLength] = s;
			listLength++;
			System.out.println("�ɹ����ѧ��" + s);
		}
	}
	
	public void printStuList(){
		System.out.println("ѧ���б�");
		for (Student s : stuArray){
			if (s == null){
				break;
			}
			System.out.println(s);
		}
	}

}
