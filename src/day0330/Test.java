package day0330;

public class Test {

	public static void main(String[] args) {
		StudentDao sd = new StudentDao();
		try {
			sd.loadAllStudents();
			sd.printList();
			Student s = new Student();
			s.setId(7);
			s.setName("��ʹ��");
			s.setAge(19);
			s.setSex("��");
//			sd.insertStudent(s);
//			sd.delectStudent(s);
			sd.updateStudent(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
