package Test;

import java.util.ArrayList;
import java.util.List;

import day0213.*;

public class Test {
	public static void main(String[] args) {
//		Student s = new Student();
//		s.setName("¶«·½Ë·");
//		System.out.println(s.getName());
//		
//		CalculateScore cs = new CalculateScore();
//		cs.setJavaScore(80);
//		cs.setCshapScore(90);
//		cs.setDbScore(100);
//		
//		cs.printScoreInfo();
//		
//		Triangle t = new Triangle(10, 20, 30);
//		System.out.println(t.calCircum());
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		List<Integer> intList = list;
		for(int i = 0; i < list.size(); i++){
			System.out.println(intList.get(i));
		}
		
	}
}
