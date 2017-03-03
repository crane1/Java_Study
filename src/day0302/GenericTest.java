package day0302;

import day0301.MMPerson;

public class GenericTest<T> {

		public <E> void add(GenericTest<T> a, GenericTest<T> b){
			System.out.println(a + "," + b);
		}
		
		public <F> F add(F a){
			return a;
		}
		
		public static void main(String[] args) {
			GenericTest<String> gt = new GenericTest<String>();
			GenericTest<String> gt1 = new GenericTest<String>();
			
			gt.add(gt, gt1);
//			gt.add(1, 2);
//			gt.add(1.2, 2.3);
//			gt.add("I", "You");
//			
//			MMPerson mp1 = new MMPerson();
//			MMPerson mp2 = new MMPerson();
//			
//			gt.add(mp1, mp2);
//			
			System.out.println(gt.add(1));
//			System.out.println(gt.add(mp2));
		}
}
