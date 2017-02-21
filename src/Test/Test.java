package Test;

import day0213.*;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("¶«·½Ë·");
		System.out.println(s.getName());
		
		CalculateScore cs = new CalculateScore();
		cs.setJavaScore(80);
		cs.setCshapScore(90);
		cs.setDbScore(100);
		
		cs.printScoreInfo();
		
		Triangle t = new Triangle(10, 20, 30);
		System.out.println(t.calCircum());
	}
}
