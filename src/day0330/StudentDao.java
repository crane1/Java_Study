package day0330;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao extends JDBCTest{
	private List<Student> list = new ArrayList<Student>();
	
	public void loadAllStudents() throws Exception{
		Connection conn = this.getConnection();
		String sql = "select * from student";
		ResultSet rs = this.select(conn, sql);
		if(rs != null){
			while(rs.next()){
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setAge(rs.getInt(3));
				s.setSex(rs.getString(4));
				list.add(s);
			}
			System.out.println("�����ɹ�");
		}else{
			System.out.println("����ʧ��");
		}
		conn.close();
	}
	
	public void updateStudent(Student s) throws Exception{
		Connection conn = this.getConnection();
		String sql = "update student set name='" + s.getName() + "' where id=" + s.getId();
		int count = this.update(conn, sql);
		if(count > 0){
			System.out.println("���³ɹ�");
		}else {
			System.out.println("����ʧ��");
		}
		conn.close();
	}
	
	public void delectStudent(Student s) throws Exception{
		Connection conn = this.getConnection();
		String sql = "delete student where id=" + s.getId();
		int count = this.update(conn, sql);
		if(count > 0){
			System.out.println("ɾ���ɹ�");
		}else {
			System.out.println("ɾ��ʧ��");
		}
		conn.close();
	}
	
	public void insertStudent(Student s) throws Exception{
		Connection conn = this.getConnection();
		String sql = "insert into student values("+ s.getId() +",'" + s.getName() + "'," + s.getAge() + ",'" + s.getSex()  + "')";
		int count = this.update(conn, sql);
		if(count > 0){
			System.out.println("��ӳɹ�");
		}else {
			System.out.println("���ʧ��");
		}
		conn.close();
	}
	
	public void printList(){
		for(Student s : list){
			System.out.println(s);
		}
	}

}
